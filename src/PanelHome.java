import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class PanelHome extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelHome() {
		setBounds(0, 0, 471, 396);
		setLayout(null);
		setVisible(true);
		
		JLabel lblNewLabel_2_1 = new JLabel("Protect your students and employees by embracing our COVID-19 Contact Tracing solution!");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2_1.setBounds(10, 363, 443, 22);
		add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("Welcome to Polytechnic University of the Philippines COVID-19 Contact Tracing System.");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(10, 342, 443, 28);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Lasto\\eclipse-workspace\\PUPContactTracing\\img\\PUP-1_2_53.jpg"));
		lblNewLabel.setBounds(-84, 0, 571, 396);
		add(lblNewLabel);
	}

}
