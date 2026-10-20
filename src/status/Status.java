/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Rahika Faruque
//991827678

package status;

/** This class takes String input from user 
 * and calls method statusDetail to print the 
 * status of User-Rejected,Pending,Processing and Approved.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the status details. 
 * @author srinivsi 
 */
public class Status {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
    /*Scanner in =new Scanner(System.in);
    System.out.println("Enter the user status code (ex. 0, 1, 2, 3, 4): ");
    String code = in.next();
    StatusUser t= new StatusUser();
    int codei = Integer.parseInt(code); //assuming the user entered an int
    t.statusDetail(codei); */
        StatusUser.statusDetail();
    }
    
}
