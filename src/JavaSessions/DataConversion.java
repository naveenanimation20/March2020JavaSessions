package JavaSessions;

public class DataConversion {

	public static void main(String[] args) {

		//String x = "100A";///NumberFormatException: For input string: "100A"
		String x = "100";

		System.out.println(x+20);
		
		//string to int:
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//String to double:
		String y = "12.33";
		System.out.println(y+20);
		
		double d = Double.parseDouble(y);
		System.out.println(d+20);
		
		//int to String:
		int p = 100;
		System.out.println(p+20);
		
		String p1 = String.valueOf(p); //"100"
		System.out.println(p1+20);
		
	}

}
