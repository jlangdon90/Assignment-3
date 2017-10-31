import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;


public class MyOrder extends JPanel {

    public JComboBox bagelBox;
    //public JPanel bagelFrame;
    public final double NO_BAGEL = 0.0;
    public final double WHITE_BAGEL = 1.25;
    public final double WHEAT_BAGEL = 1.50;
    public final double SESAME_BAGEL = 1.50;

    public String[] bagels = {"No Bagel", "White Bagel", "Wheat Bagel", "Sesame Bagel"};
    public double[] bagelCosts = {NO_BAGEL, WHITE_BAGEL, WHEAT_BAGEL, SESAME_BAGEL};

    private JComboBox toppingBox;
    // public JPanel toppingFrame;
    public final double NO_TOPPING = 0.0;
    public final double CREAM_CHEESE = 0.50;
    public final double BUTTER = 0.25;
    public final double PEACH_JELLY = 0.75;
    public final double BLUEBERRY_JAM = 0.75;

    public String[] topping = {"No Topping", "Cream Cheese", "Butter", "Peach Jelly", "Blueberry"};
    public double[] toppingCost = {NO_TOPPING, CREAM_CHEESE, BUTTER, PEACH_JELLY, BLUEBERRY_JAM};

    public JComboBox coffeeBox;
    public final double REGULAR_COFFEE = 1.25;
    public final double CAPPUCCINO = 2.00;
    public final double REDEYE_COFFEE = 1.50;
    public final double DECAF_COFFEE = 1.25;
    public final double NO_COFFEE = 0.0;

    public String[] coffee = {"No Coffee", "Regular Coffee", "Cappuccino", "Redeye Coffee", "Decaf Coffee"};
    public double[] coffeeCost = {NO_COFFEE, REGULAR_COFFEE, CAPPUCCINO, REDEYE_COFFEE, DECAF_COFFEE};

    private JPanel sliderPanel; //Slider panel
    private JSlider slider;  //declare slider

    private JPanel bagelPanel;
    private JPanel toppingPanel;
    private JPanel coffeePanel;
    private JPanel orderPanel;

    private JPanel panel;
    private JLabel label;

    public MyOrder() {

        //Set gridLayout
        setLayout(new GridLayout(4, 1));


        //Add a border around the panel
        setBorder(BorderFactory.createTitledBorder("Order"));

        //Create combo boxes
        bagelBox = new JComboBox(bagels);
        coffeeBox = new JComboBox(coffee);
        toppingBox = new JComboBox(topping);

        //Create slider
        slider = new JSlider(JSlider.HORIZONTAL, 0, 5, 0);
        slider.setMajorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setSnapToTicks(true);
        slider.addChangeListener(new SliderListener());

        //Add listeners
        bagelBox.addActionListener(new ChoiceListener());
        coffeeBox.addActionListener(new CoffeeChoiceListener());
        toppingBox.addActionListener(new ToppingChoiceListener());

        //label = new JLabel("Bagel");

        //Create a panel and add the combo boxes
        bagelPanel = new JPanel();
        toppingPanel = new JPanel();
        coffeePanel = new JPanel();
        sliderPanel = new JPanel();

        //bagelPanel.add(label);
        bagelPanel.add(bagelBox);
        toppingPanel.add(toppingBox).setVisible(false);
        coffeePanel.add(coffeeBox);
        sliderPanel.add(slider).setVisible(false);

        //Add combo boxes to panel
        add(bagelPanel, BorderLayout.NORTH);
        add(toppingPanel, BorderLayout.SOUTH);
        add(coffeePanel, BorderLayout.CENTER);
        add(sliderPanel, BorderLayout.SOUTH);
    }

    public double getBagel(){

        int index = bagelBox.getSelectedIndex();
        double bagelPrice = 0.0;
        String bagelName = " ";
        JLabel nameAndPrice = new JLabel();

        if (index == 0 ){
            bagelName = bagels[index];
            toppingPanel.add(toppingBox).setVisible(false);
            bagelPrice = bagelCosts[index];
        }
        if (index == 1){
            toppingPanel.add(toppingBox).setVisible(true);
            bagelPrice = bagelCosts[index];
        }
        if (index == 2){
            toppingPanel.add(toppingBox).setVisible(true);
            bagelPrice = bagelCosts[index];
        }
        if (index == 3){
            toppingPanel.add(toppingBox).setVisible(true);
            bagelPrice = bagelCosts[index];
        }
        return bagelPrice;
    }
    public String getbagelName(){
        int index = bagelBox.getSelectedIndex();
        String bagelName = "";

        if (index == 0){
            bagelName = bagels[index];
        }
        if (index == 1){
            bagelName = bagels[index];
        }
        if (index == 2){
            bagelName = bagels[index];
        }
        if (index == 3) {
            bagelName = bagels[index];
        }
        return bagelName;
    }
    /**
     * Private inner class that handles the event when the user selects an item of the combo box
     */
    private class ChoiceListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            int index = bagelBox.getSelectedIndex();
            double bagelPrice = bagelCosts[index];

            switch (index) {
                case 0:
                    bagelBox.getSelectedItem();
                    System.out.println(bagelPrice);
                    toppingPanel.add(toppingBox).setVisible(false);
                    break;

                case 1:
                    bagelBox.getSelectedItem();
                    toppingPanel.add(toppingBox).setVisible(true);
                    System.out.println(bagelPrice);
                    break;

                case 2:
                    bagelBox.getSelectedItem();
                    toppingPanel.add(toppingBox).setVisible(true);
                    System.out.println(bagelPrice);
                    break;

                case 3:
                    bagelBox.getSelectedItem();
                    toppingPanel.add(toppingBox).setVisible(true);
                    System.out.println(bagelPrice);
                    break;
            }
        }
    }
    private class CoffeeChoiceListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            int index = coffeeBox.getSelectedIndex();
            double coffeePrice = coffeeCost[index];
            String coff = coffee[index];
            switch (index) {
                case 0:
                    coffeeBox.getSelectedItem();
                    sliderPanel.add(slider).setVisible(false);
                    System.out.println(coffeePrice);
                    break;

                case 1:
                    coffeeBox.getSelectedItem();
                    sliderPanel.add(slider).setVisible(false);
                    System.out.println(coffeePrice);
                    break;

                case 2:
                    coffeeBox.getSelectedItem();
                    sliderPanel.add(slider).setVisible(false);
                    System.out.println(coffeePrice);
                    break;

                case 3:
                    coffeeBox.getSelectedItem();
                    sliderPanel.add(slider).setVisible(true);
                    System.out.println(coffeePrice);
                    break;

                case 4:
                    coffeeBox.getSelectedItem();
                    sliderPanel.add(slider).setVisible(false);
                    System.out.println(coffeePrice);
                    break;
            }
        }
    }
    /**
     * getCoffee Method
     * @return
     */
    public double getCoffee(){
        int index = coffeeBox.getSelectedIndex();
        double coffeePrice = 0.0;

        if (index == 0){
            sliderPanel.add(slider).setVisible(false);
            coffeePrice = coffeeCost[index];
        }
        if (index == 1){
            sliderPanel.add(slider).setVisible(false);
            coffeePrice = coffeeCost[index];
        }
        if (index == 2){
            sliderPanel.add(slider).setVisible(false);
            coffeePrice = coffeeCost[index];
        }
        if (index == 3){
            sliderPanel.add(slider).setVisible(true);
            coffeePrice = coffeeCost[index];
        }
        if (index == 4){
            sliderPanel.add(slider).setVisible(false);
            coffeePrice = coffeeCost[index];
        }
        return coffeePrice;
    }
    /**
     * Private inner class that handles the event when the slider is moved
     */
    private class SliderListener implements ChangeListener {
        public void stateChanged(ChangeEvent e) {

            double shots = slider.getValue();
        }
    }
    /**
     *
     * @return
     */
    public double getShot(){
        double shots = slider.getValue();
        double boots = 0.0;

        if (shots == 0){
            boots = 0.0;
        }
        if (shots == 1){
            boots = 0.50;
        }
        if (shots == 2){
            boots = 1.00;
        }
        if (shots == 3){
            boots = 1.50;
        }
        if (shots == 4){
            boots = 2.00;
        }
        if (shots == 5){
            boots = 2.50;
        }
        return boots;
    }
    private class ToppingChoiceListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            int index = toppingBox.getSelectedIndex();
            double toppingPrice;

            switch (index) {
                case 0:
                    toppingBox.getSelectedItem();
                    toppingPrice = toppingCost[index];
                    break;

                case 1:
                    toppingBox.getSelectedItem();
                    toppingPrice = toppingCost[index];
                    System.out.println(toppingPrice);
                    break;

                case 2:
                    toppingBox.getSelectedItem();
                    toppingPrice = toppingCost[index];
                    System.out.println(toppingPrice);
                    break;

                case 3:
                    toppingBox.getSelectedItem();
                    toppingPrice = toppingCost[index];
                    System.out.println(toppingPrice);
                    break;

                case 4:
                    toppingBox.getSelectedItem();
                    toppingPrice = toppingCost[index];
                    System.out.println(toppingPrice);
            }
        }
    }
    public double getTopping(){
        int index = toppingBox.getSelectedIndex();

        double toppings = 0.0;

        if (index == 0){
            toppings = toppingCost[index];
        }
        if (index == 1){
            toppings = toppingCost[index];
        }
        if (index == 2){
            toppings = toppingCost[index];
        }
        if (index == 3){
            toppings = toppingCost[index];
        }
        if (index == 4){
            toppings = toppingCost[index];
        }
        return toppings;
    }
}



