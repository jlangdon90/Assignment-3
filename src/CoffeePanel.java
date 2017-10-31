import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class CoffeePanel extends JPanel {
    public JComboBox coffeeBox;
    public final double REGULAR_COFFEE = 1.25;
    public final double CAPPUCCINO = 2.00;
    public final double REDEYE_COFFEE = 1.50;
    public final double DECAF_COFFEE = 1.25;
    public final double NO_COFFEE = 0.0;


    public String[] coffee = {"No Coffee", "Regular Coffee", "Cappuccino", "Redeye Coffee", "Decaf Coffee"};
    public double[] coffeeCost = { NO_COFFEE, REGULAR_COFFEE, CAPPUCCINO, REDEYE_COFFEE, DECAF_COFFEE};

    public CoffeePanel(){

        setLayout(new GridLayout(1, 1));

        coffeeBox = new JComboBox(coffee);

        coffeeBox.addActionListener(new ChoiceListener());

        add(coffeeBox);
    }
    private class ChoiceListener implements ActionListener {
        public void actionPerformed(ActionEvent e){

            int index2 = coffeeBox.getSelectedIndex();
            double coffeePrice = coffeeCost[index2];

            double totalCost =  coffeePrice;
            //System.out.println(totalCost);
        }
    }
}
