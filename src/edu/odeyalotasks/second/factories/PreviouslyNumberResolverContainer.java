package edu.odeyalotasks.second.factories;

import edu.odeyalotasks.second.services.PreviouslyNumberResolver;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PreviouslyNumberResolverContainer implements PreviouslyNumberResolverRegistry {
    private final Map<String, PreviouslyNumberResolver> resolvers = new ConcurrentHashMap<>();

    @Override
    public void registerResolver(String type, PreviouslyNumberResolver resolver) {
        this.resolvers.put(type, resolver);
    }

    @Override
    public PreviouslyNumberResolver getPreviouslyNumberResolver(String type) {
        return resolvers.get(type);
    }

    @Override
    public boolean containsResolverType(String type) {
        return resolvers.containsKey(type);
    }

    @Override
    public void removeByType(String type) {
        this.resolvers.remove(type);
    }

    @Override
    public void removeAll() {
        this.resolvers.keySet().removeAll(resolvers.keySet());
    }

    @Override
    public int size() {
        return resolvers.size();
    }


}
