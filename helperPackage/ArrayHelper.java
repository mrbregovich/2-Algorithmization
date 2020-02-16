package by.mrbregovich.helperPackage;

import java.util.Random;

public class ArrayHelper {
	private Random rand;

	public ArrayHelper() {
		rand = new Random();
	}

	/**
	 * ���������� ������ ��������� ����� ����� ��������� ������� � ������������
	 * ���������
	 * 
	 * @param length    ������ �������
	 * @param lowBound  ����������� �������� ����� � ������� ������������
	 * @param highBound ������������ �������� ����� � ������� ������������
	 */
	public int[] getRandomIntArray(int length, int lowBound, int highBound) {
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(highBound - lowBound + 1) + lowBound;
		}
		return arr;
	}

	/**
	 * ���������� ������ ��������� ������������ ����� ��������� ������� �
	 * ������������ ���������
	 * 
	 * @param length    ������ �������
	 * @param lowBound  ����������� �������� ����� � ������� ������������
	 * @param highBound ������������ �������� ����� � ������� �� ������������
	 */
	public double[] getRandomDoubleArray(int length, double lowBound, double highBound) {
		double[] arr = new double[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextDouble() * (highBound - lowBound) + lowBound;
		}
		return arr;
	}
}
