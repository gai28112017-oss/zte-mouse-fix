package com.example;

import net.fabricmc.api.ClientModInitializer;

public class MouseFixClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        System.out.println("[ZTE Mouse Fix] Client loaded!");
    }
}
