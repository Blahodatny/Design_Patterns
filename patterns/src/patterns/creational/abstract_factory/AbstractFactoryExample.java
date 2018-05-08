package patterns.creational.abstract_factory;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class AbstractFactoryExample {
    public static void showExample() {
        var abstractFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder factory = null;
        Document doc = null;
        try {
            factory = abstractFactory.newDocumentBuilder();
            doc = factory.parse(
                    new ByteArrayInputStream("<document><body><stock>AAPL</stock></body></document>".getBytes()));
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

        assert doc != null;
        doc.getDocumentElement().normalize();

        System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
        System.out.println(abstractFactory.getClass());
        System.out.println(factory.getClass());
    }
}