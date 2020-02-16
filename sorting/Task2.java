package by.mrbregovich.sorting;

/*
 * ���� ��� ������������������ a1 <= a2 <= ... <= an � b1 <= b2 <=...<= bm. ���������� �� ��� ����� ������������������
 * ����� ���, ����� ��� ���� ���� �����������. ����������. �������������� ������ �� ������������.
 */

import by.mrbregovich.helperPackage.ArrayHelper;

import java.util.Arrays;

class Task2 {
	public static void main(String[] args) {
		ArrayHelper arrHelper = new ArrayHelper();
		int sizeA = 10;
		int sizeB = 10;
		int[] arrA = arrHelper.getRandomIntArray(sizeA, 0, 100);
		int[] arrB = arrHelper.getRandomIntArray(sizeB, 0, 100);

		// ����������� ���������� ���������� ��� ���������� �������� ������
		Arrays.sort(arrA);
		Arrays.sort(arrB);
		System.out.println(Arrays.toString(arrA));
		System.out.println(Arrays.toString(arrB));
		System.out.println(Arrays.toString(mergeArrays(arrA, arrB)));

	}

	private static int[] mergeArrays(int[] left, int[] right) {
		int leftInd = 0;
		int rightInd = 0;
		int resInd = 0;
		int[] resArr = new int[left.length + right.length];
		while (leftInd < left.length && rightInd < right.length) {
			if (left[leftInd] < right[rightInd])
				resArr[resInd++] = left[leftInd++];
			else
				resArr[resInd++] = right[rightInd++];
		}
		while (leftInd < left.length)
			resArr[resInd++] = left[leftInd++];
		while (rightInd < right.length)
			resArr[resInd++] = right[rightInd++];
		return resArr;
	}

}
