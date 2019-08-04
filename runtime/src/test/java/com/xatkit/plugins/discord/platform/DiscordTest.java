package com.xatkit.plugins.discord.platform;

import com.xatkit.AbstractXatkitTest;
import com.xatkit.test.util.VariableLoaderHelper;

/**
 * An abstract test for the Discord Platform.
 * <p>
 * This class provides utility methods to load the Discord token stored in the {@code test-variables.properties} file,
 * and can be extended by all the Discord tests to easily construct {@link DiscordPlatform} instances.
 */
public class DiscordTest extends AbstractXatkitTest {

    /**
     * The {@code test-variables.properties} key used to retrieve the Discord token to use.
     */
    private static String XATKIT_DISCORD_TOKEN = "XATKIT_DISCORD_TOKEN";

    /**
     * Retrieves the Discord token stored in the {@code test-variables.properties} file.
     * @return the Discord token if it exists, {@code null} otherwise
     */
    protected String getDiscordToken() {
        return VariableLoaderHelper.getVariable(XATKIT_DISCORD_TOKEN);
    }

}
