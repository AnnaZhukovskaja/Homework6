package Task1;

public class Main {

//1. Создать класс CreditCard c полями номер счета, текущая сумма на счету.
//    Добавьте метод, который позволяет начислять сумму на кредитную  карточку.
//    Добавьте метод, который позволяет снимать с карточки некоторую сумму.
//    Добавьте метод, который выводит текущую информацию о карточке.
//    Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма.
//
//    Тестовый сценарий для проверки:
//            1. Положите деньги на первые две карточки и снимите с третьей.
//            2. Выведите на экран текущее состояние всех трех карточек.
//

    public static void main(String[] args) {

        CreditCard alfa = new CreditCard(123456, 100.5);
        CreditCard prior = new CreditCard(678997, 899.99);
        CreditCard belweb = new CreditCard(987654, 999.67);

        alfa.displayInfo();
        prior.displayInfo();
        belweb.displayInfo();

        alfa.replenishment(555);
        prior.replenishment(150);
        belweb.withdrawal(50);

        System.out.println("Rezult: ");
        alfa.displayInfo();
        prior.displayInfo();
        belweb.displayInfo();

    }

}
