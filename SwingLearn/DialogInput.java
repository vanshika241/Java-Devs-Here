import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DialogInput {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        System.out.println("My name is "+name);

    }
}
