package att.man.sys;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Login extends JFrame {
	
	Login(){
		getContentPane().setBackground(Color.GRAY);
		setLayout(null);
		
		JLabel user = new JLabel("USERNAME");
		user.setBounds(40,20,100,30);
		add(user);
		JTextField tfuser = new JTextField();
		tfuser.setBounds(150,20,150,30);
		add(tfuser);
		
		JLabel pwd = new JLabel("USERNAME");
		pwd.setBounds(40,70,100,30);
		add(pwd);
		JTextField tfpwd = new JTextField();
		tfpwd.setBounds(150,70,150,30);
		add(tfpwd);
		
		JButton login = new JButton("LOGIN");
		login.setBounds(150,150,150,30);
		add(login);

		setSize(700,350);
		setVisible(true);
		
		}

	
   
		
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Login();

	}

}
