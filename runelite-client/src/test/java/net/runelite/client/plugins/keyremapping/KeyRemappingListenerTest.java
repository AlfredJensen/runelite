/*
 * Copyright (c) 2020, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.keyremapping;

import com.google.inject.Guice;
import com.google.inject.testing.fieldbinder.Bind;
import com.google.inject.testing.fieldbinder.BoundFieldModule;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.client.config.ModifierlessKeybind;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class KeyRemappingListenerTest
{
	@Inject
	private KeyRemappingListener keyRemappingListener;

	@Mock
	@Bind
	private Client client;

	@Mock
	@Bind
	private KeyRemappingPlugin keyRemappingPlugin;

	@Mock
	@Bind
	private KeyRemappingConfig keyRemappingConfig;

	@Before
	public void setUp()
	{
		Guice.createInjector(BoundFieldModule.of(this)).injectMembers(this);

		when(client.getGameState()).thenReturn(GameState.LOGGED_IN);
	}

	@Test
	public void testTypingStateChange()
	{
		when(keyRemappingConfig.cameraRemap()).thenReturn(true);
		when(keyRemappingConfig.up()).thenReturn(new ModifierlessKeybind(KeyEvent.VK_W, 0));
		when(keyRemappingConfig.down()).thenReturn(new ModifierlessKeybind(KeyEvent.VK_S, 0));
		when(keyRemappingConfig.left()).thenReturn(new ModifierlessKeybind(KeyEvent.VK_A, 0));
		when(keyRemappingConfig.right()).thenReturn(new ModifierlessKeybind(KeyEvent.VK_D, 0));

		when(keyRemappingPlugin.chatboxFocused()).thenReturn(true);
		KeyEvent event = mock(KeyEvent.class);
		when(event.getKeyCode()).thenReturn(KeyEvent.VK_D);
		when(event.getExtendedKeyCode()).thenReturn(KeyEvent.VK_D); // for keybind matches()
		keyRemappingListener.keyPressed(event);
		verify(event).setKeyCode(KeyEvent.VK_RIGHT);

		// with the plugin now in typing mode, previously pressed and remapped keys should still be mapped
		// on key release regardless
		when(keyRemappingPlugin.isTyping()).thenReturn(true);
		event = mock(KeyEvent.class);
		when(event.getKeyCode()).thenReturn(KeyEvent.VK_D);
		keyRemappingListener.keyReleased(event);
		verify(event).setKeyCode(KeyEvent.VK_RIGHT);
	}

	@Test
	public void testMouseClicked()
	{
		when(keyRemappingConfig.consumeExtraMouseButtons()).thenReturn(true);
		MouseEvent mouseEvent = mock(MouseEvent.class);
		when(mouseEvent.getButton()).thenReturn(4);
		keyRemappingListener.mousePressed(mouseEvent);
		verify(mouseEvent).consume();

		mouseEvent = mock(MouseEvent.class);
		when(mouseEvent.getButton()).thenReturn(1);
		keyRemappingListener.mousePressed(mouseEvent);
		verify(mouseEvent, never()).consume();
	}
}
