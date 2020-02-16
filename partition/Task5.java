package by.mrbregovich.partition;

import java.util.Arrays;

import by.mrbregovich.helperPackage.ArrayHelper;

/*
 * ��������� ���������, ������� � ������� A[N] ������� ������ �� �������� ����� (������� �� ������ �����,
 * ������� ������ ������������� �������� �������, �� ������ ���� ������ ���������)
 */

class Task5 {
	public static void main(String[] args) {
		ArrayHelper arrHelper = new ArrayHelper();
		int[] arr = arrHelper.getRandomIntArray(10, -10, 10);
		System.out.println(Arrays.toString(arr));
		int secondMax = getAlmostMaxValue(arr);
		System.out.println(secondMax);

	}

	private static int getAlmostMaxValue(int[] arr) {
		if (arr.length == 0) {
			System.out.println("������� ������ ������� �����");
			System.exit(-1);
		}
		Arrays.sort(arr);
		int res = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] < res) {
				res = arr[i];
				break;
			}
		}
		if (res == arr[arr.length - 1]) {
			System.out.println("� ������� ������ ������������ ��������");
			System.exit(-1);
		}
		return res;

	}

}
