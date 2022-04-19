package Lab7;

import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Exercise extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private final JLabel NewLabel = new JLabel("JDeveloper Productivity Hints");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Exercise dialog = new Exercise();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Exercise() {
		setFont(new Font("Dialog", Font.BOLD, 13));
		setTitle("                                     Tip of the Day");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		contentPanel.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent arg0) {
				System.exit(0);
			}
		});
		contentPanel.setBounds(0, 0, 434, 228);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		NewLabel.setFont(new Font("±¼¸²", Font.BOLD, 12));
		NewLabel.setBounds(25, 0, 385, 50);
		contentPanel.add(NewLabel);
		{
			ImageIcon imageIcon = new ImageIcon(Exercise.class.getResource("/Lab7/image.png"));
			Image image = imageIcon.getImage();
			Image newimg = image.getScaledInstance(25, 25,  java.awt.Image.SCALE_SMOOTH);
			imageIcon = new ImageIcon(newimg);
			JLabel ImageIcon = new JLabel(imageIcon);
			ImageIcon.setBounds(381, 0, 53, 50);
			contentPanel.add(ImageIcon);
		}
		{
			JSeparator separator = new JSeparator();
			separator.setForeground(Color.BLACK);
			separator.setBounds(0, 48, 434, 2);
			contentPanel.add(separator);
		}
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		textPane.setContentType("text/html");
		textPane.setEditable(false);
		textPane.setText("<html><br/><b>Closing windows using the mouse wheel</b><br/><br/>Clicking with the mouse wheel on an editor tab closes the window.\r\nThis method works also with dockable windows or Log window\r\ntabs.\r\n\r\n</html>");
		textPane.setBounds(25, 60, 397, 132);
		contentPanel.add(textPane);
		
		JCheckBox chckbxShowTipsAt = new JCheckBox("Show Tips at startup");
		chckbxShowTipsAt.setBounds(25, 199, 152, 23);
		contentPanel.add(chckbxShowTipsAt);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 228, 434, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton okButton = new JButton("Next Tip");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Close");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						System.exit(0);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
