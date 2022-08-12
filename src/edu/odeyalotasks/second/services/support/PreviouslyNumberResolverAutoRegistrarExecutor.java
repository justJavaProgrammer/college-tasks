package edu.odeyalotasks.second.services.support;

import edu.odeyalotasks.second.services.PreviouslyNumberResolver;

public interface PreviouslyNumberResolverAutoRegistrarExecutor {

    void registryResolverInFactory(String type, PreviouslyNumberResolver resolver);

}
