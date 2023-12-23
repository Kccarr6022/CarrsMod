package net.kadencarr.carrsmod.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.kadencarr.carrsmod.CarrsMod;


@Mod.EventBusSubscriber(modid = CarrsMod.MOD_ID, bus= Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTab {
    public static CreativeModeTab CarrsMod;

//    @SubscribeEvent
//    public static void registerCreativeMode(CreateModeTabEvent.Register event) {
//
//    }
//    public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab("tutorialtab") {
//        @Override
//        public ItemStack makeIcon() {
//            return new ItemStack(ModItems.CAR.get());
//        }
//    };
//
//
//    public static final CreativeModeTab TUTORIAL_TAB_2 = new CreativeModeTab("tutorialtab_2") {
//        @Override
//        public ItemStack makeIcon() {
//            return new ItemStack(ModItems.LITHIUM.get());
//        }
//    };
}
