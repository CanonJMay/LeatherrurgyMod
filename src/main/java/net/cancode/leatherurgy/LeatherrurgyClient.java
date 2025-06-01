package net.cancode.leatherurgy;

import net.cancode.leatherurgy.screen.ModScreenHandler;
import net.cancode.leatherurgy.screen.custom.TanningVatScreen;
import net.cancode.leatherurgy.screen.custom.TanningVatScreenHandler;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

public class LeatherrurgyClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandler.TANNING_VAT_SCREEN_HANDLER, TanningVatScreen::new);

    }
}
