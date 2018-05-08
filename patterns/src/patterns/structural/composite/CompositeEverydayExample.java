package patterns.structural.composite;

import java.util.HashMap;

public class CompositeEverydayExample {
    public static void showExample() {
        var personAttributes = new HashMap<String, String>();

        personAttributes.put("site_role", "person");
        personAttributes.put("access_role", "limited");

        var groupAttributes = new HashMap<String, String>();

        groupAttributes.put("group_role", "claims");

        var secAttributes = new HashMap<String, String>();

        secAttributes.putAll(personAttributes);
        secAttributes.putAll(groupAttributes);

        System.out.println(secAttributes);
    }
}