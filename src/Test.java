
public class Test {
	public static void main(String args[]) {

		LinkNode headNode = creatSingleLink();
		printSingleLink(headNode);
		LinkNode temNode = Reverse(headNode);
		System.out.println();
		printSingleLink(temNode);
		

	}

	public static LinkNode creatSingleLink() {

		LinkNode headNode = new LinkNode(0);
		headNode.next = new LinkNode(1);
		headNode.next.next = new LinkNode(2);
		headNode.next.next.next = new LinkNode(3);
		headNode.next.next.next.next = new LinkNode(4);
		headNode.next.next.next.next.next = new LinkNode(5);

		return headNode;
	}

	public static void printSingleLink(LinkNode headNode) {
		if (headNode != null) {
			System.out.print("" + headNode.value);
		}
		if (null != headNode.next) {
			printSingleLink(headNode.next);
		}
	}

	public static LinkNode reverseSingleLink(LinkNode headNode) {
		if (null == headNode || null == headNode.next) {
			return headNode;
		} else {
			LinkNode temNode = headNode.next;
			headNode.next.next = headNode;
			headNode.next = null;
			reverseSingleLink(temNode);
		}
		return headNode;
	}

	public static LinkNode Reverse(LinkNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		LinkNode p1 = head;
		LinkNode p2 = head.next;
		LinkNode p3 = p2.next;
		p1.next = null;
		while (p3 != null) {
			p2.next = p1;
			p1 = p2;
			p2 = p3;
			p3 = p3.next;
		}
		p2.next = p1;
		return p2;
	}

}
