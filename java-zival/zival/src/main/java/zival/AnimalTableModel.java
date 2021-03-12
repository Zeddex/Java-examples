package zival;

import javax.swing.table.DefaultTableModel;
import java.util.*;

public class AnimalTableModel extends DefaultTableModel {
    
    private static final long serialVersionUID = 1L;
    private ArrayList<Animal> animals;

    public AnimalTableModel()
    {
        super();

        animals = new ArrayList<Animal>();

        // add columns to the table
        addColumn("Breed");
        addColumn("Name");
        addColumn("Color");
        addColumn("Weight");
    }

    // add rows to the table
    public void addAnimal(Cat animal)
    {
        animals.add(animal);

        Object[] line = new Object[] {animal.getBreed(), animal.getName() + " ", animal.getColor(), animal.getWeight() + " kg"};

        // add to the table
        addRow(line);
    }
}
