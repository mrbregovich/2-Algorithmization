package by.mrbregovich.partition;

/*
 * ����������� �����, � ������ �������� n ����, ���������� ������ ����������, ���� ����� ��� ����, 
 * ����������� � ������� n, ����� ������ �����. ����� ��� ����� ���������� �� 1 �� k. 
 * ��� ������� ������ ������������ ������������.
 */

class Task14 {
	public static void main(String[] args) {
		printArmstrongNumbers(1, 100000);

	}

	private static int getSumOfDigits(int num) {
		int sum = num % 10;
		while ((num = num / 10) != 0)
			sum += num % 10;
		return sum;
	}

	private static int getLength(int num) {
		int count = 1;
		while ((num /= 10) != 0)
			count++;
		return count;
	}

	private static boolean isArmstrongNum(int num) {
		int res = (int) Math.pow(getSumOfDigits(num), getLength(num));
		if (res == num)
			return true;
		return false;
	}

	private static void printArmstrongNumbers(int start, int end) {
		for (int i = start; i <= end; i++)
			if (isArmstrongNum(i))
				System.out.println(i);
	}
}
