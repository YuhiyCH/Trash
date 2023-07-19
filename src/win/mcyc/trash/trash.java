package win.mcyc.trash;

import org.bukkit.plugin.java.JavaPlugin;

public class trash extends JavaPlugin{
    private static trash instance;
    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        reloadConfig();
        getCommand("trash").setExecutor(new command());
    }
    public static trash getInstance() {
        return instance;
    }
}
