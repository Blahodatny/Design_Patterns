package patterns.structural.flyweight.example;

import java.util.HashMap;

class GreetingFactory {
    private final HashMap<Character, GreetingCard> hashMap = new HashMap<>();

    GreetingCard getGreeting(char key) {
        GreetingCard greetingCard = null;
        if (hashMap.containsKey(key))
            greetingCard = hashMap.get(key);
        else {
            greetingCard = switch (key) {
                case 'A' -> new ChildGirl();
                case 'B' -> new ChildBoy();
                case 'C' -> new TeenBoy();
                default -> greetingCard;
            };
            hashMap.put(key, greetingCard);
        }
        return greetingCard;
    }
}