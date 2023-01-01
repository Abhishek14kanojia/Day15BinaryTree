package com.binaryTreeDay15;

public class Main {

	public static void main(String[] args) {
		Service obj = new Service();
		
		obj.insert(56);
		obj.insert(30);
		obj.insert(70);
	
		System.out.print("post order :");
		obj.postorder();
		System.out.print("pre order :");
		obj.preorder();
		System.out.print("Inorder : ");
		obj.inorder();
	}
}
