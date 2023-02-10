import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LogIn extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		
		Connection conn = null;
		try {
			conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/contacttracing","root","ryan");
				if (conn!=null) {
					System.out.println("connected successfully");
				}
		}catch (Exception e) {
			System.out.println("not connected");
		}
		
		UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn frame = new LogIn();
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
	public LogIn() {
		setResizable(false);
		setTitle("Login Page");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lasto\\eclipse-workspace\\PUPContactTracing\\img\\PUPLogo_3_20x20.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 348);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(213, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(10, 11, 448, 287);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(10, 11, 428, 265);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(81, 45, 306, 34);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Lasto\\eclipse-workspace\\PUPContactTracing\\img\\icons8-admin-settings-male-24.png"));
		lblNewLabel.setBounds(52, 45, 24, 34);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Lasto\\eclipse-workspace\\PUPContactTracing\\img\\icons8-lock-24.png"));
		lblNewLabel_1.setBounds(52, 108, 24, 34);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
				Admin adminWindow = new Admin();
				adminWindow.setVisible(true);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Lasto\\eclipse-workspace\\PUPContactTracing\\img\\icons8-password-key-24.png"));
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(123, 175, 201, 34);
		panel_1.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(81, 105, 306, 37);
		panel_1.add(passwordField);
	}
}
