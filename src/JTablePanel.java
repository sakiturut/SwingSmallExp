import javax.swing.*;  

public class JTablePanel {
	
	 JFrame f;    
	 JTablePanel(){    
	    f=new JFrame(); 
	    Person person = new Person();
	    String data[][]={ {Person.getCity(),Person.getName()}};
	    
	    String column[]={"CİTY","NAME"};      
	    JTable jt=new JTable(data,column);    
	    jt.setBounds(30,40,200,300);          
	    JScrollPane sp=new JScrollPane(jt);    
	    f.add(sp);          
	    
	    f.setSize(300,400);    
	    f.setVisible(true);
	    }

}
