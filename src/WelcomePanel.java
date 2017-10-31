import javax.swing.*;
/**
 * Assignemnt 3
 * @author Tanekar
 * 10/30/2017
 * The Greeting class displays a greeting in the panel
 */
public class WelcomePanel extends JPanel {
    private JLabel greeting; //Display greeting

    /**
     * Constructor
     */



    public WelcomePanel(){
        //Create a Label
        greeting = new JLabel("Welcome to Brandi's Bagel House");

        //Add to the label to this panel
        add(greeting);
    }
}

