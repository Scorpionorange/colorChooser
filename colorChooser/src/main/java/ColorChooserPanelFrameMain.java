import javax.swing.*;
import java.awt.*;

/**
 * Created by ScorpionOrange on 2016/09/28.
 */
public class ColorChooserPanelFrameMain {
    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.add(new ColorChooserPanel());
            frame.pack();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Color Chooser Panel Frame Main");
            frame.setVisible(true);
            frame.setSize(400, 300);
        });
    }
}
