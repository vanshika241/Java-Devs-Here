import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MsgBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400 , 400);
        frame.setLayout(null);
        frame.setVisible(true);
        JOptionPane.showMessageDialog(frame, "Invalid Input");
        
    }
}
