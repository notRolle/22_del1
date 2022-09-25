package Test;
import java.lang.Math;

public class Test {

    public static void dice(String[] args){


        int dice1= (int)(Math.random()*6+1);
        int dice2= (int)(Math.random()*6+1);

        int sum= dice1 + dice2;
        System.out.println(sum);
    }
}
