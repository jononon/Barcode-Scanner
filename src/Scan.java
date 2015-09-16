import java.util.*;

/**
 * The Scan class is a sloppily written class that stores the names and access rights of 
 * people in a multi-dimensional array, and then references a scanned barcode against
 * this array. There is also an add function to add names to the array.
 * 
 * @author Jonathan Damico (github.com/jononon)
 * @version 1.5
 * @since Wed. April 14, 2015
 */

public class Scan {
	public static void main (String args[]) {
		//Create the Array
		String[][] reference = new String[100][2];
		int referenceLength = 0;
		
		//		INITIAL INPUTS
		reference[referenceLength][0]="Jonathan Damico"; 		reference[referenceLength++][1]="All Access";
		reference[referenceLength][0]="DJ Lesh"; 				reference[referenceLength++][1]="All Access";
		reference[referenceLength][0]="Jonathan Goldberg"; 		reference[referenceLength++][1]="All Access";
		reference[referenceLength][0]="Jacob Swanson"; 			reference[referenceLength++][1]="All Access";
		reference[referenceLength][0]="Keith Jordan"; 			reference[referenceLength++][1]="All Access";
		reference[referenceLength][0]="Edgar Jurado"; 			reference[referenceLength++][1]="All Access";
		reference[referenceLength][0]="Caroline Cook"; 			reference[referenceLength++][1]="Stage";
		reference[referenceLength][0]="Julia Cosgrove"; 		reference[referenceLength++][1]="Stage";
		reference[referenceLength][0]="J.P. Cherry"; 			reference[referenceLength++][1]="Stage";
		reference[referenceLength][0]="Chase Garvey-Daniels"; 	reference[referenceLength++][1]="Stage";
		reference[referenceLength][0]="Grace Burton"; 			reference[referenceLength++][1]="Stage";
		reference[referenceLength][0]="Jaya Nayar"; 			reference[referenceLength++][1]="Stage";
		reference[referenceLength][0]="Davis Cook"; 			reference[referenceLength++][1]="Stage";
		reference[referenceLength][0]="Pavan Tauh"; 			reference[referenceLength++][1]="Stage";
		reference[referenceLength][0]="Princie Kim"; 			reference[referenceLength++][1]="Stage";
		reference[referenceLength][0]="Pablo Greenlee"; 		reference[referenceLength++][1]="Stage";
		reference[referenceLength][0]="William Seymour"; 		reference[referenceLength++][1]="Stage";
		reference[referenceLength][0]="Ryan Stanford"; 			reference[referenceLength++][1]="Stage";
		reference[referenceLength][0]="All Access";				reference[referenceLength++][1]="All Access - Guest Pass: Check with DJ/Jonathan";
		reference[referenceLength][0]="Stage";					reference[referenceLength++][1]="Stage - Guest Pass: Check with DJ/Jonathan";
		
		//Read Out Stored Names
		for(int i = reference.length-1; i>=0; i--) {
			if(reference[i][0]==null){}
			else
				System.out.println(reference[i][1]+"---"+reference[i][0]);
		}
		
		//Give the operator a set of simple usage instructions.
		System.out.println("\nInstructions: type 'add' to add names");
		
		//INIT Scanner and Input
		Scanner s = new Scanner(System.in);
		String input;
		while(true){
			//Read Barcode
			System.out.println("\nReady");
			input = s.nextLine();
			
			//Add Mode
			if(input.equalsIgnoreCase("add")||input.equalsIgnoreCase("Add")){
				boolean okay = true;
				System.out.println("Entered Add Mode, Type 'q' to Quit");
				while(okay){
					input = s.nextLine();
					if(input.equalsIgnoreCase("q")) {
						okay = false;
						System.out.println("Exited Add Mode");
					}
					else {
						reference[referenceLength][0]=input;
						System.out.println("Access?");
						reference[referenceLength++][1]=s.nextLine();
					}
				}
			} 
			
			//Cross Reference Scanned Code with Array
			else {
				int found = 150;
				for(int i = reference.length-1;i>=0;i--){
					if(reference[i][0]==null){}
					else{
						if(reference[i][0].equalsIgnoreCase(input))
							found = i;
					}
				}
				
				//Print out whether the person has access, and to what areas they do
				if(found!=150)
					System.out.println("Access: "+reference[found][1]);
				else
					System.out.println("Access Denied - Lookup Failed");
			}
		}
	}
	
	public static String test () {
		return("Compiled Correctly, no compile time errors");
	}
}
