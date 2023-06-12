import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class TaskManagerView implements ActionListener {
    private JFrame frame;
    private JTextArea taskTextArea;
    private JTextField taskNameField;
    private JTextField paymentField;
    private JButton addButton;
    private JButton completeButton;
    private JLabel statusLabel;

    private ControllerInterface controller;

    public TaskManagerView(ControllerInterface controller) {
        this.controller = controller;
    }

    public void createView() {
        frame = new JFrame("Task Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        taskTextArea = new JTextArea(10, 20);
        taskTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(taskTextArea);
        panel.add(scrollPane, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());

        taskNameField = new JTextField(10);
        inputPanel.add(taskNameField);

        paymentField = new JTextField(10);
        inputPanel.add(paymentField);

        addButton = new JButton("Add Task");
        addButton.addActionListener(this);
        inputPanel.add(addButton);

        completeButton = new JButton("Complete Task");
        completeButton.addActionListener(this);
        inputPanel.add(completeButton);

        statusLabel = new JLabel();
        inputPanel.add(statusLabel);

        panel.add(inputPanel, BorderLayout.SOUTH);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public void updateTasks(List<String> tasks) {
        StringBuilder sb = new StringBuilder();
        for (String task : tasks) {
            sb.append(task).append("\n");
        }
        taskTextArea.setText(sb.toString());
    }

    public void updateStatus(String status) {
        statusLabel.setText(status);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == addButton) {
            String taskName = taskNameField.getText();
            String paymentAmountText = paymentField.getText();
            if (!taskName.isEmpty() && !paymentAmountText.isEmpty()) {
                double paymentAmount = Double.parseDouble(paymentAmountText);
                controller.addTask(taskName, paymentAmount);
                taskNameField.setText("");
                paymentField.setText("");
            }
        } else if (event.getSource() == completeButton) {
            String taskName = taskNameField.getText();
            if (!taskName.isEmpty()) {
                controller.completeTask(taskName);
                taskNameField.setText("");
            }
        }
    }
}
