package by.mrbregovich.partition;

import java.util.Arrays;

import by.mrbregovich.helperPackage.ArrayHelper;

/*
 * ����� ������ D. ���������� ��������� �����: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6]. 
 * ���������. ��������� �����(������) ��� ���������� ����� ���� ��������������� ������������� ��������� 
 * ������� � �������� �� k �� m.
 */

class Task8 {
	public static void main(String[] args) {
		ArrayHelper arrHelper = new ArrayHelper();
		int[] arr = arrHelper.getRandomIntArray(10, 0, 10);
		System.out.println(Arrays.toString(arr));
		System.out.println("����� ��������� � ��������� 1, 2 � 3 �����: " + sumofThreeElems(arr, 1));
		System.out.println("����� ��������� � ��������� 3, 4 � 5 �����: " + sumofThreeElems(arr, 3));
		System.out.println("����� ��������� � ��������� 4, 5 � 6 �����: " + sumofThreeElems(arr, 4));
	}

	// ���� ��������� ������ ����, ������������ ����� ��������� ��������
	private static int sumofThreeElems(int[] arr, int startIndex) {
		int sum = 0;
		for (int i = startIndex; i < arr.length && i < startIndex + 3; i++)
			sum += arr[i];
		return sum;
	}
}
