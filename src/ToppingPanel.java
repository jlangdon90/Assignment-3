import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToppingPanel extends JPanel {

    private JComboBox toppingBox;
    public JPanel toppingFrame;
    public final double NO_TOPPING = 0.0;
    public final double CREAM_CHEESE = 0.50;
    public final double BUTTER = 0.25;
    public final double PEACH_JELLY = 0.75;
    public final double BLUEBERRY_JAM = 0.75;

    public String[] topping = {"No Topping", "Cream Cheese", "Butter", "Peach Jelly", "Blueberry"};
    public double[] toppingCost = {NO_TOPPING, CREAM_CHEESE, BUTTER, PEACH_JELLY, BLUEBERRY_JAM};

    public ToppingPanel(){
        toppingFrame = new JPanel();
        toppingBox = new JComboBox(topping);

        toppingBox.addActionListener(new ChoiceListener());

        add(toppingBox);
    }
    /**
     * Private inner class that handles the event when the user selects an item of the combo box
     */
    private class ChoiceListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            int index = toppingBox.getSelectedIndex();
            double toppingPrice = toppingCost[index];
        }
    }
}
