import java.awt.*;
import java.awt.event.*;

class RegistrationPage extends Frame
{
	TextField name,email,pass,confrmpass;
	Button b1,b2,b3;

	RegistrationPage()
	{
	this.setLayout(null);

	Label n = new Label("Full Name:", Label.CENTER);
	Label e = new Label("Email:", Label.CENTER);
	Label p = new Label("Password:", Label.CENTER);
	Label c = new Label("Confirm ", Label.CENTER);

	name = new TextField(20);
	email = new TextField(20);
	pass = new TextField(20);
	pass.setEchoChar('*');
	confrmpass = new TextField(20);
	confrmpass.setEchoChar('*');

	b1 = new Button("Login");
	b2 = new Button("Cancel");
	b3 = new Button("Register");

	this.add(n);
	this.add(name);
	this.add(e);
	this.add(email);
	this.add(p);
	this.add(pass);
	this.add(c);
	this.add(confrmpass);
	this.add(b1);
	this.add(b2);
	this.add(b3);

	n.setBounds(150,150,90,60);
	e.setBounds(138,190,90,60);
	p.setBounds(150,230,90,60);
	c.setBounds(143,270,90,60);
	name.setBounds(300,170,140,20);
	email.setBounds(300,210,140,20);
	pass.setBounds(300,250,140,20);
	confrmpass.setBounds(300,290,140,20);
	b1.setBounds(160,350,90,40);
	b2.setBounds(260,350,90,40);
	b3.setBounds(360,350,90,40);
	
	}
	public static void main(String args[])
	{

	RegistrationPage r = new RegistrationPage();
	r.setVisible(true);
	r.setSize(600,600);
	r.setTitle("Registration Page");
	

}
}