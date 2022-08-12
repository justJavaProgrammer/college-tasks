package edu.odeyalotasks.second.config;

import edu.odeyalotasks.second.factories.DefaultPreviouslyNumberResolverFactory;
import edu.odeyalotasks.second.factories.PreviouslyNumberResolverContainer;
import edu.odeyalotasks.second.factories.PreviouslyNumberResolverFactory;
import edu.odeyalotasks.second.factories.PreviouslyNumberResolverRegistry;
import edu.odeyalotasks.second.services.NextNumberResolver;
import edu.odeyalotasks.second.services.PreviouslyNumberResolver;
import edu.odeyalotasks.second.services.SimpleNextNumberResolver;
import edu.odeyalotasks.second.services.SimplePreviouslyNumberResolver;
import edu.odeyalotasks.second.services.facade.NumberCalculatorPrinterFacade;
import edu.odeyalotasks.second.services.facade.PreviouslyAndNextNumberCalculatorPrinterFacade;
import edu.odeyalotasks.second.services.printers.DefaultConsoleOutputMessagePrinter;
import edu.odeyalotasks.second.services.printers.OutputMessagePrinter;
import edu.odeyalotasks.second.services.strategy.ConsoleOutputMessageStrategy;
import edu.odeyalotasks.second.services.strategy.OutputMessageStrategy;
import edu.odeyalotasks.second.services.support.ConsoleNumberScanner;
import edu.odeyalotasks.second.services.support.DefaultPreviouslyNumberResolverAutoRegistrarExecutor;
import edu.odeyalotasks.second.services.support.NumberScanner;
import edu.odeyalotasks.second.services.support.PreviouslyNumberResolverAutoRegistrarExecutor;

public class SecondTaskApplicationConfiguration {

    public final void initConfig() {
        this.numberScanner();
        this.nextNumberResolver();
        this.previouslyNumberResolverFactory();
        this.consoleOutputMessageStrategy();
        this.previouslyNumberResolverRegistry();
        this.previouslyNumberResolverAutoRegistrarExecutor();
    }
    public NextNumberResolver nextNumberResolver() {
        return new SimpleNextNumberResolver();
    }

    public OutputMessagePrinter printer() {
        return new DefaultConsoleOutputMessagePrinter();
    }

    public OutputMessageStrategy consoleOutputMessageStrategy() {
        return new ConsoleOutputMessageStrategy();
    }

    public NumberScanner numberScanner() {
        return new ConsoleNumberScanner();
    }

    public PreviouslyNumberResolverAutoRegistrarExecutor previouslyNumberResolverAutoRegistrarExecutor() {
        return new DefaultPreviouslyNumberResolverAutoRegistrarExecutor(previouslyNumberResolverRegistry());
    }

    public PreviouslyNumberResolverRegistry previouslyNumberResolverRegistry() {
        PreviouslyNumberResolverContainer container = new PreviouslyNumberResolverContainer();
        container.registerResolver("simple", new SimplePreviouslyNumberResolver());
        return container;
    }

    public PreviouslyNumberResolverFactory previouslyNumberResolverFactory() {
        return new DefaultPreviouslyNumberResolverFactory(previouslyNumberResolverRegistry());
    }

    public NumberCalculatorPrinterFacade numberCalculatorPrinterFacade(PreviouslyNumberResolver previouslyNumberResolver, NextNumberResolver nextNumberResolver, OutputMessagePrinter printer) {
        return new PreviouslyAndNextNumberCalculatorPrinterFacade(nextNumberResolver, previouslyNumberResolver, printer);
    }
}
