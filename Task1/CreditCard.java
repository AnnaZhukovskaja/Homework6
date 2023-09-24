package Task1;

public class CreditCard {
    int numberOfAccount;
    double currentSum;

    CreditCard(int numberOfAccount, double currentSum) {
        this.numberOfAccount = numberOfAccount;
        this.currentSum = currentSum;
    }

    void replenishment(double sum) {
        currentSum = currentSum + sum;
    }

    void withdrawal(double sum) {
        currentSum = currentSum - sum;
    }

    void displayInfo(){
        System.out.println("Corrent sum on the card " + numberOfAccount + " is " + currentSum);
    }






}
