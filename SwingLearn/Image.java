import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Image {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hii");
        frame.setSize(400 , 400);
        frame.setLayout(null);
        frame.setVisible(true);

        ImageIcon img = new ImageIcon("C:\\Users\\Shivam\\Downloads\\stay-positive-work-hard-quotes-9jajh1ihaewabsc1.jpg");
        frame.setIconImage(img.getImage());
    }
}
