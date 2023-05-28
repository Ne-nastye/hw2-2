public class Main {
    public static void main(String[] args) {

        int x = 100; // начальный баланс денежных средств на телефоне
        int y = 300; // сумма пополнения
        int z = x + y; // итоговый баланс денежных средств на телефоне
        int bonus = y / 100 * 10; // бонус при пополнении на сумму от 500р и более
        if (y >= 500)
            System.out.println("Итоговый баланс счета: " + (z + bonus));
        else {
            System.out.println("Итоговый баланс счета: " + z);
        }
        if (y >= 500)
        System.out.println("Бонусы: " + bonus);
    }
}