import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SecondPage extends JFrame implements ActionListener {
	private static JButton button;//declare a new JButton
	private static JLabel label;//declare a new JLabel 
	private static ImageIcon image;//declare a new ImageIcon image
	private static ImageIcon icon;//declare a new ImageIcon icon
	private static Font font;
	private static JTextField text ;
	
	public SecondPage() {
		font = new Font("Ink Free", Font.BOLD, 20);
		
	text = new JTextField("Give us a like");
	text.setBounds(10, 20, 300, 50);
	text.setFont(font);
	text.setEditable(false);
	text.setVisible(true);
	

	image = new ImageIcon("thumbs-up.png");//initialise the imaIcon and state its name 
	icon = new ImageIcon("happy (1).png");//initialise the imaIcon and state its name 
	
	
	label= new JLabel();//initialise the label
	label.setIcon(icon);//set the icon of the label to icon
	label.setBounds(150, 250, 150, 150);//set the positioning and the dimensions
	label.setVisible(false);//set the visibility to false
	
	
	button = new JButton();//finish instantiating the button
	button.setBounds(100, 100, 250, 100);//set the bounds of the button
	button.addActionListener((ActionListener) this);//make it perform an action in this class when clicked 
//button.addActionListener(e -> System.out.println("poo"));//you can use this instead of implements ActionListener
	//and using actionPerformed method(DOES THE SAME THING WITH LESS SYNTAX)<<<THIS IS CALLED Lambda
	button.setText("Like");//puts this text inside the button
	button.setFocusable(false);//gets rid of the border line around the button
	button.setIcon(image);//put the image on the button
	button.setHorizontalTextPosition(JButton.CENTER);//sets the text of the button to the cetre
	button.setVerticalTextPosition(JButton.BOTTOM);//sets the text of the button at the bottom of the button
	button.setFont(new Font("Comic Sans" , Font.BOLD,25));//sets the font of the text of the button
	button.setIconTextGap(-2);//sets the gap between the text and the icon
	button.setForeground(Color.GRAY);//sets the colour of the text on the button
	button.setBackground(Color.lightGray);//set the background colour of the button to grey
	button.setBorder(BorderFactory.createEtchedBorder());//make it look a bit 3d ish
	//button.setEnabled(false);//disables the button
	
	
	
	this.setTitle("MY Gui maaan");//sets the title of the this
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exits out of the application
	//this.setResizable(false);//prevent the this from being resized
	this.setLayout(null);
	this.setSize(500,500);//set the size of the this
	
	
	
	//ImageIcon image = new ImageIcon("ninja.png");//create an image iconj
	//this.setIconImage(image.getImage());//chamge icon of the this
	//this.getContentPane().setBackground(new Color(0x123456));//hexadecimal or rgb values for colours(google
	//this for more info) 123,50,250(rgb value) <<Twitch purple--(0xFFFFFF)<<white (0x000000)<<black (0x123456) nice blue colour


	
	this.add(button);//add the button to the frame
	this.add(label);//add the label to the frame
	this.add(text);
	this.setVisible(true);//makes the this visible
}

@Override
public void actionPerformed(ActionEvent e) {
	if (e.getSource() == button) {
		System.out.println("poo");
	//this disbales the button after one click
	//button.setEnabled(false);//disables the button
		
		label.setVisible(true);
	//button.setEnabled(false);
	
	}
	
	}
	
}
