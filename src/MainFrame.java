import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
public class MainFrame extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton OKButton;
    private JButton saveToCollectionButton;
    private JPanel Device;

    public MainFrame() {
        super("Device");
        setContentPane(Device);
        Container container = this.getContentPane();
        this.setBounds(400,400,250,250);
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