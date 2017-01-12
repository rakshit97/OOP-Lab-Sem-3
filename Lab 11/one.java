import javax.swing.*;
import java.awt.FlowLayout;
class one
{
	one()
	{
	JFrame jfm=new JFrame("HelloWorldSwing");
	jfm.setSize(300, 70);
	JLabel l1;
	l1=new JLabel("Hello World");
	jfm.setLayout(new FlowLayout());
	jfm.add(l1);
	jfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jfm.setVisible(true);
	}
	public static void main(String[] args)
	{
	SwingUtilities.invokeLater(new Runnable()
	{
	public void run()
	{
	new one();
	}
	});
	}
}