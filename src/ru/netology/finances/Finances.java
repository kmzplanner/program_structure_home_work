package ru.netology.finances;

public class Finances {
    public static double calcPayment(int start, int amount, int years){
        double monthPayment = (amount - start)/(years*12);
        return monthPayment;
    }
}
