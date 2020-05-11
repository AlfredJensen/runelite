/*
 * Copyright (c) 2017, Seth <Sethtroll3@gmail.com>
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
package net.runelite.client.plugins.itemcharges;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import javax.annotation.Nullable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import static net.runelite.api.ItemID.*;
import static net.runelite.client.plugins.itemcharges.ItemChargeType.POTION;
import static net.runelite.client.plugins.itemcharges.ItemChargeType.*;

@AllArgsConstructor
@Getter
enum ItemWithCharge
{
	ABRACE1(ABYSSAL_BRACELET, ABYSSAL_BRACELET1, 1),
	ABRACE2(ABYSSAL_BRACELET, ABYSSAL_BRACELET2, 2),
	ABRACE3(ABYSSAL_BRACELET, ABYSSAL_BRACELET3, 3),
	ABRACE4(ABYSSAL_BRACELET, ABYSSAL_BRACELET4, 4),
	ABRACE5(ABYSSAL_BRACELET, ABYSSAL_BRACELET5, 5),
	ABSORPTION1(POTION, ABSORPTION_1, 1),
	ABSORPTION2(POTION, ABSORPTION_2, 2),
	ABSORPTION3(POTION, ABSORPTION_3, 3),
	ABSORPTION4(POTION, ABSORPTION_4, 4),
	AGILITY1(POTION, AGILITY_POTION1, 1),
	AGILITY2(POTION, AGILITY_POTION2, 2),
	AGILITY3(POTION, AGILITY_POTION3, 3),
	AGILITY4(POTION, AGILITY_POTION4, 4),
	ANTI1(POTION, ANTIPOISON1, 1),
	ANTI2(POTION, ANTIPOISON2, 2),
	ANTI3(POTION, ANTIPOISON3, 3),
	ANTI4(POTION, ANTIPOISON4, 4),
	ANTIDOTE_P1(POTION, ANTIDOTE1, 1),
	ANTIDOTE_P2(POTION, ANTIDOTE2, 2),
	ANTIDOTE_P3(POTION, ANTIDOTE3, 3),
	ANTIDOTE_P4(POTION, ANTIDOTE4, 4),
	ANTIDOTE_PP1(POTION, ANTIDOTE1_5958, 1),
	ANTIDOTE_PP2(POTION, ANTIDOTE2_5956, 2),
	ANTIDOTE_PP3(POTION, ANTIDOTE3_5954, 3),
	ANTIDOTE_PP4(POTION, ANTIDOTE4_5952, 4),
	ANTIFIRE1(POTION, ANTIFIRE_POTION1, 1),
	ANTIFIRE2(POTION, ANTIFIRE_POTION2, 2),
	ANTIFIRE3(POTION, ANTIFIRE_POTION3, 3),
	ANTIFIRE4(POTION, ANTIFIRE_POTION4, 4),
	ANTIVEN1(POTION, ANTIVENOM1, 1),
	ANTIVEN2(POTION, ANTIVENOM2, 2),
	ANTIVEN3(POTION, ANTIVENOM3, 3),
	ANTIVEN4(POTION, ANTIVENOM4, 4),
	ANTIVENOM_P1(POTION, ANTIVENOM1_12919, 1),
	ANTIVENOM_P2(POTION, ANTIVENOM2_12917, 2),
	ANTIVENOM_P3(POTION, ANTIVENOM3_12915, 3),
	ANTIVENOM_P4(POTION, ANTIVENOM4_12913, 4),
	ATTACK1(POTION, ATTACK_POTION1, 1),
	ATTACK2(POTION, ATTACK_POTION2, 2),
	ATTACK3(POTION, ATTACK_POTION3, 3),
	ATTACK4(POTION, ATTACK_POTION4, 4),
	BASKET_APPLES1(FRUIT_BASKET, APPLES1, 1),
	BASKET_APPLES2(FRUIT_BASKET, APPLES2, 2),
	BASKET_APPLES3(FRUIT_BASKET, APPLES3, 3),
	BASKET_APPLES4(FRUIT_BASKET, APPLES4, 4),
	BASKET_APPLES5(FRUIT_BASKET, APPLES5, 5),
	BASKET_BANANAS1(FRUIT_BASKET, BANANAS1, 1),
	BASKET_BANANAS2(FRUIT_BASKET, BANANAS2, 2),
	BASKET_BANANAS3(FRUIT_BASKET, BANANAS3, 3),
	BASKET_BANANAS4(FRUIT_BASKET, BANANAS4, 4),
	BASKET_BANANAS5(FRUIT_BASKET, BANANAS5, 5),
	BASKET_ORANGES1(FRUIT_BASKET, ORANGES1, 1),
	BASKET_ORANGES2(FRUIT_BASKET, ORANGES2, 2),
	BASKET_ORANGES3(FRUIT_BASKET, ORANGES3, 3),
	BASKET_ORANGES4(FRUIT_BASKET, ORANGES4, 4),
	BASKET_ORANGES5(FRUIT_BASKET, ORANGES5, 5),
	BASKET_STRAWBERRIES1(FRUIT_BASKET, STRAWBERRIES1, 1),
	BASKET_STRAWBERRIES2(FRUIT_BASKET, STRAWBERRIES2, 2),
	BASKET_STRAWBERRIES3(FRUIT_BASKET, STRAWBERRIES3, 3),
	BASKET_STRAWBERRIES4(FRUIT_BASKET, STRAWBERRIES4, 4),
	BASKET_STRAWBERRIES5(FRUIT_BASKET, STRAWBERRIES5, 5),
	BASKET_TOMATOES1(FRUIT_BASKET, TOMATOES1, 1),
	BASKET_TOMATOES2(FRUIT_BASKET, TOMATOES2, 2),
	BASKET_TOMATOES3(FRUIT_BASKET, TOMATOES3, 3),
	BASKET_TOMATOES4(FRUIT_BASKET, TOMATOES4, 4),
	BASKET_TOMATOES5(FRUIT_BASKET, TOMATOES5, 5),
	BASTION1(POTION, BASTION_POTION1, 1),
	BASTION2(POTION, BASTION_POTION2, 2),
	BASTION3(POTION, BASTION_POTION3, 3),
	BASTION4(POTION, BASTION_POTION4, 4),
	BATTLEMAGE1(POTION, BATTLEMAGE_POTION1, 1),
	BATTLEMAGE2(POTION, BATTLEMAGE_POTION2, 2),
	BATTLEMAGE3(POTION, BATTLEMAGE_POTION3, 3),
	BATTLEMAGE4(POTION, BATTLEMAGE_POTION4, 4),
	BELLOWS0(BELLOWS, OGRE_BELLOWS, 0),
	BELLOWS1(BELLOWS, OGRE_BELLOWS_1, 1),
	BELLOWS2(BELLOWS, OGRE_BELLOWS_2, 2),
	BELLOWS3(BELLOWS, OGRE_BELLOWS_3, 3),
	BLIGHTED_SUPER_REST1(POTION, BLIGHTED_SUPER_RESTORE1, 1),
	BLIGHTED_SUPER_REST2(POTION, BLIGHTED_SUPER_RESTORE2, 2),
	BLIGHTED_SUPER_REST3(POTION, BLIGHTED_SUPER_RESTORE3, 3),
	BLIGHTED_SUPER_REST4(POTION, BLIGHTED_SUPER_RESTORE4, 4),
	BURNING1(TELEPORT, BURNING_AMULET1, 1),
	BURNING2(TELEPORT, BURNING_AMULET2, 2),
	BURNING3(TELEPORT, BURNING_AMULET3, 3),
	BURNING4(TELEPORT, BURNING_AMULET4, 4),
	BURNING5(TELEPORT, BURNING_AMULET5, 5),
	CBRACE1(TELEPORT, COMBAT_BRACELET1, 1),
	CBRACE2(TELEPORT, COMBAT_BRACELET2, 2),
	CBRACE3(TELEPORT, COMBAT_BRACELET3, 3),
	CBRACE4(TELEPORT, COMBAT_BRACELET4, 4),
	CBRACE5(TELEPORT, COMBAT_BRACELET5, 5),
	CBRACE6(TELEPORT, COMBAT_BRACELET6, 6),
	COMBAT1(POTION, COMBAT_POTION1, 1),
	COMBAT2(POTION, COMBAT_POTION2, 2),
	COMBAT3(POTION, COMBAT_POTION3, 3),
	COMBAT4(POTION, COMBAT_POTION4, 4),
	COMPOST1(POTION, COMPOST_POTION1, 1),
	COMPOST2(POTION, COMPOST_POTION2, 2),
	COMPOST3(POTION, COMPOST_POTION3, 3),
	COMPOST4(POTION, COMPOST_POTION4, 4),
	DEFENCE1(POTION, DEFENCE_POTION1, 1),
	DEFENCE2(POTION, DEFENCE_POTION2, 2),
	DEFENCE3(POTION, DEFENCE_POTION3, 3),
	DEFENCE4(POTION, DEFENCE_POTION4, 4),
	DIGSITE1(TELEPORT, DIGSITE_PENDANT_1, 1),
	DIGSITE2(TELEPORT, DIGSITE_PENDANT_2, 2),
	DIGSITE3(TELEPORT, DIGSITE_PENDANT_3, 3),
	DIGSITE4(TELEPORT, DIGSITE_PENDANT_4, 4),
	DIGSITE5(TELEPORT, DIGSITE_PENDANT_5, 5),
	DIVINE_BASTION1(POTION, DIVINE_BASTION_POTION1, 1),
	DIVINE_BASTION2(POTION, DIVINE_BASTION_POTION2, 2),
	DIVINE_BASTION3(POTION, DIVINE_BASTION_POTION3, 3),
	DIVINE_BASTION4(POTION, DIVINE_BASTION_POTION4, 4),
	DIVINE_BATTLEMAGE1(POTION, DIVINE_BATTLEMAGE_POTION1, 1),
	DIVINE_BATTLEMAGE2(POTION, DIVINE_BATTLEMAGE_POTION2, 2),
	DIVINE_BATTLEMAGE3(POTION, DIVINE_BATTLEMAGE_POTION3, 3),
	DIVINE_BATTLEMAGE4(POTION, DIVINE_BATTLEMAGE_POTION4, 4),
	DIVINE_MAGIC1(POTION, DIVINE_MAGIC_POTION1, 1),
	DIVINE_MAGIC2(POTION, DIVINE_MAGIC_POTION2, 2),
	DIVINE_MAGIC3(POTION, DIVINE_MAGIC_POTION3, 3),
	DIVINE_MAGIC4(POTION, DIVINE_MAGIC_POTION4, 4),
	DIVINE_RANGING1(POTION, DIVINE_RANGING_POTION1, 1),
	DIVINE_RANGING2(POTION, DIVINE_RANGING_POTION2, 2),
	DIVINE_RANGING3(POTION, DIVINE_RANGING_POTION3, 3),
	DIVINE_RANGING4(POTION, DIVINE_RANGING_POTION4, 4),
	DIVINE_SUPER_ATTACK1(POTION, DIVINE_SUPER_ATTACK_POTION1, 1),
	DIVINE_SUPER_ATTACK2(POTION, DIVINE_SUPER_ATTACK_POTION2, 2),
	DIVINE_SUPER_ATTACK3(POTION, DIVINE_SUPER_ATTACK_POTION3, 3),
	DIVINE_SUPER_ATTACK4(POTION, DIVINE_SUPER_ATTACK_POTION4, 4),
	DIVINE_SUPER_COMBAT1(POTION, DIVINE_SUPER_COMBAT_POTION1, 1),
	DIVINE_SUPER_COMBAT2(POTION, DIVINE_SUPER_COMBAT_POTION2, 2),
	DIVINE_SUPER_COMBAT3(POTION, DIVINE_SUPER_COMBAT_POTION3, 3),
	DIVINE_SUPER_COMBAT4(POTION, DIVINE_SUPER_COMBAT_POTION4, 4),
	DIVINE_SUPER_DEFENCE1(POTION, DIVINE_SUPER_DEFENCE_POTION1, 1),
	DIVINE_SUPER_DEFENCE2(POTION, DIVINE_SUPER_DEFENCE_POTION2, 2),
	DIVINE_SUPER_DEFENCE3(POTION, DIVINE_SUPER_DEFENCE_POTION3, 3),
	DIVINE_SUPER_DEFENCE4(POTION, DIVINE_SUPER_DEFENCE_POTION4, 4),
	DIVINE_SUPER_STRENGTH1(POTION, DIVINE_SUPER_STRENGTH_POTION1, 1),
	DIVINE_SUPER_STRENGTH2(POTION, DIVINE_SUPER_STRENGTH_POTION2, 2),
	DIVINE_SUPER_STRENGTH3(POTION, DIVINE_SUPER_STRENGTH_POTION3, 3),
	DIVINE_SUPER_STRENGTH4(POTION, DIVINE_SUPER_STRENGTH_POTION4, 4),
	ELYRE1(TELEPORT, ENCHANTED_LYRE1, 1),
	ELYRE2(TELEPORT, ENCHANTED_LYRE2, 2),
	ELYRE3(TELEPORT, ENCHANTED_LYRE3, 3),
	ELYRE4(TELEPORT, ENCHANTED_LYRE4, 4),
	ELYRE5(TELEPORT, ENCHANTED_LYRE5, 5),
	ENERGY1(POTION, ENERGY_POTION1, 1),
	ENERGY2(POTION, ENERGY_POTION2, 2),
	ENERGY3(POTION, ENERGY_POTION3, 3),
	ENERGY4(POTION, ENERGY_POTION4, 4),
	EXTENDED_ANTIFI1(POTION, EXTENDED_ANTIFIRE1, 1),
	EXTENDED_ANTIFI2(POTION, EXTENDED_ANTIFIRE2, 2),
	EXTENDED_ANTIFI3(POTION, EXTENDED_ANTIFIRE3, 3),
	EXTENDED_ANTIFI4(POTION, EXTENDED_ANTIFIRE4, 4),
	EXTENDED_SUPER_ANTI1(POTION, EXTENDED_SUPER_ANTIFIRE1, 1),
	EXTENDED_SUPER_ANTI2(POTION, EXTENDED_SUPER_ANTIFIRE2, 2),
	EXTENDED_SUPER_ANTI3(POTION, EXTENDED_SUPER_ANTIFIRE3, 3),
	EXTENDED_SUPER_ANTI4(POTION, EXTENDED_SUPER_ANTIFIRE4, 4),
	FISHING1(POTION, FISHING_POTION1, 1),
	FISHING2(POTION, FISHING_POTION2, 2),
	FISHING3(POTION, FISHING_POTION3, 3),
	FISHING4(POTION, FISHING_POTION4, 4),
	FUNGICIDE0(FUNGICIDE_SPRAY, FUNGICIDE_SPRAY_0, 0),
	FUNGICIDE1(FUNGICIDE_SPRAY, FUNGICIDE_SPRAY_1, 1),
	FUNGICIDE2(FUNGICIDE_SPRAY, FUNGICIDE_SPRAY_2, 2),
	FUNGICIDE3(FUNGICIDE_SPRAY, FUNGICIDE_SPRAY_3, 3),
	FUNGICIDE4(FUNGICIDE_SPRAY, FUNGICIDE_SPRAY_4, 4),
	FUNGICIDE5(FUNGICIDE_SPRAY, FUNGICIDE_SPRAY_5, 5),
	FUNGICIDE6(FUNGICIDE_SPRAY, FUNGICIDE_SPRAY_6, 6),
	FUNGICIDE7(FUNGICIDE_SPRAY, FUNGICIDE_SPRAY_7, 7),
	FUNGICIDE8(FUNGICIDE_SPRAY, FUNGICIDE_SPRAY_8, 8),
	FUNGICIDE9(FUNGICIDE_SPRAY, FUNGICIDE_SPRAY_9, 9),
	FUNGICIDE10(FUNGICIDE_SPRAY, FUNGICIDE_SPRAY_10, 10),
	GAMES1(TELEPORT, GAMES_NECKLACE1, 1),
	GAMES2(TELEPORT, GAMES_NECKLACE2, 2),
	GAMES3(TELEPORT, GAMES_NECKLACE3, 3),
	GAMES4(TELEPORT, GAMES_NECKLACE4, 4),
	GAMES5(TELEPORT, GAMES_NECKLACE5, 5),
	GAMES6(TELEPORT, GAMES_NECKLACE6, 6),
	GAMES7(TELEPORT, GAMES_NECKLACE7, 7),
	GAMES8(TELEPORT, GAMES_NECKLACE8, 8),
	GLORY1(TELEPORT, AMULET_OF_GLORY1, 1),
	GLORY2(TELEPORT, AMULET_OF_GLORY2, 2),
	GLORY3(TELEPORT, AMULET_OF_GLORY3, 3),
	GLORY4(TELEPORT, AMULET_OF_GLORY4, 4),
	GLORY5(TELEPORT, AMULET_OF_GLORY5, 5),
	GLORY6(TELEPORT, AMULET_OF_GLORY6, 6),
	GLORYT1(TELEPORT, AMULET_OF_GLORY_T1, 1),
	GLORYT2(TELEPORT, AMULET_OF_GLORY_T2, 2),
	GLORYT3(TELEPORT, AMULET_OF_GLORY_T3, 3),
	GLORYT4(TELEPORT, AMULET_OF_GLORY_T4, 4),
	GLORYT5(TELEPORT, AMULET_OF_GLORY_T5, 5),
	GLORYT6(TELEPORT, AMULET_OF_GLORY_T6, 6),
	GREST1(GUTHIX_REST, GUTHIX_REST1, 1),
	GREST2(GUTHIX_REST, GUTHIX_REST2, 2),
	GREST3(GUTHIX_REST, GUTHIX_REST3, 3),
	GREST4(GUTHIX_REST, GUTHIX_REST4, 4),
	GUTHIX_BAL1(POTION, GUTHIX_BALANCE1, 1),
	GUTHIX_BAL2(POTION, GUTHIX_BALANCE2, 2),
	GUTHIX_BAL3(POTION, GUTHIX_BALANCE3, 3),
	GUTHIX_BAL4(POTION, GUTHIX_BALANCE4, 4),
	HUNTER1(POTION, HUNTER_POTION1, 1),
	HUNTER2(POTION, HUNTER_POTION2, 2),
	HUNTER3(POTION, HUNTER_POTION3, 3),
	HUNTER4(POTION, HUNTER_POTION4, 4),
	IMP_IN_A_BOX1(IMPBOX, IMPINABOX1, 1),
	IMP_IN_A_BOX2(IMPBOX, IMPINABOX2, 2),
	MAGIC1(POTION, MAGIC_POTION1, 1),
	MAGIC2(POTION, MAGIC_POTION2, 2),
	MAGIC3(POTION, MAGIC_POTION3, 3),
	MAGIC4(POTION, MAGIC_POTION4, 4),
	OVERLOAD1(POTION, OVERLOAD_1, 1),
	OVERLOAD2(POTION, OVERLOAD_2, 2),
	OVERLOAD3(POTION, OVERLOAD_3, 3),
	OVERLOAD4(POTION, OVERLOAD_4, 4),
	PASSAGE1(TELEPORT, NECKLACE_OF_PASSAGE1, 1),
	PASSAGE2(TELEPORT, NECKLACE_OF_PASSAGE2, 2),
	PASSAGE3(TELEPORT, NECKLACE_OF_PASSAGE3, 3),
	PASSAGE4(TELEPORT, NECKLACE_OF_PASSAGE4, 4),
	PASSAGE5(TELEPORT, NECKLACE_OF_PASSAGE5, 5),
	PHARAO1(TELEPORT, PHARAOHS_SCEPTRE_1, 1),
	PHARAO2(TELEPORT, PHARAOHS_SCEPTRE_2, 2),
	PHARAO3(TELEPORT, PHARAOHS_SCEPTRE_3, 3),
	PHARAO4(TELEPORT, PHARAOHS_SCEPTRE_4, 4),
	PHARAO5(TELEPORT, PHARAOHS_SCEPTRE_5, 5),
	PHARAO6(TELEPORT, PHARAOHS_SCEPTRE_6, 6),
	PHARAO7(TELEPORT, PHARAOHS_SCEPTRE_7, 7),
	PHARAO8(TELEPORT, PHARAOHS_SCEPTRE_8, 8),
	PRAYER1(POTION, PRAYER_POTION1, 1),
	PRAYER2(POTION, PRAYER_POTION2, 2),
	PRAYER3(POTION, PRAYER_POTION3, 3),
	PRAYER4(POTION, PRAYER_POTION4, 4),
	RANGING1(POTION, RANGING_POTION1, 1),
	RANGING2(POTION, RANGING_POTION2, 2),
	RANGING3(POTION, RANGING_POTION3, 3),
	RANGING4(POTION, RANGING_POTION4, 4),
	RELICYMS1(POTION, RELICYMS_BALM1, 1),
	RELICYMS2(POTION, RELICYMS_BALM2, 2),
	RELICYMS3(POTION, RELICYMS_BALM3, 3),
	RELICYMS4(POTION, RELICYMS_BALM4, 4),
	RESTORE1(POTION, RESTORE_POTION1, 1),
	RESTORE2(POTION, RESTORE_POTION2, 2),
	RESTORE3(POTION, RESTORE_POTION3, 3),
	RESTORE4(POTION, RESTORE_POTION4, 4),
	RETURNING1(TELEPORT, RING_OF_RETURNING1, 1),
	RETURNING2(TELEPORT, RING_OF_RETURNING2, 2),
	RETURNING3(TELEPORT, RING_OF_RETURNING3, 3),
	RETURNING4(TELEPORT, RING_OF_RETURNING4, 4),
	RETURNING5(TELEPORT, RING_OF_RETURNING5, 5),
	ROD1(TELEPORT, RING_OF_DUELING1, 1),
	ROD2(TELEPORT, RING_OF_DUELING2, 2),
	ROD3(TELEPORT, RING_OF_DUELING3, 3),
	ROD4(TELEPORT, RING_OF_DUELING4, 4),
	ROD5(TELEPORT, RING_OF_DUELING5, 5),
	ROD6(TELEPORT, RING_OF_DUELING6, 6),
	ROD7(TELEPORT, RING_OF_DUELING7, 7),
	ROD8(TELEPORT, RING_OF_DUELING8, 8),
	ROS1(TELEPORT, SLAYER_RING_1, 1),
	ROS2(TELEPORT, SLAYER_RING_2, 2),
	ROS3(TELEPORT, SLAYER_RING_3, 3),
	ROS4(TELEPORT, SLAYER_RING_4, 4),
	ROS5(TELEPORT, SLAYER_RING_5, 5),
	ROS6(TELEPORT, SLAYER_RING_6, 6),
	ROS7(TELEPORT, SLAYER_RING_7, 7),
	ROS8(TELEPORT, SLAYER_RING_8, 8),
	ROW1(TELEPORT, RING_OF_WEALTH_1, 1),
	ROW2(TELEPORT, RING_OF_WEALTH_2, 2),
	ROW3(TELEPORT, RING_OF_WEALTH_3, 3),
	ROW4(TELEPORT, RING_OF_WEALTH_4, 4),
	ROW5(TELEPORT, RING_OF_WEALTH_5, 5),
	SACK_CABBAGES1(SACK, CABBAGES1, 1),
	SACK_CABBAGES2(SACK, CABBAGES2, 2),
	SACK_CABBAGES3(SACK, CABBAGES3, 3),
	SACK_CABBAGES4(SACK, CABBAGES4, 4),
	SACK_CABBAGES5(SACK, CABBAGES5, 5),
	SACK_CABBAGES6(SACK, CABBAGES6, 6),
	SACK_CABBAGES7(SACK, CABBAGES7, 7),
	SACK_CABBAGES8(SACK, CABBAGES8, 8),
	SACK_CABBAGES9(SACK, CABBAGES9, 9),
	SACK_CABBAGES10(SACK, CABBAGES10, 10),
	SACK_ONIONS1(SACK, ONIONS1, 1),
	SACK_ONIONS2(SACK, ONIONS2, 2),
	SACK_ONIONS3(SACK, ONIONS3, 3),
	SACK_ONIONS4(SACK, ONIONS4, 4),
	SACK_ONIONS5(SACK, ONIONS5, 5),
	SACK_ONIONS6(SACK, ONIONS6, 6),
	SACK_ONIONS7(SACK, ONIONS7, 7),
	SACK_ONIONS8(SACK, ONIONS8, 8),
	SACK_ONIONS9(SACK, ONIONS9, 9),
	SACK_ONIONS10(SACK, ONIONS10, 10),
	SACK_POTATOES1(SACK, POTATOES1, 1),
	SACK_POTATOES2(SACK, POTATOES2, 2),
	SACK_POTATOES3(SACK, POTATOES3, 3),
	SACK_POTATOES4(SACK, POTATOES4, 4),
	SACK_POTATOES5(SACK, POTATOES5, 5),
	SACK_POTATOES6(SACK, POTATOES6, 6),
	SACK_POTATOES7(SACK, POTATOES7, 7),
	SACK_POTATOES8(SACK, POTATOES8, 8),
	SACK_POTATOES9(SACK, POTATOES9, 9),
	SACK_POTATOES10(SACK, POTATOES10, 10),
	SANFEW1(POTION, SANFEW_SERUM1, 1),
	SANFEW2(POTION, SANFEW_SERUM2, 2),
	SANFEW3(POTION, SANFEW_SERUM3, 3),
	SANFEW4(POTION, SANFEW_SERUM4, 4),
	SARADOMIN_BR1(POTION, SARADOMIN_BREW1, 1),
	SARADOMIN_BR2(POTION, SARADOMIN_BREW2, 2),
	SARADOMIN_BR3(POTION, SARADOMIN_BREW3, 3),
	SARADOMIN_BR4(POTION, SARADOMIN_BREW4, 4),
	SERUM_2071(POTION, SERUM_207_1, 1),
	SERUM_2072(POTION, SERUM_207_2, 2),
	SERUM_2073(POTION, SERUM_207_3, 3),
	SERUM_2074(POTION, SERUM_207_4, 4),
	SERUM_2081(POTION, SERUM_208_1, 1),
	SERUM_2082(POTION, SERUM_208_2, 2),
	SERUM_2083(POTION, SERUM_208_3, 3),
	SERUM_2084(POTION, SERUM_208_4, 4),
	SKILLS1(TELEPORT, SKILLS_NECKLACE1, 1),
	SKILLS2(TELEPORT, SKILLS_NECKLACE2, 2),
	SKILLS3(TELEPORT, SKILLS_NECKLACE3, 3),
	SKILLS4(TELEPORT, SKILLS_NECKLACE4, 4),
	SKILLS5(TELEPORT, SKILLS_NECKLACE5, 5),
	SKILLS6(TELEPORT, SKILLS_NECKLACE6, 6),
	STAMINA1(POTION, STAMINA_POTION1, 1),
	STAMINA2(POTION, STAMINA_POTION2, 2),
	STAMINA3(POTION, STAMINA_POTION3, 3),
	STAMINA4(POTION, STAMINA_POTION4, 4),
	STRENGTH1(POTION, STRENGTH_POTION1, 1),
	STRENGTH2(POTION, STRENGTH_POTION2, 2),
	STRENGTH3(POTION, STRENGTH_POTION3, 3),
	STRENGTH4(POTION, STRENGTH_POTION4, 4),
	SUPERANTI1(POTION, SUPERANTIPOISON1, 1),
	SUPERANTI2(POTION, SUPERANTIPOISON2, 2),
	SUPERANTI3(POTION, SUPERANTIPOISON3, 3),
	SUPERANTI4(POTION, SUPERANTIPOISON4, 4),
	SUPER_ANTIFIRE1(POTION, SUPER_ANTIFIRE_POTION1, 1),
	SUPER_ANTIFIRE2(POTION, SUPER_ANTIFIRE_POTION2, 2),
	SUPER_ANTIFIRE3(POTION, SUPER_ANTIFIRE_POTION3, 3),
	SUPER_ANTIFIRE4(POTION, SUPER_ANTIFIRE_POTION4, 4),
	SUPER_ATT1(POTION, SUPER_ATTACK1, 1),
	SUPER_ATT2(POTION, SUPER_ATTACK2, 2),
	SUPER_ATT3(POTION, SUPER_ATTACK3, 3),
	SUPER_ATT4(POTION, SUPER_ATTACK4, 4),
	SUPER_COMB1(POTION, SUPER_COMBAT_POTION1, 1),
	SUPER_COMB2(POTION, SUPER_COMBAT_POTION2, 2),
	SUPER_COMB3(POTION, SUPER_COMBAT_POTION3, 3),
	SUPER_COMB4(POTION, SUPER_COMBAT_POTION4, 4),
	SUPER_DEF1(POTION, SUPER_DEFENCE1, 1),
	SUPER_DEF2(POTION, SUPER_DEFENCE2, 2),
	SUPER_DEF3(POTION, SUPER_DEFENCE3, 3),
	SUPER_DEF4(POTION, SUPER_DEFENCE4, 4),
	SUPER_ENERG1(POTION, SUPER_ENERGY1, 1),
	SUPER_ENERG2(POTION, SUPER_ENERGY2, 2),
	SUPER_ENERG3(POTION, SUPER_ENERGY3, 3),
	SUPER_ENERG4(POTION, SUPER_ENERGY4, 4),
	SUPER_MAG1(POTION, SUPER_MAGIC_POTION_1, 1),
	SUPER_MAG2(POTION, SUPER_MAGIC_POTION_2, 2),
	SUPER_MAG3(POTION, SUPER_MAGIC_POTION_3, 3),
	SUPER_MAG4(POTION, SUPER_MAGIC_POTION_4, 4),
	SUPER_RANG1(POTION, SUPER_RANGING_1, 1),
	SUPER_RANG2(POTION, SUPER_RANGING_2, 2),
	SUPER_RANG3(POTION, SUPER_RANGING_3, 3),
	SUPER_RANG4(POTION, SUPER_RANGING_4, 4),
	SUPER_REST1(POTION, SUPER_RESTORE1, 1),
	SUPER_REST2(POTION, SUPER_RESTORE2, 2),
	SUPER_REST3(POTION, SUPER_RESTORE3, 3),
	SUPER_REST4(POTION, SUPER_RESTORE4, 4),
	TCRYSTAL1(TELEPORT, TELEPORT_CRYSTAL_1, 1),
	TCRYSTAL2(TELEPORT, TELEPORT_CRYSTAL_2, 2),
	TCRYSTAL3(TELEPORT, TELEPORT_CRYSTAL_3, 3),
	TCRYSTAL4(TELEPORT, TELEPORT_CRYSTAL_4, 4),
	TCRYSTAL5(TELEPORT, TELEPORT_CRYSTAL_5, 5),
	WCAN0(WATERCAN, WATERING_CAN, 0),
	WCAN1(WATERCAN, WATERING_CAN1, 1),
	WCAN2(WATERCAN, WATERING_CAN2, 2),
	WCAN3(WATERCAN, WATERING_CAN3, 3),
	WCAN4(WATERCAN, WATERING_CAN4, 4),
	WCAN5(WATERCAN, WATERING_CAN5, 5),
	WCAN6(WATERCAN, WATERING_CAN6, 6),
	WCAN7(WATERCAN, WATERING_CAN7, 7),
	WCAN8(WATERCAN, WATERING_CAN8, 8),
	WSKIN0(WATERSKIN, WATERSKIN0, 0),
	WSKIN1(WATERSKIN, WATERSKIN1, 1),
	WSKIN2(WATERSKIN, WATERSKIN2, 2),
	WSKIN3(WATERSKIN, WATERSKIN3, 3),
	WSKIN4(WATERSKIN, WATERSKIN4, 4),
	ZAMORAK_BR1(POTION, ZAMORAK_BREW1, 1),
	ZAMORAK_BR2(POTION, ZAMORAK_BREW2, 2),
	ZAMORAK_BR3(POTION, ZAMORAK_BREW3, 3),
	ZAMORAK_BR4(POTION, ZAMORAK_BREW4, 4),
	;

	private final ItemChargeType type;
	private final int id;
	private final int charges;

	private static final Map<Integer, ItemWithCharge> ID_MAP;

	static
	{
		ImmutableMap.Builder<Integer, ItemWithCharge> builder = new ImmutableMap.Builder<>();

		for (ItemWithCharge itemCharge : values())
		{
			builder.put(itemCharge.getId(), itemCharge);
		}

		ID_MAP = builder.build();
	}

	@Nullable
	static ItemWithCharge findItem(int itemId)
	{
		return ID_MAP.get(itemId);
	}

}
