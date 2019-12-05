

import java.io.Serializable;

public class lunchbox implements Serializable{
	private String rice;
	private String seasondish;
	private String sidedish[];
	private int index;
	
	public lunchbox()
	{
		index = 0;
		sidedish = new String[index];
		rice = "";
		seasondish = "";
	}
	public lunchbox(String sd1, String sd2, String sd5, String rice)
	{
		this.index = 4;
		sidedish = new String[index];
		this.sidedish[0] = sd1;
		this.sidedish[1] = sd2;
		this.sidedish[2] = sd5;
		this.rice = rice;
	}//4개짜리 메뉴
	public lunchbox(String sd1, String sd2, String sd3, String sd5, String rice)
	{
		this.index = 5;
		sidedish = new String[index];
		this.sidedish[0] = sd1;
		this.sidedish[1] = sd2;
		this.sidedish[2] = sd3;
		this.sidedish[3] = sd5;
		this.rice = rice;
	}//5개짜리 메뉴
	public lunchbox(String sd1, String sd2, String sd3, String sd4, String sd5, String rice)
	{
		this.index = 6;
		sidedish = new String[index];
		this.sidedish[0] = sd1;
		this.sidedish[1] = sd2;
		this.sidedish[2] = sd3;
		this.sidedish[3] = sd4;
		this.sidedish[4] = sd5;
		this.rice = rice;
	}//6개짜리 메뉴
	public lunchbox(String seasondish)
	{
		this.index = 7;
		this.seasondish = seasondish;
	}//계절메뉴
	
	//copy constructor
	public lunchbox(lunchbox other) {
		this.index = other.index;
		sidedish = new String[this.index];
		for(int i = 0; i<index; i++)
		{
			this.sidedish[i] = other.sidedish[i];
		}
		this.sidedish = other.sidedish.clone();
		this.rice = other.rice;
		this.seasondish = other.seasondish;
	}
	
	public String getdish(int index) {
		return sidedish[index];
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
	
	public void setdish(int index, String s) {
		sidedish[index] = s; 
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
	
	public String toString()
	{
		if(this.index == 4)
		{
			return index + " " + sidedish[0] + " " + sidedish[1] + " " + sidedish[2] + " " + rice; 
		}
		else if(this.index == 5)
		{
			return index + " " + sidedish[0] + " " + sidedish[1] + " " + sidedish[2] + " " + sidedish[3] + " " + rice;
		}
		else if(this.index == 6)
		{
			return index + " " + sidedish[0] + " " + sidedish[1] + " " + sidedish[2] + " " + sidedish[3] + " " +  sidedish[4] + " " + rice;
		}
		else if(this.index == 7)
		{
			return index + " " + seasondish;
		}
		else
		{
			return "error";
		}
	}
}

