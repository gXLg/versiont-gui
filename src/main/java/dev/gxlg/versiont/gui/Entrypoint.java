package dev.gxlg.versiont.gui;

import com.mojang.blaze3d.platform.InputConstants;
import dev.gxlg.versiont.gen.versiont.gui.net.minecraft.client.Minecraft;
import dev.gxlg.versiont.gui.screen.VersiontScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keymapping.v1.KeyMappingHelper;
import net.minecraft.client.KeyMapping;

public class Entrypoint implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        InputConstants.Key key = InputConstants.getKey("key.keyboard.i");
        KeyMapping mapping = new KeyMapping("test.key.test", key.getType(), key.getValue(), KeyMapping.Category.MISC);
        KeyMappingHelper.registerKeyMapping(mapping);

        ClientTickEvents.END_CLIENT_TICK.register(c -> {
            while (mapping.consumeClick()) {
                Minecraft.getInstance().getGuiField().setScreen(new VersiontScreen());
            }
        });
    }
}
