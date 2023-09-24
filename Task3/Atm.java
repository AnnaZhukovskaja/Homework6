package Task3;

public class Atm {

    //    2. Создать класс, описывающий банкомат.
//    Набор купюр, находящихся в банкомате, должен задаваться тремя
//    свойствами: количеством купюр номиналом 20, 50 и 100.
//    Сделать метод для добавления денег в банкомат.
//    Сделать функцию, снимающую деньги, которая принимает сумму денег, а
//    возвращает булевое значение - успешность выполнения операции.
//    При снятии денег функция должна распечатывать каким количеством
//    купюр какого номинала выдаётся сумма.
//    Создать конструктор с тремя параметрами - количеством купюр каждого
//    номинала.

    int quantity20InATM;
    int quantity50InATM;
    int quantity100InATM;
    int sumInAtm;
    int quantity100InWithdrawnSum;
    int quantity50InWithdrawnSum;
    int quantity20InWithdrawnSum;

    Atm(int quantityOfTwenty, int quantityOfFifty, int quantityOfHundred) {
        this.quantity20InATM = quantityOfTwenty;
        this.quantity50InATM = quantityOfFifty;
        this.quantity100InATM = quantityOfHundred;
    }

    void addBanknotes(int quantityOfTwentyBanknotes, int quantityOfFiftyBanknotes, int quantityOfHundredBanknotes) {
        quantity20InATM = quantity20InATM + quantityOfTwentyBanknotes;
        quantity50InATM = quantity50InATM + quantityOfFiftyBanknotes;
        quantity100InATM = quantity100InATM + quantityOfHundredBanknotes;
    }

    boolean withdrawal(int sum) {

        sumInAtm = quantity20InATM * 20 + quantity50InATM * 50 + quantity100InATM * 100;
        System.out.println("Summ in the ATM is " + sumInAtm);
        int remainingOfWithdrownSum = 0;

        if (sum < sumInAtm){
            quantity100InWithdrawnSum = sum / 100;
            if (quantity100InATM < quantity100InWithdrawnSum && quantity100InWithdrawnSum > 0) {
                quantity100InWithdrawnSum = quantity100InWithdrawnSum - quantity100InATM;
            }
            remainingOfWithdrownSum = (sum - (quantity100InWithdrawnSum * 100));
            if (remainingOfWithdrownSum % 50 == 10 || remainingOfWithdrownSum % 50 == 30) {
                quantity50InWithdrawnSum = ((sum - (quantity100InWithdrawnSum * 100)) / 50) - 1;
                if (quantity50InATM < quantity50InWithdrawnSum && quantity50InWithdrawnSum > 0) {
                    quantity50InWithdrawnSum = quantity50InWithdrawnSum - quantity50InATM;
                }
            } else {
                quantity50InWithdrawnSum = ((sum - (quantity100InWithdrawnSum * 100)) / 50);
            }
            if (quantity50InATM < quantity50InWithdrawnSum && quantity50InWithdrawnSum > 0) {
                quantity50InWithdrawnSum = quantity50InWithdrawnSum - quantity50InATM;
            }
            quantity20InWithdrawnSum = (sum - (quantity100InWithdrawnSum * 100 + quantity50InWithdrawnSum * 50)) / 20;
            remainingOfWithdrownSum = sum - (quantity100InWithdrawnSum * 100 + quantity50InWithdrawnSum * 50 + quantity20InWithdrawnSum * 20);
            if ((quantity20InATM < quantity20InWithdrawnSum) && (remainingOfWithdrownSum < 20)) {
                System.out.println("There are not enough banknotes in the ATM.");
                return false;
            }
            System.out.println("Successfully");
            System.out.println("Quantity of hundred banknotes: " + quantity100InWithdrawnSum + "\nQuantity of fifty banknotes:  " + quantity50InWithdrawnSum + "\nQuantity of twenty banknotes:  " + quantity20InWithdrawnSum);
            return true;
        } else {
            System.out.println("Insufficient funds.");
        }
        return false;
    }
}
