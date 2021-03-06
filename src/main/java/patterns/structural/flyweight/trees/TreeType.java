package patterns.structural.flyweight.trees;

import java.awt.Graphics;
import java.awt.Color;

class TreeType {
    private final String name;
    private final Color color;
    private final String otherTreeData;

    TreeType(String name, Color color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }
}