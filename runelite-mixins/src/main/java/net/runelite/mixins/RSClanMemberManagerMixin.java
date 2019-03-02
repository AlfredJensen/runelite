/*
 * Copyright (c) 2018, trimbe <github.com/trimbe>
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
package net.runelite.mixins;

import net.runelite.api.events.ClanMemberJoined;
import net.runelite.api.events.ClanMemberLeft;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClanMemberManager;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSName;
import net.runelite.rs.api.RSNameable;

@Mixin(RSClanMemberManager.class)
public abstract class RSClanMemberManagerMixin implements RSClanMemberManager
{
	@Shadow("clientInstance")
	private static RSClient client;

	@Inject
	@Override
	public void rl$add(RSName name, RSName prevName)
	{
		ClanMemberJoined event = new ClanMemberJoined(name.getName());
		client.getCallbacks().post(event);
	}

	@Inject
	@Override
	public void rl$remove(RSNameable nameable)
	{
		ClanMemberLeft event = new ClanMemberLeft(nameable.getRsName().getName());
		client.getCallbacks().post(event);
	}
}
