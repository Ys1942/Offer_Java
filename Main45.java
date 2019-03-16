import java.util.Arrays;

/**
 * 判断是不是扑克牌的顺子
 * */
public class Main45 {
	public boolean isContinuous(int [] numbers) {
		if(numbers.length != 5)
			return false;
		int zero = 0;
		int interval = 0;
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length-1; i++) {
			if(numbers[i] == 0){
				zero++;
				continue;
			}
			if(numbers[i] == numbers[i+1])
				return false;
			interval += numbers[i+1]-numbers[i]-1;
		}
		if(zero >= interval)
			return true;
		return false;
    }
}
