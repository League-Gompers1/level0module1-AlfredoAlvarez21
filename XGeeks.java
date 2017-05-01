package variables_and_conditionals;

import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
public static void main(String[] args) {

        // 1. Save the superpower for each person in a variable= 
String alfredosPower = "gaming";
String danielsPower = "hacking";
String ebukasPower = "endurance";
String christophersPower = "reading";
String jesusPower = "speed";
String jasonsPower = "smarts";
String joshuasPower = "inspiration";
        // 2. Ask the user to enter a name. Store their answer in a variable.
String name = JOptionPane.showInputDialog("Enter your name");
        // 3. Show the superpower in a pop-up, depending on the name entered. 
if (name.equals( ("Daniel"))) {
	JOptionPane.showMessageDialog(null, "Daniel's superpower is "+danielsPower); 
}
 if (name.equals( ("Alfredo"))) {
		JOptionPane.showMessageDialog(null, "Alfredo's superpower is "+alfredosPower);

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 }
}		
}

	
	
    
