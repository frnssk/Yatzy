package yatzy;

import java.awt.*;
import javax.swing.*;

public class UserInput extends JPanel{
	private String button = "Save";
	
	private JPanel pnlMain = new JPanel(new GridLayout(1, 2));
	private JPanel pnlWest = new JPanel(new BorderLayout(15,15));
	private JPanel pnlCenter = new JPanel(new GridLayout(5, 7));
	private JPanel pnlEast = new JPanel(new GridLayout(5, 1));
	
	private JTextField txtFieldOne = new JTextField(button);
	private JTextField txtFieldTwo = new JTextField(button);
	private JTextField txtFieldThree = new JTextField(button);
	private JTextField txtFieldFour = new JTextField(button);
	private JTextField txtFieldFive = new JTextField(button);

	private JRadioButton rb1 = new JRadioButton(button);
	private JRadioButton rb2 = new JRadioButton(button);
	private JRadioButton rb3 = new JRadioButton(button);
	private JRadioButton rb4 = new JRadioButton(button);
	private JRadioButton rb5 = new JRadioButton(button);
	
	private JButton btnRoll = new JButton("Roll dice");
	private JButton btnSave = new JButton("Save dice");
	
	public UserInput() {
		setLayout(new GridLayout());
		setPreferredSize(new Dimension(500, 200));

		pnlMain.add(pnlWest);
		pnlMain.add(pnlEast);
		pnlWest.add(pnlCenter, BorderLayout.CENTER);
		
		pnlCenter.add(txtFieldOne);
		pnlCenter.add(txtFieldTwo);
		pnlCenter.add(txtFieldThree);
		pnlCenter.add(txtFieldFour);
		pnlCenter.add(txtFieldFive);
		
		//Hitta ett sätt att lägga till en tom rad
		
		pnlCenter.add(rb1);
		pnlCenter.add(rb2);
		pnlCenter.add(rb3);
		pnlCenter.add(rb4);
		pnlCenter.add(rb5);
		
		pnlEast.add(btnRoll);
		pnlEast.add(btnSave);
		
		
	}
	
	public static void main(String[] args) {
		UserInput ui = new UserInput();
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(ui);
		frame.pack();
		frame.setVisible(true);
		
	}
}
