package edu.odeyalotasks.second;

import edu.odeyalotasks.second.config.SecondTaskApplicationConfiguration;
import edu.odeyalotasks.second.factories.PreviouslyNumberResolverFactory;
import edu.odeyalotasks.second.services.PreviouslyNumberResolver;
import edu.odeyalotasks.second.services.facade.NumberCalculatorPrinterFacade;
import edu.odeyalotasks.second.services.support.ConsoleNumberScanner;

public class SecondTask {
    /**
     * Runs the second task and executes it
     */
    public static void run(SecondTaskApplicationConfiguration configuration) {
        configuration.initConfig();
        ConsoleNumberScanner scn = new ConsoleNumberScanner();
        Integer number = scn.scanNumber();
        PreviouslyNumberResolverFactory factory = configuration.previouslyNumberResolverFactory();
        PreviouslyNumberResolver simplePrevNumberResolver = factory.getPreviouslyNumberResolver("simple");
        NumberCalculatorPrinterFacade facade = configuration.numberCalculatorPrinterFacade(simplePrevNumberResolver, configuration.nextNumberResolver(), configuration.printer());
        facade.print(number);
    }
}
