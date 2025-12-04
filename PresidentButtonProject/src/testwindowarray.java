import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JLabel;

public class testwindowarray {

	JFrame frmG;

	/**
	 * Launch the application.
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testwindowarray window = new testwindowarray();
					window.frmG.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws FileNotFoundException 
	 */
	public testwindowarray() throws FileNotFoundException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws FileNotFoundException 
	 */
	public void initialize() throws FileNotFoundException {
		Scanner inFile = new Scanner (new FileReader ("buttons.txt"));
		//inFile takes info from "buttons.txt"
		ArrayList<String> list = new ArrayList <String> ();

		while (inFile.hasNext()) {

			list.add(inFile.nextLine());

		}

		inFile.close();

		frmG = new JFrame();
		frmG.setTitle("President Button Program");
		frmG.setBounds(100, 100, 574, 418);
		frmG.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmG.getContentPane().setLayout(null);


		JCheckBox chckbxGeorgeWashington = new JCheckBox("George Washington");
		chckbxGeorgeWashington.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxGeorgeWashington.setBounds(6, 39, 121, 24);
		frmG.getContentPane().add(chckbxGeorgeWashington);


		JCheckBox chckbxJohnAdams = new JCheckBox("John Adams");
		chckbxJohnAdams.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxJohnAdams.setBounds(6, 62, 104, 23);
		chckbxJohnAdams.setVerticalAlignment(SwingConstants.TOP);
		frmG.getContentPane().add(chckbxJohnAdams);

		JCheckBox chckbxThomasJefferson = new JCheckBox("Thomas Jefferson");
		chckbxThomasJefferson.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxThomasJefferson.setVerticalAlignment(SwingConstants.TOP);
		chckbxThomasJefferson.setBounds(6, 84, 121, 23);
		frmG.getContentPane().add(chckbxThomasJefferson);

		JCheckBox chckbxJamesMadison = new JCheckBox("James Madison");
		chckbxJamesMadison.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxJamesMadison.setVerticalAlignment(SwingConstants.TOP);
		chckbxJamesMadison.setBounds(6, 110, 104, 23);
		frmG.getContentPane().add(chckbxJamesMadison);

		JCheckBox chckbxJamesMonroe = new JCheckBox("James Monroe");
		chckbxJamesMonroe.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxJamesMonroe.setVerticalAlignment(SwingConstants.TOP);
		chckbxJamesMonroe.setBounds(6, 136, 104, 23);
		frmG.getContentPane().add(chckbxJamesMonroe);

		JCheckBox chckbxJohnQuincyAdams = new JCheckBox("John Quincy Adams");
		chckbxJohnQuincyAdams.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxJohnQuincyAdams.setVerticalAlignment(SwingConstants.TOP);
		chckbxJohnQuincyAdams.setBounds(6, 162, 126, 23);
		frmG.getContentPane().add(chckbxJohnQuincyAdams);

		JCheckBox chckbxAndrewJackson = new JCheckBox("Andrew Jackson");
		chckbxAndrewJackson.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxAndrewJackson.setVerticalAlignment(SwingConstants.TOP);
		chckbxAndrewJackson.setBounds(6, 188, 121, 23);
		frmG.getContentPane().add(chckbxAndrewJackson);

		JCheckBox chckbxMartinVanBuren = new JCheckBox("Martin Van Buren");
		chckbxMartinVanBuren.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxMartinVanBuren.setVerticalAlignment(SwingConstants.TOP);
		chckbxMartinVanBuren.setBounds(6, 214, 121, 23);
		frmG.getContentPane().add(chckbxMartinVanBuren);

		JCheckBox chckbxFranklinPierce = new JCheckBox("Franklin Pierce");
		chckbxFranklinPierce.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxFranklinPierce.setVerticalAlignment(SwingConstants.TOP);
		chckbxFranklinPierce.setBounds(145, 40, 121, 23);
		frmG.getContentPane().add(chckbxFranklinPierce);

		JCheckBox chckbxJamesBuchanan = new JCheckBox("James Buchanan");
		chckbxJamesBuchanan.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxJamesBuchanan.setVerticalAlignment(SwingConstants.TOP);
		chckbxJamesBuchanan.setBounds(145, 62, 126, 23);
		frmG.getContentPane().add(chckbxJamesBuchanan);

		JCheckBox chckbxAbrahamLincoln = new JCheckBox("Abraham Lincoln");
		chckbxAbrahamLincoln.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxAbrahamLincoln.setVerticalAlignment(SwingConstants.TOP);
		chckbxAbrahamLincoln.setBounds(145, 84, 121, 23);
		frmG.getContentPane().add(chckbxAbrahamLincoln);

		JCheckBox chckbxAndrewJohnson = new JCheckBox("Andrew Johnson");
		chckbxAndrewJohnson.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxAndrewJohnson.setVerticalAlignment(SwingConstants.TOP);
		chckbxAndrewJohnson.setBounds(145, 110, 121, 23);
		frmG.getContentPane().add(chckbxAndrewJohnson);

		JCheckBox chckbxUlyssesSGrant = new JCheckBox("Ulysses S. Grant");
		chckbxUlyssesSGrant.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxUlyssesSGrant.setVerticalAlignment(SwingConstants.TOP);
		chckbxUlyssesSGrant.setBounds(145, 136, 121, 23);
		frmG.getContentPane().add(chckbxUlyssesSGrant);

		JCheckBox chckbxRutherfordBHayes = new JCheckBox("Rutherford B. Hayes");
		chckbxRutherfordBHayes.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxRutherfordBHayes.setVerticalAlignment(SwingConstants.TOP);
		chckbxRutherfordBHayes.setBounds(145, 162, 126, 23);
		frmG.getContentPane().add(chckbxRutherfordBHayes);

		JCheckBox chckbxJamesGarfield = new JCheckBox("James Garfield");
		chckbxJamesGarfield.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxJamesGarfield.setVerticalAlignment(SwingConstants.TOP);
		chckbxJamesGarfield.setBounds(145, 188, 104, 23);
		frmG.getContentPane().add(chckbxJamesGarfield);

		JCheckBox chckbxChesterAArthur = new JCheckBox("Chester A. Arthur");
		chckbxChesterAArthur.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxChesterAArthur.setVerticalAlignment(SwingConstants.TOP);
		chckbxChesterAArthur.setBounds(145, 214, 121, 23);
		frmG.getContentPane().add(chckbxChesterAArthur);

		JCheckBox chckbxWoodrowWilson = new JCheckBox("Woodrow Wilson");
		chckbxWoodrowWilson.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxWoodrowWilson.setVerticalAlignment(SwingConstants.TOP);
		chckbxWoodrowWilson.setBounds(268, 40, 126, 23);
		frmG.getContentPane().add(chckbxWoodrowWilson);

		JCheckBox chckbxWarrenGHarding = new JCheckBox("Warren G. Harding");
		chckbxWarrenGHarding.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxWarrenGHarding.setVerticalAlignment(SwingConstants.TOP);
		chckbxWarrenGHarding.setBounds(268, 62, 126, 23);
		frmG.getContentPane().add(chckbxWarrenGHarding);

		JCheckBox chckbxCalvinCoolidge = new JCheckBox("Calvin Coolidge");
		chckbxCalvinCoolidge.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxCalvinCoolidge.setVerticalAlignment(SwingConstants.TOP);
		chckbxCalvinCoolidge.setBounds(268, 84, 121, 23);
		frmG.getContentPane().add(chckbxCalvinCoolidge);

		JCheckBox chckbxHerbertHoover = new JCheckBox("Herbert Hoover");
		chckbxHerbertHoover.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxHerbertHoover.setVerticalAlignment(SwingConstants.TOP);
		chckbxHerbertHoover.setBounds(268, 110, 121, 23);
		frmG.getContentPane().add(chckbxHerbertHoover);

		JCheckBox chckbxFranklinDRoosevelt = new JCheckBox("Franklin D. Roosevelt");
		chckbxFranklinDRoosevelt.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxFranklinDRoosevelt.setVerticalAlignment(SwingConstants.TOP);
		chckbxFranklinDRoosevelt.setBounds(268, 136, 126, 23);
		frmG.getContentPane().add(chckbxFranklinDRoosevelt);

		JCheckBox chckbxHarrySTruman = new JCheckBox("Harry S. Truman");
		chckbxHarrySTruman.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxHarrySTruman.setVerticalAlignment(SwingConstants.TOP);
		chckbxHarrySTruman.setBounds(268, 162, 121, 23);
		frmG.getContentPane().add(chckbxHarrySTruman);

		JCheckBox chckbxDwightDEisenhower = new JCheckBox("Dwight D. Eisenhower");
		chckbxDwightDEisenhower.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxDwightDEisenhower.setVerticalAlignment(SwingConstants.TOP);
		chckbxDwightDEisenhower.setBounds(268, 188, 137, 23);
		frmG.getContentPane().add(chckbxDwightDEisenhower);

		JCheckBox chckbxJohnFKennedy = new JCheckBox("John F. Kennedy");
		chckbxJohnFKennedy.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxJohnFKennedy.setVerticalAlignment(SwingConstants.TOP);
		chckbxJohnFKennedy.setBounds(268, 214, 126, 23);
		frmG.getContentPane().add(chckbxJohnFKennedy);

		JCheckBox chckbxRonaldReagan = new JCheckBox("Ronald Reagan");
		chckbxRonaldReagan.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxRonaldReagan.setVerticalAlignment(SwingConstants.TOP);
		chckbxRonaldReagan.setBounds(410, 40, 118, 23);
		frmG.getContentPane().add(chckbxRonaldReagan);

		JCheckBox chckbxWilliamHenryHarrison = new JCheckBox("William Henry Harrison");
		chckbxWilliamHenryHarrison.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxWilliamHenryHarrison.setVerticalAlignment(SwingConstants.TOP);
		chckbxWilliamHenryHarrison.setBounds(6, 240, 137, 23);
		frmG.getContentPane().add(chckbxWilliamHenryHarrison);

		JCheckBox chckbxJohnTyler = new JCheckBox("John Tyler");
		chckbxJohnTyler.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxJohnTyler.setVerticalAlignment(SwingConstants.TOP);
		chckbxJohnTyler.setBounds(6, 266, 104, 23);
		frmG.getContentPane().add(chckbxJohnTyler);

		JCheckBox chckbxJamesKPolk = new JCheckBox("James K. Polk");
		chckbxJamesKPolk.setVerticalAlignment(SwingConstants.TOP);
		chckbxJamesKPolk.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxJamesKPolk.setBounds(6, 292, 104, 23);
		frmG.getContentPane().add(chckbxJamesKPolk);

		JCheckBox chckbxZacharyTaylor = new JCheckBox("Zachary Taylor");
		chckbxZacharyTaylor.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxZacharyTaylor.setVerticalAlignment(SwingConstants.TOP);
		chckbxZacharyTaylor.setBounds(6, 318, 104, 23);
		frmG.getContentPane().add(chckbxZacharyTaylor);

		JCheckBox chckbxMillardFillmore = new JCheckBox("Millard Fillmore");
		chckbxMillardFillmore.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxMillardFillmore.setVerticalAlignment(SwingConstants.TOP);
		chckbxMillardFillmore.setBounds(6, 344, 104, 23);
		frmG.getContentPane().add(chckbxMillardFillmore);

		JCheckBox chckbxBenjaminHarrison = new JCheckBox("Benjamin Harrison");
		chckbxBenjaminHarrison.setVerticalAlignment(SwingConstants.TOP);
		chckbxBenjaminHarrison.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxBenjaminHarrison.setBounds(145, 266, 121, 23);
		frmG.getContentPane().add(chckbxBenjaminHarrison);

		JCheckBox chckbxGroverCleveland = new JCheckBox("Grover Cleveland");
		chckbxGroverCleveland.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxGroverCleveland.setVerticalAlignment(SwingConstants.TOP);
		chckbxGroverCleveland.setBounds(145, 240, 121, 23);
		frmG.getContentPane().add(chckbxGroverCleveland);

		JCheckBox chckbxWilliamMckinley = new JCheckBox("William McKinley");
		chckbxWilliamMckinley.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxWilliamMckinley.setVerticalAlignment(SwingConstants.TOP);
		chckbxWilliamMckinley.setBounds(145, 292, 104, 23);
		frmG.getContentPane().add(chckbxWilliamMckinley);

		JCheckBox chckbxTheodoreRoosevelt = new JCheckBox("Theodore Roosevelt");
		chckbxTheodoreRoosevelt.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxTheodoreRoosevelt.setVerticalAlignment(SwingConstants.TOP);
		chckbxTheodoreRoosevelt.setBounds(145, 318, 126, 23);
		frmG.getContentPane().add(chckbxTheodoreRoosevelt);

		JCheckBox chckbxWilliamHowardTaft = new JCheckBox("William Howard Taft");
		chckbxWilliamHowardTaft.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxWilliamHowardTaft.setVerticalAlignment(SwingConstants.TOP);
		chckbxWilliamHowardTaft.setBounds(145, 344, 126, 23);
		frmG.getContentPane().add(chckbxWilliamHowardTaft);

		JCheckBox chckbxLyndonBJohnson = new JCheckBox("Lyndon B. Johnson");
		chckbxLyndonBJohnson.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxLyndonBJohnson.setVerticalAlignment(SwingConstants.TOP);
		chckbxLyndonBJohnson.setBounds(268, 240, 148, 23);
		frmG.getContentPane().add(chckbxLyndonBJohnson);

		JCheckBox chckbxRichardMNixon = new JCheckBox("Richard M. Nixon");
		chckbxRichardMNixon.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxRichardMNixon.setVerticalAlignment(SwingConstants.TOP);
		chckbxRichardMNixon.setBounds(268, 266, 121, 23);
		frmG.getContentPane().add(chckbxRichardMNixon);

		JCheckBox chckbxGeraldRFord = new JCheckBox("Gerald R. Ford");
		chckbxGeraldRFord.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxGeraldRFord.setVerticalAlignment(SwingConstants.TOP);
		chckbxGeraldRFord.setBounds(268, 292, 104, 23);
		frmG.getContentPane().add(chckbxGeraldRFord);

		JCheckBox chckbxJamesCarter = new JCheckBox("James Carter");
		chckbxJamesCarter.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxJamesCarter.setVerticalAlignment(SwingConstants.TOP);
		chckbxJamesCarter.setBounds(268, 318, 104, 23);
		frmG.getContentPane().add(chckbxJamesCarter);

		JCheckBox chckbxGeorgeHW = new JCheckBox("George H. W. Bush");
		chckbxGeorgeHW.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxGeorgeHW.setVerticalAlignment(SwingConstants.TOP);
		chckbxGeorgeHW.setBounds(410, 62, 148, 23);
		frmG.getContentPane().add(chckbxGeorgeHW);

		JCheckBox chckbxWilliamJClinton = new JCheckBox("William J. Clinton");
		chckbxWilliamJClinton.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxWilliamJClinton.setVerticalAlignment(SwingConstants.TOP);
		chckbxWilliamJClinton.setBounds(410, 84, 122, 23);
		frmG.getContentPane().add(chckbxWilliamJClinton);

		JCheckBox chckbxGeorgeWBush = new JCheckBox("George W. Bush");
		chckbxGeorgeWBush.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxGeorgeWBush.setVerticalAlignment(SwingConstants.TOP);
		chckbxGeorgeWBush.setBounds(410, 110, 118, 23);
		frmG.getContentPane().add(chckbxGeorgeWBush);

		JCheckBox chckbxBarackObama = new JCheckBox("Barack Obama");
		chckbxBarackObama.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxBarackObama.setVerticalAlignment(SwingConstants.TOP);
		chckbxBarackObama.setBounds(410, 136, 148, 23);
		frmG.getContentPane().add(chckbxBarackObama);

		JCheckBox chckbxDonaldJTrump = new JCheckBox("Donald J. Trump");
		chckbxDonaldJTrump.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxDonaldJTrump.setVerticalAlignment(SwingConstants.TOP);
		chckbxDonaldJTrump.setBounds(410, 162, 122, 23);
		frmG.getContentPane().add(chckbxDonaldJTrump);

		JCheckBox chckbxJoeBiden = new JCheckBox("Joe Biden");
		chckbxJoeBiden.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxJoeBiden.setVerticalAlignment(SwingConstants.TOP);
		chckbxJoeBiden.setBounds(410, 188, 118, 23);
		frmG.getContentPane().add(chckbxJoeBiden);

		JButton btnClickWhenDone = new JButton("Click when done");
		btnClickWhenDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				//this converts the arraylist list to an array, str
				String[] str = new String[list.size()];

				for (int i =0; i < list.size(); i++) {
					str[i] = list.get(i);
				}

				ArrayList<String> list2 = new ArrayList <String> ();



				//i hate these if else statements with a passion but i don't know how to do it any other way
				if (chckbxGeorgeWashington.isSelected()==false) {
					list2.add(str[0]);
					System.out.println(list2.get(0));
				}
				else {
					list2.add(null);
				}
				if (chckbxJohnAdams.isSelected()==false) {
					list2.add(str[1]);
					System.out.println(list2.get(1));
				}
				else {
					list2.add(null);
				}

				if (chckbxThomasJefferson.isSelected()==false) {
					list2.add(str[2]);
					System.out.println(list2.get(2));
				}
				else {
					list2.add(null);
				}

				if (chckbxJamesMadison.isSelected()==false) {
					list2.add(str[3]);
					System.out.println(list2.get(3));
				}
				else {
					list2.add(null);
				}

				if (chckbxJamesMonroe.isSelected()==false) {
					list2.add(str[4]);
					System.out.println(list2.get(4));
				}
				else {
					list2.add(null);
				}

				if (chckbxJohnQuincyAdams.isSelected()==false) {
					list2.add(str[5]);
					System.out.println(list2.get(5));
				}
				else {
					list2.add(null);
				}

				if (chckbxAndrewJackson.isSelected()==false) {
					list2.add(str[6]);
					System.out.println(list2.get(6));
				}
				else {
					list2.add(null);
				}
				if (chckbxMartinVanBuren.isSelected()==false) {
					list2.add(str[7]);
					System.out.println(list2.get(7));
				}
				else {
					list2.add(null);
				}
				if (chckbxWilliamHenryHarrison.isSelected()==false) {
					list2.add(str[8]);
					System.out.println(list2.get(8));
				}
				else {
					list2.add(null);
				}
				if (chckbxJohnTyler.isSelected()==false) {
					list2.add(str[9]);
					System.out.println(list2.get(9));
				}
				else {
					list2.add(null);
				}

				if (chckbxJamesKPolk.isSelected()==false) {
					list2.add(str[10]);
					System.out.println(list2.get(10));
				}
				else {
					list2.add(null);
				}
				if (chckbxZacharyTaylor.isSelected()==false) {
					list2.add(str[11]);
					System.out.println(list2.get(11));
				}
				else {
					list2.add(null);
				}
				if (chckbxMillardFillmore.isSelected()==false) {
					list2.add(str[12]);
					System.out.println(list2.get(12));
				}
				else {
					list2.add(null);
				}
				if (chckbxFranklinPierce.isSelected()==false) {
					list2.add(str[13]);
					System.out.println(list2.get(13));
				}
				else {
					list2.add(null);
				}
				if (chckbxJamesBuchanan.isSelected()==false) {
					list2.add(str[14]);
					System.out.println(list2.get(14));
				}
				else {
					list2.add(null);
				}
				if (chckbxAbrahamLincoln.isSelected()==false) {
					list2.add(str[15]);
					System.out.println(list2.get(15));
				}
				else {
					list2.add(null);
				}
				if (chckbxAndrewJohnson.isSelected()==false) {
					list2.add(str[16]);
					System.out.println(list2.get(16));
				}
				else {
					list2.add(null);
				}

				if (chckbxUlyssesSGrant.isSelected()==false) {
					list2.add(str[17]);
					System.out.println(list2.get(17));
				}
				else {
					list2.add(null);
				}

				if (chckbxRutherfordBHayes.isSelected()==false) {
					list2.add(str[18]);
					System.out.println(list2.get(18));
				}
				else {
					list2.add(null);
				}
				if (chckbxJamesGarfield.isSelected()==false) {
					list2.add(str[19]);
					System.out.println(list2.get(19));
				}
				else {
					list2.add(null);
				}
				if (chckbxChesterAArthur.isSelected()==false) {
					list2.add(str[20]);
					System.out.println(list2.get(20));
				}
				else {
					list2.add(null);
				}
				if (chckbxGroverCleveland.isSelected()==false) {
					list2.add(str[21]);
					System.out.println(list2.get(21));
				}
				else {
					list2.add(null);
				}
				if (chckbxBenjaminHarrison.isSelected()==false) {
					list2.add(str[22]);
					System.out.println(list2.get(22));
				}
				else {
					list2.add(null);
				}
				if (chckbxWilliamMckinley.isSelected()==false) {
					list2.add(str[23]);
					System.out.println(list2.get(23));
				}
				else {
					list2.add(null);
				}
				if (chckbxTheodoreRoosevelt.isSelected()==false) {
					list2.add(str[24]);
					System.out.println(list2.get(24));
				}
				else {
					list2.add(null);
				}
				if (chckbxWilliamHowardTaft.isSelected()==false) {
					list2.add(str[25]);
					System.out.println(list2.get(25));
				}
				else {
					list2.add(null);
				}
				if (chckbxWoodrowWilson.isSelected()==false) {
					list2.add(str[26]);
					System.out.println(list2.get(26));
				}
				else {
					list2.add(null);
				}
				if (chckbxWarrenGHarding.isSelected()==false) {
					list2.add(str[27]);
					System.out.println(list2.get(27));
				}
				else {
					list2.add(null);
				}
				if (chckbxCalvinCoolidge.isSelected()==false) {
					list2.add(str[28]);
					System.out.println(list2.get(28));
				}
				else {
					list2.add(null);
				}
				if (chckbxHerbertHoover.isSelected()==false) {
					list2.add(str[29]);
					System.out.println(list2.get(29));
				}
				else {
					list2.add(null);
				}
				if (chckbxFranklinDRoosevelt.isSelected()==false) {
					list2.add(str[30]);
					System.out.println(list2.get(30));
				}
				else {
					list2.add(null);
				}
				if (chckbxHarrySTruman.isSelected()==false) {
					list2.add(str[31]);
					System.out.println(list2.get(31));
				}
				else {
					list2.add(null);
				}
				if (chckbxDwightDEisenhower.isSelected()==false) {
					list2.add(str[32]);
					System.out.println(list2.get(32));
				}
				else {
					list2.add(null);
				}
				if (chckbxJohnFKennedy.isSelected()==false) {
					list2.add(str[33]);
					System.out.println(list2.get(33));
				}
				else {
					list2.add(null);
				}
				if (chckbxLyndonBJohnson.isSelected()==false) {
					list2.add(str[34]);
					System.out.println(list2.get(34));
				}
				else {
					list2.add(null);
				}
				if (chckbxRichardMNixon.isSelected()==false) {
					list2.add(str[35]);
					System.out.println(list2.get(35));
				}
				else {
					list2.add(null);
				}
				if (chckbxGeraldRFord.isSelected()==false) {
					list2.add(str[36]);
					System.out.println(list2.get(36));
				}
				else {
					list2.add(null);
				}
				if (chckbxJamesCarter.isSelected()==false) {
					list2.add(str[37]);
					System.out.println(list2.get(37));
				}
				else {
					list2.add(null);
				}
				if (chckbxRonaldReagan.isSelected()==false) {
					list2.add(str[38]);
					System.out.println(list2.get(38));
				}
				else {
					list2.add(null);
				}
				if (chckbxGeorgeHW.isSelected()==false) {
					list2.add(str[39]);
					System.out.println(list2.get(39));
				}
				else {
					list2.add(null);
				}
				if (chckbxWilliamJClinton.isSelected()==false) {
					list2.add(str[40]);
					System.out.println(list2.get(40));
				}
				else {
					list2.add(null);
				}
				if (chckbxGeorgeWBush.isSelected()==false) {
					list2.add(str[41]);
					System.out.println(list2.get(41));
				}
				else {
					list2.add(null);
				}
				if (chckbxBarackObama.isSelected()==false) {
					list2.add(str[42]);
					System.out.println(list2.get(42));
				}
				else {
					list2.add(null);
				}
				if (chckbxDonaldJTrump.isSelected()==false) {
					list2.add(str[43]);
					System.out.println(list2.get(43));
				}
				else {
					list2.add(null);
				}
				if (chckbxJoeBiden.isSelected()==false) {
					list2.add(str[44]);
					System.out.println(list2.get(44));
				}
				else {
					list2.add(null);
				}

				//i have to do this chunky outfile try/catch thing i got off the internet because it doesn't work otherwise
				PrintWriter outFile = null;
				try {
					outFile = new PrintWriter ("presidentsleft.txt");
					for (int i=0;i<list2.size();i++) {
						if (list2.get(i) == null) {

						}
						else {
							outFile.println(list2.get(i));
						}
					}

				} catch (FileNotFoundException e1) {

					e1.printStackTrace();	
				} finally {
					if (outFile != null) {
						outFile.close(); //closes outfile
					}

					// this closes this first window, very important!!
					frmG.setVisible(false);

					//initialises/opens/starts the second window
					presidentbutton presButt = new presidentbutton();
					presButt.initialize();

					outFile.close();

				}
			}});

		frmG.setVisible(true);
		btnClickWhenDone.setBounds(380, 305, 168, 49);
		frmG.getContentPane().add(btnClickWhenDone);

		JLabel lblPleaseCheckOff = new JLabel("Please check off every president button you have!");;
		lblPleaseCheckOff.setFont(new Font("Ravie", Font.PLAIN, 11));
		lblPleaseCheckOff.setBackground(SystemColor.control);
		lblPleaseCheckOff.setBounds(94, 11, 388, 20);
		frmG.getContentPane().add(lblPleaseCheckOff);


	}
}
