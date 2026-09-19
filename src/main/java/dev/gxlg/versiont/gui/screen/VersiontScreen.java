package dev.gxlg.versiont.gui.screen;

import dev.gxlg.versiont.api.R;
import dev.gxlg.versiont.gen.versiont.gui.net.minecraft.client.gui.screens.Screen;
import dev.gxlg.versiont.gen.versiont.gui.net.minecraft.network.chat.Component;

public class VersiontScreen extends Screen {
    public static final R.RClass clazz = R.extendWrapper(Screen.class, VersiontScreen.class);

    public VersiontScreen() {
        super(Component.nullToEmpty("Versiont Screen"));
    }
}
