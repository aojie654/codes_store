package Advanced.Lessons.Week7.L721ClassTable.src.ClassTable;

import javax.swing.*;

public class ClassTable {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JTable table = new JTable(new ClassTableData());
        JScrollPane pane = new JScrollPane(table);
        frame.add(pane);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
