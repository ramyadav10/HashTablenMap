package com.hashing;

public class CreateBSTTree {
	public static int count;
    public static void main(String[] args) {
    	CreateBSTTree s = new CreateBSTTree();
        
        s.addData(56);
        s.addData(30);
        s.addData(70);

        s.display(s.root);
        
        System.out.println("Left Node : "+s.root.left.key);
        System.out.println("Center Node : "+s.root.key);
        System.out.println("Right Node : "+s.root.right.key);
        s.size();


    }

    public Node root;

    public void addData(int x){
    	count++;
        Node node = new Node(x);
        if (root == null){
            root = node;
        }else {
            Node current = root;
            Node parent = null;
            while (true){
                parent = current;
                if (x <current.key){
                    current = current.left;
                    if (current == null){
                        parent.left = node;
                        return;
                    }
                }else if (x > current.key){
                    current = current.right;
                    if (current == null){
                        parent.right = node;
                        return;
                    }
                }
            }
        }

    }
    
    
    public static class Node {
        int key;
        Node left;
        Node right;

        public Node(int x) {
            this.key = x;
            this.left = null;
            this.right = null;
        }
    }
    
    
    public void display(Node node){
        if (root == null){
            System.out.println("List is Empty");
        }else {
            if (node.left != null)
                display(node.left);
           if (node.right != null)
                display(node.right);

        }
    }
    public void size() {
    	System.out.println("Size of BST: "+count);
    }
}
