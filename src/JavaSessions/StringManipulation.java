package JavaSessions;

public class StringManipulation {

	public static void main(String[] args) {

		String str = "This is my first java code and I am so happy";

		System.out.println(str.length());// 44

		System.out.println(str.charAt(5));
		System.out.println(str.charAt(43));

		System.out.println(str.indexOf('i'));// 1st occurrence of i

		System.out.println(str.indexOf('i', str.indexOf('i') + 1));// 2nd
																	// occurrence
																	// of i

		System.out.println(str.indexOf("java"));

		System.out.println(str.indexOf("testing"));

		String message = "welcome admin";
		if (message.indexOf("admin") >= 0) {
			System.out.println("user is logged in");
		}

		// trim:
		String st = "     hello world    ";
		System.out.println(st.trim());

		System.out.println(st.trim().replace(" ", ""));

		String dob = "01-01-1990"; // 01/01/1990
		System.out.println(dob.replace("-", "/"));

		// LCASE and UCASE
		String sc = "This Is Java";
		System.out.println(sc.toLowerCase());
		System.out.println(sc.toUpperCase());

		String a = "Hello";
		String b = "selenium";

		System.out.println(a.concat(b));

		// contains:
		String mesg = "hey admin welcome to my portal";
		System.out.println(mesg.contains("admin"));

		// equals:
		String s1 = "This is my code";
		String s2 = "this is my code";

		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));

		String browser = "CHROME";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("launch chrome");
		}

		// subString:
		String se = "your transaction id is 12345";
		System.out.println(se.substring(0, 10));
		System.out.println(se.substring(0));
		System.out.println(se.substring(5));
		System.out.println(se.substring(se.indexOf("is") + 2).trim());

		// split:
		String data = "Tom;25;IBM;London;9999";
		String emp[] = data.split(";");
		System.out.println(emp.length);
		System.out.println(emp[0]);
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i]);
		}

		String userCred = "admin_admin123";
		String username = userCred.split("_")[0];
		String password = userCred.split("_")[1];

		System.out.println(username);
		System.out.println(password);

		String test = "xXjavaXxXpythonxXXxXRubyxX";
		String testArr[] = test.split("xX");
		System.out.println("0-->" + testArr[0]);
		System.out.println("1-->" + testArr[1]);
		System.out.println("2-->" + testArr[2]);
		System.out.println("3-->" + testArr[3]);
		System.out.println("4-->" + testArr[4]);

		String main = "Selenium";
		String rev = "";

		// for(int i=main.length()-1 ; i>=0; i--){
		// rev = rev + main.charAt(i); //m+u+i+n+e+l+e+S
		// }
		// System.out.println(rev);

		char c[] = main.toCharArray();
		for (int i = c.length - 1; i >= 0; i--) {
			rev = rev + main.charAt(i); // m+u+i+n+e+l+e+S
		}
		System.out.println(rev);
		
		StringBuffer obj = new StringBuffer(main);
		System.out.println(obj.reverse());

	}

}
