package Chapter_3_ExceptionTest;

import java.util.Scanner;

public class Exception_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		
		Scanner scann = new Scanner(System.in);
		
		System.out.println("���� ������ �Է��ϼ���.(����): ");
		int b = scann.nextInt();
		try	{		
			int ret = a / b; //0���� ������� ����
			System.out.println(ret);
		}
		catch(Exception e) {
			System.out.println("0������ �����Դϴ�!!!");
		}
		
		int arr[] = new int[5];
		
		try {
			arr[7] = 10;
		
			System.out.println(arr[7]);
		}
		catch(Exception e) {
			System.out.println("�迭 �ε��� ����!!!!");
		}
		finally {
			arr[0] = 100;
		}
		
		
		scann.close();
		System.out.print("���α׷��� �����մϴ�.");
	}

}
