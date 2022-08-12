package edu.odeyalotasks.second.services.support;

import edu.odeyalotasks.second.factories.PreviouslyNumberResolverRegistry;
import edu.odeyalotasks.second.services.PreviouslyNumberResolver;

public class DefaultPreviouslyNumberResolverAutoRegistrarExecutor implements PreviouslyNumberResolverAutoRegistrarExecutor {
    private final PreviouslyNumberResolverRegistry resolverRegistry;

    public DefaultPreviouslyNumberResolverAutoRegistrarExecutor(PreviouslyNumberResolverRegistry resolverRegistry) {
        this.resolverRegistry = resolverRegistry;
    }

    @Override
    public void registryResolverInFactory(String type, PreviouslyNumberResolver resolver) {
        this.resolverRegistry.registerResolver(type, resolver);
    }
}
