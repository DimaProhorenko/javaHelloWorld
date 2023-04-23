
public class Vars {
	public static void main(String[] args) {
//		byte -128 to 127
//		byte = 8 bits
		byte b = 127;
//		short = 16 bits
		short shortNum = 49;
//		int = 32 bits
		int x = 2;
//		long = 64 bits
		long l = 1798597439232434254l;
		long l2 = 922337203685477600l;
		double d = 23.58909808435;
		float f = 2.4f;
		boolean isPub = true;
		System.out.println(b);
		
		int y = 10;
		int g = y;
		y = y + 15;
		
		short s = 234;
		int n;
		n = s;
		
		Dog spike = new Dog("Spike");
		spike.bark();
		System.out.println(spike);
	}
}
