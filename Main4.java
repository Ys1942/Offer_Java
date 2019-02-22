/**输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
 * 则重建二叉树并返回。
 */

class TreeNode {
	int val;
	TreeNode left = null;
	TreeNode right = null;
	TreeNode(int x) {
		this.val = x; 
	}
 }
public class Main4 {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
    	return reConstructBinaryTree(pre, 0, pre.length-1, in, 0, in.length-1);
    }
    public TreeNode reConstructBinaryTree(int [] pre,int startPre, int endPre, int [] in, int startIn, int endIn){
    	if(startPre>endPre || startIn>endIn)
    		return null;
    	TreeNode node = new TreeNode(pre[startPre]);
    	for (int i = startIn; i <= endIn ; i++) {
			if(in[i] == pre[startPre]){
				node.left = reConstructBinaryTree(pre, startPre+1, startPre+i-startIn, in, startIn, i-1);
				node.right = reConstructBinaryTree(pre, startPre+i-startIn+1, endPre, in, i+1, endIn);
				break;
			}
		}
    	return node;
    }
    public static void preOrderTraverse(TreeNode root){
		if(root == null)
			return;
		System.out.print(root.val+" ");
		preOrderTraverse(root.left);
		preOrderTraverse(root.right);
	}
    public static void inOrderTraverse(TreeNode root){
    	if(root == null)
    		return;
    	inOrderTraverse(root.left);
    	System.out.print(root.val+" ");
    	inOrderTraverse(root.right);
    }
    public static void postOrderTraverse(TreeNode root){
		if(root == null)
			return;
		postOrderTraverse(root.left);
		postOrderTraverse(root.right);
		System.out.print(root.val+" ");
	}
    public static void main(String[] args) {
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
		TreeNode root = new Main4().reConstructBinaryTree(pre, in);
		preOrderTraverse(root);
		System.out.println();
		inOrderTraverse(root);
		System.out.println();
		postOrderTraverse(root);
	}
}

/*考察二叉树的遍历*/