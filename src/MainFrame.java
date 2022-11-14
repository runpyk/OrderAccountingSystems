import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class MainFrame extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton OKButton;
    private JPanel Device;
    private JButton наступнаЗаявкаButton;

    public MainFrame() {
        super("Заявки");
        setContentPane(Device);
        Container container = this.getContentPane();
        this.setBounds(900,900,550,550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Name = textField1.getText();
                String Model = textField2.getText();
                String requestNumber = textField3.getText();


                //adding elements on form
                container.add(textField1);
                container.add(textField2);
                container.add(textField3);

                //events

            }
        });
    }
}