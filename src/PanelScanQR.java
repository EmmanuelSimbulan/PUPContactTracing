import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JProgressBar;
import javax.swing.JTree;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;

public class PanelScanQR extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelScanQR() {
		setBackground(new Color(213, 0, 0));
		setBounds(0, 0, 471, 396);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 11, 451, 374);
		add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("SCAN");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Lasto\\eclipse-workspace\\PUPContactTracing\\img\\icons8-scan-30.png"));
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 20));
		btnNewButton.setBounds(124, 286, 199, 57);
		panel.add(btnNewButton);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(124, 265, 199, 14);
		panel.add(progressBar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Select Date", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 11, 332, 57);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBoxMonth = new JComboBox();
		comboBoxMonth.setBounds(10, 21, 137, 22);
		panel_1.add(comboBoxMonth);
		comboBoxMonth.setModel(new DefaultComboBoxModel(new String[] {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"}));
		
		JComboBox comboBoxDay = new JComboBox();
		comboBoxDay.setBounds(157, 21, 56, 22);
		panel_1.add(comboBoxDay);
		comboBoxDay.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "13", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		
		JComboBox comboBoxYear = new JComboBox();
		comboBoxYear.setBounds(223, 21, 85, 22);
		panel_1.add(comboBoxYear);
		comboBoxYear.setModel(new DefaultComboBoxModel(new String[] {"2022", "2023", "2024", "2025", "2026", "2027", "2028"}));

	}
}