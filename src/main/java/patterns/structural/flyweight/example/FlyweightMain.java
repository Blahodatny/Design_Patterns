package patterns.structural.flyweight.example;

import java.io.IOException;

class FlyweightMain {
    public static void main(String[] args) throws IOException {
        var doc = "AABACCAB";
        var chars = doc.toCharArray();

        var factory = new GreetingFactory();
        var array = new String[]{
                "man/teen/idea.png",
                "man/child/4.jpg",
                "woman/child/5.jpg"
        };

        for (var i = 0; i < chars.length; i++) {
            var greetingCard = factory.getGreeting(chars[i]);
            greetingCard.display(array[i % 3]);
        }
    }
}