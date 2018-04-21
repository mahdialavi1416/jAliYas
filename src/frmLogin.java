import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Sat Apr 21 17:25:18 IRDT 2018
 */



/**
 * @author Brainrain
 */
public class frmLogin extends JPanel {
    public frmLogin() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        textField1 = new JTextField();
        label3 = new JLabel();
        textField2 = new JTextField();
        label2 = new JLabel();
        textField3 = new JTextField();
        label1 = new JLabel();
        textField4 = new JTextField();
        label4 = new JLabel();
        checkBox1 = new JCheckBox();
        button1 = new JButton();

        //======== this ========
        setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));
        add(textField1, "cell 5 3 6 1,width 150:150:150");

        //---- label3 ----
        label3.setText("\u0645\u06cc\u0632\u0628\u0627\u0646 :");
        add(label3, "cell 11 3 3 1,alignx right,growx 0");
        add(textField2, "cell 5 4 6 1");

        //---- label2 ----
        label2.setText("\u0631\u0645\u0632 \u0639\u0628\u0648\u0631:");
        add(label2, "cell 11 4 3 1,alignx right,growx 0");
        add(textField3, "cell 5 5 6 1");

        //---- label1 ----
        label1.setText("\u0646\u0627\u0645 \u06a9\u0627\u0631\u0628\u0631\u06cc:");
        add(label1, "cell 11 5 3 1,alignx right,growx 0");
        add(textField4, "cell 5 6 6 1");

        //---- label4 ----
        label4.setText("\u062f\u0631\u06af\u0627\u0647 :");
        add(label4, "cell 11 6 3 1,align right center,grow 0 0");

        //---- checkBox1 ----
        checkBox1.setText("SSL");
        add(checkBox1, "cell 6 8 5 1,alignx right,growx 0");

        //---- button1 ----
        button1.setText("\u0627\u062a\u0635\u0627\u0644");
        add(button1, "cell 5 12 6 1");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JTextField textField1;
    private JLabel label3;
    private JTextField textField2;
    private JLabel label2;
    private JTextField textField3;
    private JLabel label1;
    private JTextField textField4;
    private JLabel label4;
    private JCheckBox checkBox1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
