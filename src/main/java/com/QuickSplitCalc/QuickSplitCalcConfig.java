package com.QuickSplitCalc;

import net.runelite.client.config.*;

@ConfigGroup("cashsplit")
public interface QuickSplitCalcConfig extends Config
{
	@ConfigItem(
			keyName = "enableSplitHelper",
			name = "Enable Split Helper",
			description = "Shows a clickable widget to auto-fill split amounts when trading",
			position = 2
	)
	default boolean enableSplitHelper()
	{
		return true;
	}

	@ConfigItem(
			keyName = "roundedSplits",
			name = "Rounded Splits",
			description = "Display split amounts in rounded format (e.g., 21.3M instead of 21,345,988)"
	)
	default boolean roundedSplits()
	{
		return false;
	}

	enum RoundingPlace
	{
		HUNDRED_THOUSAND("100,000"),
		TEN_THOUSAND("10,000"),
		ONE_THOUSAND("1,000");

		private final String name;
		RoundingPlace(String name) { this.name = name; }
		@Override
		public String toString() { return name; }
	}

	@ConfigItem(
			keyName = "roundingPlace",
			name = "Rounding Place",
			description = "Choose the place to round split amounts to",
			position = 1
	)
	default RoundingPlace roundingPlace()
	{
		return RoundingPlace.HUNDRED_THOUSAND;
	}

}
