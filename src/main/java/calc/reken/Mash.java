package calc.reken;

public class Mash {
    public int rek(int a, int b, int c) {
        return  c = a + b;
    }
    public static void main(String[] args) {
        Mash mash = new Mash();
        int t = mash.rek(7, 8, 0);
        System.out.println(t);
    }
}
