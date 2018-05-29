
package simpleinterest;

/**
 *
 * @author Santosh Yadav
 */
public class SimpleInterest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float principle,rate,time,si;
        principle=10000.67f;
        rate=10.5f;
        time=2.5f;
        si=(principle*rate*time)/100;
        System.out.print("Simple interest of given amount is "+si+"\n\n");
                
    }
    
}
