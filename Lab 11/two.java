import java.awt.*;   
import java.awt.event.*;  
 

public class two extends Frame implements ActionListener {
   private Label lblCount;
   private TextField tfCount;
   private Button btnCount;    
   private int count = 0;      
   public two () {
      setLayout(new FlowLayout());
      lblCount = new Label("Counter");
      add(lblCount); 
 
      tfCount = new TextField(count + "", 10);
      tfCount.setEditable(false);       
      add(tfCount);                    
 
      btnCount = new Button("Count");   
      add(btnCount);                    
      btnCount.addActionListener(this);

      setSize(250, 100);
      setTitle("AWT Counter");
      setVisible(true); 
   }
 

   public void actionPerformed(ActionEvent evt) {
      ++count;
      tfCount.setText(count + "");
   }
 

   public static void main(String[] args) {

      new two();
   }
}