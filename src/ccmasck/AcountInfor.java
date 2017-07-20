/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccmasck;

/**
 *
 * @author Shawn
 */
public class AcountInfor implements CCmasckInterface {

    private int numcount;
    private double price;
    private String userName;

    
    
    public void setNumcount(int numcount) { this.numcount = ++numcount;}

    public int getNumcount() { return numcount; }

    public void inputPrice(double price) {  this.price = disMethod(price);}

    public double getPrice() { return price; }
    
    public void setUserName(String userName ){this.userName = userName;}
    
    public String getUserName(){ return userName; }

}
