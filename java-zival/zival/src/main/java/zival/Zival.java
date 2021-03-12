package zival;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Zival implements ActionListener {

    private AnimalTableModel tableModel;
    private JTextField inputField;
    private static String[] colors = {"Tabby", "Red", "Black and White", "Black", "White"};

    public static void main(String[] args) {

        Zival zival = new Zival();
    }

    public Zival() 
    {
        JFrame window = new JFrame("Maine Coon cattery");

        window.setSize(800, 600);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());

        window.add(mainPanel);

        // top panel
        JPanel topPanel = new JPanel();

        mainPanel.add(topPanel, BorderLayout.NORTH);

        // text
        JLabel label = new JLabel("Enter cat's name");
        topPanel.add(label);
        
        inputField = new JTextField("", 64);
        topPanel.add(inputField);

        // button
        JButton button = new JButton("Add");
        button.addActionListener(this);
        topPanel.add(button);

        // add table model
        tableModel = new AnimalTableModel();

        // add table
        JTable table = new JTable(tableModel);
        mainPanel.add(table, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        System.out.println("Add new row: " + inputField.getText());

        Cat newAnimal = new Cat("Maine Coon", inputField.getText(), colors[(int) (Math.random() * colors.length)], (int)(Math.random() * (12 - 5 + 1) + 5));

        // add row to the table
        tableModel.addAnimal(newAnimal);

    }
    
}