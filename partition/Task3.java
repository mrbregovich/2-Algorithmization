package by.mrbregovich.partition;

/*
 * ��������� ������� ����������� �������������� �� �������� �, ��������� ����� ���������� �������
 * ������������
 */

import java.util.Random;

class Task3 {
	public static void main(String[] args) {
		int a = new Random().nextInt(21) + 1;
		System.out.println("������� ����������� �������������� �� �������� " + a + " ����� " + 6 * triangleSq(a));

	}

	private static double triangleSq(int size) {
		return Math.pow(3, 1 / 2) / 4 * size * size;
	}
}
