package edu.odeyalotasks.second.services;

public class SimplePreviouslyNumberResolver implements PreviouslyNumberResolver {

    @Override
    public Integer resolvePreviouslyNumber(Integer givenNumber) {
        return givenNumber - 1;
    }

    @Override
    public String getType() {
        return "simple";
    }

    @Override
    public PreviouslyNumberResolver getPreviouslyNumberResolver() {
        return this;
    }
}
