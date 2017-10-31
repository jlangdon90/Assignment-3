import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class RedEyeSlider extends JPanel {
    private JPanel sliderPanel; //Slider panel
    private JSlider slider;  //declare slider

    public RedEyeSlider(){
        //Create Slider
        slider = new JSlider(JSlider.HORIZONTAL, 0, 5, 0);
        slider.setMajorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setSnapToTicks(true);
        slider.addChangeListener(new SliderListener());

        //Create and add slider to panel
        sliderPanel = new JPanel();
        sliderPanel.add(slider);

        add("North", slider);

    }
    /**
     * Private inner class that handles the event when the slider is moved
     */
    private class SliderListener implements ChangeListener {
        public void stateChanged(ChangeEvent e) {

             int shots = slider.getValue();

        }
    }


}
