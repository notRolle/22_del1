package Test;

import java.lang.Math;
//Terningen udviklet med brug af ideer og kode fra Java Software Solutions: Foundations of Program design, 9th Edition, listing 4.2


public class Die {
    //Private attributter for vores terninger
    private final int Max = 6;
    private final int maxSum = Max + Max;
    private int faceValue1;
    //private int faceValue2;

    //Konstruktør for terningerne
    public Die() {
        faceValue1 = 1;
        //faceValue2 = 1;
}

    //Terningerne bygges ud fra samme princip som TestDice, da vores test viser en normalfordeling
    public int roll1() {
        faceValue1 = (int) (Math.random() * Max + 1);
            return faceValue1;
    }
    /*public int roll2() {
        faceValue2 = (int) (Math.random() * Max + 1);
        return faceValue2;
    }*/

    //Get-metode til at se den nuværende faceValue af terningerne
    public int getFaceValue1() {
        return faceValue1;
    }
    /*public int getFaceValue2() {
        return faceValue2;
    }*/

    //Set-metode til ændre værdien af faceValue1 og faceValue2
    public int setFaceValue1(int x1) {
        faceValue1 = x1;
        return x1;
    }
    /*public int setFaceValue2(int x1) {
        faceValue1 = x1;
        return x1;
        {*/
    public int getSum(int faceValue1 + faceValue2) {
        Sum = faceValue1 + faceValue2;
        return sum;

    }





}