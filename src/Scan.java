import java.util.*;

public class Scan {
	public static void main (String args[]) {
		String[][] reference = new String[100][2];
		int referenceLength = 0;
		reference[referenceLength][0]="Jonathan Damico"; 		reference[referenceLength++][1]="All Access";
		reference[referenceLength][0]="DJ Lesh"; 				reference[referenceLength++][1]="All Access";
		reference[referenceLength][0]="Jonathan Goldberg"; 		reference[referenceLength++][1]="All Access";
		reference[referenceLength][0]="Caroline Cook"; 			reference[referenceLength++][1]="Stage";
		reference[referenceLength][0]="Chase Garvey-Daniels"; 	reference[referenceLength++][1]="Stage";
		reference[referenceLength][0]="Grace Burton"; 			reference[referenceLength++][1]="Stage";
		reference[referenceLength][0]="Jaya Nayar"; 			reference[referenceLength++][1]="Stage";
		reference[referenceLength][0]="Davis Cook"; 			reference[referenceLength++][1]="Stage";
		reference[referenceLength][0]="Pavan Tauh"; 			reference[referenceLength++][1]="Stage";
		reference[referenceLength][0]="Princie Kim"; 			reference[referenceLength++][1]="Stage";
		for(int i = reference.length-1; i>=0; i--) {
			if(reference[i][0]==null){}
			else
				System.out.println(reference[i][1]+"---"+reference[i][0]);
		}
		System.out.println("\nInstructions: type 'add' to add names");
		Scanner s = new Scanner(System.in);
		String input;
		while(true){
			System.out.println("\nReady");
			input = s.nextLine();
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
			} else {
				int found = 150;
				for(int i = reference.length-1;i>=0;i--){
					if(reference[i][0]==null){}
					else{
						if(reference[i][0].equals(input))
							found = i;
					}
				}
				if(found!=150)
					System.out.println("Access: "+reference[found][1]);
				else
					System.out.println("Access Denied - Lookup Failed");
			}
		}
	}
	
}
