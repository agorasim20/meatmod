package com.agorasim.meat;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.Item.Settings;

public class FoodRegistry {
    
    public static final Item ENCHANTED_COAL_BEEF = new GlintModEffect(new Settings().group(MeatMod.ITEM_GROUP).food(Food.ECOAL));
    public static final Item ENCHANTED_COPPER_BEEF = new GlintModEffect(new Settings().group(MeatMod.ITEM_GROUP).food(Food.ECOPPER));
    public static final Item ENCHANTED_EMERALD_BEEF = new GlintModEffect(new Settings().group(MeatMod.ITEM_GROUP).food(Food.EEMERALD));
    public static final Item ENCHANTED_LAPIS_BEEF = new GlintModEffect(new Settings().group(MeatMod.ITEM_GROUP).food(Food.ELAPIS));
    public static final Item ENCHANTED_OBSIDIAN_BEEF = new GlintModEffect(new Settings().group(MeatMod.ITEM_GROUP).food(Food.EOBSIDIAN));
    public static final Item ENCHANTED_DIAMOND_BEEF = new GlintModEffect(new Settings().group(MeatMod.ITEM_GROUP).food(Food.EDIAMOND));
    public static final Item ENCHANTED_NETHERITE_BEEF = new GlintModEffect(new Settings().group(MeatMod.ITEM_GROUP).food(Food.ENETHERITE));
    public static final Item ENCHANTED_IRON_BEEF = new GlintModEffect(new Settings().group(MeatMod.ITEM_GROUP).food(Food.EIRON));
    public static final Item ENCHANTED_GOLD_BEEF = new GlintModEffect(new Settings().group(MeatMod.ITEM_GROUP).food(Food.EGOLD));

    public static final Item ENCHANTED_COAL_PORK = new GlintModEffect(new Settings().group(MeatMod.ITEM_GROUP).food(Food.ECOAL));
    public static final Item ENCHANTED_COPPER_PORK = new GlintModEffect(new Settings().group(MeatMod.ITEM_GROUP).food(Food.ECOPPER));
    public static final Item ENCHANTED_EMERALD_PORK = new GlintModEffect(new Settings().group(MeatMod.ITEM_GROUP).food(Food.EEMERALD));
    public static final Item ENCHANTED_LAPIS_PORK = new GlintModEffect(new Settings().group(MeatMod.ITEM_GROUP).food(Food.ELAPIS));
    public static final Item ENCHANTED_OBSIDIAN_PORK = new GlintModEffect(new Settings().group(MeatMod.ITEM_GROUP).food(Food.EOBSIDIAN));
    public static final Item ENCHANTED_DIAMOND_PORK = new GlintModEffect(new Settings().group(MeatMod.ITEM_GROUP).food(Food.EDIAMOND));
    public static final Item ENCHANTED_NETHERITE_PORK = new GlintModEffect(new Settings().group(MeatMod.ITEM_GROUP).food(Food.ENETHERITE));
    public static final Item ENCHANTED_IRON_PORK = new GlintModEffect(new Settings().group(MeatMod.ITEM_GROUP).food(Food.EIRON));
    public static final Item ENCHANTED_GOLD_PORK = new GlintModEffect(new Settings().group(MeatMod.ITEM_GROUP).food(Food.EGOLD));

    public static final Item COAL_BEEF = new    Item (new Settings().group(MeatMod.ITEM_GROUP).food(Food.COAL));
    public static final Item COPPER_BEEF = new Item(new Settings().group(MeatMod.ITEM_GROUP).food(Food.COPPER));
    public static final Item EMERALD_BEEF = new Item(new Settings().group(MeatMod.ITEM_GROUP).food(Food.EMERALD));
    public static final Item LAPIS_BEEF = new Item(new Settings().group(MeatMod.ITEM_GROUP).food(Food.LAPIS));
    public static final Item OBSIDIAN_BEEF = new Item(new Settings().group(MeatMod.ITEM_GROUP).food(Food.OBSIDIAN));
    public static final Item DIAMOND_BEEF = new Item(new Settings().group(MeatMod.ITEM_GROUP).food(Food.DIAMOND));
    public static final Item NETHERITE_BEEF = new Item(new Settings().group(MeatMod.ITEM_GROUP).fireproof().food(Food.NETHERITE));
    public static final Item IRON_BEEF = new Item(new Settings().group(MeatMod.ITEM_GROUP).food(Food.IRON));
    public static final Item GOLD_BEEF = new Item(new Settings().group(MeatMod.ITEM_GROUP).food(Food.GOLD));

    public static final Item COAL_PORK = new Item(new Settings().group(MeatMod.ITEM_GROUP).food(Food.COAL));
    public static final Item COPPER_PORK = new Item(new Settings().group(MeatMod.ITEM_GROUP).food(Food.COPPER));
    public static final Item EMERALD_PORK = new Item(new Settings().group(MeatMod.ITEM_GROUP).food(Food.EMERALD));
    public static final Item LAPIS_PORK = new Item(new Settings().group(MeatMod.ITEM_GROUP).food(Food.LAPIS));
    public static final Item OBSIDIAN_PORK = new Item(new Settings().group(MeatMod.ITEM_GROUP).food(Food.OBSIDIAN));
    public static final Item DIAMOND_PORK = new Item(new Settings().group(MeatMod.ITEM_GROUP).food(Food.DIAMOND));
    public static final Item NETHERITE_PORK = new Item(new Settings().group(MeatMod.ITEM_GROUP).fireproof().food(Food.NETHERITE));
    public static final Item IRON_PORK = new Item(new Settings().group(MeatMod.ITEM_GROUP).food(Food.IRON));
    public static final Item GOLD_PORK = new Item(new Settings().group(MeatMod.ITEM_GROUP).food(Food.GOLD));

    public static void init() {
        Registry.register(Registry.ITEM, new Identifier("meat", "beef_coal"), COAL_BEEF);
        Registry.register(Registry.ITEM, new Identifier("meat", "beef_copper"), COPPER_BEEF);
        Registry.register(Registry.ITEM, new Identifier("meat", "beef_emerald"), EMERALD_BEEF);
        Registry.register(Registry.ITEM, new Identifier("meat", "beef_lapis"), LAPIS_BEEF);
        Registry.register(Registry.ITEM, new Identifier("meat", "beef_obsidian"), OBSIDIAN_BEEF);
        Registry.register(Registry.ITEM, new Identifier("meat", "beef_diamond"), DIAMOND_BEEF);
        Registry.register(Registry.ITEM, new Identifier("meat", "beef_netherite"), NETHERITE_BEEF);
        Registry.register(Registry.ITEM, new Identifier("meat", "beef_iron"), IRON_BEEF);
        Registry.register(Registry.ITEM, new Identifier("meat", "beef_gold"), GOLD_BEEF);
      
        Registry.register(Registry.ITEM, new Identifier("meat", "enchanted_beef_coal"), ENCHANTED_COAL_BEEF);
        Registry.register(Registry.ITEM, new Identifier("meat", "enchanted_beef_copper"), ENCHANTED_COPPER_BEEF);
        Registry.register(Registry.ITEM, new Identifier("meat", "enchanted_beef_emerald"), ENCHANTED_EMERALD_BEEF);
        Registry.register(Registry.ITEM, new Identifier("meat", "enchanted_beef_lapis"), ENCHANTED_LAPIS_BEEF);
        Registry.register(Registry.ITEM, new Identifier("meat", "enchanted_beef_obsidian"), ENCHANTED_OBSIDIAN_BEEF);
        Registry.register(Registry.ITEM, new Identifier("meat", "enchanted_beef_diamond"), ENCHANTED_DIAMOND_BEEF);
        Registry.register(Registry.ITEM, new Identifier("meat", "enchanted_beef_netherite"), ENCHANTED_NETHERITE_BEEF);
        Registry.register(Registry.ITEM, new Identifier("meat", "enchanted_beef_iron"), ENCHANTED_IRON_BEEF);
        Registry.register(Registry.ITEM, new Identifier("meat", "enchanted_beef_gold"), ENCHANTED_GOLD_BEEF);

        Registry.register(Registry.ITEM, new Identifier("meat", "pork_coal"), COAL_PORK);
        Registry.register(Registry.ITEM, new Identifier("meat", "pork_copper"), COPPER_PORK);
        Registry.register(Registry.ITEM, new Identifier("meat", "pork_emerald"), EMERALD_PORK);
        Registry.register(Registry.ITEM, new Identifier("meat", "pork_lapis"), LAPIS_PORK);
        Registry.register(Registry.ITEM, new Identifier("meat", "pork_obsidian"), OBSIDIAN_PORK);
        Registry.register(Registry.ITEM, new Identifier("meat", "pork_diamond"), DIAMOND_PORK);
        Registry.register(Registry.ITEM, new Identifier("meat", "pork_netherite"), NETHERITE_PORK);
        Registry.register(Registry.ITEM, new Identifier("meat", "pork_iron"), IRON_PORK);
        Registry.register(Registry.ITEM, new Identifier("meat", "pork_gold"), GOLD_PORK);

        Registry.register(Registry.ITEM, new Identifier("meat", "enchanted_pork_coal"), ENCHANTED_COAL_PORK);
        Registry.register(Registry.ITEM, new Identifier("meat", "enchanted_pork_copper"), ENCHANTED_COPPER_PORK);
        Registry.register(Registry.ITEM, new Identifier("meat", "enchanted_pork_emerald"), ENCHANTED_EMERALD_PORK);
        Registry.register(Registry.ITEM, new Identifier("meat", "enchanted_pork_lapis"), ENCHANTED_LAPIS_PORK);
        Registry.register(Registry.ITEM, new Identifier("meat", "enchanted_pork_obsidian"), ENCHANTED_OBSIDIAN_PORK);
        Registry.register(Registry.ITEM, new Identifier("meat", "enchanted_pork_diamond"), ENCHANTED_DIAMOND_PORK);
        Registry.register(Registry.ITEM, new Identifier("meat", "enchanted_pork_netherite"), ENCHANTED_NETHERITE_PORK);
        Registry.register(Registry.ITEM, new Identifier("meat", "enchanted_pork_iron"), ENCHANTED_IRON_PORK);
        Registry.register(Registry.ITEM, new Identifier("meat", "enchanted_pork_gold"), ENCHANTED_GOLD_PORK);
    }
}