package PA1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class CentralLibrary extends JFrame {
    private static final String CLASS_NAME = "Central Library";
    private static Library centralLib = Main.centralLib;
    private Vector<String> vector;
    private static DefaultTableModel model;
    private JPanel contentPane;
    private static JTable table;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {

                    CentralLibrary frame = new CentralLibrary();
                    frame.setVisible(true);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public CentralLibrary() {
        setTitle(centralLib.getName());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 700, 500);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(51, 102, 255));
        panel.setForeground(new Color(51, 102, 255));
        panel.setBounds(0, 0, 684, 83);
        contentPane.add(panel);
        panel.setLayout(null);

        String text = "Central" + "<br>" + "LIBRARY";
        JLabel lblTitle = new JLabel("<html><div style='text-align: center;'>" + text + "</div></html>");
        lblTitle.setForeground(new Color(255, 255, 255));
        lblTitle.setFont(new Font("맑은 고딕", Font.BOLD, 25));
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitle.setBounds(0, 0, 684, 83);
        panel.add(lblTitle);

        ImageIcon icon = new ImageIcon(Main.class.getResource("/PA1/skkuicon1.png"));

        Image img = icon.getImage();
        Image changeImg = img.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        ImageIcon changeIcon = new ImageIcon(changeImg);

        JLabel lblIcon = new JLabel(changeIcon);
        lblIcon.setOpaque(false);
        lblIcon.setBounds(0, 0, 86, 83);
        panel.add(lblIcon);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(255, 255, 255));
        panel_1.setBounds(0, 80, 684, 381);
        contentPane.add(panel_1);
        panel_1.setLayout(null);

        JLabel lblAvilableBooks = new JLabel("Available Books");
        lblAvilableBooks.setFont(new Font("Georgia", Font.PLAIN, 20));
        lblAvilableBooks.setHorizontalAlignment(SwingConstants.CENTER);
        lblAvilableBooks.setBounds(12, 20, 528, 39);
        panel_1.add(lblAvilableBooks);

        vector = new Vector<String>();
        vector.addElement("ID");
        vector.addElement("Title");
        vector.add("Author");
        vector.add("Year");

        model = new DefaultTableModel(vector, 0) {
            public boolean isCellEditable(int r, int c) {
                return false;
            }
        };

        getBooks();

        table = new JTable(model);
        table.setRowSelectionAllowed(false);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(25);
        columnModel.getColumn(1).setPreferredWidth(300);
        columnModel.getColumn(2).setPreferredWidth(150);
        columnModel.getColumn(3).setPreferredWidth(50);
        table.setRowHeight(20);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(12, 69, 528, 285);
        panel_1.add(scrollPane);
        scrollPane.setViewportView(table);

        JButton btnAddBook = new JButton("Add Book");
        btnAddBook.setFocusPainted(false);
        btnAddBook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (centralLib.getCount() >= 10)
                    JOptionPane.showMessageDialog(null, "Maximum number of books reached (10).", "Error",
                            JOptionPane.PLAIN_MESSAGE);
                else {
                    AddBook addbook = new AddBook(CLASS_NAME);
                    addbook.setVisible(true);
                }
            }
        });
        btnAddBook.setBounds(552, 20, 120, 78);
        panel_1.add(btnAddBook);

        JButton btnDelete = new JButton("Delete Book");
        final JFrame delete = new JFrame();
        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                int ID = Integer.parseInt(JOptionPane.showInputDialog(delete,
                        "Enter the ID of the book to delete", null));
                if (centralLib.getIndex(ID) == -1) {
                    JOptionPane.showMessageDialog(null, "No book with index " + ID, "Error", JOptionPane.PLAIN_MESSAGE);
                } else {
                    centralLib.delBook(ID);
                    getBooks();
                }
            }
        });
        btnDelete.setFocusPainted(false);
        btnDelete.setBounds(552, 108, 120, 78);
        panel_1.add(btnDelete);

        JButton btnBorrow = new JButton("Borrow Book");
        btnBorrow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                int ID = Integer.parseInt(JOptionPane.showInputDialog(delete,
                        "Enter the ID of the book to borrow", null));
                if (centralLib.getIndex(ID) == -1) {
                    JOptionPane.showMessageDialog(null, "No book with index " + ID, "Error", JOptionPane.PLAIN_MESSAGE);
                } else {
                    if (centralLib.getBook(centralLib.getIndex(ID)).getAvail() == false) {
                        JOptionPane.showMessageDialog(null, "Book is already borrowed", "Error",
                                JOptionPane.PLAIN_MESSAGE);
                    } else {
                        centralLib.getBook(centralLib.getIndex(ID)).Borrow();
                        getBooks();
                    }
                }

            }
        });
        btnBorrow.setFocusPainted(false);
        btnBorrow.setBounds(552, 196, 120, 78);
        panel_1.add(btnBorrow);

        JButton btnReturn = new JButton("Return Book");
        btnReturn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                int ID = Integer.parseInt(JOptionPane.showInputDialog(delete,
                        "Enter the ID of the book to return", null));
                if (centralLib.getIndex(ID) == -1) {
                    JOptionPane.showMessageDialog(null, "No book with index " + ID, "Error", JOptionPane.PLAIN_MESSAGE);
                } else {
                    if (centralLib.getBook(centralLib.getIndex(ID)).getAvail() == true) {
                        JOptionPane.showMessageDialog(null, "Book is not borrowed", "Error", JOptionPane.PLAIN_MESSAGE);
                    } else {
                        centralLib.getBook(centralLib.getIndex(ID)).Return();
                        getBooks();
                    }
                }
            }
        });
        btnReturn.setFocusPainted(false);
        btnReturn.setBounds(552, 284, 120, 78);
        panel_1.add(btnReturn);

    }

    public static void getBooks() {
        model.setRowCount(0);
        for (int i = 0; i < centralLib.getCount(); i++) {
            if (centralLib.getBook(i).getAvail()) {
                Vector<String> v = new Vector<String>();
                v.add(Integer.toString(centralLib.getBook(i).getID()));
                v.add(centralLib.getBook(i).getTitle());
                v.add(centralLib.getBook(i).getAuthor());
                v.add(Integer.toString(centralLib.getBook(i).getYear()));
                model.addRow(v);
            }
        }
    }

}
