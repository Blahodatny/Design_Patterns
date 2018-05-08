package patterns.structural.facade.facade;

import patterns.structural.facade.Color;
import patterns.structural.facade.card.GenerateCard;
import patterns.structural.facade.card.Greeting;
import patterns.structural.facade.card.GreetingCard;

import java.io.IOException;

public class CardGenerationFacade {
    public CardGenerationFacade() {
    }

    public void generateGreetingCard(int age, String sex) throws IOException {
        System.out.println("CardGenerationFacade: generation started!!!");
        var greetingCard = new GreetingCard(age);
        Greeting greeting;
        if (sex.equals("man")) {
            if (age < 10)
                greeting = new Greeting(Color.ANSI_RED, "man/child/4.jpg");
            else
                greeting = new Greeting(Color.ANSI_GREEN, "man/teen/idea.png");
        } else {
            if (age < 10)
                greeting = new Greeting(Color.ANSI_BLUE, "woman/child/5.jpg");
            else
                greeting = new Greeting(Color.ANSI_PURPLE, "woman/teen/6.jpg");
        }

        greetingCard = GenerateCard.generate(greetingCard, greeting);
        System.out.println(greetingCard.toString());
        greetingCard.getGreeting().showImage();
        System.out.println("CardGenerationFacade: generation finished!!!");
    }
}