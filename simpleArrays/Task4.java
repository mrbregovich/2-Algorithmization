package by.mrbregovich.simpleArrays;
/*
 * ���� �������������� ����� �1 ,�2 ,..., �n . �������� ������� ���������� � ���������� ��������
 */

import java.util.Arrays;

import by.mrbregovich.helperPackage.ArrayHelper;

class Task4 {
	public static void main(String[] args) {
		int[] arr = new ArrayHelper().getRandomIntArray(10, 0, 20);
		System.out.println("�������������� ������");
		System.out.println(Arrays.toString(arr));
		int min = getMinElem(arr);
		int max = getMaxElem(arr);
		System.out.println("����������� ������ �������: " + min);
		System.out.println("������������ ������ �������: " + max);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == min) {
				arr[i] = max;
			} else if (arr[i] == max) {
				arr[i] = min;
			}
		}
		System.out.println("��� ����������� �������� �������� �� ������������ � ��������");
		System.out.println(Arrays.toString(arr));

	}

	private static int getMaxElem(int[] arr) {
		int maxValue = arr[0];
		for (int i = 1; i < arr.length; i++)
			if (arr[i] > maxValue)
				maxValue = arr[i];
		return maxValue;
	}

	private static int getMinElem(int[] arr) {
		int minValue = arr[0];
		for (int i = 1; i < arr.length; i++)
			if (arr[i] < minValue)
				minValue = arr[i];
		return minValue;
	}

}
