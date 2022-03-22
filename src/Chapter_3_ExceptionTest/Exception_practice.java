package Chapter_3_ExceptionTest;

import java.util.Scanner;

public class Exception_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		
		Scanner scann = new Scanner(System.in);
		
		System.out.println("나눌 정수를 입력하세요.(젯수): ");
		int b = scann.nextInt();
		try	{		
			int ret = a / b; //0으로 나눌경우 에러
			System.out.println(ret);
		}
		catch(Exception e) {
			System.out.println("0나누기 에러입니다!!!");
		}
		
		int arr[] = new int[5];
		
		try {
			arr[7] = 10;
		
			System.out.println(arr[7]);
		}
		catch(Exception e) {
			System.out.println("배열 인덱스 오류!!!!");
		}
		finally {
			arr[0] = 100;
		}
		
		
		scann.close();
		System.out.print("프로그램을 종료합니다.");
	}

}
