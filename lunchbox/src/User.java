

import java.io.*;

public class User implements Serializable{
   private String name;
   private String pw;
   private String phone_num;
   private String address;
   private String inquiry;
   private lunchbox[] mybox;//order_list
   private lunchbox[] mybasket;//basket
   private int box_num;
   private int basket_num;
   
   public User() {
      name = "";
      pw = "";
      phone_num = "";
      address = "";
      inquiry = "";
      mybox = new lunchbox[100];
      mybasket = new lunchbox[100];
      box_num =0;
      basket_num = 0;
   }
   
   public User(String name, String pw, String phone_num, String address, String inquiry) {
      this.name = name;
      this.pw = pw;
      this.phone_num = phone_num;
      this.address = address;
      this.inquiry = inquiry;
      mybox = new lunchbox[100];
      mybasket = new lunchbox[100];
      box_num = 0;
      basket_num = 0;
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
   
   public String getinquiry() {
	   return inquiry;
   }
   
   public lunchbox[] getbox() {
      return mybox;
   }
   
   public lunchbox[] getbasket() {
      return mybasket;
   }
   
   public int getbox_num() {
      return box_num;
   }
   
   public int getbasket_num() {
      return basket_num;
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
   
   public void setinquiry(String s) {
	   inquiry = s;
   }
   
   public void setbox(lunchbox new_box) {
      mybox[box_num++] = new lunchbox(new_box);
   }
   
   public void setbasket(lunchbox new_basket) {
      mybasket[basket_num++] = new lunchbox(new_basket);
   }
   
   public String toString() {
      String[] order_list = new String[box_num];
      for(int i=0; i<box_num; i++) {
         order_list[i] = new String(mybox.toString()+"\n");
      }
      return name+ " " + pw + " " + phone_num + " " + address + "\n" + order_list;
   }
}