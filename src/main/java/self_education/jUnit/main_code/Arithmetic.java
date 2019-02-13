package self_education.jUnit.main_code;

import java.util.Arrays;

public class Arithmetic {

    public double addition(double a, double b) {
        return a + b;
    }

    public float subtraction(float a, float b) {
        return a - b;
    }

    public int division(int a, int b) {
        return a / b;
    }

    public int [] arrayCopy(int ... a) {
        int [] array = new int[a.length];
        for (int i = a.length -1; i >= 0; i--){
            array[i] = a[i];
            System.out.println(Arrays.toString(array));
        }
        return array;
    }

    public String characterInBytes(char c){
        return Integer.toBinaryString(c);
    }

    public Object objectCreation(){
        return new Object();
    }

}

