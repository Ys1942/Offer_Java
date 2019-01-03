/**请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。*/
public class Main2 {
	public String replaceSpace(StringBuffer str) {
    	String str1 = "";
    	for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==' ')
				str1+="%20";
			else
				str1+=str.charAt(i);
		}
    	return str1;
    }
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("We Are Happy");
		System.out.println(new Main2().replaceSpace(sb));
	}
}
/*考察字符串，String和StringBuffer的区别*/
/*判断是否为空格的方法，是与' '比较不是" " */
