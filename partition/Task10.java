package by.mrbregovich.partition;

import java.util.Arrays;

/*
 * Äàíî íàòóğàëüíîå ÷èñëî N. Íàïèñàòü ìåòîä(ìåòîäû) äëÿ ôîğìèğîâàíèÿ ìàññèâà, ıëåìåíòàìè êîòîğîãî 
 * ÿâëÿşòñÿ öèôğû ÷èñëà N.
 */

class Task10 {
	public static void main(String[] args) {
		int n = 10547896;
		int[] arr = intToArray(n);
		System.out.println(Arrays.toString(arr));
	}

	private static int getLen(int num) {
		int count = 1;
		while ((num /= 10) != 0)
			count++;
		return count;
	}

	private static int[] intToArray(int num) {
		int len = getLen(num);
		if (len == 1)
			return new int[] { num };
		int[] arr = new int[len];
		for (int i = len - 1; i >= 0; i--) {
			arr[i] = num % 10;
			num /= 10;
		}
		return arr;
	}
}
