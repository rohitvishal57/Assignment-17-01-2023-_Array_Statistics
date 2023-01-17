package com.monocept.test;

import java.util.Arrays;

public class FindStatisticsOfArray {

	public static void main(String[] args) {
		int sum = 0, max = Integer.parseInt(args[0]), min = Integer.parseInt(args[0]);
		double avg = 0, median = 0;
		int[] arr = new int[args.length];
		for (int i = 0; i < args.length; ++i) {
			arr[i] = Integer.parseInt(args[i]);
			sum += arr[i];
			if (max < arr[i])
				max = arr[i];
			if (min > arr[i])
				min = arr[i];
		}
		Arrays.sort(arr);
		int n = arr.length;
		avg = (double) sum / n;
		if (n % 2 != 0)
			median = (double) arr[n / 2];
		else
			median = (double) (arr[(n - 1) / 2] + arr[n / 2]) / 2.0;
		System.out.println("sum of array elements is :" + sum);
		System.out.println("Maximum of array elements is :" + max);
		System.out.println("Minimum of array elements is :" + min);
		System.out.println("Average of array elements is :" + avg);
		System.out.println("Median of array elements is :" + median);
		printFrequency(arr, n);

	}

	private static void printFrequency(int[] arr, int n) {
		boolean[] visitedAlready = new boolean[n];
		Arrays.fill(visitedAlready, false);
		System.out.println("Element " + " Frequency ");
		for (int i = 0; i < n; ++i) {
			if (visitedAlready[i] == true)
				continue;
			int cnt = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					visitedAlready[j] = true;
					cnt++;
				}

			}
			System.out.println(arr[i] + "         " + cnt);
		}

	}

}
