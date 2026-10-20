/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */

//Rahika Faruque
//991827678

public class StatusUser 
{
    public enum Status 
{
    REJECTED, PENDING, PROCESSING, APPROVED, COMPLETE
}
    
    
   public static void statusDetail()
{
    for(int i = 0; i < Status.values().length; i++) {
        System.out.println(Status.values()[i]);
    }
    
            
/*switch(code.toUpperCase())
        {
        case "ZERO": System.out.println("REJECTED");
        break;
        case "ONE": System.out.println("PENDING");
        break;
        case "TWO":
        System.out.println("PROCESSING");
        break;
        case "THREE": 
            System.out.println("APPROVED");
        break;
        default:
         System.out.println("NOT VALID CODE");
        break;
        } */
}
 
}
