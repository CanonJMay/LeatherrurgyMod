package net.cancode.leatherurgy.screen;

import net.cancode.leatherurgy.Leatherrurgy;
import net.cancode.leatherurgy.screen.custom.DryingRackScreenHandler;
import net.cancode.leatherurgy.screen.custom.TanningVatScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

public class ModScreenHandler {

    public static final ScreenHandlerType<TanningVatScreenHandler> TANNING_VAT_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Leatherrurgy.MOD_ID, "tanning_vat_screen_handler"),
                    new ExtendedScreenHandlerType<>(TanningVatScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<DryingRackScreenHandler> DRYING_RACK_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Leatherrurgy.MOD_ID, "drying_rack_screen_handler"),
                    new ExtendedScreenHandlerType<>(DryingRackScreenHandler::new, BlockPos.PACKET_CODEC));

    public static void registerScreenHandler() {
        Leatherrurgy.LOGGER.info("Registering Screen Handlers for " + Leatherrurgy.MOD_ID);
    }
}
