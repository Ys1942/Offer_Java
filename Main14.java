/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 * 例如，链表是1、2、3、4、5、6，倒数第3个结点是4。
 * (ListNode 在Main3中定义过了)
 * */
public class Main14 {
	public ListNode FindKthToTail(ListNode head,int k) {
		if(head == null || k <= 0)
			return null;
		ListNode ahead = head;
		ListNode behind = head;
		for (int i = 1; i < k; i++) {
			if(behind.next != null)
				behind = behind.next;
			else 
				return null;
		}
		while(behind.next != null){
			behind = behind.next;
			ahead = ahead.next;
		}
		return ahead;
    }
}
