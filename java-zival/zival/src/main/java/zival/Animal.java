package zival;

public class Animal {
    private String name;
    private String color;
    private int weight;

    // Constructor
    public Animal(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Getter
    public String getColor() {
        return color;
    }

    // Getter
    public int getWeight() {
        return weight;
    }
}