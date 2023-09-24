package Task2;

public class HDD {

    String name;
    String type;
    int volume;

    HDD() {}

    HDD(String name, String type, int volume) {
        this.name = name;
        this.type = type;
        this.volume = volume;
    }

    void displayInfo() {
        System.out.println("HDD:\n " + "Name - " + name + "\n Type - " + type + "\n Volume -  " + volume);
    }

    @Override
    public String toString() {
        return "HDD{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", volume=" + volume +
                '}';
    }
}
