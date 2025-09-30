import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

public class Main extends JFrame {

    private DefaultListModel<String> taskListModel;
    private JList<String> taskList;
    private JTextField taskInput;

    public Main() {
        setTitle("To-Do App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());


        taskInput = new JTextField();
        panel.add(taskInput, BorderLayout.NORTH);
        taskInput.setSize(200, 30);
        taskInput.setVisible(false);

        JPanel buttonPanel = new JPanel();
        JButton addButton = new JButton("Add Task");
        JButton removeButton = new JButton("Remove Task");
        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);
        panel.add(buttonPanel, BorderLayout.SOUTH);


        taskListModel = new DefaultListModel<>();
        taskList = new JList<>(taskListModel);
        JScrollPane scrollPane = new JScrollPane(taskList);
        panel.add(taskList, BorderLayout.CENTER);
        add(panel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);


//        addButton.addActionListener(new ActionListener() {
////            taskInput.setVisible(true);
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String task = taskInput.getText().trim();
//                if (!task.isEmpty()) {
//                    taskListModel.addElement(task);
//                    taskInput.setText("");
//                }else {
//                    JOptionPane.showMessageDialog(Main.this, "Task name cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
//                }
//            }
//        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String task = JOptionPane.showInputDialog(Main.this, "Enter a new task:");
                LocalDateTime dateTime = LocalDateTime.parse(JOptionPane.showInputDialog(Main.this, "Enter date and time (YYYY-MM-DDTHH:MM):"));
                String taskEntry = String.format("Task: %s | Created: %s | To Do: %s",
                        task,
                        LocalDateTime.now(),
                        dateTime != null ? dateTime : "N/A");
                if (task != null && !task.trim().isEmpty()) {
                    taskListModel.addElement(taskEntry);
                } else if (task != null) {
                    JOptionPane.showMessageDialog(Main.this, "Task name cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = taskList.getSelectedIndex();
                if (selectedIndex != -1) {
                    taskListModel.remove(selectedIndex);
                } else {
                    JOptionPane.showMessageDialog(Main.this, "Please select a task to remove", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main app = new Main();
            app.setVisible(true);
        });
    }
}