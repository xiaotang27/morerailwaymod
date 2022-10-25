package morerailway.morerailway;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Morerailway implements ModInitializer {
    public static final Block TP_1 = new Block(FabricBlockSettings.of(Material.METAL));
    public static final Block TP_2 = new Block(FabricBlockSettings.of(Material.METAL));
    public static final Block TP_3 = new Block(FabricBlockSettings.of(Material.METAL));
    public static final Block CEILING = new Block(FabricBlockSettings.of(Material.METAL));

    public static final ItemGroup TP = FabricItemGroupBuilder.build(
            new Identifier("morerailway", "general"),
            () -> new ItemStack(Morerailway.TP_1));

    public static final ItemGroup DEC = FabricItemGroupBuilder.create(
                    new Identifier("morerailway", "dec"))
            .icon(() -> new ItemStack(Morerailway.CEILING))
            .build();

    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier("morerailway", "tp_1"), TP_1);
        Registry.register(Registry.ITEM, new Identifier("morerailway", "tp_1"), new BlockItem(TP_1, new Item.Settings().group(Morerailway.TP)));
        Registry.register(Registry.BLOCK, new Identifier("morerailway", "tp_2"), TP_2);
        Registry.register(Registry.ITEM, new Identifier("morerailway", "tp_2"), new BlockItem(TP_2, new Item.Settings().group(Morerailway.TP)));
        Registry.register(Registry.BLOCK, new Identifier("morerailway", "tp_3"), TP_3);
        Registry.register(Registry.ITEM, new Identifier("morerailway", "tp_3"), new BlockItem(TP_3, new Item.Settings().group(Morerailway.TP)));
        Registry.register(Registry.BLOCK, new Identifier("morerailway", "ceiling"), CEILING);
        Registry.register(Registry.ITEM, new Identifier("morerailway", "ceiling"), new BlockItem(CEILING, new Item.Settings().group(Morerailway.DEC)));
    }
}
