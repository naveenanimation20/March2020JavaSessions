package OOP_Encapsulation;

public class Company {

	public String name;
	public String logo;
	public int totalEmp;

	private int tenderAmount;
	private String information;

	public Company() {

	}

	// to set the class vars values:
	public Company(String name, String logo, int totalEmp, int tenderAmount, String information) {
		this.name = name;
		this.logo = logo;
		this.totalEmp = totalEmp;
		this.tenderAmount = tenderAmount;
		this.information = information;
	}

	// getter and setter:
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public int getTotalEmp() {
		return totalEmp;
	}

	public void setTotalEmp(int totalEmp) {
		this.totalEmp = totalEmp;
	}

	public int getTenderAmount() {
		return tenderAmount;
	}

	public void setTenderAmount(int tenderAmount) {
		this.tenderAmount = tenderAmount;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

}
