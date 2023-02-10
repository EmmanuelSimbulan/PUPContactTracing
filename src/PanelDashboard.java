import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JProgressBar;
import javax.swing.JTree;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import javax.swing.ImageIcon;

public class PanelDashboard extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelDashboard() {
		setBackground(new Color(213, 0, 0));
		setBounds(0, 0, 471, 396);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 11, 451, 374);
		add(panel);
		panel.setLayout(null);
		
		JPanel ConfirmedCases = new JPanel();
		ConfirmedCases.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), null));
		ConfirmedCases.setBackground(new Color(254, 191, 1));
		ConfirmedCases.setBounds(20, 34, 165, 53);
		panel.add(ConfirmedCases);
		ConfirmedCases.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Confirmed Cases");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 11, 101, 31);
		ConfirmedCases.add(lblNewLabel);
		
		JLabel resultCases = new JLabel("2");
		resultCases.setHorizontalAlignment(SwingConstants.CENTER);
		resultCases.setFont(new Font("Tahoma", Font.BOLD, 11));
		resultCases.setBounds(121, 11, 34, 31);
		ConfirmedCases.add(resultCases);
		
		JPanel Suspects = new JPanel();
		Suspects.setBorder(UIManager.getBorder("Button.border"));
		Suspects.setBackground(new Color(132, 0, 0));
		Suspects.setBounds(243, 34, 165, 53);
		panel.add(Suspects);
		Suspects.setLayout(null);
		
		JLabel lblSuspects = new JLabel("Suspects");
		lblSuspects.setForeground(SystemColor.inactiveCaptionBorder);
		lblSuspects.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSuspects.setBounds(10, 11, 101, 31);
		Suspects.add(lblSuspects);
		
		JLabel resultSuspects = new JLabel("2");
		resultSuspects.setForeground(SystemColor.inactiveCaptionBorder);
		resultSuspects.setHorizontalAlignment(SwingConstants.CENTER);
		resultSuspects.setFont(new Font("Tahoma", Font.BOLD, 11));
		resultSuspects.setBounds(121, 11, 34, 31);
		Suspects.add(resultSuspects);
		
		JPanel Recovered = new JPanel();
		Recovered.setBorder(UIManager.getBorder("Button.border"));
		Recovered.setBackground(new Color(132, 0, 0));
		Recovered.setBounds(20, 137, 165, 53);
		panel.add(Recovered);
		Recovered.setLayout(null);
		
		JLabel lblRecovered = new JLabel("Recovered");
		lblRecovered.setForeground(SystemColor.inactiveCaptionBorder);
		lblRecovered.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRecovered.setBounds(10, 11, 101, 31);
		Recovered.add(lblRecovered);
		
		JLabel resultRecovered = new JLabel("2");
		resultRecovered.setForeground(SystemColor.inactiveCaptionBorder);
		resultRecovered.setHorizontalAlignment(SwingConstants.CENTER);
		resultRecovered.setFont(new Font("Tahoma", Font.BOLD, 11));
		resultRecovered.setBounds(121, 11, 34, 31);
		Recovered.add(resultRecovered);
		
		JPanel RegisteredStudent = new JPanel();
		RegisteredStudent.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), null));
		RegisteredStudent.setBackground(new Color(254, 191, 1));
		RegisteredStudent.setBounds(243, 137, 165, 53);
		panel.add(RegisteredStudent);
		RegisteredStudent.setLayout(null);
		
		JLabel lblRegisteredStudents = new JLabel("Registered Students");
		lblRegisteredStudents.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblRegisteredStudents.setBounds(10, 11, 101, 31);
		RegisteredStudent.add(lblRegisteredStudents);
		
		JLabel resultRegStud = new JLabel("2");
		resultRegStud.setHorizontalAlignment(SwingConstants.CENTER);
		resultRegStud.setFont(new Font("Tahoma", Font.BOLD, 11));
		resultRegStud.setBounds(121, 11, 34, 31);
		RegisteredStudent.add(resultRegStud);
		
		JPanel RegisteredFaculty = new JPanel();
		RegisteredFaculty.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), null));
		RegisteredFaculty.setBackground(new Color(254, 191, 1));
		RegisteredFaculty.setBounds(20, 239, 165, 53);
		panel.add(RegisteredFaculty);
		RegisteredFaculty.setLayout(null);
		
		JLabel lblRegisteredFaculty = new JLabel("Registered Faculty");
		lblRegisteredFaculty.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblRegisteredFaculty.setBounds(10, 11, 101, 31);
		RegisteredFaculty.add(lblRegisteredFaculty);
		
		JLabel resultRegFac = new JLabel("2");
		resultRegFac.setHorizontalAlignment(SwingConstants.CENTER);
		resultRegFac.setFont(new Font("Tahoma", Font.BOLD, 11));
		resultRegFac.setBounds(121, 11, 34, 31);
		RegisteredFaculty.add(resultRegFac);
		
		JPanel Attendance = new JPanel();
		Attendance.setBorder(UIManager.getBorder("Button.border"));
		Attendance.setBackground(new Color(132, 0, 0));
		Attendance.setBounds(243, 239, 165, 53);
		panel.add(Attendance);
		Attendance.setLayout(null);
		
		JLabel lblAtte = new JLabel("Attendees");
		lblAtte.setForeground(SystemColor.inactiveCaptionBorder);
		lblAtte.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAtte.setBounds(10, 11, 101, 31);
		Attendance.add(lblAtte);
		
		JLabel resultAttendees = new JLabel("2");
		resultAttendees.setForeground(SystemColor.inactiveCaptionBorder);
		resultAttendees.setHorizontalAlignment(SwingConstants.CENTER);
		resultAttendees.setFont(new Font("Tahoma", Font.BOLD, 11));
		resultAttendees.setBounds(121, 11, 34, 31);
		Attendance.add(resultAttendees);
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.setIcon(new ImageIcon("C:\\Users\\Lasto\\eclipse-workspace\\PUPContactTracing\\img\\icons8-refresh-20.png"));
		btnRefresh.setBounds(302, 340, 106, 23);
		panel.add(btnRefresh);

	}
}
