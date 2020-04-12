
public class LoopsWeek2 {

	public static void main(String[] args) {
	
		int a = 0;
		int b = 100;
		
		while (a <= 100) {
			System.out.println(a);
			a += 2;
		}
		
		while (b >= 0) {
			System.out.println(b);
			b -= 3;
		}
		
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			i += 1;	
		}
		
		for (int i = 1; i <= 100; i++) {
			if (i % 15 == 0) {
				System.out.println("Hello World");
			}
			else if (i % 3 == 0) {
				System.out.println("Hello");
			}
			else if (i % 5 == 0) {
				System.out.println("World");
				
			} else {
			System.out.println(i);
		}
	
	}
			
	}
}		
	


