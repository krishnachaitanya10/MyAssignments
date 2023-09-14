package week1.day1;

public class Primee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		int temp=0;
		for(int i=2;i<=num-1;i++) {
			if(num%i == 0) {
				temp=temp+1;
			}}
			if(temp>0) {
				System.out.println("number is "+num+":"+"Not a prime number");
			}else {
				System.out.println("number is "+num+":"+"Prime number");	
		}
	}
}
