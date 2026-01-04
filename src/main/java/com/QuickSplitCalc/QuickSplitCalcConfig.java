package com.QuickSplitCalc;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("cashsplit")
public interface QuickSplitCalcConfig extends Config
{

	@ConfigItem(
			keyName = "roundedSplits",
			name = "Rounded Splits",
			description = "Display split amounts in rounded format (e.g., 21.3M instead of 21,345,988)"
	)
	default boolean roundedSplits()
	{
		return false;
	}
}
