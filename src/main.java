public class Main {

    public static void main(String[] args) {


        int persent;
        int balance = 100; // текущий баланс //
        int enterMoney = 1990; // пополнение //
        if (enterMoney < 1000) {
            persent = 0;
        } else {
            persent = 1;
        }
        int bonus = enterMoney * persent / 100; // бонус //
        int total = balance + enterMoney + bonus; // баланс с учетом пополнения //
        System.out.println(total);
    }
}
