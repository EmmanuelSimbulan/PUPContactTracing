import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTabbedPane;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;

public class PanelAbout extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelAbout() {
		setBackground(new Color(213, 0, 0));
		setBounds(0, 0, 471, 396);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), new LineBorder(new Color(0, 0, 0))));
		panel.setBounds(10, 11, 451, 374);
		add(panel);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setToolTipText("");
		tabbedPane.setBounds(10, 11, 431, 352);
		panel.add(tabbedPane);
		
		JPanel Overview = new JPanel();
		tabbedPane.addTab("Overview", null, Overview, null);
		Overview.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("ABOUT");
		lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_4.setBounds(10, 11, 146, 42);
		Overview.add(lblNewLabel_4);
		
		String about = "<html> <p>PUP Contact Tracing System is a unified contact tracing system that aims to help PUPians feel "
				+ "safe and assured against the uncertainty of the pandemic, by providing a reliable and simple contact tracing tool. "
				+ "The app will be used by all students and faculty members to automate Contact Tracing.\r\n"
				+ "</p> </html>";
		JLabel lblNewLabel_5 = new JLabel(about);
		lblNewLabel_5.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(10, 43, 406, 111);
		Overview.add(lblNewLabel_5);
		
		String privacy = "<html> <p>- Data Privacy Act (DPA) RA 10173 Compliant\r\n"
				+ "- Uses QR Code scanning to trace the places and people you have been in contact with\r\n"
				+ "<br> - Allows anonymous registration, personal information (i.e. mobile phone, email address) may be submitted, but it is optional.\r\n"
				+ "<br> - App works with slow data or wifi\r\n"
				+ "<br> - This app is absolutely free to use.\r\n"
				+ "</p> </html>";
		JLabel lblNewLabel_6 = new JLabel(privacy);
		lblNewLabel_6.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(10, 194, 406, 130);
		Overview.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Key Benifits and Features:");
		lblNewLabel_7.setFont(new Font("Dialog", Font.ITALIC, 12));
		lblNewLabel_7.setBounds(10, 165, 193, 18);
		Overview.add(lblNewLabel_7);
		
		JPanel Team = new JPanel();
		tabbedPane.addTab("Our Team", null, Team, null);
		Team.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Emmanuel Simbulan", TitledBorder.CENTER, TitledBorder.BOTTOM, null, null));
		panel_1.setBackground(SystemColor.inactiveCaption);
		panel_1.setBounds(39, 11, 147, 147);
		Team.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Lasto\\eclipse-workspace\\PUPContactTracing\\img\\yman_113x113.jpg"));
		lblNewLabel_3.setBounds(10, 11, 127, 113);
		panel_1.add(lblNewLabel_3);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new TitledBorder(null, "Ryan Dacanay", TitledBorder.CENTER, TitledBorder.BOTTOM, null, null));
		panel_1_1.setBackground(SystemColor.inactiveCaption);
		panel_1_1.setBounds(238, 11, 147, 147);
		Team.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon("C:\\Users\\Lasto\\eclipse-workspace\\PUPContactTracing\\img\\ryan_113x113.jpg"));
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(10, 11, 127, 113);
		panel_1_1.add(lblNewLabel_3_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBorder(new TitledBorder(null, "Andrea Flores", TitledBorder.CENTER, TitledBorder.BOTTOM, null, null));
		panel_1_2.setBackground(SystemColor.inactiveCaption);
		panel_1_2.setBounds(39, 166, 147, 147);
		Team.add(panel_1_2);
		panel_1_2.setLayout(null);
		
		JLabel lblNewLabel_3_2 = new JLabel("");
		lblNewLabel_3_2.setIcon(new ImageIcon("C:\\Users\\Lasto\\eclipse-workspace\\PUPContactTracing\\img\\andrea_113x113.jpg"));
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setBounds(10, 11, 127, 113);
		panel_1_2.add(lblNewLabel_3_2);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBorder(new TitledBorder(null, "Patrick Pangilinan", TitledBorder.CENTER, TitledBorder.BOTTOM, null, null));
		panel_1_3.setBackground(SystemColor.inactiveCaption);
		panel_1_3.setBounds(238, 166, 147, 147);
		Team.add(panel_1_3);
		panel_1_3.setLayout(null);
		
		JLabel lblNewLabel_3_3 = new JLabel("");
		lblNewLabel_3_3.setIcon(new ImageIcon("C:\\Users\\Lasto\\eclipse-workspace\\PUPContactTracing\\img\\patrick_113x113.jpg"));
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setBounds(10, 11, 127, 113);
		panel_1_3.add(lblNewLabel_3_3);
		
		JPanel Algorithm = new JPanel();
		tabbedPane.addTab("Algorithm", null, Algorithm, null);
		Algorithm.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("What is Bruteforce - String Matching?");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 11, 324, 25);
		Algorithm.add(lblNewLabel_2);
		
		String text = "<html> <p>Brute-force string matching compares a pattern to all text substrings. Character-by-character comparisons between "
				+ "substring and pattern are performed. When a mismatch is discovered, the remaining character comparisons are deleted and the next "
				+ "substring may be chosen. This sliding selection window displays blue characters. Magenta characters are compared. Note that brute-force "
				+ "searching changes upon mismatch to minimise wasteful comparisons.</p> </html>";
		JLabel paragraph = new JLabel(text);
		paragraph.setFont(new Font("Dialog", Font.PLAIN, 12));
		paragraph.setBounds(10, 47, 406, 170);
		Algorithm.add(paragraph);
		
		JPanel Version = new JPanel();
		tabbedPane.addTab("Version", null, Version, null);
		Version.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Lasto\\eclipse-workspace\\PUPContactTracing\\img\\PUPLogo_4_140x140.png"));
		lblNewLabel.setBounds(142, 26, 140, 140);
		Version.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PUP Contact Tracing Tool");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(141, 191, 167, 14);
		Version.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Using Bruteforce - String Matching");
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(118, 216, 208, 14);
		Version.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("VERSION 1.0");
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.BOLD, 13));
		lblNewLabel_1_2.setBounds(175, 241, 106, 14);
		Version.add(lblNewLabel_1_2);

	}
}
