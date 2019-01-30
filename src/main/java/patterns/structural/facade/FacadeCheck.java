package patterns.structural.facade;

import patterns.structural.facade.facade.CardGenerationFacade;

import java.io.IOException;

public class FacadeCheck {
    public static void check() {
        var generationFacade = new CardGenerationFacade();
        try {
            generationFacade.generateGreetingCard(15, "man");
            generationFacade.generateGreetingCard(9, "woman");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}