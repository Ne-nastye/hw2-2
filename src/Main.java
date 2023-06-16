public class Main {
    public static void main(String[] args) {

        int balance = 100; // начальный баланс денежных средств на телефоне
        int drop = 1100; // сумма пополнения
        int totalbalance = balance + drop; // итоговый баланс денежных средств на телефоне
        int bonus = drop / 100; // бонус: при пополнении на сумму от 1000р за каждые 100р будет бонус=1р
        if (drop >= 1000) {
            System.out.println("Итоговый баланс счета: " + (totalbalance + bonus));
        } else {
            System.out.println("Итоговый баланс счета: " + totalbalance);
        }
        if (drop >= 1000) {
            System.out.println("Бонусы: " + bonus);
        }
    }
}