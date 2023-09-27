package week3HomAssignments;

import java.util.ArrayList;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//{3, 2, 11, 4, 6, 7
		//r {1, 2, 8, 4, 9, 7}
           List<Integer> list1 = new ArrayList<Integer>();
           list1.add(3);
           list1.add(2);
           list1.add(11);
           list1.add(4);
           list1.add(9);
           list1.add(7);
           
           List<Integer> list2 = new ArrayList<Integer>();
           list2.add(1);
           list2.add(2);
           list2.add(8);
           list2.add(4);
           list2.add(9);
           list2.add(7);
           
           List<Integer> compares = new ArrayList<Integer>(list1);
           compares.retainAll(list2);
           
           System.out.println("Intersection: "+compares);
            
		}
	}


