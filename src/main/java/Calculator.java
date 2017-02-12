/**
 * Created by touit on 12/02/2017.
 */
public class Calculator {


    private float a = 0;
    private float b = 0;
    private float r = 0;



    public float addition(float number, float number1){

    float a = number;
    float b = number1;
    float r = a + b;
    return r;


    }
    public float subtraction(float number, float number1){

        float a = number;
        float b = number1;
        float r = a-b;
        return r;


    }
    public float divide(float number, float number1){

        float a = number;
        float b = number1;


        if(b == 0){

            System.out.println("Erreur diviseur ne peut etre egal a 0");


        }else{

            float r = a/b;

        }

        return r;

    }



    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }
}
