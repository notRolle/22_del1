package Test;

public class TestDice {

    //Test Terning
    public static int dice(){
        int dice1 = (int) (Math.random() * 6 + 1);
        int dice2 = (int) (Math.random() * 6 + 1);
        //Beregner og printer summen af øjne
        return dice1 + dice2;
    }





    public static void main(String[] args) {

        //-------------------------Tester normalfordeling--------------------------------

        //Tomt array, med samme antal værdier som summen af to terninger kan give.
        int[] num = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        //Loop for 1000 kast
        for (int j = 0; j <1000 ; j++) {

            Die die1 = new Die();
            Die die2 = new Die();
            int a=die1.roll1(), b=die2.roll1();
            int sum=a+b;
            // Notere hvad der blev slået for hvert kast i num array.
            num[sum-2]+=1;
            //System.out.println(dice()); // Data til histogram (Printer Alle Udfald)
        }
        //printer antal at hvert slag.
        for (int i = 0; i < num.length; i++) {
            System.out.println((i+2)+": " + num[i]);
        }
    }
}
