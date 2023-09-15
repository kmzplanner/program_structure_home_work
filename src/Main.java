public class Main {
    public static double calcPayment(int start, int amount, int years){
        double monthPayment = (amount - start)/(years*12);
        return monthPayment;
    }
    public static void main(String[] args) {
        double payment = calcPayment(200000, 2600000,1);
        System.out.println(payment);
    }
}
