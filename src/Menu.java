import javax.swing.*;
import java.awt.*;
public class Menu extends JFrame {

    private JButton заявкиButton;
    private JButton робітникиButton;
    private JButton вийтиButton;

    private JPanel Menu;
    private JButton відкритиЧатButton;

    public Menu() {

        super("Меню");
        setContentPane(Menu);
        Container container = this.getContentPane();
        this.setBounds(900, 900, 550, 550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}