import java.util.Stack;

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向
 * */
public class Main26 {
//	public TreeNode Convert(TreeNode pRootOfTree) {
//        if(pRootOfTree == null)
//        	return null;
//        Stack<TreeNode> stack = new Stack<>();
//        TreeNode p = pRootOfTree;
//        TreeNode pre = null;
//        boolean isFirst = true;
//        while(p != null || !stack.isEmpty()){
//        	while(p != null){
//        		stack.push(p);
//        		p = p.left;
//        	}
//        	p = stack.pop();
//        	if(isFirst){
//        		pRootOfTree = p;
//        		pre = pRootOfTree;
//        		isFirst = false;
//        	}
//        	pre.right = p;
//        	p.left = pre;
//        	pre = p;
//        	p = p.right;
//        }
//        return pRootOfTree;
//    }
	protected TreeNode leftLast = null;
	public TreeNode Convert(TreeNode pRootOfTree){
		if(pRootOfTree == null)
			return null;
		if(pRootOfTree.left == null && pRootOfTree.right == null){
			leftLast = pRootOfTree;
			return pRootOfTree;
		}
		TreeNode left = Convert(pRootOfTree.left);
		if(left != null){
			leftLast.right = pRootOfTree;
			pRootOfTree.left = leftLast;
		}
		leftLast = pRootOfTree;
		TreeNode right = Convert(pRootOfTree.right);
		if(right != null){
			right.left = pRootOfTree;
			pRootOfTree.right = right;
		}
		return left != null ? left :pRootOfTree; 
	}
}
