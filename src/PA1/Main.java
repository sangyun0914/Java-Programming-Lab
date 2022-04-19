package PA1;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.Color;

import javax.swing.ImageIcon;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {
    public static Library centralLib = new Library("Central Library");
    static int centralBookID = 1;
    public static Library samsungLib = new Library("Samsung Library");
    static int samsungBookID = 1;
    public static Library newLib;
    static int newBookID = 1;
    boolean CreatedLib = false;

    private JFrame frmSkkuDigitalLibrary;
    private JButton btnCentral;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Main window = new Main();
                    window.frmSkkuDigitalLibrary.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Main() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmSkkuDigitalLibrary = new JFrame();
        frmSkkuDigitalLibrary.setTitle("SKKU Digital Library");
        frmSkkuDigitalLibrary.setBounds(100, 100, 750, 500);
        frmSkkuDigitalLibrary.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmSkkuDigitalLibrary.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(51, 102, 255));
        panel.setForeground(new Color(51, 102, 255));
        panel.setBounds(0, 0, 734, 105);
        frmSkkuDigitalLibrary.getContentPane().add(panel);
        panel.setLayout(null);

        String text = "성균관대학교" + "<br>" + "LIBRARY";
        JLabel lblTitle = new JLabel("<html><div style='text-align: center;'>" + text + "</div></html>");
        lblTitle.setForeground(new Color(255, 255, 255));
        lblTitle.setFont(new Font("맑은 고딕", Font.BOLD, 25));
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitle.setBounds(0, 0, 734, 105);
        panel.add(lblTitle);

        ImageIcon icon = new ImageIcon(Main.class.getResource("/PA1/skkuicon1.png"));

        Image img = icon.getImage();
        Image changeImg = img.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        ImageIcon changeIcon = new ImageIcon(changeImg);

        JLabel lblIcon = new JLabel(changeIcon);
        lblIcon.setOpaque(false);
        lblIcon.setBounds(202, 0, 100, 105);
        panel.add(lblIcon);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(255, 255, 255));
        panel_1.setBounds(0, 104, 734, 357);
        frmSkkuDigitalLibrary.getContentPane().add(panel_1);
        panel_1.setLayout(null);

        text = "Central" + "<br>" + "Library";
        btnCentral = new JButton("<html><div style='text-align: center;'>" + text + "</div></html>");
        btnCentral.setFocusPainted(false);
        btnCentral.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                CentralLibrary l1 = new CentralLibrary();
                l1.setVisible(true);

            }
        });
        btnCentral.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
        btnCentral.setBounds(57, 103, 160, 160);
        panel_1.add(btnCentral);

        text = "Samsung" + "<br>" + "Library";
        JButton btnSamsung = new JButton("<html><div style='text-align: center;'>" + text + "</div></html>");
        btnSamsung.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                SamsungLibrary l2 = new SamsungLibrary();
                l2.setVisible(true);
            }
        });
        btnSamsung.setFocusPainted(false);
        btnSamsung.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
        btnSamsung.setBounds(284, 103, 160, 160);
        panel_1.add(btnSamsung);

        text = "Add" + "<br>" + "Library";
        final JButton btnNew = new JButton("<html><div style='text-align: center;'>" + text + "</div></html>");
        final JFrame frame = new JFrame();
        btnNew.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (!CreatedLib) {
                    String name = JOptionPane.showInputDialog(frame,
                            "Enter the name of new library", null);
                    btnNew.setText(name);
                    CreatedLib = true;
                    newLib = new Library(name);
                } else {
                    NewLibrary l3 = new NewLibrary();
                    l3.setVisible(true);
                }

            }

        });
        btnNew.setFocusPainted(false);
        btnNew.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
        btnNew.setBounds(514, 103, 160, 160);
        panel_1.add(btnNew);

        addDefaultBooks();
    }

    private void addDefaultBooks() {
        Book book1 = new Book("It's Not Easy Being a Bunny", "Marilyn Sadler", 1983);
        Book book2 = new Book("Cat Kid Comic Club: On Purpose", "Dav Pilkey", 2022);
        Book book3 = new Book("Atomic Habits", "James Clear", 2018);
        Book book4 = new Book("Don't Push the Button! An Easter Surprise", "Bill Cotter", 2019);
        Book book5 = new Book("It Ends with Us", "Colleen Hoover", 2016);
        Book book6 = new Book("Where the Crawdads Sing", "Delia Owens", 2021);
        Book book7 = new Book("Little Blue Truck's Springtime", "Alice Schertle", 2018);
        Book book8 = new Book("Verity", "Colleen Hoover", 2021);
        Book book9 = new Book("Half Baked Harvest Every Day", "Tieghan Gerard", 2022);
        Book book10 = new Book("The Flames of Hope", "Tui T. Sutherland ", 2022);

        centralLib.addBook(book1, centralBookID++);
        centralLib.addBook(book2, centralBookID++);
        centralLib.addBook(book3, centralBookID++);
        centralLib.addBook(book4, centralBookID++);
        centralLib.addBook(book5, centralBookID++);
        samsungLib.addBook(book6, samsungBookID++);
        samsungLib.addBook(book7, samsungBookID++);
        samsungLib.addBook(book8, samsungBookID++);
        samsungLib.addBook(book9, samsungBookID++);
        samsungLib.addBook(book10, samsungBookID++);
    }
}
