package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 53000;
        double uangDidompet = 25000;

        if (uangDidompet<totalBelanja) {
            System.out.println("Uang kurang, kurangi jajan anda");

        }else if (uangDidompet>totalBelanja) {
            double angsul = uangDidompet - totalBelanja;
            System.out.println("Uang cukup, angsul : " + angsul);
        }else {
            System.out.println("Uang Pas... Asekkuee");
        }
    }

}
