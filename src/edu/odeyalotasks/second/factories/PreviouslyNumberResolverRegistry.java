package edu.odeyalotasks.second.factories;

import edu.odeyalotasks.second.services.PreviouslyNumberResolver;

/**
 * Registry PreviouslyNumberResolver in container for factory
 */
public interface PreviouslyNumberResolverRegistry  {

    void registerResolver(String type, PreviouslyNumberResolver resolver);

    PreviouslyNumberResolver getPreviouslyNumberResolver(String type);

    boolean containsResolverType(String type);

    void removeByType(String type);

    void removeAll();

    int size();
}
