import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {
    JTextField field = new JTextField(30);
    JButton button = new JButton("Добавить текст");
    JLabel label = new JLabel();

    public Frame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(field);
        add(button);
        add(label);
        button.addActionListener(this);
        pack();
        setSize(1000, 500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = field.getText();

        label.setText(text);
    }
}
