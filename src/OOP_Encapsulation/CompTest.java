package OOP_Encapsulation;

public class CompTest {

	public static void main(String[] args) {

		
		Company comp1 = new Company();
		
		
		Company comp = new Company();
		comp.setName("IBM");
		comp.setLogo("IBM logo");
		comp.setTotalEmp(1000);
		comp.setTenderAmount(20000);
		comp.setInformation("New Contract");
		
		
		System.out.println(comp.getName());
		System.out.println(comp.getLogo());
		System.out.println(comp.getTotalEmp());
		System.out.println(comp.getTenderAmount());
		System.out.println(comp.getInformation());
		
		comp.setInformation("New Contract1");
		System.out.println(comp.getInformation());


	}

}
