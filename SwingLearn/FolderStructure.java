import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class FolderStructure {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Tree");
        frame.setSize(400 , 400);
        frame.setLayout(null);
        frame.setVisible(true);

        DefaultMutableTreeNode style = new DefaultMutableTreeNode("Style");
        DefaultMutableTreeNode color = new DefaultMutableTreeNode("color"); 
        DefaultMutableTreeNode font = new DefaultMutableTreeNode("font");
        style.add(color);
        style.add(font);
        DefaultMutableTreeNode red = new DefaultMutableTreeNode("Red");
        DefaultMutableTreeNode green = new DefaultMutableTreeNode("Green");
        DefaultMutableTreeNode black = new DefaultMutableTreeNode("Black");
        color.add(red);
        color.add(green);
        color.add(black);

        DefaultMutableTreeNode pixel = new DefaultMutableTreeNode("14px");
        font.add(pixel);
        JTree tree = new JTree(style);
        tree.setBounds(50 , 50 , 300 , 200);
        frame.add(tree);


                

    }
}
