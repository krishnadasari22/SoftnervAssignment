package com.softnerv;
public class ArrayLeader
{
	public void printLeaders(int arr[], int size)
	{
		for (int i = 0; i < size; i++)
		{
			int j;
			for (j = i + 1; j < size; j++)
			{
				if (arr[i] <=arr[j])
					break;
			}
			if (j == size)
				System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args)
	{
		ArrayLeader lead = new ArrayLeader();
		int arr[] = new int[]{7, 10, 4, 10, 6, 5, 2};
		int n = arr.length;
		lead.printLeaders(arr, n);
	}
}
