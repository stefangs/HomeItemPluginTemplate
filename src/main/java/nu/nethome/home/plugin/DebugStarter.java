package nu.nethome.home.plugin;

import nu.nethome.home.impl.HomeManagerStarter;
import nu.nethome.home.impl.SingleHomeItemFactory;

/**
 * This class is not really part of the plugin. It is a helper class to make it easier to test and debug
 * your plugin during development. Normally you would place the resulting .jar-file from this project in
 * the plugin-folder of your NetHomeServer-installation and run your server as usual to use your plugin.
 *
 * During development it is however practical to be able to run the server with your plugin statically linked
 * so debugging is easier. To do that, you run this class from your debugger, which will start the server
 * with a demo file and your plugin(s) loaded by the normal class loader.
 *
 * To get access to all needed dependencies you have to place a devkit-folder on the top level of this project.
 */
public class DebugStarter extends HomeManagerStarter{
    public static void main(String[] args) {
        HomeManagerStarter me = new DebugStarter();
        me.go(args, new SingleHomeItemFactory(PluginExample.class));
    }

    @Override
    protected String getDefaultFileName() {
        return "src/test/demo.xml";
    }

    @Override
    protected String getDefaultPluginDirectory() {
        return "devkit/plugin";
    }
}
