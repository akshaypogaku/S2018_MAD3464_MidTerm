/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c0738027_midterm_mads3464;

/**
 *
 * @author macstudent
 */
public class C0738027_MidTerm_MADS3464 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String string1="Lambton";
        String string2="";
        String str="James tiBerUs kiRk";
        String str2;
        
        {
        for(int i=string1.length()-1;i>=0;i--)
        string2 = string2 + string1.charAt(i);
    
    System.out.println("the reverse string is" +string2);
   }
        if(str==null)
        {
            System.out.println("The String is empty");
        }
         str2=str.toUpperCase();
         
         System.out.println(str2);
    }
}
