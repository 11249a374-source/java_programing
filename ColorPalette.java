// Experiment 8(b): AWT color palette
import java.awt.*;
import java.awt.event.*;

public class ColorPalette extends Frame implements ActionListener {
    private final Label message;
    private final Button red, green, blue, yellow;

    ColorPalette() {
        setTitle("Color Palette");
        setSize(400, 250);
        setLayout(new FlowLayout());

        message = new Label("Choose a color");
        red = new Button("Red");
        green = new Button("Green");
        blue = new Button("Blue");
        yellow = new Button("Yellow");

        add(message);
        add(red);
        add(green);
        add(blue);
        add(yellow);

        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
        yellow.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String color = e.getActionCommand();
        message.setText("Selected: " + color);
        switch (color) {
            case "Red": setBackground(Color.RED); break;
            case "Green": setBackground(Color.GREEN); break;
            case "Blue": setBackground(Color.BLUE); break;
            case "Yellow": setBackground(Color.YELLOW); break;
        }
    }

    public static void main(String[] args) {
        new ColorPalette();
    }
}
