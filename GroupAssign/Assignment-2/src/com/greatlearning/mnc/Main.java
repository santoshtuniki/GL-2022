package com.greatlearning.mnc;

public class Main {
	Node node;
	Node prevNode = null;
    Node headNode = null;
    
    public void skewedTree(Node root) {
    	if (root == null) 
    		return;
    	skewedTree (root.left);
        Node rightNode = root.right;
        if (headNode == null)
        {
            headNode = root;
            root.left = null;
            prevNode = root;
        }
        else
        {
            prevNode.right = root;
            root.left = null;
            prevNode = root;
        }
        skewedTree (rightNode);
    }
    
    public void traverse(Node root)
    {
        if (root == null) 
        	return;
        System.out.print(root.value + " ");
        traverse (root.right);       
    }
	
	public static void main(String[] args) {
	     Main tree = new Main();
	     tree.node = new Node(50);
	     tree.node.left = new Node(30);
	     tree.node.right = new Node(60);
	     tree.node.left.left = new Node(10);
	     tree.node.right.left= new Node(55);
	     
	     tree.skewedTree(tree.node);
	     tree.traverse (tree.headNode);
	}

}
