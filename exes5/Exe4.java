package exes5;

public class Exe4 {
	public static void main(String[] args) {
		int h = 0;
		int m = 0;
		int s = 0;
		
		for(;h != 23 || m != 59 || s != 59; s++) {
			System.out.printf("%d:%d:%d\n", h, m, s);
			
			if (s == 60) {
				s = -1;
				m ++;
			}
			
			if (m == 60) {
				m = -1;
				h ++;
			}
		}
	}
}
