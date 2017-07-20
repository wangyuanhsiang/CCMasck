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
public interface CCmasckInterface {
    double dis1 = 0.9;
    double dis2 = 0.5;
    
    CardTypeClass cardType = new CardTypeClass();
    
    default double disMethod(double data){
    return data > 500 ? (data*dis1):data > 300 ? (data*dis2):data ;
    }
}
