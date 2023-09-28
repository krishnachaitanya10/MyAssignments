package week3HomAssignments;

public class StringPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Madam";     
		int leng = name.length();
		String rev ="";
		
		for(int i=leng-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		if(name.equals(rev)) {
			System.out.println("Pallindrome");
		}
		else {
			System.out.println("Not a Pallindrome!");
		}
		
	
	}

}
