package hlo;

public class binarytree {
public static void main(String[] args) {
	Binarytree b = new Binarytree();
	 b.root = new nodebin(10);
	 b.root.left = new nodebin(20);
	 b.root.right = new nodebin(30);
	 b.root.left.left = new nodebin(40);
	 b.root.left.right = new nodebin(50);
	 b.root.right.left = new nodebin(60);
	 b.root.right.right = new nodebin(70);
}
}
class nodebin {
    int data;
    nodebin left;
    nodebin right;

    public nodebin(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Binarytree {
	nodebin root;
	Binarytree() {
		this.root=null;
	}
}