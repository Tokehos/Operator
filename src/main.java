public class Main {

    public static void main(String[] args) {

        int persent = 0;
        int balance = 100; // текущий баланс //
        int enterMoney = 1; // пополнение //
        int bonus;
        int total;

        if (enterMoney <= 0) {
            System.out.println("Не может быть отрицательной или нулевой!");
        } else {
            if (enterMoney < 1000) {
                persent = 0;
                bonus = enterMoney * persent / 100;
                total = balance + enterMoney + bonus;
                System.out.println("Бонусы = " + bonus);
                System.out.println("Итоговый баланс = " + total);

            } else {
                persent = 1;
                bonus = enterMoney * persent / 100;
                total = balance + enterMoney + bonus;
                System.out.println("Бонусы + " + bonus);
                System.out.println("Итоговый баланс + " + total);
            }
        }
        System.out.println("Спасибо, что воспользовались услугами MaxPay!");
    }
}
