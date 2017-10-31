import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;
public class BagelHouseGUI extends JFrame {

//    private WelcomePanel welcome;
//    private BagelPanel bagel;
//    private CoffeePanel coffee;
//    private ToppingPanel toppings;
//    private RedEyeSlider shots;

    private MyOrder order;
    private WelcomePanel welcome;

    private JLabel label;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;

    private JPanel buttonPanel;
    private JPanel panel;
    private JButton calcButton;
    private JButton exitButton;


    public BagelHouseGUI(){
        //Set title
        setTitle("Order Calculator");

        //Specify action for when close button is clicked
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(400,500);

        //Create a borderLayout manager
        setLayout(new BorderLayout());

//        welcome = new WelcomePanel();
//        bagel = new BagelPanel();
//        coffee = new CoffeePanel();
//        toppings = new ToppingPanel();
//        shots = new RedEyeSlider();
        //Create custom panel
        order = new MyOrder();
        welcome = new WelcomePanel();


        //Create a panel
        //panel = new JPanel();


        //Button panel method
        buildButtonPanel();
        //buildOutputPanel();
//        add(welcome, BorderLayout.NORTH);
//        add(bagel,BorderLayout.WEST);
//        add(coffee, BorderLayout.EAST);
//        add(shots, BorderLayout.CENTER);
        add(welcome, BorderLayout.NORTH);
        add(order, BorderLayout.WEST);
//        add(panel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);


        //Pack the content of the window and display it
       // pack();
        setVisible(true);
    }
    /**
     * The buildButtonPanel method builds the button panel
     */
    private void buildButtonPanel(){
        //Create a panel for the button
        buttonPanel = new JPanel();

        //Create the button
        calcButton = new JButton("Calculate");
        exitButton =  new JButton("Exit");

        //Register the action listeners
        calcButton.addActionListener(new CalculateListener());
        exitButton.addActionListener(new ExitListener());

        //Add the button to the button panel
        buttonPanel.add(calcButton);
        buttonPanel.add(exitButton);
    }
//    private void buildOutputPanel(){
//        panel = new JPanel();
//        label = new JLabel(order.getbagelName() + " " + " " + order.getBagel());
//        panel.add(label);
//        label3 = new JLabel("(Includes 0 shots");
//    }
    /**
     * This private inner class handles the events when the user clicks the add to order button
     */
    private class CalculateListener implements ActionListener{
        public void actionPerformed(ActionEvent e){

            double bgCost;
            double cfCost;
            double toppin;
            double shot;
            double total = 0.0;

            bgCost = order.getBagel();
            cfCost = order.getCoffee();
            toppin = order.getTopping();
            shot = order.getShot();
            total = bgCost + cfCost + shot + toppin;
            JOptionPane.showMessageDialog(null, total);
        }
    }
    private class ExitListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }
    public static void main(String[] args){
        new BagelHouseGUI();

    }
}
