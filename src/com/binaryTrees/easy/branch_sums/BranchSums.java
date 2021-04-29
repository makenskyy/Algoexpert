package com.binaryTrees.easy.branch_sums;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.binaryTrees.BinaryTreePrinter;
import com.binaryTrees.Node;

public class BranchSums {
    public static void main(String[] args) {
        Node binaryTree = new Node(10);
        binaryTree.left = new Node(6);
        binaryTree.right = new Node(20);
        binaryTree.left.right = new Node(8);
        binaryTree.left.left = new Node(4);
        BinaryTreePrinter.printNode(binaryTree);

    }
    public static void helper(List<Integer> list, Node root, int sum){
        if(root == null) return;
        sum += root.value;
        if(root.left == null && root.right == null)  list.add(sum);
        if(root.left != null) helper(list, root.left, sum);
        if(root.right != null) helper(list, root.right, sum);
    }
    public static List<Integer> branchSums(Node root) {
        if(root == null) return new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(list, root, 0);
        return list;
    }
}
