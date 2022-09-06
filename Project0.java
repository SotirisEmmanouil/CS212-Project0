import javax.swing.JOptionPane;
import java.lang.String;

public class Project0 {
	
	public static void main (String [] args) {
		
		int lowercase = 0 , UpperCase = 0;
		
   String sample = JOptionPane.showInputDialog(null,"Please enter a sentence.");
		 
		 while(!(sample.equalsIgnoreCase("STOP"))) {

		 for (int i=0; i<=sample.length()-1; i++) {  
			 	if(sample.charAt(i)=='e')
				       lowercase++;
			        if(sample.charAt(i)=='E')
			        		UpperCase++;
		}

	JOptionPane.showMessageDialog(null,"Number of lower case e's: "+ lowercase + "\n" + "Number of upper case e's: " +UpperCase);				
	
		sample = JOptionPane.showInputDialog(null,"Please enter a sentence.");
		lowercase = 0; 
		UpperCase = 0;
		
		 }
	     System.exit(0);
	}
}
