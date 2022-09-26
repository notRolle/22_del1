package Test;

//Her testes alle funktioner af Die.java
public class TestAfDie {
    public static void main(String[] args) {

    Die die1 = new Die();
    Die die2 = new Die();
    Die compare = new Die();
    int a = die1.roll1();
    int b = die2.roll1();
        System.out.println(a);
        System.out.println(b);
        System.out.println(compare.getSum(a, b));
        System.out.println(compare.getEns(a, b));
        int d = die1.setFaceValue(2);
        System.out.println(d);
        System.out.println(die2.getFaceValue());






    }
}
