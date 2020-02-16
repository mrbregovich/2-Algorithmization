package by.mrbregovich.multyArrays;

/*
 * Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,...,2n
 * так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
 * собой. Построить такой квадрат
 */

import java.util.Arrays;

import by.mrbregovich.helperPackage.matrix.MatrixPrinter;

class Task16 {
	public static void main(String[] args) {
		MatrixPrinter mxPrinter = new MatrixPrinter();
		int n = 3;
		int sum = n * (n * n + 1) / 2;

		// массив чисел
		int[] numbers = getArrayOfNumbers(n * n);

		// элемент с индексом [0; 0]
		for (int a = 0; a < numbers.length; a++) {
			int elem00 = numbers[a];
			int[] arr01 = getNewArr(numbers, elem00);
			// элементы с индексом [0; 1] и [0; 2]
			for (int b = 0; b < arr01.length; b++) {
				int elem01 = arr01[b];
				int elem02 = sum - elem00 - elem01;
				// убрать из arr01 элемент elem01 и проверить оставшиеся на наличие elem02
				int[] arr02 = getNewArr(arr01, elem01);
				if (!isContainingNum(arr02, elem02))
					continue;
				// элементы с индексом [1; 0] и [2; 0]
				int[] arr10 = getNewArr(arr02, elem02);
				for (int i = 0; i < arr10.length; i++) {
					int elem10 = arr10[i];
					int elem20 = sum - elem00 - elem10;
					// убрать из arr10 элемент elem10 и проверить оставшиеся на наличие elem20
					int[] arr20 = getNewArr(arr10, elem10);
					if (!isContainingNum(arr20, elem20))
						continue;
					// элементы с индексом [1; 1] и [2; 1] и [1; 2] и [2; 2]
					int[] arr11 = getNewArr(arr20, elem20);
					for (int j = 0; j < arr11.length; j++) {
						int elem11 = arr11[j];
						int elem12 = sum - elem10 - elem11;
						// убрать из arr11 элемент elem11 и проверить оставшиеся на наличие elem12
						int[] arr12 = getNewArr(arr11, elem11);
						if (!isContainingNum(arr12, elem12))
							continue;
						int elem21 = sum - elem01 - elem11;
						// убрать из arr12 элемент elem12 и проверить оставшиеся на наличие elem21
						int[] arr21 = getNewArr(arr12, elem12);
						if (!isContainingNum(arr21, elem21))
							continue;
						// проверка элемента elem22
						int[] arr22 = getNewArr(arr21, elem21);
						int elem22 = sum - elem20 - elem21;
						if (!isContainingNum(arr22, elem22))
							continue;
						if (elem20 + elem21 + elem22 != sum)
							continue;

						// составить матрицу и проверить. Если магический квадрат -> вывести на экран
						int[][] newMatrix = doSquareMatrix(
								new int[] { elem00, elem01, elem02, elem10, elem11, elem12, elem20, elem21, elem22 },
								n);
						if (isMagicSquare(newMatrix)) {
							mxPrinter.print(newMatrix);
							System.out.println();
						}
					}
				}
			}
		}
	}

	private static int[] getArrayOfNumbers(int maxNum) {
		int[] arr = new int[maxNum];
		for (int i = 0; i < maxNum; i++)
			arr[i] = i + 1;
		return arr;
	}

	// вернет новый массив за исключением элемента с определенным значением. Если
	// такого элемента нет, вернет весь массив
	private static int[] getNewArr(int[] numbers, int numToExcl) {
		int[] newArr;
		int pos = -1;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == numToExcl)
				pos = i;
		}
		if (pos == -1)
			newArr = Arrays.copyOf(numbers, numbers.length);
		else {
			newArr = new int[numbers.length - 1];
			for (int i = 0; i < pos; i++) {
				newArr[i] = numbers[i];
			}
			for (int i = numbers.length - 1; i > pos; i--) {
				newArr[i - 1] = numbers[i];
			}
		}
		return newArr;
	}

	private static boolean isContainingNum(int[] arr, int num) {
		for (int elem : arr)
			if (elem == num)
				return true;
		return false;
	}

	private static int[][] doSquareMatrix(int[] arr, int size) {
		int[][] mx = new int[size][size];
		for (int i = 0; i < arr.length; i++) {
			mx[i / size][i % size] = arr[i];
		}
		return mx;
	}

	private static boolean isMagicSquare(int[][] matrix) {
		int n = matrix.length;
		int sum = n * (n * n + 1) / 2;
		int diag1 = 0;
		for (int i = 0; i < n; i++)
			diag1 += matrix[i][i];
		int diag2 = 0;
		for (int i = 0; i < n; i++)
			diag2 += matrix[n - 1 - i][i];
		return diag1 == sum && diag2 == sum;
	}

}
