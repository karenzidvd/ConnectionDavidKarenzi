package combeginners;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class UserLoginForm implements ActionListener {
	//All required fields
	JFrame frame;
	//Labels
	JLabel userLabel=new JLabel("Username");
	JLabel passwordLabel=new JLabel("Password");
	//Fields
	JTextField userTextField=new JTextField("Enter username");
	JPasswordField passwordField=new JPasswordField("*********");
	//Buttons
	JButton loginButton=new JButton("Login");
	JButton resetButton=new JButton("Reset");
	//Check box
	JCheckBox showpwdButton=new JCheckBox("Show Password");
	
	//Constructor
	public UserLoginForm() {
		createWindow(); // create window
		setLocationAndSize(); // location
		addComponentsToFrame();//components
		addActionEvent();//events
		
		
	}
	
	private void addActionEvent() {
		loginButton.addActionListener(this);
		resetButton.addActionListener(this);
		showpwdButton.addActionListener(this);
		
	}

	private void addComponentsToFrame() 
	{
		frame.add(userLabel);
		frame.add(passwordLabel);
		frame.add(userTextField);
		frame.add(passwordField);
		frame.add(loginButton);
		frame.add(showpwdButton);
		frame.add(resetButton);
		frame.add(userTextField);
		
		
		
	}

	private void setLocationAndSize() {
		userLabel.setBounds(50, 150,100, 30);
		passwordLabel.setBounds(50, 220, 100, 30);
		userTextField.setBounds(150, 150, 150, 30);
		passwordField.setBounds(150, 220, 150, 30);
		showpwdButton.setBounds(150, 280, 150, 30);
		loginButton.setBounds(50, 350, 100, 30);
		resetButton.setBounds(200, 350, 100, 30);
		
		
		
	}

	private void createWindow() {
		frame=new JFrame();
		frame.setTitle("Login Form");//Title
		frame.setBounds(10, 10, 380, 600);//Size of frame
		frame.getContentPane().setBackground(Color.blue);//Color of frame
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);//visibility
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close our work
		frame.setResizable(false);//Resizing a frame
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==loginButton) {
			User myUser=new User(null, null);
			myUser.setUsername(userTextField.getText());
			myUser.setPassword(passwordField.getText());
			myUser.login(myUser.getUsername(),myUser.getPassword());
			
		}
		if(e.getSource()==resetButton) {
			userTextField.setText("");
			passwordField.setText("");
		}
		if(e.getSource()==showpwdButton) {
			if(showpwdButton.isSelected()) {
				passwordField.setEchoChar((char)0);
							}else {
								passwordField.setEchoChar('*');
							}
		}
		
	}
	
public static void main(String[]args)
{
	UserLoginForm lgfm=new UserLoginForm();
	}
	

}