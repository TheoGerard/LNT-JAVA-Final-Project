import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Random;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import config.connect;
public class view extends JFrame{
	
	JPanel insertButtonPanel,insertTitlePanel,insertPanel,namePanel,panel2,priceLabelPanel,priceTextFieldPanel,nameMainPanel, priceMainPanel, stockLabelPanel, stockTextFieldPanel;
	JLabel nameLabel,priceLabel,stockLabel,insertTitleLabel;
	JTextField nameTextField,priceTextField,stockTextField;
	JButton insertButton;
	JTextField codeTextField = new JTextField();
	public connect con;
	
	public view() {
		con = new connect();
		con.getAllData();
		try {
			for(int i=0; i<30;i++) {
				System.out.println(" ");
			}
			while(con) {
				System.out.println(con.getString(1)+" "+con.getString(2)+" "+con.getInt(3)+" "+con.getInt(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		new home();
		
		
	}
	
}
