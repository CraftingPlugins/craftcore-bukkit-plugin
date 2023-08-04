package dev.craftplugins.craftcore;

import org.bukkit.plugin.java.JavaPlugin;

public final class CraftCore extends JavaPlugin {

    public static void require(int major, int minor, int build) {
        CraftCore plugin = CraftCore.getPlugin(CraftCore.class);
        String version = plugin.getDescription().getVersion();

        String[] split = version.split("\\.");
        int currentMajor = Integer.parseInt(split[0]);
        int currentMinor = Integer.parseInt(split[1]);
        int currentBuild = Integer.parseInt(split[2]);

        if (currentMajor < major || currentMinor < minor || currentBuild < build) {
            throw new IllegalStateException("CraftCore version " + major + "." + minor + "." + build + " or higher is required. Please update CraftCore.");
        }
    }

}
