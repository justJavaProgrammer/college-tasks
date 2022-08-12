package edu.odeyalotasks.second.factories;

import edu.odeyalotasks.second.services.PreviouslyNumberResolver;

public interface PreviouslyNumberResolverFactory {


    PreviouslyNumberResolver getPreviouslyNumberResolver(String resolverType);

}
