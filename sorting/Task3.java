package by.mrbregovich.sorting;

import java.util.Arrays;

/*
 * ���������� �������. ���� ������������������ ����� a1 <= a2 <=... <= an .��������� ����������� �������� ���,
 * ����� ��� ���� ����������� �� ��������. ��� ����� � �������, ������� � �������, ���������� ����������
 * ������� � �������� �� ������ �����, � ������ - �� ����� �����������. �����, ������� �� �������, ��� ���������
 * �����������. �������� �������� ���������� �������
 */

import by.mrbregovich.helperPackage.ArrayHelper;

class Task3 {
	public static void main(String[] args) {
		ArrayHelper arrHelper = new ArrayHelper();
		int size = 30;
		int[] arr = arrHelper.getRandomIntArray(size, -10, 11);
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("������ ����� ���������� ���������: ");
		long time = System.nanoTime();
		selectionDescSort(arr);
		time = System.nanoTime() - time;
		System.out.println(Arrays.toString(arr));
		System.out.println("����� �� ����������: " + time + " �������");
	}

	private static void selectionDescSort(int[] arr) {
		int maxInd;
		for (int i = 0; i < arr.length - 1; i++) {
			maxInd = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[maxInd])
					maxInd = j;
			}
			swap(arr, i, maxInd);
		}
	}

	private static void swap(int[] arr, int iIndex, int jIndex) {
		int temp = arr[iIndex];
		arr[iIndex] = arr[jIndex];
		arr[jIndex] = temp;
	}

}
