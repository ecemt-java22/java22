
public class Company extends Customer {
	private String taxtNamber;
	private String companyName;
	
	public Company() {

	}

	public Company(int id, String city, String taxtNamber, String companyName) {
		this.taxtNamber = taxtNamber;
		this.companyName = companyName;
	}

	public String getTaxtNamber() {
		return taxtNamber;
	}

	public void setTaxtNamber(String taxtNamber) {
		this.taxtNamber = taxtNamber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
