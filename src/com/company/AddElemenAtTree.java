package com.company;

import com.Tree.BST;
import com.Tree.Node;

public class AddElemenAtTree {
    public static Node AddTree(Node root){




        boolean T = false;
        BST a = new BST();


        root = a.insert(root, 7,6,4);
        root = a.insert(root, 5,5,4);
        root = a.insert(root, 6,4,4);
        root = a.insert(root, 3,4,4);
        root = a.insert(root, 4,3,2);
        root = a.insert(root, 2,1,3);
        root = a.insert(root, 1,2,3);
        root = a.insert(root, 8,3,3);
        root = a.insert(root, 3,4,3);

        root = a.insert(root, 1,2,3);
        root = a.insert(root, 1,2,3);
        root = a.insert(root, 3,3,3);
        root = a.insert(root, 5,3,3);
   return root;
    }
}
