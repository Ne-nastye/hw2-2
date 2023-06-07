public class Main {
    public static void main(String[] args) {

        int balance = 100; // начальный баланс денежных средств на телефоне
        int drop = 400; // сумма пополнения
        int totalbalance = balance + drop; // итоговый баланс денежных средств на телефоне
        int bonus = drop / 100 * 10; // бонус при пополнении на сумму от 500р и более
        if (drop >= 500) {
            System.out.println("Итоговый баланс счета: " + (totalbalance + bonus));
        } else {
            System.out.println("Итоговый баланс счета: " + totalbalance);
        }
        if (drop >= 500) {
            System.out.println("Бонусы: " + bonus);
        }
    }