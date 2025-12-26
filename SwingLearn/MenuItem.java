import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuItem {
    public static void main(String[] args) {
        JFrame frame = new JFrame("LearnMenu");
        frame.setSize(400 , 400);
        frame.setLayout(null);
        frame.setVisible(true);

        JMenuBar mb = new JMenuBar();
        JMenu menu , SubMenu;
        JMenuItem i1 , i2 , i3 , i4 , i5;
        menu = new JMenu("Menu");
        SubMenu = new JMenu("SubMenu");
        i1 = new JMenuItem("item1");
        i2 = new JMenuItem("item2");
        i3 = new JMenuItem("item3");
        i4 = new JMenuItem("item4");
        i5 = new JMenuItem("item5");

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        SubMenu.add(i4);
        SubMenu.add(i5);
        mb.add(menu);
        mb.add(SubMenu);
        frame.setJMenuBar(mb);



    }

}
