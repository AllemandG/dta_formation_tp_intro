package tpintro;

public class TpJava02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int varInt = 123456789;
		float varFloat = varInt;
		
		System.out.println(varInt);
		System.out.println(varFloat);
		
		float x, z, y, a, b, c;
		
		x = 15;
		z = 0;
		y = -123;
		
		a = x/z;
		b = y/z;
		c = a/b;
		
		System.out.println("x = " + x);
		System.out.println("z = " + z);
		System.out.println("y = " + y);
		System.out.println("a = x / z = " + a);
		System.out.println("b = y / z = " + b);
		System.out.println("a / b = " + c);
	}

}
