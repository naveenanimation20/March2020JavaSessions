package OOP_Interface;

public class FortisHospital extends WHO implements USMedical, UKMedical, IndianMedical {

	// USA
	@Override
	public void orthoServices() {
		System.out.println("FS -- orthoServices");
	}

	@Override
	public void cardioServices() {
		System.out.println("FS -- cardioServices");
	}

	@Override
	public void neuroServices() {
		System.out.println("FS -- neuroServices");
	}

	@Override
	public void Services911() {
		System.out.println("FS -- Services911");
	}

	// UK
	@Override
	public void physioServices() {
		System.out.println("FS -- Services911");
	}

	@Override
	public void pediatricServices() {
		System.out.println("FS -- Services911");
	}

	// India
	@Override
	public void oncologyServices() {
		System.out.println("FS -- oncologyServices");

	}

	@Override
	public void radioServices() {
		System.out.println("FS -- radioServices");

	}

	@Override
	public void pathologyServices() {
		System.out.println("FS -- pathologyServices");
	}
	
	
	//fortis:
	public void medicalInsurance(){
		System.out.println("FS -- medicalInsurance");
	}

	public void OPTClinics(){
		System.out.println("FS -- OPTClinics");
	}
	
	//who:
	@Override
	public void vaccination(){
		System.out.println("FS -- vaccination");

	}
	
	@Override
	public void polio(){
		
	}
	
	
}
