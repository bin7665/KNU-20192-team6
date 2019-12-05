
public class Administer extends User{
	private boolean admin;
	private String company;
	
	public Administer() {
		super();
		this.admin = true;
		this.company = "";
	}
	
	public Administer(String name, String pw, String phone_num, String address, String company) {
		super(name, pw, phone_num, address);
		this.admin = true;
		this.company = company;
	}
	
	public boolean getAdmin() {
		return admin;
	}
	
	public String getCompany() {
		return company;
	}
		
	public void setAdmin(boolean type) {
		admin = type;
	}
	
	public void setCompany(String com) {
		company = com;
	}
	
}
