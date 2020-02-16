package by.mrbregovich.simpleArrays;
/*
 * ���� ������������������ ����� ����� a1,a2,...,an . ���������� ����� ������������������, �������� ��
 * �������� �� �����, ������� ����� min(a1,a2,...,an)
 */

import java.util.Arrays;

import by.mrbregovich.helperPackage.ArrayHelper;

class Task8 {
	public static void main(String[] args) {
		ArrayHelper arrHelp = new ArrayHelper();
		int n = 40;
		int[] arr = arrHelp.getRandomIntArray(n, 5, 10);
		System.out.println(Arrays.toString(arr));
		int min = Integer.MAX_VALUE;
		int minCounter = 0;
		for (int elem : arr) {
			if (elem < min) {
				min = elem;
				// ���������� ���������� ����������� ��������� �� 1
				minCounter = 1;
			} else if (elem == min) {
				// ���� ���������� � ������������ ���������, ���������� ��������
				minCounter++;
			}
		}

		int[] newArr = new int[n - minCounter];
		for (int i = 0, j = 0; i < n; i++) {
			if (arr[i] != min) {
				newArr[j++] = arr[i];
			}
		}

		System.out.println("�������� ������������ �������� ������� �������: " + min);
		System.out.println("���������� ����������� ��������� ������� �������: " + minCounter);
		System.out.println("����� ������");
		System.out.println(Arrays.toString(newArr));
	}

}
