package patterns.structural.flyweight.example;

import java.io.IOException;

class FlyweightMain {
    public static void main(String[] args) throws IOException {
        String doc = "AABACCAB";
        char[] chars = doc.toCharArray();

        GreetingFactory factory = new GreetingFactory();
        String[] array = new String[]{"man/teen/idea.png", "man/child/4.jpg", "woman/child/5.jpg"};

        for (int i = 0; i < chars.length; i++) {
            GreetingCard greetingCard = factory.getGreeting(chars[i]);
            greetingCard.display(array[i % 3]);
        }
    }
}