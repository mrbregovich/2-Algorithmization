package by.mrbregovich.simpleArrays;

/*
 * Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.	
 */
import by.mrbregovich.helperPackage.ArrayHelper;

class Task5 {
	public static void main(String[] args) {
		int[] a = new ArrayHelper().getRandomIntArray(50, -100, 100);
		System.out.println("i\ta[i]\n");
		for (int i = 0; i < a.length; i++) {
			if (a[i] > i)
				System.out.println(i + "\t" + a[i]);
		}
	}
}
