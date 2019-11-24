import java.io.Serializable;

public class lunchbox implements Serializable{
	private String sidedish1;
	private String sidedish2;
	private String sidedish3;
	private String sidedish4;
	private String sidedish5; // �� & ����
	private String rice;
	private String seasondish;
	private int index;
	
	public lunchbox()
	{
		index = 0;
		sidedish1 = "";
		sidedish2 = "";
		sidedish3 = "";
		sidedish4 = "";
		sidedish5 = "";
		rice = "";
		seasondish = "";
	}
	public lunchbox(int index, String sd1, String sd2, String sd5, String rice)
	{
		this.index = index;
		this.sidedish1 = sd1;
		this.sidedish2 = sd2;
		this.sidedish5 = sd5;
		this.rice = rice;
	}//4��¥�� �޴�
	public lunchbox(int index, String sd1, String sd2, String sd3, String sd5, String rice)
	{
		this.index = index;
		this.sidedish1 = sd1;
		this.sidedish2 = sd2;
		this.sidedish3 = sd3;
		this.sidedish5 = sd5;
		this.rice = rice;
	}//5��¥�� �޴�
	public lunchbox(int index, String sd1, String sd2, String sd3, String sd4, String sd5, String rice)
	{
		this.index = index;
		this.sidedish1 = sd1;
		this.sidedish2 = sd2;
		this.sidedish1 = sd3;
		this.sidedish2 = sd4;
		this.sidedish5 = sd5;
		this.rice = rice;
	}//6��¥�� �޴�
	public lunchbox(int index, String seasondish)
	{
		this.index = index;
		this.seasondish = seasondish;
	}//�����޴�
	
	//copy constructor
	public lunchbox(lunchbox other) {
		this.sidedish1 = other.sidedish1;
		this.sidedish2 = other.sidedish2;
		this.sidedish3 = other.sidedish3;
		this.sidedish4 = other.sidedish4;
		this.sidedish5 = other.sidedish5;
		this.rice = other.rice;
		this.seasondish = other.seasondish;
	}
	
	public String getdish1() {
		return sidedish1;
	}
	
	public String getdish2() {
		return sidedish2;
	}
	
	public String getdish3() {
		return sidedish3;
	}
	
	public String getdish4() {
		return sidedish4;
	}
	
	public String getdish5() {
		return sidedish5;//��
	}
	
	public String getrice() {
		return rice;
	}
	
	public String getseasondish() {
		return seasondish;
	}
	
	public int getindex() {
		return index;
	}
	
	public void setdish1(String s) {
		sidedish1 = s; 
	}
	
	public void setdish2(String s) {
		sidedish2 = s; 
	}
	
	public void setdish3(String s) {
		sidedish3 = s; 
	}
	
	public void setdish4(String s) {
		sidedish4 = s; 
	}
	
	public void setdish5(String s) {
		sidedish5 = s; 
	}
	
	public void setrice(String s) {
		rice = s; 
	}
	
	public void setseasondish(String s){
		seasondish = s;
	}
	
	public void setindex(int n) {
		index = n;
	}
	
	public String toString() {
		if(index == 4)
		{
			return(sidedish1 + " " + sidedish2 + " " + sidedish5 + " " + rice);
		}
		else if(index == 5)
		{
			return(sidedish1 + " " + sidedish2 + " " + sidedish3 + " " + sidedish5 + " " + rice);
		}
		else if(index == 6)
		{
			return(sidedish1 + " " + sidedish2 + " " + sidedish3 + " " + sidedish4 + " " + sidedish5 + " " + rice);
		}
		else if(index == 7)
		{
			return(seasondish);
		}
		else
		{
			return ("error");
		}
	}
}
