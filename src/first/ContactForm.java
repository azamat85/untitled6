package first;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactForm extends JFrame {
    JLabel name;
    JTextField nameField;
    JLabel email;
    JTextField emailField;
    JRadioButton male;
    JRadioButton female;
    JCheckBox checkBox;
    public ContactForm() {
        super("Добрый день");
        super.setBounds(200, 200, 300,250 );
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Container container = super.getContentPane();
        container.setLayout(new GridLayout(5,2,2,10));


        name = new JLabel("Имя");
        nameField = new JTextField("",1);
        email = new JLabel("Email");
        emailField = new JTextField("",1);

        container.add(name);
        container.add(nameField);
        container.add(email);
        container.add(emailField);

         male = new JRadioButton("Мужской");
         female = new JRadioButton("Женский");
        checkBox = new JCheckBox("Согласен",false);
        JButton sendButton = new JButton("OK");

        male.setSelected(true);
        container.add(male);
        container.add(female);

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        container.add(checkBox);
        container.add(sendButton);

        sendButton.addActionListener(new ButtonEvent());
    }
    class ButtonEvent implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String name = nameField.getText();
            String email = emailField.getText();

            String isMale = "Мужской";
            if (!male.isSelected())
            isMale="Женский";

            boolean check = checkBox.isSelected();

            JOptionPane.showMessageDialog(null,"Ваша почта: "+email+" \nВаш пол: "+isMale+" \nВы согласны: "+check,
                    "Привет"+ name,JOptionPane.PLAIN_MESSAGE);
        }
    }
}
