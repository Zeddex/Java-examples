package zival;

public class Cat extends Animal {
    
    private String breed;

    // constructor
    public Cat(String breed, String name, String color, int weight)
    {
        super(name, color, weight);
        this.breed = breed;
    }

    // getter
    public String getBreed()
    {
        return breed;
    }
}
