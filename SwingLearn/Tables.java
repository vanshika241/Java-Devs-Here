import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Tables {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400 , 400);
        frame.setLayout(null);
        frame.setVisible(true);

        String columns[] = {"S.NO" , "MovieName" , "Watched"};
        String data[][] = {
            {"1" , "Welcome" , "YES"},
            {"2" , "Titanic" , "NO"},
            {"3" , "Dhurandhar" , "YES"},
            {"4" , "Hulchul" , "Yes"}
        };
        JTable table = new JTable(data , columns);
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(50 , 100 , 300 , 90);
        frame.add(sp);

        

    }
}
