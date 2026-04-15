package fr.snowtyy.polyglot;

import org.bukkit.plugin.Plugin;

import java.util.function.BiConsumer;

/**
 * @author Snowtyy
 */
public interface MessageLoader {

    void loadMessages(MessageStore messageStore, Plugin plugin, BiConsumer<LogLevel, String> log);

    enum LogLevel {
        INFO,
        WARN
    }
}
