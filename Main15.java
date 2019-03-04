/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 * (ListNode 在Main3中定义过了)
 * */

public class Main15 {
	/**不用递归*/
	public ListNode ReverseList1(ListNode head) {
		if(head == null)
			return null;
		ListNode p = head.next;
		ListNode temp = null;
		ListNode q = head;
		q.next = null;
		while(p != null){
			temp = p.next;
			p.next = q;
			q = p;
			p = temp;
		}
		return q;
    }
	/**用递归*/
	public ListNode ReverseList(ListNode head) {
		if(head == null)
			return null;
		ListNode p = head.next;
		ListNode q = head;
		q.next = null;
		return re(p, q);
    }
	public static ListNode re(ListNode p,ListNode q){
		if(p != null){
			ListNode temp = p.next;
			p.next = q;
			return re(temp, p);
		}
		else
			return q;
	}
}
