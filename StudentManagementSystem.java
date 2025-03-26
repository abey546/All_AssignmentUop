import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {
    private JFrame frame;
    private DefaultTableModel studentTableModel;
    private JTable studentTable;
    private List<Student> students;

    public StudentManagementSystem() {
        students = new ArrayList<>();
        frame = new JFrame("Student Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        studentTableModel = new DefaultTableModel(new String[]{"ID", "Name", "Course", "Grade"}, 0);
        studentTable = new JTable(studentTableModel);
        panel.add(new JScrollPane(studentTable), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        JButton addButton = new JButton("Add Student");
        JButton updateButton = new JButton("Update Student");
        JButton enrollButton = new JButton("Enroll Course");
        JButton assignGradeButton = new JButton("Assign Grade");
        
        addButton.addActionListener(e -> addStudent());
        updateButton.addActionListener(e -> updateStudent());
        enrollButton.addActionListener(e -> enrollCourse());
        assignGradeButton.addActionListener(e -> assignGrade());
        
        buttonPanel.add(addButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(enrollButton);
        buttonPanel.add(assignGradeButton);
        
        panel.add(buttonPanel, BorderLayout.SOUTH);
        frame.add(panel);
        frame.setVisible(true);
    }

    private void addStudent() {
        JTextField idField = new JTextField();
        JTextField nameField = new JTextField();
        Object[] fields = {"ID:", idField, "Name:", nameField};
        int option = JOptionPane.showConfirmDialog(frame, fields, "Add Student", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            students.add(new Student(idField.getText(), nameField.getText()));
            studentTableModel.addRow(new Object[]{idField.getText(), nameField.getText(), "", ""});
        }
    }

    private void updateStudent() {
        int selectedRow = studentTable.getSelectedRow();
        if (selectedRow >= 0) {
            String newName = JOptionPane.showInputDialog(frame, "Enter new name:", studentTable.getValueAt(selectedRow, 1));
            if (newName != null) {
                studentTable.setValueAt(newName, selectedRow, 1);
                students.get(selectedRow).setName(newName);
            }
        } else {
            JOptionPane.showMessageDialog(frame, "Please select a student to update.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void enrollCourse() {
        int selectedRow = studentTable.getSelectedRow();
        if (selectedRow >= 0) {
            String course = JOptionPane.showInputDialog(frame, "Enter course name:");
            if (course != null) {
                studentTable.setValueAt(course, selectedRow, 2);
                students.get(selectedRow).setCourse(course);
            }
        } else {
            JOptionPane.showMessageDialog(frame, "Please select a student to enroll.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void assignGrade() {
        int selectedRow = studentTable.getSelectedRow();
        if (selectedRow >= 0) {
            String grade = JOptionPane.showInputDialog(frame, "Enter grade:");
            if (grade != null) {
                studentTable.setValueAt(grade, selectedRow, 3);
                students.get(selectedRow).setGrade(grade);
            }
        } else {
            JOptionPane.showMessageDialog(frame, "Please select a student to assign a grade.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(StudentManagementSystem::new);
    }
}

class Student {
    private String id, name, course, grade;
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public void setName(String name) { this.name = name; }
    public void setCourse(String course) { this.course = course; }
    public void setGrade(String grade) { this.grade = grade; }
}
