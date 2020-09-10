package org.neonsis.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Travers all graph elements into array using Depth-first Search
 * Graph:
 * A
 * /  |  \
 * B   C   D
 * /  \    /  \
 * E   F   G     H
 * /  \   \
 * I    J   K
 * Result : [A,B,E,F,I,J,C,D,G,K,H]
 */
public class DepthFirstSearch {

    public static void main(String[] args) {
        Node root = new Node("A");

        Node b = root.addChild("B");
        b.addChild("E");

        Node f = b.addChild("F");
        f.addChild("I");
        f.addChild("J");

        root.addChild("C");

        Node d = root.addChild("D");
        Node g = d.addChild("G");
        g.addChild("K");
        d.addChild("H");

        List<String> strings = root.depthFirstSearch(new ArrayList<>());
        System.out.println(strings);
    }

    static class Node {
        String name;
        List<Node> children = new ArrayList<>();

        public Node(String name) {
            this.name = name;
        }

        // Recursion solution (n) - time, (n) - space
        public List<String> depthFirstSearch(List<String> array) {
            array.add(name);
            for (Node child : children) {
                child.depthFirstSearch(array);
            }
            return array;
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return child;
        }
    }
}
