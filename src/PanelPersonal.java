import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JProgressBar;
import javax.swing.JTree;
import javax.swing.JToggleButton;
import javax.swing.JTable;

public class PanelPersonal extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public PanelPersonal() {
		setBackground(new Color(213, 0, 0));
		setBounds(0, 0, 471, 396);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 11, 451, 374);
		add(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 11, 431, 318);
		panel.add(table);
		
		JButton btnNewButton = new JButton("Show Records");
		btnNewButton.setBounds(10, 340, 129, 23);
		panel.add(btnNewButton);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setBounds(163, 340, 129, 23);
		panel.add(btnPrint);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(312, 340, 129, 23);
		panel.add(btnDelete);

	}
}
