import java.awt.*;
import java.awt.event.*;

class Register extends Frame
{
	TextField name,pass;
	Button b1,b2;

	Register()
	{

	this.setLayout(null);

	Label n = new Label("Username:", Label.CENTER);
	Label p = new Label("Password:", Label.CENTER);

	name = new TextField(20);
	pass = new TextField(20);

	pass.setEchoChar('*');

	b1 = new Button("Login");
	b2 = new Button("Reset");

	this.add(n);
	this.add(name);
	this.add(p);
	this.add(pass);
	this.add(b1);
	this.add(b2);

	n.setBounds(70,200,90,60);
	p.setBounds(70,250,90,60);
	name.setBounds(190,220,90,20);
	pass.setBounds(190,270,90,20);
	b1.setBounds(100,350,50,30);
	b2.setBounds(200,350,50,30);
	
	
}
	public static void main(String args[])
	{

	Register r = new Register();
		r.setVisible(true);
		r.setSize(600,600);
		r.setTitle("REGISTER");
}


}