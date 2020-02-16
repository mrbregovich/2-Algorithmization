package by.mrbregovich.simpleArrays;

/*
 * ���� ������������������ �������������� ����� �1 ,�2 ,..., ��. �������� ��� �� �����, ������� ������� Z, 
 * ���� ������. ���������� ���������� �����.
 */
import java.util.Arrays;

import by.mrbregovich.helperPackage.ArrayHelper;
import by.mrbregovich.helperPackage.UserInputHelper;

class Task2 {
	public static void main(String[] args) {
		UserInputHelper inputHeper = new UserInputHelper();
		int z = inputHeper.getIntValue("������� ����� �����: ");
		int counter = 0;
		ArrayHelper arrHelper = new ArrayHelper();
		int[] arr = arrHelper.getRandomIntArray(20, -100, 100);
		System.out.println("������ �� 20 ��������� ����� �� -100 �� 100");
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > z) {
				arr[i] = z;
				counter++;
			}
		}
		System.out.println("\n������ ����� ������ ���� ��������� ������ " + z + " �� " + z);
		System.out.println(Arrays.toString(arr));
		System.out.println("����� ������������ �����: " + counter);
	}

}
