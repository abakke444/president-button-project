import java.awt.EventQueue;
import javax.swing.JFrame;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class presidentbutton {


	JFrame frmG;
	@SuppressWarnings("unused")
	private JTextField textField;

	/**
	 * Launch the application.
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {

	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					presidentbutton window = new presidentbutton();
					window.frmG.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws FileNotFoundException 
	 */
	
	//public presidentbutton(){
	//	initialize();
	//}
	public void initialize() {
		
		
		
		frmG = new JFrame();
		
		frmG.setVisible(true);
		frmG.setTitle("President Button Program");
		frmG.setBounds(100, 100, 2000, 418);
		frmG.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmG.getContentPane().setLayout(null);

		JLabel lblPleaseCheckOff = new JLabel("Presidents You Still Need to Collect!");;
		lblPleaseCheckOff.setFont(new Font("Ravie", Font.PLAIN, 11));
		lblPleaseCheckOff.setBackground(SystemColor.control);
		lblPleaseCheckOff.setBounds(144, 11, 271, 20);
		frmG.getContentPane().add(lblPleaseCheckOff);
		
		ArrayList<String> list = new ArrayList <String> ();
		
		Scanner inFile = null;
		try {
			inFile = new Scanner (new FileReader ("presidentsleft.txt"));
			while (inFile.hasNext()) {

				list.add(inFile.nextLine());

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
	  } finally {
		     if (inFile != null) {
		        inFile.close(); //closes outfile
		     }
	  }
		//inFile takes info from "buttons.txt"
	

		

		
		
		String[] str = new String[list.size()];
		
		for (int i =0; i<list.size(); i++) {
            str[i] = list.get(i);
        }
		

		
		JLabel label = new JLabel("presidents");
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setText(toString2(str)); //change this later Arrays.toString(str)
		label.setBounds(10, 42, 2000, 20);
		frmG.getContentPane().add(label);
		
		//JLabel lblNewLabel = new JLabel(toString3(str));
		//label.setText(toString3(str)); //change this later Arrays.toString(str)
		//lblNewLabel.setBounds(10, 147, 2000, 14);
		//frmG.getContentPane().add(lblNewLabel);
		
	
		


	}
	
	
	public static String toString2(String[] array) {
		String str = "";
		for (int i =0; i<array.length; i++) {
			 if (i == array.length-1) {
	        	   str = str + ", and " + array[i] + ".";
	           }
           str = str + array[i] + ", ";
          
        }
		return str;
	}
}
