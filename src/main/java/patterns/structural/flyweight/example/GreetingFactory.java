package patterns.structural.flyweight.example;

import java.util.HashMap;

class GreetingFactory {
    private HashMap<Character, GreetingCard> hashMap = new HashMap<>();

    GreetingCard getGreeting(char key) {
        GreetingCard greetingCard = null;
        if (hashMap.containsKey(key))
            greetingCard = hashMap.get(key);
        else {
            switch (key) {
                case 'A':
                    greetingCard = new ChildGirl();
                    break;

                case 'B':
                    greetingCard = new ChildBoy();
                    break;

                case 'C':
                    greetingCard = new TeenBoy();
                    break;
            }
            hashMap.put(key, greetingCard);
        }
        return greetingCard;
    }
}