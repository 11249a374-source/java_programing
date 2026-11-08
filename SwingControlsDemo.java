// Experiment 9(b): Handling Swing controls
import javax.swing.*;
import java.awt.*;

public class SwingControlsDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Swing Controls");
            frame.setSize(400, 250);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new FlowLayout());

            JLabel nameLabel = new JLabel("Enter your name:");
            JTextField nameField = new JTextField(15);
            JCheckBox javaCheck = new JCheckBox("I like Java");
            String[] years = {"First Year", "Second Year", "Third Year", "Fourth Year"};
            JComboBox<String> yearBox = new JComboBox<>(years);
            JButton submit = new JButton("Submit");
            JLabel result = new JLabel(" ");

            submit.addActionListener(e -> {
                String name = nameField.getText().trim();
                if (name.isEmpty()) {
                    result.setText("Please enter your name.");
                } else {
                    result.setText("Hello " + name + " | Java: "
                            + (javaCheck.isSelected() ? "Yes" : "No")
                            + " | " + yearBox.getSelectedItem());
                }
            });

            frame.add(nameLabel);
            frame.add(nameField);
            frame.add(javaCheck);
            frame.add(yearBox);
            frame.add(submit);
            frame.add(result);

            frame.setVisible(true);
        });
    }
}
