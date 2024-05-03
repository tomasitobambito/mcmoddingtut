package net.tomasitobambito.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.tomasitobambito.tutorialmod.TutorialMod;
import net.tomasitobambito.tutorialmod.item.custom.MetalDetectorItem;

public class ModItems {

    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new Item.Settings()));

    public static final Item TOMATO = registerItem("tomato",
            new Item(new Item.Settings().food(ModFoodComponents.TOMATO)));

    public static final Item COAL_BRICKLET = registerItem("coal_bricklet", new Item(new Item.Settings()));

    public static final Item METAL_DETECTOR = registerItem("metal_detector",
            new MetalDetectorItem(new Item.Settings().maxDamage(64)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(RAW_RUBY);
    }

    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
        new PickaxeItem(ModToolMaterial.RUBY, new Item.Settings()
                .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.RUBY,
                        2.0f, 2.0f))));
    public static final Item RUBY_AXE = registerItem("ruby_axe",
        new AxeItem(ModToolMaterial.RUBY, new Item.Settings()
                .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.RUBY,
                        2.0f, 2.0f))));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
        new ShovelItem(ModToolMaterial.RUBY, new Item.Settings()
                .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.RUBY,
                        2.0f, 2.0f))));
    public static final Item RUBY_SWORD = registerItem("ruby_sword",
        new SwordItem(ModToolMaterial.RUBY, new Item.Settings()
                .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.RUBY,
                        5.0f, 3.0f))));
    public static final Item RUBY_HOE = registerItem("ruby_hoe",
        new HoeItem(ModToolMaterial.RUBY, new Item.Settings()
                .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.RUBY,
                        2.0f, 2.0f))));


    public static final Item RUBY_HELMET = registerItem("ruby_helmet",
            new ArmorItem(ModArmorMaterial.RUBY, ArmorItem.Type.HELMET, new Item.Settings().maxCount(1)));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",
            new ArmorItem(ModArmorMaterial.RUBY, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxCount(1)));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings",
            new ArmorItem(ModArmorMaterial.RUBY, ArmorItem.Type.LEGGINGS, new Item.Settings().maxCount(1)));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots",
            new ArmorItem(ModArmorMaterial.RUBY, ArmorItem.Type.BOOTS, new Item.Settings().maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
