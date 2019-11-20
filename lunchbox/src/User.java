import java.io.*;

public class User implements Serializable{
	private String name;
	private String pw;
	private String phone_num;
	private String address;
	
	public User() {
		name = "";
		pw = "";
		phone_num = "";
		address = "";
	}
	
	public User(String name, String pw, String phone_num, String address) {
		this.name = name;
		this.pw = pw;
		this.phone_num = phone_num;
		this.address = address;
	}
	
	public String getname() {
		return name;
	}
	
	public String getpw() {
		return pw;
	}
	
	public String getphone_num() {
		return phone_num;
	}
	
	public String getaddress() {
		return address;
	}
	
	public void setname(String s) {
		name = s;
	}
	
	public void setpw(String s) {
		pw = s;
	}
	
	public void setphone_num(String s) {
		phone_num = s;
	}
	
	public void setaddress(String s) {
		address = s;
	}
	
	public String toString() {
		return name+ " " + pw + " " + phone_num + " " + address + "\n";
	}
}