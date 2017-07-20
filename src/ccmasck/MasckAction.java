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
public class MasckAction extends AcountInfor{
//    private int numcount;
   
    public String dataMack(int data1, int data2, int data3, int data4){
        
        StringBuilder sb = new StringBuilder(data1+"_"+ data2+"_"+ data3+"_"+data4); 
        setNumcount(getNumcount());
        return "XXXX_XXXX_XXXX_"+ sb.substring(15, 19);
    
    }
    
    
   
//  public void inputPrice (double price){
//      this.price = disMethod(price);
//   }
//    
//  public double getPrice(){
//     return price;
//  }
}


