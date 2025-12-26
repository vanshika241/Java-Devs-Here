import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class CheckBoxRadio {
    public static void main(String[] args) {
         JFrame frame = new JFrame();
        frame.setSize(400 , 400);
        frame.setLayout(null);
        frame.setVisible(true);

        JCheckBox check = new JCheckBox("Java");
        check.setBounds(50 , 50 , 100 , 50);
        frame.add(check);

        JCheckBox check2 = new JCheckBox("C++");
        check2.setBounds(50 , 110 , 100 , 50);
        frame.add(check2);

        //RadioButtons

        JRadioButton btn1 = new JRadioButton("Dhurandhar");
        btn1.setBounds(50 , 170 , 100 , 50);
        frame.add(btn1);

        JRadioButton btn2 = new JRadioButton("Single Papa");
        btn2.setBounds(50 , 230 , 100 , 50);
        frame.add(btn2);
 
        String[]  data= {"HTML" , "CSS" , "JavaScript" , "Java"};
        JComboBox box = new JComboBox(data);
        box.setBounds(50 , 300 , 100  , 50);
        frame.add(box);

    }
}
