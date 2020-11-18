package com.Tree;


public class BST {
    private static int Nums=0;
    public Node insert(Node node, int val,int h,int l) {
        if(node == null) {
            Nums++;
            return createNewNode(val,h,l,Nums);
        }


        if(val < node.data) {
            node.left = insert(node.left, val,h,l);
        } else if((val > node.data)) {
            node.right = insert(node.right, val,h,l);
        }
        else if(val ==node.data)
        {
            node.left = insert(node.left, val,h,l);
        }

        return node;
    }

    public Node createNewNode(int k,int h,int l,int Nums) {
       // Nums++;
        //System.out.println(Nums);
        Node a = new Node();
        a.data = k;
        a.high=h;
        a.lengh=l;
        a.index=Nums;
        a.left = null;
        a.right = null;
        return a;
    }


    public static void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data + " H-" + node.high + "L-"+ node.lengh + "\n");
            traverseInOrder(node.right);
        }
    }
    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.data) {
            // Case 1: no children
            if (current.left == null && current.right == null) {
                return null;
            }

            // Case 2: only 1 child
            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }

            // Case 3: 2 children
            int smallestValue = findSmallestValue(current.right);
            current.data = smallestValue;
            //  current.lengh=smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        }
        if (value < current.data) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }

        current.right = deleteRecursive(current.right, value);
        return current;
    }

    private int findSmallestValue(Node root) {
        return root.left == null ? root.data : findSmallestValue(root.left);
    }
    public void delete(int value,Node root) {
        root = deleteRecursive(root, value);
    }

}