package OOP_Interface;

public class FortisTest {

	public static void main(String[] args) {

		FortisHospital fs = new FortisHospital();
		
		fs.cardioServices();
		fs.neuroServices();
		fs.medicalInsurance();
		fs.pathologyServices();
		
		fs.ebola();
		fs.polio();
		fs.pandemic();
		fs.vaccination();
		
		USMedical.medicine();
		System.out.println(USMedical.min_fee);
		//USMedical.min_fee = 20;
		fs.nursing();
				
		//top casting:
		USMedical us = new FortisHospital();//child class object can be referred by parent interface ref variable
		
		us.orthoServices();
		us.cardioServices();
		us.neuroServices();
		us.Services911();
		
		UKMedical uk = new FortisHospital();
		uk.physioServices();
		uk.pediatricServices();
		
		
		
		
	}

}
