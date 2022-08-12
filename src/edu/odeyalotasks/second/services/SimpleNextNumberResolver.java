package edu.odeyalotasks.second.services;

public class SimpleNextNumberResolver implements NextNumberResolver {

    @Override
    public Integer getNextNumber(Integer number) {
        return number + 1;
    }
}
