package hlo;

public class doublecircularlinkedlist {
public static void main(String[] args) {
	cirdoulinked cl = new cirdoulinked();
	cl.addfirst(100);
	cl.addfirst(200);
	cl.addfirst(300);
	cl.addlast(10);
	cl.addlast(20);
	cl.get(4);
	cl.deletefirst();
	cl.deletelast();
	cl.addatind(400, 1);
	cl.deleteatind(3);
	cl.print();
}
}
class nodecirdou {
    int data;
    nodecirdou next;
    nodecirdou prev;

    public nodecirdou(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class cirdoulinked {
	nodecirdou head;
	nodecirdou tail;

    public cirdoulinked() {
        this.head = null;
        this.tail = null;
    }
    
    void addfirst(int data) {
    	nodecirdou n = new nodecirdou(data);
    	if(head == null) {
    		head = n;
    		tail = n;
    		n.next = head;
    	}
    	n.next = head;
    	head = n;
    	tail.next = head;
    }
    void addlast(int data) {
    	nodecirdou n = new nodecirdou(data);
    	if(head == null) {
    		head = n;
    		tail = n;
    		n.next = head;
    	}
    	tail.next = n;
    	n.next = head;
    	tail = n;
    }
    
    void addatind(int data, int ind) {
    	nodecirdou n = new nodecirdou(data);
    	if(ind == 0) {
    		addfirst(data);
    		return;
    	}
    	nodecirdou curr = head;
    	int count = 0;
    	do {
    		if(count == ind - 1) {
    		break;
    		}
    		curr = curr.next;
    		count++;
    	} while(curr != head);
    	
    	n.next = curr.next;
    	n.prev = curr;
    	curr.next = n;	
    }
    
    void get(int ind) {
    	nodecirdou curr = head;
    	int count = 0;
    	do {
    		if(count == ind) {
    		System.out.println(curr.data + " ");
    		return;
    		}
    		curr = curr.next;
    		count++;
    	} while(curr != head);
    	
    	System.out.println("Index out of range");
    }
    
    void deletefirst() {
    	if(head == null) {
    		System.out.println("Deletion not possible");
    		return;
    	}
    	head.next.prev = null;
    	head = head.next;
    	tail.next = head;
    }
    
    void deletelast() {
    	nodecirdou curr = head;
    	if(head == null) {
    		System.out.println("Deletion not possible");
    		return;
    	}
    	do {
    		curr = curr.next;
    	} while(curr.next.next != head);
    	curr.next = head;
    	tail = curr;
    }
    
    void deleteatind(int ind) {
    	if(ind == 0) {
    		deletefirst();
    		return;
    	}
    	nodecirdou curr = head;
    	int count = 0;
    	do {
    		if(count == ind - 1) {
    		break;
    		}
    		curr = curr.next;
    		count++;
    	} while(curr != head);
    	
    	curr.next = curr.next.next;
    }
    
    void print() {
    	nodecirdou curr = head;
    	do {
    		System.out.print(curr.data + " ");
    		curr = curr.next;
    	} while(curr != head);
    	System.out.println();
    }
}