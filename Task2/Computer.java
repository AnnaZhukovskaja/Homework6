package Task2;

public class Computer {

    double cost;
    String model;
    HDD hdd;
    RAM ram;

    Computer(double cost, String model) {
        this.cost = cost;
        this.model = model;
    }

    Computer(double cost, String model, HDD hdd, RAM ram) {
        this.cost = cost;
        this.model = model;
        this.hdd = hdd;
        this.ram = ram;
    }

    void displayInfo() {
        System.out.println("Computer: " + "\nModel - " + model + "\nHDD - " + hdd.toString() + "\nRAM -  " + ram.toString() + "\nCost - " + cost);
    }

}
