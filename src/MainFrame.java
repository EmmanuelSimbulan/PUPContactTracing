import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	
	private PanelHome panelHome;
	private PanelCreateQR panelCreateQR;
	private PanelScanQR panelScanQR;

	private PanelAbout panelAboutUS;

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
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setResizable(false);
		setTitle("PUP Contact Tracing App");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lasto\\eclipse-workspace\\PUPContactTracing\\img\\PUPLogo_3_20x20.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 648, 479);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(136, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelHome = new PanelHome();

		panelCreateQR = new PanelCreateQR();

		panelScanQR = new PanelScanQR();


		panelAboutUS = new PanelAbout();

		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 255, 255));
		menuBar.setToolTipText("");
		menuBar.setBounds(0, 0, 636, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Edit");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Admin");
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("Help");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("About PUP Contact Tracing");
		mntmNewMenuItem.setIcon(new ImageIcon("C:\\Users\\Lasto\\Downloads\\PUPLogo_3_20x20.png"));
		mnNewMenu_3.add(mntmNewMenuItem);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(206, 0, 0));
		panel.setBounds(0, 22, 140, 424);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Lasto\\eclipse-workspace\\PUPContactTracing\\img\\PUPCountrys_1st_PolytechnicU_120x31.png"));
		lblNewLabel_1.setBounds(10, 35, 120, 31);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Group 3 - DAA \u00A9 2022");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(10, 393, 120, 14);
		panel.add(lblNewLabel_3);
		
		JPanel paneHome = new JPanel();
		paneHome.addMouseListener(new PanelButtonMouseAdapter(paneHome) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelHome);
			}
		});
		paneHome.setBackground(new Color(235, 206, 7));
		paneHome.setBounds(0, 107, 140, 31);
		panel.add(paneHome);
		paneHome.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("   HOME");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Lasto\\eclipse-workspace\\PUPContactTracing\\img\\icons8-home-30.png"));
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 0, 120, 31);
		paneHome.add(lblNewLabel);
		
		JPanel paneCreateQR = new JPanel();
		paneCreateQR.addMouseListener(new PanelButtonMouseAdapter(paneCreateQR){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelCreateQR);
			}
		});
		paneCreateQR.setBackground(new Color(235, 206, 7));
		paneCreateQR.setBounds(0, 137, 140, 31);
		panel.add(paneCreateQR);
		paneCreateQR.setLayout(null);
		
		JLabel lblCreateQr = new JLabel("CREATE QR");
		lblCreateQr.setIcon(new ImageIcon("C:\\Users\\Lasto\\eclipse-workspace\\PUPContactTracing\\img\\icons8-qr-code-30.png"));
		lblCreateQr.setFont(new Font("Dialog", Font.BOLD, 14));
		lblCreateQr.setBounds(10, 0, 130, 31);
		paneCreateQR.add(lblCreateQr);
		
		JPanel paneAdmin = new JPanel();
		paneAdmin.addMouseListener(new PanelButtonMouseAdapter(paneAdmin){
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				
				LogIn log = new LogIn();
				log.setVisible(true);
			}
		});
		paneAdmin.setBackground(new Color(235, 206, 7));
		paneAdmin.setBounds(0, 282, 140, 31);
		panel.add(paneAdmin);
		paneAdmin.setLayout(null);
		
		JLabel lblAdmin = new JLabel("  ADMIN");
		lblAdmin.setIcon(new ImageIcon("C:\\Users\\Lasto\\eclipse-workspace\\PUPContactTracing\\img\\icons8-admin-settings-male-24.png"));
		lblAdmin.setFont(new Font("Dialog", Font.BOLD, 14));
		lblAdmin.setBounds(10, 0, 130, 31);
		paneAdmin.add(lblAdmin);
		
		JPanel paneAboutUS = new JPanel();
		paneAboutUS.addMouseListener(new PanelButtonMouseAdapter(paneAboutUS){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelAboutUS);
			}
		});
		paneAboutUS.setBackground(new Color(235, 206, 7));
		paneAboutUS.setBounds(0, 313, 140, 31);
		panel.add(paneAboutUS);
		paneAboutUS.setLayout(null);
		
		JLabel lblAbout = new JLabel("  ABOUT");
		lblAbout.setIcon(new ImageIcon("C:\\Users\\Lasto\\eclipse-workspace\\PUPContactTracing\\img\\icons8-about-24.png"));
		lblAbout.setFont(new Font("Dialog", Font.BOLD, 14));
		lblAbout.setBounds(10, 0, 130, 31);
		paneAboutUS.add(lblAbout);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(0, 241, 140, 4);
		panel.add(panel_1);
		
		JPanel paneScanQR = new JPanel();
		paneScanQR.addMouseListener(new PanelButtonMouseAdapter(paneScanQR){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelScanQR);
			}
		});
		paneScanQR.setBounds(0, 168, 140, 31);
		panel.add(paneScanQR);
		paneScanQR.setBackground(new Color(235, 206, 7));
		paneScanQR.setLayout(null);
		
		JLabel lblScanQr = new JLabel("  SCAN QR");
		lblScanQr.setIcon(new ImageIcon("C:\\Users\\Lasto\\eclipse-workspace\\PUPContactTracing\\img\\icons8-scan-30.png"));
		lblScanQr.setFont(new Font("Dialog", Font.BOLD, 14));
		lblScanQr.setBounds(10, 0, 130, 31);
		paneScanQR.add(lblScanQr);
		
		JPanel panelMainContent = new JPanel();
		panelMainContent.setBounds(151, 33, 471, 396);
		contentPane.add(panelMainContent);
		panelMainContent.setLayout(null);
		
		panelMainContent.add(panelHome);
		panelMainContent.add(panelCreateQR);
		panelMainContent.add(panelScanQR);

		panelMainContent.add(panelAboutUS);
		
		menuClicked(panelHome);
	}
	
	public void menuClicked(JPanel panel) {
		panelHome.setVisible(false);
		panelCreateQR.setVisible(false);
		panelScanQR.setVisible(false);

		panelAboutUS.setVisible(false);
		
		panel.setVisible(true);
	}
	
	private class PanelButtonMouseAdapter extends MouseAdapter{
		
		JPanel panel;
		public PanelButtonMouseAdapter(JPanel panel) {
			this.panel = panel;
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			panel.setBackground(new Color(0, 255, 102));
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(235, 206, 7));
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			panel.setBackground(new Color(60, 179, 113));
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			panel.setBackground(new Color(235, 206, 7));
		}
		
	}
}
