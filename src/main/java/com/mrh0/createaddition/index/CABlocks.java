package com.mrh0.createaddition.index;

import static com.simibubi.create.foundation.data.ModelGen.customItemModel;
import com.mrh0.createaddition.CreateAddition;
import com.mrh0.createaddition.blocks.alternator.AlternatorBlock;
import com.mrh0.createaddition.blocks.electric_motor.ElectricMotorBlock;
import com.mrh0.createaddition.groups.ModGroup;
import com.simibubi.create.AllTags.AllBlockTags;
import com.simibubi.create.foundation.config.StressConfigDefaults;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.data.SharedProperties;
import com.simibubi.create.repack.registrate.util.entry.BlockEntry;

public class CABlocks {
	
	private static final CreateRegistrate REGISTRATE = CreateAddition.registrate()
			.itemGroup(() -> ModGroup.MAIN);
	
	public static final BlockEntry<ElectricMotorBlock> ELECTRIC_MOTOR = REGISTRATE.block("electric_motor", ElectricMotorBlock::new)
			.initialProperties(SharedProperties::stone)
			.tag(AllBlockTags.SAFE_NBT.tag) //Dono what this tag means (contraption safe?).
			//.transform(StressConfigDefaults.setCapacity(16.0))
			.item()
			.transform(customItemModel())
			.register();
	
	public static final BlockEntry<AlternatorBlock> ALTERNATOR = REGISTRATE.block("alternator", AlternatorBlock::new)
			.initialProperties(SharedProperties::stone)
			.transform(StressConfigDefaults.setImpact(8.0))
			.tag(AllBlockTags.SAFE_NBT.tag) //Dono what this tag means (contraption safe?).
			.item()
			.transform(customItemModel())
			.register();
	
	public static void register() {}
}
