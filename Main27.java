/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串
 * abc,acb,bac,bca,cab和cba。
 * */
import java.util.ArrayList;
import java.util.TreeSet;
public class Main27 {
	private TreeSet<String> result = new TreeSet<>();
    public ArrayList<String> Permutation(String str){
    	if(str == null || str.length() == 0)
    		return new ArrayList<>(0);
    	ArrayList<String> result = new ArrayList<>();
    	char[] chars = str.toCharArray();
    	Permutation(chars,0);
    	result.addAll(this.result);
    	return result;
    }
    public void Permutation(char[] chars,int begin){
    	if(chars == null || chars.length == 0 || begin > chars.length-1)
    		return;
    	if(begin == chars.length-1)
    		result.add(String.valueOf(chars));
    	else
    	{
    		for (int i = begin; i < chars.length; i++) {
				swap(chars, begin, i);
				Permutation(chars, begin+1);
				swap(chars, begin, i);
			}
    	}
    }
    
    public static void swap(char[] ch, int i, int j){
    	char temp = ch[i];
    	ch[i] = ch[j];
    	ch[j] = temp;
    }
}