/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，
 * 当然我们需要合成后的链表满足单调不减规则。
 * */

public class Main16 {
	/**递归*/
	public static ListNode Merge(ListNode list1,ListNode list2) {
		if(list1 == null)
			return list2;
		if(list2 == null)
			return list1;
		if(list1.val<list2.val){
			list1.next = Merge(list1.next, list2);
			return list1;
		}
		else{
			list2.next = Merge(list1, list2.next);
			return list2;
		}
    }
	/**非递归*/
	public static ListNode Merge1(ListNode list1,ListNode list2) {
		if(list1 == null)
			return list2;
		if(list2 == null)
			return list1;
        ListNode head = new ListNode(-1);
        ListNode pNode = head;
        while(list1 != null && list2 != null){
        	if(list1.val<list2.val){
        		pNode.next = list1;
        		pNode = list1;
        		list1 = list1.next;
        	}
        	else{
        		pNode.next = list2;
        		pNode = list2;
        		list2 = list2.next;
        	}
        	pNode.next = null;
        }
        if(list2 != null)
        	list1 = list2;
        pNode.next = list1;
        return head.next;
    }
}
