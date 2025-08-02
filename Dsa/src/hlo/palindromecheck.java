package hlo;

public class palindromecheck {
public static void main(String[] args) {
	linkedlistpalindrome l = new linkedlistpalindrome();
	l.insertatend(100);
	l.insertatend(200);
	l.insertatend(300);
	l.insertatend(200);
	l.insertatend(100);
	l.traverse();
	l.ispalindrome();
}
}
class nodeball {
	int data;
	nodeball next;
	
	public nodeball(int data) {
		super();
		this.data = data;
		this.next = null;
	}
	
}
class linkedlistpalindrome {
	nodeball head;
	linkedlistpalindrome() {
		this.head = null;
	}
	void insertatend(int data) {
		nodeball n = new nodeball(data);
		if(head == null) {
			head = n;
			return;
		}
		nodeball curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = n;
	}
	
	boolean ispalindrome() {
	    if (head == null || head.next == null) return true;

	    // Step 1: Find the middle using slow & fast pointers
	    nodeball slow = head, fast = head;
	    while (fast != null && fast.next != null) {
	        slow = slow.next;
	        fast = fast.next.next;
	    }

	    // Step 2: Reverse the second half of the list
	    nodeball secondHalf = reverse(slow);
	    nodeball firstHalf = head;

	    // Step 3: Compare both halves
	    while (secondHalf != null) {
	        if (firstHalf.data != secondHalf.data) {
	            return false;
	        }
	        firstHalf = firstHalf.next;
	        secondHalf = secondHalf.next;
	    }

	    return true;
	}

	
	nodeball reverse(nodeball head) {
		nodeball prev = null;
		while(head != null) {
			nodeball temp = head.next;
			head.next = prev;
			prev = head;
			head = temp;
		}
		return prev;
	}
	
	void traverse() {
		nodeball curr = head;
		while(curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}
}