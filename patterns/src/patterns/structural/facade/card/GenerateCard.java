package patterns.structural.facade.card;

public class GenerateCard {
    public static GreetingCard generate(GreetingCard greetingCard, Greeting greeting) {
        greetingCard.setGreeting(greeting);
        return greetingCard;
    }
}