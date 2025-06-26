package net.serverstart;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.minecraft.server.MinecraftServer;

public class ServerStartFunctions implements ModInitializer {
    @Override
    public void onInitialize() {
        ServerLifecycleEvents.SERVER_STARTED.register(this::onServerStart);
    }

    private void onServerStart(MinecraftServer server) {
        server.getCommandManager().execute(server.getCommandSource(), "function gymkey:setup");
        server.getCommandManager().execute(server.getCommandSource(), "function candyswapper:setup");
    }
}
