/**
 * 圆圈中最后剩下的数
 * */
public class Main46 {
	public int LastRemaining_Solution(int n, int m) {
        if(n<1 || m<1)
        	return -1;
//        int last = 0;
//        for (int i = 2; i <= n ; i++) {
//			last = (last+m)%i;
//		}
//        return last;
        return solution(n, m);
    }
	public int solution(int n,int m){
		if(n == 1)
			return 0;
		else
			return (solution(n-1, m)+m)%n;
	}
}
