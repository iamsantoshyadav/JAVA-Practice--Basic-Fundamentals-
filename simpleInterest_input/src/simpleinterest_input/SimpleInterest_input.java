
package simpleinterest_input;
import java.io.*;
/**
 *
 * @author Santosh Yadav
 */
public class SimpleInterest_input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float principle,rate,time,si;
        
        try 
        {
            BufferedReader br= new BufferedReader(
                            new InputStreamReader(System.in));
            System.out.print("Enter Pricicple Ammount : ");
            principle=Float.parseFloat(br.readLine());
            System.out.print("Enter Rate of Interest : ");
            rate=Float.parseFloat(br.readLine());
            System.out.print("Enter time  : ");
            time=Float.parseFloat(br.readLine());
            si=(principle*rate*time)/100;
            System.out.print("Interest of ammount"+ principle + "is = "+si );
        }
        catch(IOException e)
        {
        
            System.out.print("Enter the value carefully\n");
            
        }
    
}
