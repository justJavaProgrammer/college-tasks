package edu.odeyalotasks.second.factories;

import edu.odeyalotasks.second.services.PreviouslyNumberResolver;

public class DefaultPreviouslyNumberResolverFactory implements PreviouslyNumberResolverFactory {
    private final PreviouslyNumberResolverRegistry container;

    public DefaultPreviouslyNumberResolverFactory(PreviouslyNumberResolverRegistry container) {
        this.container = container;
    }

    @Override
    public PreviouslyNumberResolver getPreviouslyNumberResolver(String type) {
        return container.getPreviouslyNumberResolver(type);
    }
}
