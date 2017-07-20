/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccmasck;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author Shawn
 */
public class CardTypeClass {
    
    
    public String switchMethod(String data   ){
        String localdata;
        switch(data){
            case "VISA": localdata = cardType(data)+" User : " ;  break;
            case "MASTERCARD": localdata = cardType(data)+" User : "; break;
            case "INTERAC": localdata = cardType(data)+" User : " ; break;
            default : localdata = cardType(data)+" User : " ;
        
        
        }
        return localdata;
    }
   
    public String cardType(String data){ 
        String option1 = "This "+data+" card was purchased at "+LocalDateTime.of(LocalDate.now(), LocalTime.now()).toString();
        String option2 = "This "+data+" was purchased at "+LocalDateTime.of(LocalDate.now(), LocalTime.now()).toString();
        String option3 = "This DEBIT card was purchased at "+LocalDateTime.of(LocalDate.now(), LocalTime.now()).toString();
        if(data.equals("MASTERCARD"))
        { return option2; }
        else if(data.equals("VISA"))
        {return option1;}
        else if (data.equals("INTERAC"))
        {return option3;}
        else
        {return "Invaild card inserted";}
        
    }
  
}
