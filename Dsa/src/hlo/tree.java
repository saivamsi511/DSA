package hlo;

public class tree {
public static void main(String[] args) {
	treeimp t = new treeimp();
	t.insert(8);
	t.insert(7);
	t.insert(12);
	t.insert(15);
	t.delete(8);
	t.insert(2);
	t.inorder();
	t.postorder();
	t.preorder();
	t.search(150);
}
}

class nodetree {
	int data;
	nodetree left;
	nodetree right;
	
	public nodetree(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

class treeimp {
	nodetree root;
	
	public treeimp() {
		this.root = null;
	}


	void insert(int data) {
		
		root = insertrec(root, data);
		
	}
	
	nodetree insertrec(nodetree root, int data) {
		if(root == null) {
			root = new nodetree(data);
		}
		else if(data > root.data) {
			root.right = insertrec(root.right, data);
		}
		else if(data < root.data) {
			root.left = insertrec(root.left, data);
		}
		return root;
	}
	
	public void inorder() {
		System.out.println("in order traversal: ");
		inorderrec(root);
		System.out.println();
	}
	
	void inorderrec(nodetree root) {
		if(root != null) {
			inorderrec(root.left);
			System.out.print(root.data + " ");
			inorderrec(root.right);
		}
	}
	
	public void preorder() {
		System.out.println("pre order traversal: ");
		preorderrec(root);
		System.out.println();
	}
	
	void preorderrec(nodetree root) {
		if(root != null) {
			System.out.print(root.data + " ");
			preorderrec(root.left);
			preorderrec(root.right);
		}
	}
	
	public void postorder() {
		System.out.println("Post order traversal: ");
		postorderrec(root);
		System.out.println();
	}
	
	void postorderrec(nodetree root) {
		if(root != null) {
			postorderrec(root.left);
			postorderrec(root.right);
			System.out.print(root.data + " ");
		}
	}
	
	void search(int data) {
	    nodetree result = searchrec(root, data);
	    if (result != null) {
	        System.out.println(data + " found in the tree.");
	    } else {
	        System.out.println(data + " not found in the tree.");
	    }
	}
	
	nodetree searchrec(nodetree root, int data) {
	    if (root == null || root.data == data) {
	        return root;
	    }
	    if (data < root.data) {
	        return searchrec(root.left, data);
	    } else {
	        return searchrec(root.right, data);
	    }
	}

	void delete(int data) {
		root = deleterec(root,data);
	}


	nodetree deleterec(nodetree root, int data) {
		if(root == null) {
			return null;
		}
		else if(data > root.data) {
			root.right = deleterec(root.right,data);
		}
		else if(data < root.data) {
			root.left = deleterec(root.left,data);
		}
		else {
			// Node found
            // Case 1: No child
			if(root.left == null && root.right == null) {
				return null;
			}
			// Case 2: One child
			else if(root.left == null) {
				return root.right;
			}
			else if(root.right == null) {
				return root.left;
			}
			
			  // Case 3: Two children
			root.data = minvalue(root.right); // Get inorder successor
			root.right = deleterec(root.right,root.data);  // Delete the inorder successor
		}
		return root;
	}


	int minvalue(nodetree root) {
		int min = root.data;
		
		while(root.left != null) {
			root = root.left;;
			min = root.data;
		}
		return min;
	}
}