package Lab7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercise2 {

	private JFrame frmScoreBoard;
	private JTextField txtRedScore;
	private JTextField txtBlueScore;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercise2 window = new Exercise2();
					window.frmScoreBoard.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Exercise2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmScoreBoard = new JFrame();
		frmScoreBoard.setTitle("Score Board");
		frmScoreBoard.setBounds(100, 100, 450, 300);
		frmScoreBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmScoreBoard.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frmScoreBoard.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblRedTeam = new JLabel("Red Team");
		lblRedTeam.setForeground(Color.RED);
		lblRedTeam.setFont(new Font("±¼¸²", Font.BOLD, 15));
		lblRedTeam.setHorizontalAlignment(SwingConstants.CENTER);
		lblRedTeam.setBounds(67, 27, 80, 36);
		panel.add(lblRedTeam);
		
		JLabel lblBlueTeam = new JLabel("Blue Team");
		lblBlueTeam.setForeground(Color.BLUE);
		lblBlueTeam.setFont(new Font("±¼¸²", Font.BOLD, 15));
		lblBlueTeam.setHorizontalAlignment(SwingConstants.CENTER);
		lblBlueTeam.setBounds(286, 27, 80, 36);
		panel.add(lblBlueTeam);
		
		txtRedScore = new JTextField();
		txtRedScore.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtRedScore.setHorizontalAlignment(SwingConstants.CENTER);
		txtRedScore.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		txtRedScore.setText("0");
		txtRedScore.setEditable(false);
		txtRedScore.setBounds(67, 73, 80, 50);
		panel.add(txtRedScore);
		txtRedScore.setColumns(10);
		
		txtBlueScore = new JTextField();
		txtBlueScore.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtBlueScore.setText("0");
		txtBlueScore.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		txtBlueScore.setHorizontalAlignment(SwingConstants.CENTER);
		txtBlueScore.setEditable(false);
		txtBlueScore.setColumns(10);
		txtBlueScore.setBounds(286, 73, 80, 50);
		panel.add(txtBlueScore);
		
		JButton btnRedScore = new JButton("Red Score!");
		btnRedScore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int RedScore = Integer.parseInt(txtRedScore.getText());
				txtRedScore.setText(Integer.toString(RedScore+1));
			}
		});
		btnRedScore.setBounds(36, 159, 147, 36);
		panel.add(btnRedScore);
		
		JButton btnBlueScore = new JButton("Blue Score!");
		btnBlueScore.setBounds(254, 159, 147, 36);
		btnBlueScore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int BlueScore = Integer.parseInt(txtBlueScore.getText());
				txtBlueScore.setText(Integer.toString(BlueScore+1));
			}
		});
		panel.add(btnBlueScore);
		
		JButton btnReset = new JButton("Reset Score");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtRedScore.setText("0");
				txtBlueScore.setText("0");
			}
		});
		btnReset.setBounds(36, 211, 365, 40);
		panel.add(btnReset);
	}
}
