package fr.snowtyy.polyglot;

import java.util.Optional;

/**
 * @author Snowtyy
 */
@FunctionalInterface
public interface LanguageResolver {

    Optional<String> resolve(Object context);

}
