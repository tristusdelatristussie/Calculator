/**
 * Created by touit on 12/02/2017.
 */
public class CalculatorTest extends Calculator {

    public static void main(String[] args) {



        Float addition1 = new CalculatorTest().addition(1.0f,1.0f);
        System.out.println(addition1);


        Float soustraction1 = new CalculatorTest().subtraction(2.0f,1.0f);
        System.out.println(soustraction1);

        Float division1 = new CalculatorTest().divide(5.0f,5.0f);
        System.out.println(division1);


        Float division2 = new CalculatorTest().divide(5.0f,0.0f);
        System.out.println(division2);






    }


}
