package Test;

public class TestDice {
    public static void main(String[] args) {

        //-------------------------Tester normalfordeling--------------------------------

        //tomt array, men antallet af værdier som summen af to terninger kan give.
        int[] num = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int j = 0; j <1000 ; j++) {
            // To terninger
            int dice1 = (int) (Math.random() * 6 + 1);
            int dice2 = (int) (Math.random() * 6 + 1);
            //Beregner og printer summen af øjne
            int sum = dice1 + dice2;

            num[sum-2]+=1;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }



    }
}
