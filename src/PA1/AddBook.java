package PA1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class AddBook extends JFrame {

    private JPanel contentPane;
    private JTextField txtTitle;
    private JTextField txtAuthor;
    private JTextField txtYear;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public AddBook(final String caller) {
        setTitle("Add Book");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 350, 380);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 334, 341);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lbTitle = new JLabel("Add New Book");
        lbTitle.setBackground(new Color(51, 102, 255));
        lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lbTitle.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
        lbTitle.setBounds(0, 0, 334, 59);
        panel.add(lbTitle);

        JLabel lblTitle = new JLabel("Book Title:");
        lblTitle.setFont(new Font("굴림", Font.PLAIN, 15));
        lblTitle.setHorizontalAlignment(SwingConstants.TRAILING);
        lblTitle.setBounds(0, 108, 142, 29);
        panel.add(lblTitle);

        txtTitle = new JTextField();
        txtTitle.setBounds(160, 108, 116, 29);
        panel.add(txtTitle);
        txtTitle.setColumns(10);

        JLabel lblAuthor = new JLabel("Book Author:");
        lblAuthor.setFont(new Font("굴림", Font.PLAIN, 15));
        lblAuthor.setHorizontalAlignment(SwingConstants.TRAILING);
        lblAuthor.setBounds(0, 158, 142, 29);
        panel.add(lblAuthor);

        txtAuthor = new JTextField();
        txtAuthor.setColumns(10);
        txtAuthor.setBounds(160, 158, 116, 29);
        panel.add(txtAuthor);

        JLabel lblYear = new JLabel("Year Published:");
        lblYear.setFont(new Font("굴림", Font.PLAIN, 15));
        lblYear.setHorizontalAlignment(SwingConstants.TRAILING);
        lblYear.setBounds(0, 212, 142, 29);
        panel.add(lblYear);

        txtYear = new JTextField();
        txtYear.setColumns(10);
        txtYear.setBounds(160, 212, 116, 29);
        panel.add(txtYear);

        JButton btnAdd = new JButton("Add");
        btnAdd.setFocusPainted(false);
        btnAdd.setFont(new Font("맑은 고딕", Font.BOLD, 17));
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String Title = txtTitle.getText();
                String Author = txtAuthor.getText();
                int Year = Integer.parseInt(txtYear.getText());
                Book newBook = new Book(Title, Author, Year);
                if (caller == "Cen  tral Library") {
                    Main.centralLib.addBook(newBook, Main.centralBookID++);
                    CentralLibrary.getBooks();
                } else if (caller == "Samsung Library") {
                    Main.samsungLib.addBook(newBook, Main.samsungBookID++);
                    SamsungLibrary.getBooks();
                } else if (caller == "New Library") {
                    Main.newLib.addBook(newBook, Main.newBookID++);
                    NewLibrary.getBooks();
                }

                setVisible(false);
                dispose();
            }
        });
        btnAdd.setBounds(109, 277, 103, 42);
        panel.add(btnAdd);
    }

}
