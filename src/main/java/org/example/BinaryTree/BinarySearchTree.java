package org.example.BinaryTree;

import java.sql.SQLOutput;

public class BinarySearchTree {
    class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value = value;
            left = null;
            right = null;
        }
        public Node creatRoot( int d){
            Node new_node = new Node(d);
            return new_node;
        }
        public void insert(Node root, int d){
            if(d<root.value) {
                if (root.left != null) {
                    insert(root.left, d);
                } else {
                    root.left = new Node(d);
                }
            } else {
                if(root.right!=null){
                    insert(root.right, d);

                } else {
                    root.right = new Node(d);
                }
            }
        }
        public void inOrder(Node root){
            Node temp = root;
            if(temp == null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.value + "->");
            inOrder(root.right);
            System.out.println("END");
        }
    }
}
