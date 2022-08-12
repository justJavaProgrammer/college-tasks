package edu.odeyalotasks.second.services;

/**
 * Resolves the previous number of the given number
 */
public interface PreviouslyNumberResolver extends PreviouslyNumberResolverAutoRegistry{

    /**
     *
     * @param givenNumber
     * @return - returns previous number
     */
    Integer resolvePreviouslyNumber(Integer givenNumber);

}
