package by.mrbregovich.partition;

import java.util.Arrays;

/*
 * На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
 * из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
 */
class Task4 {
	public static void main(String[] args) {
		double[][] points = { new double[] { 1, 1 }, new double[] { -1, 1 }, new double[] { 2, 2 },
				new double[] { 5, 5 }};
		double[][] res = getMaxDistBetweenTwoPoints(points);
		for (double[] elem : res)
			System.out.println(Arrays.toString(elem));
	}

	private static double getDist(double[] pointA, double[] pointB) {
		return Math.sqrt(Math.pow(pointA[0] - pointB[0], 2) + Math.pow(pointA[1] - pointB[1], 2));
	}

	public static double[][] getMaxDistBetweenTwoPoints(double[]... args) {
		if (args.length < 2) {
			System.out.println("Нужно ввести не менее 2 точек!");
			System.exit(-1);
		}
		double[] pointA = null;
		double[] pointB = null;
		double maxDist = Double.MIN_VALUE;
		for (int i = 0; i < args.length; i++) {
			double[] firstPoint = args[i];
			for (int j = i + 1; j < args.length; j++) {
				double[] secPoint = args[j];
				double currDist = getDist(firstPoint, secPoint);
				if (currDist > maxDist) {
					pointA = firstPoint;
					pointB = secPoint;
					maxDist = currDist;
				}
			}
		}
		return new double[][] { pointA, pointB };
	}
}
