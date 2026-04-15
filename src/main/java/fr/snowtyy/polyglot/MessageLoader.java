package fr.snowtyy.polyglot;

import org.bukkit.plugin.Plugin;

/**
 * @author Snowtyy
 */
public interface MessageLoader {

    void loadMessages(MessageStore messageStore, Plugin plugin);

}
