import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JProgressBar;
import javax.swing.JTree;
import javax.swing.JToggleButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class PanelTracing extends JPanel {
	private JTextField textSearchSurname;
	private JTextField textSearchLocation;
	private JTextField textSearchFirstname;
	private JTextField textSearchPUPID;
	private JTextField txtLocation;
	private JTextField textLocation2;
	private JTextField txtfail;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;

	
	// Bruteforce - String Matching Condition
	public static int bruteforce(String text,String tobematched){
		int length = text.length();//length of the text
		int plength = tobematched.length();//length of the pattern;

		//loop condition
		for(int i=0;i<length-plength;i++){
			//initialization of j
			int j=0;
			while((j < plength) && (text.charAt(i+j) == tobematched.charAt(j))){
				j++;
			}
			if(j == plength){
				return i;
			}
		}

		return -1;
	}
	/**
	 * Create the panel.
	 */
	public PanelTracing() {
		setBackground(new Color(213, 0, 0));
		setBounds(0, 0, 471, 396);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 11, 451, 374);
		add(panel);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 431, 352);
		panel.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Trace Location", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_3_1.setBounds(10, 173, 406, 1);
		panel_1.add(panel_3_1);
		
		textSearchLocation = new JTextField();
		textSearchLocation.setColumns(10);
		textSearchLocation.setBounds(119, 185, 297, 20);
		panel_1.add(textSearchLocation);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter College:");
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(20, 188, 92, 14);
		panel_1.add(lblNewLabel_1_1);
		
		JButton btnSearchLocation = new JButton("SEARCH");
		btnSearchLocation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String resultLocation;
				resultLocation = textSearchLocation.getText();
				
				Bruteforce obj = new Bruteforce();
				Scanner sc =  new Scanner(System.in);
				//text
				String text = "College of Education (COED)\r\n"
						+ "College of Computer and Information Sciences (CCIS)\r\n"
						+ "College of Communication (COC)\r\n"
						+ "College of Business Administration (CBA)\r\n"
						+ "College of Arts and Letters (CAL)\r\n"
						+ "College of Architecture, Design and the Built Environment (CADBE, formerly the College of Architecture and Fine Arts)\r\n"
						+ "College of Accountancy and Finance (CAF)\r\n"
						+ "College of Engineering (CE)\r\n"
						+ "College of Human Kinetics (CHK)\r\n"
						+ "College of Law (CL)\r\n"
						+ "College of Political Science and Public Administration (CPSPA)\r\n"
						+ "College of Social Sciences and Development (CSSD)\r\n"
						+ "College of Science (CS)\r\n"
						+ "College of Tourism, Hospitality and Transportation Management (CTHTM)\r\n"
						+ "";
				//word that want to be matched in the text
				String tobematched = resultLocation;
				//calling the function
				int position = obj.bruteforce(text,tobematched);
				int endindex = position+1;
				//condition to check whether the pattern is matched are not
				if(position == -1){
					txtfail.setText("Pattern is not matched in the text");
				}else{
					txtLocation.setText("Found at position:" + (position+1));
					textLocation2.setText("Number of Students and Faculty Members in the Department:" + (endindex + tobematched.length()));
				}
				
				
				
				
				
			}
		});
		btnSearchLocation.setIcon(new ImageIcon("C:\\Users\\Lasto\\eclipse-workspace\\PUPContactTracing\\img\\icons8-search-24.png"));
		btnSearchLocation.setFont(new Font("Dialog", Font.BOLD, 14));
		btnSearchLocation.setBounds(140, 250, 135, 28);
		panel_1.add(btnSearchLocation);
		
		txtLocation = new JTextField();
		txtLocation.setBounds(10, 71, 406, 33);
		panel_1.add(txtLocation);
		txtLocation.setColumns(10);
		
		textLocation2 = new JTextField();
		textLocation2.setColumns(10);
		textLocation2.setBounds(10, 115, 406, 33);
		panel_1.add(textLocation2);
		
		txtfail = new JTextField();
		txtfail.setColumns(10);
		txtfail.setBounds(10, 27, 406, 33);
		panel_1.add(txtfail);
		
		JButton del = new JButton("X");
		del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtfail.setText("");
				txtLocation.setText("");
				textLocation2.setText("");
			}
		});
		del.setBounds(377, 0, 39, 23);
		panel_1.add(del);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Trace Contacts", null, panel_2, null);
		panel_2.setLayout(null);
		
		textSearchSurname = new JTextField();
		textSearchSurname.setBounds(119, 185, 297, 20);
		panel_2.add(textSearchSurname);
		textSearchSurname.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_3.setBounds(10, 173, 406, 1);
		panel_2.add(panel_3);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Surname:");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 188, 102, 14);
		panel_2.add(lblNewLabel_1);
		
		JButton btnSearchContact = new JButton("SEARCH");
		btnSearchContact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String resultLocation;
				resultLocation = textSearchSurname.getText();
				
				Bruteforce obj = new Bruteforce();
				Scanner sc =  new Scanner(System.in);
				//text
				String text = "Lyndon Jeff Ebue\r\n"
						+ "Jailinan\r\n"
						+ "Elleunice Lindohren Hans Dayag\r\n"
						+ "Emmanuel Simbulan\r\n"
						+ "Andrea Nicole Flores\r\n"
						+ "Ryan Dacanay\r\n"
						+ "Patrick Pang\r\n"
						+ "Joyce Marie";
				//word that want to be matched in the text
				String tobematched = resultLocation;
				//calling the function
				int position = obj.bruteforce(text,tobematched);
				int endindex = position+1;
				//condition to check whether the pattern is matched are not
				if(position == -1){
					textField.setText("Pattern is not matched in the text");
				}else{
					textField_1.setText("Student Name Found at position:" + (position+1));
					textField_3.setText("End at the position:" + (endindex + tobematched.length()));
				}
				
			}
		});
		btnSearchContact.setIcon(new ImageIcon("C:\\Users\\Lasto\\eclipse-workspace\\PUPContactTracing\\img\\icons8-search-24.png"));
		btnSearchContact.setFont(new Font("Dialog", Font.BOLD, 14));
		btnSearchContact.setBounds(140, 250, 135, 28);
		panel_2.add(btnSearchContact);
		
		textSearchFirstname = new JTextField();
		textSearchFirstname.setColumns(10);
		textSearchFirstname.setBounds(119, 216, 297, 20);
		panel_2.add(textSearchFirstname);
		
		JLabel lblNewLabel_1_2 = new JLabel("Enter Firstname:");
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_2.setBounds(10, 219, 102, 14);
		panel_2.add(lblNewLabel_1_2);
		
		JButton del_1 = new JButton("X");
		del_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("");
				textField_1.setText("");
				textField_3.setText("");
				textSearchSurname.setText("");
				textSearchFirstname.setText("");
				
				
			}
		});
		del_1.setBounds(377, 11, 39, 23);
		panel_2.add(del_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 38, 406, 33);
		panel_2.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 82, 406, 33);
		panel_2.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 126, 406, 33);
		panel_2.add(textField_3);
		
		JPanel panelID = new JPanel();
		panelID.setLayout(null);
		tabbedPane.addTab("Trace ID", null, panelID, null);
		
		textSearchPUPID = new JTextField();
		textSearchPUPID.setColumns(10);
		textSearchPUPID.setBounds(119, 205, 297, 20);
		panelID.add(textSearchPUPID);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_3_2.setBounds(10, 173, 406, 1);
		panelID.add(panel_3_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Enter PUP ID:");
		lblNewLabel_1_3.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1_3.setBounds(10, 208, 102, 14);
		panelID.add(lblNewLabel_1_3);
		
		JButton btnSearchID = new JButton("SEARCH");
		btnSearchID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String resultLocation;
				resultLocation = textSearchPUPID.getText();
				
				Bruteforce obj = new Bruteforce();
				Scanner sc =  new Scanner(System.in);
				//text
				String text = "2020-01837-MN-0"
						+ "2020-27921-MN-0"
						+ "2022-38271-MN-0"
						+ "2021-27972-MN-0"
						+ "2021-23283-MN-0";
				//word that want to be matched in the text
				String tobematched = resultLocation;
				//calling the function
				int position = obj.bruteforce(text,tobematched);
				int endindex = position+1;
				//condition to check whether the pattern is matched are not
				if(position == -1){
					textField_2.setText("Pattern is not matched in the text");
				}else{
					textField_4.setText("ID Found at position:" + (position+1));
					textField_5.setText("End at the position:" + (endindex + tobematched.length()));
				}
				
			}
		});
		btnSearchID.setIcon(new ImageIcon("C:\\Users\\Lasto\\eclipse-workspace\\PUPContactTracing\\img\\icons8-search-24.png"));
		btnSearchID.setFont(new Font("Dialog", Font.BOLD, 14));
		btnSearchID.setBounds(140, 250, 135, 28);
		panelID.add(btnSearchID);
		
		JButton del_1_1 = new JButton("X");
		del_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField_2.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textSearchPUPID.setText("");

			}
		});
		del_1_1.setBounds(377, 14, 39, 23);
		panelID.add(del_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 41, 406, 33);
		panelID.add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(10, 85, 406, 33);
		panelID.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(10, 129, 406, 33);
		panelID.add(textField_5);

	}
}