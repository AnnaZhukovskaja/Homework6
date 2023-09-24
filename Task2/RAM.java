package Task2;

public class RAM {

    String name;
    int volume;

    RAM() {
    }

    RAM(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    void displayInfo() {
        System.out.println("RAM:\n " + "Name - " + name + "\n Volume -  " + volume);

    }

    @Override
    public String toString() {
        return "RAM{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
