package patterns.structural.flyweight.forest;

import patterns.structural.flyweight.trees.Tree;
import patterns.structural.flyweight.trees.TreeFactory;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        var type = TreeFactory.getTreeType(name, color, otherTreeData);
        var tree = new Tree(x, y, type);
        trees.add(tree);
    }

    public void paint(Graphics graphics) {
        trees.forEach(tree -> tree.draw(graphics));
    }
}