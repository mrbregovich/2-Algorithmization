package by.mrbregovich.sorting;

import java.util.Arrays;

/*
 * ���������� ��������. ���� ������������������ ����� a1 <= a2 <=...<= an .��������� ����������� ����� �
 * ������� ��������. ��� ����� ������������ ��� �������� ����� ai � ai+1 . ���� ai > ai+1 , �� ��������
 * ������������. ��� ������������ �� ��� ���, ���� ��� �������� �� ������ ����������� � ������� �����������.
 * ��������� �������� ����������, ����������� ��� ���� ���������� ������������.
 */

import by.mrbregovich.helperPackage.ArrayHelper;

class Task4 {
	public static void main(String[] args) {
		ArrayHelper arrHelper = new ArrayHelper();
		int size = 30;
		int[] arr = arrHelper.getRandomIntArray(size, -20, 21);
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int counter = 0;
		long time = System.nanoTime();
		counter = bubbleDescSort(arr);
		time = System.nanoTime() - time;
		System.out.println("������ ����� ����������");
		System.out.println(Arrays.toString(arr));
		System.out.println("���������� ������������: " + counter);
		System.out.println("����� ����������: " + time + " �������");
	}

	private static int bubbleDescSort(int[] arr) {
		int counter = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = arr.length - 1; j > i; j--) {
				if (arr[j] > arr[j - 1]) {
					swap(arr, j, j - 1);
					counter++;
				}
			}
		}
		return counter;
	}

	private static void swap(int[] arr, int iInd, int jInd) {
		int temp = arr[iInd];
		arr[iInd] = arr[jInd];
		arr[jInd] = temp;
	}
}
