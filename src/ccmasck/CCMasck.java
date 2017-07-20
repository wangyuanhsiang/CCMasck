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
public class CCMasck {
     
    /**
     * @param args the command line arguments
     */
    public  static void main(String[] args) {
        // TODO code application logic here
        MasckAction ma = new MasckAction();
        String s = ma.dataMack(1234,4321,4231,2314);
        int data1 = print(ma).getNumcount();
        print(ma).inputPrice(550);
        print(ma).setUserName("Shawn Wang");
        String data2 = CCmasckInterface.cardType.switchMethod("INTERAC");    
        System.out.println(s);
        System.out.println(data1);
        System.out.println(print(ma).getPrice());
        System.out.println(data2 +" UserName : "+ print(ma).getUserName());
//        System.out.println();
        
        
        
    }
    
    
    public static AcountInfor print(AcountInfor data){ return data;}
}
