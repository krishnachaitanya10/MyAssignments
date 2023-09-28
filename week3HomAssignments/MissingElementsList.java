package week3HomAssignments;
import java.util.ArrayList;
import java.util.List;
public class MissingElementsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1, 2, 3, 4, 10, 6, 8
		
		
		List<Integer> Inputvalue = new ArrayList<Integer>();
		 Inputvalue.add(1);
		 Inputvalue.add(2);
		 Inputvalue.add(3);
		 Inputvalue.add(4);
		 Inputvalue.add(10);
		 Inputvalue.add(6);
		 Inputvalue.add(8);
		 
		 List<Integer> Value = new ArrayList<Integer>();
		 Value.add(1);
		 Value.add(2);
		 Value.add(3);
		 Value.add(4);
		 Value.add(5);
		 Value.add(6);
		 Value.add(7);
		 Value.add(8);
		 Value.add(9);
		 Value.add(10);
		 
		 List<Integer> missingNumbers = new ArrayList<Integer>(Value);
		 missingNumbers.removeAll( Inputvalue);
		 System.out.println("Missing Elements: "+ missingNumbers);
		 
		
		

	}

}
