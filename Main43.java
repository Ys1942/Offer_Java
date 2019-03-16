/**
 * ·­×ªµ¥´ÊË³Ðò
 * */
public class Main43 {
	public String ReverseSentence(String str) {
        char[] ch = str.toCharArray();
        reverse(ch, 0, ch.length-1);
        int blank = -1;
        for (int i = 0; i < ch.length; i++) {
			if(ch[i] == ' '){
				int nextBlank = i;
				reverse(ch, blank+1, nextBlank-1);
				blank = nextBlank;
			}
		}
        reverse(ch, blank+1, ch.length-1);
        return new String(ch);
    }
	public void reverse(char[] ch,int low,int high){
		while(low<high){
			char tmp = ch[low];
			ch[low] = ch[high];
			ch[high] = tmp;
			low++;
			high--;
		}
	}
}
