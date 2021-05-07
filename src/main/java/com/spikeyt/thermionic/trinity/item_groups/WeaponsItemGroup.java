package com.spikeyt.thermionic.trinity.item_groups;

import com.spikeyt.thermionic.trinity.lists.TrinityItems;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class WeaponsItemGroup extends ItemGroup {
	
	public WeaponsItemGroup() {
		
		super("weapons");
	}


	@Override
	public ItemStack makeIcon() {
		// TODO Auto-generated method stub
		return new ItemStack(TrinityItems.battle_axe_netherite);
	}


}