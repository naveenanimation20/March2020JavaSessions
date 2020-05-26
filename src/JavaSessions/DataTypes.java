package JavaSessions;

/**
 * 
 * @author NaveenKhunteta
 *
 */
public class DataTypes {

	public static void main(String[] args) {

		//data types
		//1. primitive data types : boolean, numeric types
		//2. non primitive data types  : String , Arrays, ArrayList 
		
		//numeric types : character: char
		//Integral types: Integer and Floating point
		//Integer : byte, short, int, long
		//floating : float, double
		
		//1. byte: 
		//size: 1  byte = 8 bits
		//range: -128 to 127
		byte b = 10;
		b = 20;
		byte b1 = 20;
		
		System.out.println(b1);
		System.out.println(b+b1);
		
		//2. short:
		//size: 2 bytes: 16 bits
		//range : -32768 to 32767
		short s1 = 120;
		short s2 = 200;
		System.out.println(s2/2);
		
		//3. int:
		//size: 4 bytes = 32 bits
		//range: -2147483648 to 2147483647
		int i = 1000;
		int j = -100;
		int k = 0;
		System.out.println(i+j+k);
		
		//4. long:
		//size: 8 bytes : 64 bits
		//range : 
		long l = 12333339999999l;
		long l1 = -122222;
		
		long l2 = 10;
		
		//5. float :
		//size: 4 bytes : 32 bits
		//range : upto 7 decimal digits
		float f1 = (float)12.33;
		float f2 = 14.33f;
		float f3 = 100; //100.0
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		
		//6. double:
		//size: 8 bytes : 64 bits
		//range : upto 16 decimal digits
		double d1 = 12.33333;
		System.out.println(d1+100);
		
		//7. character:
		char c1 = 'a';
		char c11 = 'b';
		char c2 = '1';
		char c3 = '$';
		
		System.out.println(c1);
		System.out.println(c1+c11);//97 + 98 = 195

		//a-z: 97-122
		//A-Z: 65-90
		//0-9: 48-57
		
		//8. boolean: true/false
		//size: ~ 1 bit
		boolean flag = true;
		boolean flag1 = false;
		System.out.println(flag);
		
		
		//9. String:
		String str = "Hello World";
		System.out.println(str);
		
		String str1 = "this is my java code and im super excited";
		System.out.println(str1);
		
		String str2 = "100";
		System.out.println(str2+20);//10020
		
		System.out.println("this is selenium");
		System.out.println(123+23);
		
	}

}
