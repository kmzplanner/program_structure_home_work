import ru.netology.finances.Finances;

public class Main {

    public static void main(String[] args) {
        double payment = Finances.calcPayment(200000, 2600000,1);
        System.out.println(payment);
    }
}
