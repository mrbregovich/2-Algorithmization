package by.mrbregovich.sorting;

import java.util.Arrays;

/*
 * ���������� �����. 
 */

import by.mrbregovich.helperPackage.ArrayHelper;

class Task6 {
	public static void main(String[] args) {
		ArrayHelper arrHelper = new ArrayHelper();
		int size = 30;
		int[] arr = arrHelper.getRandomIntArray(size, -20, 21);
		System.out.println(Arrays.toString(arr));

		shellSort(arr);

		System.out.println("������ ����� ����������");
		System.out.println(Arrays.toString(arr));
	}

	private static void shellSort(int[] arr) {
		int h = 1;
		int outer, inner, temp;
		while (h <= arr.length / 3) {
			h = h * 3 + 1;
		}
		while (h > 0) {
			// h-����������
			for (outer = h; outer < arr.length; outer++) {
				temp = arr[outer];
				inner = outer;
				while (inner - h >= 0 && arr[inner - h] > temp) {
					arr[inner] = arr[inner - h];
					inner -= h;
				}
				arr[inner] = temp;
			}
			// ���������� ���������
			h = (h - 1) / 3;
		}
	}

}
