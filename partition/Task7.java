package by.mrbregovich.partition;

/*
 * �������� �����(������) ��� ���������� ����� ����������� ���� �������� ����� �� 1 �� 9
 */

class Task7 {
	public static void main(String[] args) {
		int num = 9;
		System.out.println(sumOfFact(num));
	}

	//���������� ���������� �����
	private static int fact(int num) {
		int f = 1;
		for (int i = 2; i <= num; i++) {
			f *= i;
		}
		return f;
	}
	//���������� ����� ����������� ����� �� 1 �� num ������������
	private static int sumOfFact(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i += 2) {
			sum += fact(i);
		}
		return sum;
	}
}
