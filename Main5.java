/**用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。*/

import java.util.Stack;

public class Main5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
//    public int pop() {
//    	while(!stack1.isEmpty()){
//    		stack2.push(stack1.pop());
//    	}
//    	int i = stack2.pop();
//    	while(!stack2.isEmpty()){
//    		stack1.push(stack2.pop());
//    	}
//    	return i;
//    }
    public int pop(){
    	if(stack2.isEmpty()){
    		while(!stack1.isEmpty()){
    			stack2.push(stack1.pop());
    		}
    	}
    	return stack2.pop();
    }
    public static void main(String[] args) {
		Main5 m = new Main5();
		m.push(1);
		m.push(2);
		m.push(3);
		System.out.println(m.pop());
		m.push(4);
		m.push(5);
		m.push(6);
		System.out.println(m.pop());
		System.out.println(m.pop());
		System.out.println(m.pop());
		System.out.println(m.pop());
		System.out.println(m.pop());
	}
}

/*考察队列和栈的LIFO和FIFO特性*/