import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import javax.swing.JCheckBox;
import javax.swing.JEditorPane;
import javax.swing.JTable;

public class PanelCreateQR extends JPanel {
	private JTextField txtSurname;
	private JTextField txtFirstName;
	private JTextField txtMI;
	private JLabel FirstName;
	private JLabel lblMi;
	private JTextField txtAge;
	private JRadioButton nrbFaculty;
	private JLabel lblAge;
	private JTextField txtContact;
	private JTextField txtEmail;
	private JTextField textField;
	private JTable table;
	private JTextField textPUPID;

	/**
	 * Create the panel.
	 */
	public PanelCreateQR() {
		setBackground(new Color(213, 0, 0));
		setBounds(0, 0, 471, 396);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Personal Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 293, 374);
		add(panel);
		panel.setLayout(null);
		
		txtSurname = new JTextField();
		txtSurname.setToolTipText("");
		txtSurname.setBounds(10, 58, 112, 20);
		panel.add(txtSurname);
		txtSurname.setColumns(10);
		
		txtFirstName = new JTextField();
		txtFirstName.setToolTipText("");
		txtFirstName.setColumns(10);
		txtFirstName.setBounds(132, 58, 112, 20);
		panel.add(txtFirstName);
		
		txtMI = new JTextField();
		txtMI.setToolTipText("");
		txtMI.setColumns(10);
		txtMI.setBounds(254, 58, 29, 20);
		panel.add(txtMI);
		
		JLabel Surname = new JLabel("Surname");
		Surname.setFont(new Font("Tahoma", Font.BOLD, 11));
		Surname.setBounds(10, 42, 61, 14);
		panel.add(Surname);
		
		FirstName = new JLabel("First Name");
		FirstName.setFont(new Font("Tahoma", Font.BOLD, 11));
		FirstName.setBounds(132, 42, 61, 14);
		panel.add(FirstName);
		
		lblMi = new JLabel("M.I.");
		lblMi.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMi.setBounds(254, 42, 29, 14);
		panel.add(lblMi);
		
		txtAge = new JTextField();
		txtAge.setBounds(10, 102, 86, 20);
		panel.add(txtAge);
		txtAge.setColumns(10);
		
		JRadioButton nrbStudent = new JRadioButton("Student");
		nrbStudent.setBounds(115, 101, 78, 23);
		panel.add(nrbStudent);
		
		nrbFaculty = new JRadioButton("Faculty");
		nrbFaculty.setBounds(195, 101, 88, 23);
		panel.add(nrbFaculty);
		
		lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAge.setBounds(10, 83, 61, 20);
		panel.add(lblAge);
		
		JComboBox comboCollege = new JComboBox();
		comboCollege.setModel(new DefaultComboBoxModel(new String[] {"College of Computer and Information Sciences (CCIS)", "College of Education (COED)", "College of Communication (COC)", "College of Business Administration (CBA)", "College of Arts and Letters (CAL)", "College of Architecture, Design and the Built Environment (CADBE, formerly the College of Architecture and Fine Arts)", "College of Accountancy and Finance (CAF)", "College of Engineering (CE)", "College of Human Kinetics (CHK)", "College of Law (CL)", "College of Political Science and Public Administration (CPSPA)", "College of Social Sciences and Development (CSSD)", "College of Science (CS)", "College of Tourism, Hospitality and Transportation Management (CTHTM)"}));
		comboCollege.setBounds(10, 151, 273, 20);
		panel.add(comboCollege);
		
		JLabel lblSelectCollege = new JLabel("Select College");
		lblSelectCollege.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSelectCollege.setBounds(10, 133, 112, 20);
		panel.add(lblSelectCollege);
		
		txtContact = new JTextField();
		txtContact.setToolTipText("");
		txtContact.setColumns(10);
		txtContact.setBounds(10, 199, 273, 20);
		panel.add(txtContact);
		
		JLabel lblC = new JLabel("Contact Number");
		lblC.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblC.setBounds(10, 180, 112, 20);
		panel.add(lblC);
		
		JLabel lblEmailAddress = new JLabel("Email Address");
		lblEmailAddress.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEmailAddress.setBounds(10, 230, 112, 20);
		panel.add(lblEmailAddress);
		
		txtEmail = new JTextField();
		txtEmail.setToolTipText("");
		txtEmail.setColumns(10);
		txtEmail.setBounds(10, 249, 273, 20);
		panel.add(txtEmail);
		
		JLabel lblHouseAddress = new JLabel("House Address");
		lblHouseAddress.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblHouseAddress.setBounds(10, 280, 112, 20);
		panel.add(lblHouseAddress);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setColumns(10);
		textField.setBounds(10, 299, 273, 20);
		panel.add(textField);
		
		JButton btnGenerateQR = new JButton("Generate QR");
		btnGenerateQR.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnGenerateQR.setBounds(10, 340, 123, 23);
		panel.add(btnGenerateQR);
		
		JButton btnDownload = new JButton("DOWNLOAD");
		btnDownload.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDownload.setBounds(160, 340, 123, 23);
		panel.add(btnDownload);
		
		textPUPID = new JTextField();
		textPUPID.setToolTipText("");
		textPUPID.setColumns(10);
		textPUPID.setBounds(71, 19, 212, 20);
		panel.add(textPUPID);
		
		JLabel lblPupId = new JLabel("PUP ID");
		lblPupId.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPupId.setBounds(10, 21, 54, 17);
		panel.add(lblPupId);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(313, 237, 148, 148);
		add(panel_1);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 11, 128, 126);
		panel_1.add(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Diseases", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(314, 11, 147, 212);
		add(panel_2);
		panel_2.setLayout(null);
		
		JCheckBox chckbxHepatitasA = new JCheckBox("Hepatitas A");
		chckbxHepatitasA.setBounds(6, 21, 135, 23);
		panel_2.add(chckbxHepatitasA);
		
		JCheckBox chckbxHepatitasB = new JCheckBox("Hepatitas B");
		chckbxHepatitasB.setBounds(6, 47, 135, 23);
		panel_2.add(chckbxHepatitasB);
		
		JCheckBox chckbxHepatitasC = new JCheckBox("Hepatitas C");
		chckbxHepatitasC.setBounds(6, 73, 135, 23);
		panel_2.add(chckbxHepatitasC);
		
		JCheckBox chckbxCancer = new JCheckBox("Cancer");
		chckbxCancer.setBounds(6, 99, 135, 23);
		panel_2.add(chckbxCancer);
		
		JCheckBox chckbxDiabetes = new JCheckBox("Diabetes");
		chckbxDiabetes.setBounds(6, 125, 135, 23);
		panel_2.add(chckbxDiabetes);
		
		JCheckBox chckbxDengue = new JCheckBox("Dengue");
		chckbxDengue.setBounds(6, 151, 135, 23);
		panel_2.add(chckbxDengue);
		
		JCheckBox chckbxOthers = new JCheckBox("Others");
		chckbxOthers.setBounds(6, 177, 135, 23);
		panel_2.add(chckbxOthers);
		setVisible(true);

	}
}