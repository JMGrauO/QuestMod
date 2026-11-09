package me.mithosus.questmod.item;

import me.mithosus.questmod.QuestMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    private static Item registrarItem (String nombre, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(QuestMod.MOD_ID, nombre), item);
    }

    public static void registrarItemsMod(){
        QuestMod.LOGGER.info("Registrando items del Mod " + QuestMod.MOD_ID);
    }
}
