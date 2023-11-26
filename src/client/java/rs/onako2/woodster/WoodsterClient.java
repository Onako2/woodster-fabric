package rs.onako2.woodster;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class WoodsterClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(Woodster.ACACIA_LADDER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Woodster.BAMBOO_LADDER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Woodster.BIRCH_LADDER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Woodster.CHERRY_LADDER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Woodster.CRIMSON_LADDER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Woodster.DARK_OAK_LADDER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Woodster.JUNGLE_LADDER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Woodster.MANGROVE_LADDER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Woodster.SPRUCE_LADDER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Woodster.WARPED_LADDER, RenderLayer.getCutout());
	}
}