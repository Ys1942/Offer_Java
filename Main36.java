import java.util.Objects;

/**
 * 输入两个链表，找出它们的第一个公共结点。
 * */
public class Main36 {
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		 int len1 = findListLength(pHead1);
		 int len2 = findListLength(pHead2);
		 if(len1 > len2)
			 pHead1 = walkStep(pHead1, len1-len2);
		 else
			 pHead2 = walkStep(pHead2, len2-len1);
		 while(!Objects.equals(pHead1, pHead2)){
			 pHead1 = pHead1.next;
			 pHead2 = pHead2.next;
		 }
		 return pHead1;
	}
	public static ListNode walkStep(ListNode head, int step){
		while(step > 0){
			head = head.next;
			step--;
		}
		return head;
	}
	public static int findListLength(ListNode head){
		int len = 0;
		while(head != null){
			len++;
			head = head.next;
		}
		return len;
	}
}
