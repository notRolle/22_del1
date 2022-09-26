package Test;

//Her testes Die class
public class TestAfDie {
    public static void main(String[] args) {

    Die die1 = new Die();
    Die die2 = new Die();
    Die dieSum = new Die();
    int a = die1.roll1();
    int b = die2.roll1();
        System.out.println(a);
        System.out.println(b);

        int c = dieSum.getSum(a, b);
        System.out.println(c);
        die1.getSum(a, b);






    }
}
