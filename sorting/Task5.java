package by.mrbregovich.sorting;

/*
 * ���������� ���������. ���� ������������������ ����� a1,a2,...,an . ��������� ����������� ����� � �������
 * �����������. �������� ��� ��������� �������. ����� a1,a2,..,ai - ������������� ������������������, �. �.
 * a1 <= a2 <=...<= an . ������� ��������� ����� ai+1 � ����������� � ������������������ ���, ����� �����
 * ������������������ ���� ���� ������������. ������� ������������ �� ��� ���, ���� ��� �������� �� i +1 �� n
 * �� ����� ���������. ����������. ����� ��������� ���������� �������� � ��������������� ����� �����������
 * � ������� ��������� ������. �������� ����� �������� � ���� ��������� �������.
 */

import by.mrbregovich.helperPackage.ArrayHelper;

import java.util.Arrays;

class Task5 {
	public static void main(String[] args) {
		ArrayHelper arrHelper = new ArrayHelper();
		int size = 100;
		int[] arr = arrHelper.getRandomIntArray(size, -20, 21);
		System.out.println(Arrays.toString(arr));
		long time = System.nanoTime();
		insertionSort(arr);
		time = System.nanoTime() - time;
		System.out.println("������ ����� ����������");
		System.out.println(Arrays.toString(arr));
		System.out.println("����� ����������: " + time + " �������");

	}

	private static void insertionSort(int[] arr) {
		int pos;
		for (int i = 1; i < arr.length; i++) {
			pos = binarySearch(i, arr);
			if (pos != i)
				insert(i, pos, arr);
		}
	}

	private static int binarySearch(int curPos, int[] arr) {
		int leftBoud = 0;
		int rightBound = curPos - 1;
		int pos = curPos;
		while (leftBoud <= rightBound) {
			pos = leftBoud + (rightBound - leftBoud) / 2;
			if (arr[curPos] < arr[pos]) {
				rightBound = pos - 1;
			} else {
				leftBoud = pos + 1;
				pos++;
			}
		}
		return pos;
	}

	private static void insert(int curInd, int newPos, int[] arr) {
		// ��������� ������� �������
		int temp = arr[curInd];
		// �������� �������� ������� �� 1 ������� ������ ������� � newPos �� curInd
		for (int i = curInd; i > newPos; i--) {
			arr[i] = arr[i - 1];
		}
		arr[newPos] = temp;
	}
}
