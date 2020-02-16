package by.mrbregovich.helperPackage;

import java.util.Random;

public class ArrayHelper {
	private Random rand;

	public ArrayHelper() {
		rand = new Random();
	}

	/**
	 * Возвращает массив случайных целых чисел заданного размера в определенном
	 * интервале
	 * 
	 * @param length    размер массива
	 * @param lowBound  минимальное значение чисел в массиве включительно
	 * @param highBound максимальное значение чисел в массиве включительно
	 */
	public int[] getRandomIntArray(int length, int lowBound, int highBound) {
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(highBound - lowBound + 1) + lowBound;
		}
		return arr;
	}

	/**
	 * Возвращает массив случайных вещественных чисел заданного размера в
	 * определенном интервале
	 * 
	 * @param length    размер массива
	 * @param lowBound  минимальное значение чисел в массиве включительно
	 * @param highBound максимальное значение чисел в массиве НЕ включительно
	 */
	public double[] getRandomDoubleArray(int length, double lowBound, double highBound) {
		double[] arr = new double[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextDouble() * (highBound - lowBound) + lowBound;
		}
		return arr;
	}
}
