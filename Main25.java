/**
 * 输入一个复杂链表
 * （每个节点中有节点值，以及两个指针，一个指向下一个节点，
 * 另一个特殊指针指向任意一个节点），
 * 返回结果为复制后复杂链表的head。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 * */
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
public class Main25 {
	public RandomListNode Clone(RandomListNode pHead)
    {
		RandomListNode p1 = pHead;
		RandomListNode p2 = pHead;
		RandomListNode temp = null;
		while(p1 != null){
			temp = new RandomListNode(p1.label);
			temp.next = p1.next;
			p1.next = temp;
			p1 = temp.next;
		}
		temp = null;
		while(p2 != null){
			temp = p2.next;
			if(p2.random != null)
				temp.random = p2.random.next;
			p2 = temp.next;
		}
		temp = null;
		RandomListNode s = new RandomListNode(0);
		RandomListNode s1 = s;
		while(pHead != null){
			temp = pHead.next;
			pHead.next = temp.next;
			temp.next = s.next;
			s.next = temp;
			s = s.next;
			pHead = pHead.next;
		}
		return s1.next;
    }
	
}
