package week3HomAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {3, 2, 11, 4, 6, 7};
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int num : arr1) {
			list.add(num);
		}
		
		Collections.sort(list);
		System.out.println("Sorted List :"+list);
		System.out.println("The second largest number is :"+list.get(1));
		
		
		/*if(list1.size()>=2) {
			int secondLargest=list1.get(5);
			System.out.println("The second largest number is: "+secondLargest);
		}else {
				System.out.println("No numbers found!");
			
		}*/
		
		
		
		

	}

}
