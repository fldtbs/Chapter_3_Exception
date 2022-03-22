package Chapter_3_ExceptionTest;

import java.util.*;

public class moonjae3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scann = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오>>");
		
		int num = scann.nextInt();
		
		for(int i=num;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scann.close();
		
	}

}
