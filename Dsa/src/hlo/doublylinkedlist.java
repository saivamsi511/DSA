package hlo;

public class doublylinkedlist {
    public static void main(String[] args) {
        doulinked l = new doulinked();
        l.addfirst(10);
        l.addfirst(20);
        l.addfirst(30);
        l.addlast(40);
        l.addlast(50);
        l.deletefirst();
        l.deletelast();
        l.get(1);
        l.deleteatind(2);
        l.addatind(100, 2);
        l.traverse(); 
    }
}

class nodedou {
    int data;
    nodedou next;
    nodedou prev;

    public nodedou(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class doulinked {
	nodedou head;
	nodedou tail;

    public doulinked() {
        this.head = null;
        this.tail = null;
    }

    void addfirst(int data) {
    	nodedou n = new nodedou(data);
        n.next = head;
        if (head == null) {
        	tail = n;
            head = n;
        } else {
        	head.prev = n;
            head = n; 
        }
    }
    
    void addlast(int data) {
    	nodedou n = new nodedou(data);
    	n.prev = tail.next;
    	tail.next = n;
    	tail = n;
    }
    
    void addatind(int data,int ind) {
    	nodedou n = new nodedou(data);
    	int count = 0;
    	nodedou curr = head;
    	if(ind == 0) {
    		addfirst(data);
    		return;
    	}
    	while(curr != null) {
    		if(count == ind - 1) {
    			break;
    		}
    		count++;
    		curr = curr.next;
    	}
    	n.next = curr.next;
    	n.prev = curr;
    	curr.next = n;
    	
    }
    
    void traverse() {
    	nodedou curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    
    void deletefirst() {
    	nodedou curr = head;
    	head = head.next;
    	head.next.prev = null;
    }
    
    void deletelast() {
    	nodedou curr = head;
    	while(curr.next.next != null) {
    		curr = curr.next;
    	}
    	tail = tail.prev;
    	curr.next = null;
    }
    
    void deleteatind(int ind) {
    	int count = 0;
    	nodedou curr = head;
    	if(ind == 0) {
    		deletefirst();
    		return;
    	}
    	while(curr != null) {
    		if(count == ind - 1) {
    			break;
    		}
    		count++;
    		curr = curr.next;
    	}
    	curr.next = curr.next.next;
    }
    
    void get(int ind) {
    	int count = 0;
    	if(ind == 0) {
    		System.out.println(head.data);
    		return;
    	}
    	nodedou curr = head;
    	while(curr.next != null) {
    		if(count == ind) {
    			System.out.println(curr.data);
    			return;
    		}
    		count++;
    		curr= curr.next;
    	}
    	System.out.println("Index out of range.....");
    }
}
