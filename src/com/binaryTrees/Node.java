package com.binaryTrees;

public class Node<T extends Comparable<?>> {
    public int value;
    public Node left;
    public Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
