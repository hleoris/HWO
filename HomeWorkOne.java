public class HomeWorkOne {

	public static void main(String[] args) {
		byte a = 1;
		short b = 2;
		int c = 3;
		long d = 4;
		float e = 5.1f;
		double f = 6.12;
		char g = 'Z';
		boolean h = true;
		
		System.out.println(equation3(1, 2, 8, 4));
		System.out.println(decision4(7, 7));
		simile5(0);
		System.out.println(noTrue6(-3));
		textName7("Sergey!");
		
	}
	
	public static int equation3(int a, int b, int c, int d) {
		return a * (b + (c / d));
	}
	
	public static boolean decision4(int x1, int x2) {
		int y = x1 + x2;
		if (y >= 10 && y <= 20) {
            return true;
        } else {
            return false;
        }
    }
	
	public static void simile5(int i) {
		System.out.println((i < 0)? "Negative" : "Positive");
	}
	
	public static boolean noTrue6(int r) {
		if (r < 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void textName7(String name) {
		System.out.println("Hello, " + name);
	}
}
