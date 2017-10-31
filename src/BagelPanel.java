import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;


public class BagelPanel extends JPanel {
    private JComboBox bagelBox;
    public JPanel bagelFrame;
    public final double NO_BAGEL = 0.0;
    public final double WHITE_BAGEL = 1.25;
    public final double WHEAT_BAGEL = 1.50;
    public final double SESAME_BAGEL = 1.50;

    public String[] bagels = {"No Bagel", "White Bagel", "Wheat Bagel", "Sesame Bagel"};
    public double[] bagelCosts = {NO_BAGEL, WHITE_BAGEL, WHEAT_BAGEL, SESAME_BAGEL};

    public JLabel bagelLabel;



    public BagelPanel() {
        //Create a panel to hold the combo box
        bagelFrame = new JPanel();
        bagelLabel = new JLabel();


        //Set gridLayout
        setLayout(new GridLayout(1,1));

        //Create combo boxes
        bagelBox = new JComboBox(bagels);


        //Add listeners
        bagelBox.addActionListener(new BagelChoiceListener());


        //Add a border around the panel
        setBorder(BorderFactory.createTitledBorder("Order"));

        //Add combo boxes to panel
        add(bagelBox);
        add(bagelLabel);

    }
    /**
     * Private inner class that handles the event when the user selects an item of the combo box
     */
    private class BagelChoiceListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == bagelBox){
                JComboBox cb = (JComboBox)e.getSource();
                String msg = (String) cb.getSelectedItem();
                switch (msg){
                    case "No bagel":
                        bagelLabel.setText("No Bagel");
                }

            }

//            int index = bagelBox.getSelectedIndex();
//            double bagelPrice = bagelCosts[index];
        }
    }

}