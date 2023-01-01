package com.binaryTreeDay15;

public class Service {


	Node root;
	
	public void insert(int data) {
		 Node newNode = new Node(data);
		 this.root = insertAll(root, newNode);
		 display(this.root);
		 System.out.println();
	}

	private Node insertAll(Node root, Node node) {
		if (root == null)
			
		return node;
		else if (root.compareTo(node)>0) {
			System.out.println(node.data);
			root.left = insertAll(root.left, node);
			
		} else if (root.compareTo(node)<0) {
			System.out.println(node.data);
			root.right = insertAll(root.right, node);
		}
		
		
		return root;
		
	}
	
	public void display(Node root) {
		if(root == null)
		return;
		
		display(root.left);
		System.out.println(root.data);
		display(root.right);
	}
	 public void inorder() {
	        inorder(root);
	    }

	    private void inorder(Node r) {
	        if (r != null) {
	            inorder(r.left);
	            System.out.print(r.data + " ");
	            inorder(r.right);
	        }
	    }
	
	    public void preorder() {
	        preorder(root);
	    }

	    private void preorder(Node r) {
	        if (r != null) {
	            System.out.print(r.data + " ");
	            preorder(r.left);
	            preorder(r.right);
	        }
	    }
	    public void postorder() {
	        postorder(root);
	    }

	    private void postorder(Node r) {
	        if (r != null) {
	            postorder(r.left);
	            postorder(r.right);
	            System.out.print(r.data + " ");
	        }
	    } public void size() {
	        System.out.println("\n The size of the tree is: " + sizeAll(root));
	    }
	    public int sizeAll(Node root) {

	        if (root == null)
	            return 0;

	        return sizeAll(root.left) + sizeAll(root.right) + 1;
	    }

}