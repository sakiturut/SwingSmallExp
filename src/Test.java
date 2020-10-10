import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Test {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person= new Person();
		
		JFrame jFrame = new JFrame("JFrame-Test");
		JButton buton=new JButton("Kaydet");

		
		jFrame.setBounds(100, 100, 400, 500);
		
		JTextField jt1,jt2;
		jt1=new JTextField("Adinizi giriniz..");
		
		jt2=new JTextField("İlinizi giriniz..");
		
		
		
		jt1.setBounds(50, 50, 250, 30);
		jt2.setBounds(50, 100, 250, 30);
		
		buton.setBounds(125,150,100,30);
		jFrame.add(buton);
		
		buton.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
			            String name = jt1.getText();
			            String city=jt2.getText();
			            
			            person.setCity(city);
			            person.setName(name);
			            
			            jt1.setText("");
			            jt2.setText("");
			            
			            new JTablePanel();
			            
			            jFrame.dispatchEvent(new WindowEvent(jFrame, WindowEvent.WINDOW_CLOSING));
			            
			            
			        }  
			    }); 
		
		jFrame.add(jt1);
		jFrame.add(jt2);
		jFrame.setLayout(null);  
		jFrame.setVisible(true);

		

	}

}
