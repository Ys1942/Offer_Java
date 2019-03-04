/**大家都知道斐波那契数列，现在要求输入一个整数n，
 * 请你输出斐波那契数列的第n项（从0开始，第0项为0）
 * n<=39*/
public class Main7 {
	/**递归（效果不如迭代）*/
	public int Fibonacci(int n) {
		return n<2 ? n:Fibonacci(n-1)+Fibonacci(n-2);
    }
	/**迭代*/
	public int Fibonacci1(int n) {
		if(n<2)
			return n;
		int f0 = 0;
        int f1 = 1;
		int fn = 0;
        for(int i =2;i<=n;i++){
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
        }
        return fn;
    }
}
