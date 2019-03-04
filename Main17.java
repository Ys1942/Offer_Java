/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。
 * （ps：我们约定空树不是任意一个树的子结构）
 * */

public class Main17 {
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
		if(root1 == null || root2 == null)
			return false;
		return check(root1, root2)||HasSubtree(root1.left, root2)||HasSubtree(root1.right, root2);
	}
	public static boolean check(TreeNode root1, TreeNode root2){
		if(root2 == null)
			return true;
		if(root1 == null)
			return false;
		if(root1.val == root2.val)
			return check(root1.left, root2.left) && check(root1.right, root2.right);
		return false;	
	}
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(8);
		TreeNode t2 = new TreeNode(8);
		t1.left = t2;
		TreeNode t3 = new TreeNode(7);
		t1.right = t3;
		TreeNode t4 = new TreeNode(9);
		t2.left = t4;
		TreeNode t5 = new TreeNode(2);
		t2.right = t5;
		TreeNode s1 = new TreeNode(8);
		TreeNode s2 = new TreeNode(9);
		s1.left = s2;
		TreeNode s3 = new TreeNode(2);
		s1.right = s3;
		System.out.println(new Main17().HasSubtree(t1, s1));
	}
}
