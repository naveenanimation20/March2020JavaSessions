package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {

		//1 to 10

		//1. while loop:
		int i = 1; //initialization
		while(i<=10){ //conditional 
			System.out.println(i);//1 2 3 4 5 ... 10
			i++; //incremental/decremental
		}
		
		int p =1;
		while(p<=20){
			if(p % 5 == 0){
				System.out.println("Hey");
			}
			p++;
		}
		
//		while(true){
//			System.out.println("hey");
//		}
		
		//for loop:
		for(int k=1; k<=10; k++){
			System.out.println(k);//1 2 3 .......10
		}
		
//		for(; ;){
//			System.out.println("JAVA");
//		}
		
		//even numbers:
		//2 4 6 8 10
		for(int even=2; even<=10; even=even+2){
			System.out.println(even);//0 2 4  6
		}
		
		//odd numbers:
		//1 3 5 7 9
		for(int odd=1; odd<=9; odd=odd+2){
			System.out.println(odd);//1 3
		}
		
		//do-while:
		int t = 1;
		do{
			System.out.println(t);
			t++;
		}
		while(t<=10);
		
	}

}
