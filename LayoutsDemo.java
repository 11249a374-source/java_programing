// Experiment 9(a): Handling layouts in Java using FlowLayout and GridLayout
import java.awt.*;
import java.awt.event.*;

public class LayoutsDemo extends Frame {
    LayoutsDemo() {
        setTitle("Java Layout Managers");
        setSize(350, 220);
        setLayout(new BorderLayout(5, 5));

        Label heading = new Label("BorderLayout - North", Label.CENTER);
        add(heading, BorderLayout.NORTH);

        Panel centerPanel = new Panel(new GridLayout(2, 2, 5, 5));
        centerPanel.add(new Button("One"));
        centerPanel.add(new Button("Two"));
        centerPanel.add(new Button("Three"));
        centerPanel.add(new Button("Four"));
        add(centerPanel, BorderLayout.CENTER);

        add(new Label("GridLayout buttons in center", Label.CENTER), BorderLayout.SOUTH);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new LayoutsDemo();
    }
}
