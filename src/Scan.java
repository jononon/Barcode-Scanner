import java.util.*;

public class Scan {
	public static void main (String args[]) {
		String[] reference = new String[100];
		int referenceLength = 0;
		reference[referenceLength++]="Jonathan Damico";
		reference[referenceLength++]="DJ Lesh";
		for(int i = reference.length-1; i>=0; i--) {
			if(reference[i]==null){}
			else
				System.out.println(reference[i]);
		}
		Scanner s = new Scanner(System.in);
		String input;
		while(true){
			System.out.println("Ready");
			input = s.nextLine();
			if(input.equalsIgnoreCase("add")||input.equalsIgnoreCase("Add")){
				boolean okay = true;
				System.out.println("Entered Add Mode, Type 'q' to Quit");
				while(okay){
					input = s.nextLine();
					if(input.equalsIgnoreCase("q"))
						okay = false;
					else
						reference[referenceLength++]=input;
				}
			} else {
				boolean found = false;
				for(int i = reference.length-1;i>=0;i--){
					if(reference[i]==null){}
					else{
						if(reference[i].equals(input))
							found = true;
					}
				}
				if(found)
					System.out.println("Access Granted");
				else
					System.out.println("Access Denied");
			}
		}
	}
	
}
