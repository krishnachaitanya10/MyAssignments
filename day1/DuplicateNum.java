package week1.day1;

public class DuplicateNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number[] = {2,5,7,7,5,9,2,3};
		
		for(int i=0;i<number.length;i++) {
			for(int j=i+1;j<number.length;j++) {
				if(number[i]==number[j]) {
					System.out.println("Duplicate values :"+number[i]);
				}	
			}
		}
	}
}
