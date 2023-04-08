public class Flash extends JFrame implements ActionListener {
	Flash(){
		//getContentPane().setBackground(Color.BLACK);
		//setLayout(null);
		
		JLabel head = new JLabel("ATTENDANCE MANAGEMENT SYSTEM");
		head.setBounds(150,30,1200,50);
		head.setFont(new Font("serif",Font.BOLD,50));
		head.setForeground(Color.BLACK);
		add(head);
		
		JLabel bg1= new JLabel(new ImageIcon("abc/flash.jpeg"));
		add(bg1);
		bg1.setLayout(new FlowLayout());
		
		
		JButton click = new JButton("CLICK HERE TO CONTINUE");
		click.setBounds(200,100,500,200);
		click.addActionListener(this);
		bg1.add(click);
		
		setSize(1200,700);
		setVisible(true);
		
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Flash();

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		setVisible(false);
		new Login();
		
	}

}
