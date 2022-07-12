package com.example.project;

public class Exercise1 {

    public static void main(String[] args) {
        Exercise1 obj = new Exercise1();

        BST<Integer> tree1 = new BST<Integer>();
        BST<Integer> tree2 = new BST<Integer>();

        Integer array [] = {1, 2,3, 4, 5};

        for(Integer value : array){
            tree1.insert(value);
            tree2.insert(value);
        }

        System.out.print(obj.bstSimilares(tree1, tree2));
        
    }


    public <T extends Comparable<T>> boolean bstSimilares(BST<T> a1, BST<T> a2){

        if (a1.isEmpty() && a2.isEmpty())
            return true;
        else if (a1.isEmpty() || a2.isEmpty())
            return false;
        else {
            return  bstSimilares2(a1.root.right, a2.root.right) && bstSimilares2(a1.root.left, a2.root.left); 
        }
    }
    
    private <T> boolean bstSimilares2(Node<T> node1, Node<T> node2) {
        if (node1 == null && node2 == null)
            return true;
        else if (node1 == null || node2 == null)
            return false;
        else {
            return bstSimilares2(node1.left, node2.left) && bstSimilares2(node1.right, node2.right);
        }
    
    }
}
