package by.mrbregovich.sorting;

/*
 * ������ ��� ���������� ������� � ��������� ����������� ��������� � ����������� ����� k. ���������� �� �
 * ���� ������, ������� ������ ������ ����� k-� � (k+1) - � ���������� �������, ��� ���� �� ���������
 * �������������� ������
 */

import by.mrbregovich.helperPackage.ArrayHelper;
import by.mrbregovich.helperPackage.UserInputHelper;

import java.util.Arrays;

class Task1 {
	public static void main(String[] args) {
		UserInputHelper usrInput = new UserInputHelper();
		ArrayHelper arrHelper = new ArrayHelper();
		int sizeA = 20;
		int sizeB = 10;
		int[] arrA = arrHelper.getRandomIntArray(sizeA, 0, 100);
		int[] arrB = arrHelper.getRandomIntArray(sizeB, 0, 100);
		System.out.println("������� ����� k � ��������� �� 0 �� " + (sizeA - 1));
		System.out.println("��� ����� ����� ������ 0 ��� ������ " + (sizeA - 1)
				+ " ������ ������ ����� �������� � ������ ��� ����� ������� ������� ��������������");
		int k = usrInput.getIntValue("k: ");
//		if (k < 0)
//			k = 0;
//		else if (k > sizeA - 1)
//			k = sizeA - 1;
		System.out.println("����������� �������");
		System.out.println(Arrays.toString(arrA));
		System.out.println(Arrays.toString(arrB));
		System.out.println("������ ����� �������");
		System.out.println(Arrays.toString(merge(arrA, arrB, k)));

	}

	private static int[] merge(int[] left, int[] right, int k) {
		int[] arr = new int[left.length + right.length];
		if (k < 0) {
			// ������� � ������ �������
			for (int i = 0; i < right.length; i++)
				arr[i] = right[i];
			for (int i = 0; i < left.length; i++)
				arr[right.length + i] = left[i];
		} else if (k > left.length - 1) {
			// ������� � ����� �������
			for (int i = 0; i < left.length; i++)
				arr[i] = left[i];
			for (int i = 0; i < right.length; i++)
				arr[left.length + i] = right[i];
		} else {
			// ������� � �������� �������
			for (int i = 0; i <= k; i++)
				arr[i] = left[i];
			for (int i = 0; i < right.length; i++)
				arr[k + 1 + i] = right[i];
			for (int i = k + 1; i < left.length; i++)
				arr[i + right.length] = left[i];
		}
		return arr;
	}

}
