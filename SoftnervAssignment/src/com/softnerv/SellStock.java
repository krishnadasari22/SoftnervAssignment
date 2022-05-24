package com.softnerv;

public class SellStock
{

	static int maxProfit(int prices[], int size)
	{
		int maxProfit = 0;
		for (int i = 1; i < size; i++)
			if (prices[i] > prices[i - 1])
				maxProfit += prices[i] - prices[i - 1];
		return maxProfit;
	}
	public static void main(String[] args)
	{
		int price[] = {7,1,5,3,6,4 };
		int n = price.length;
		System.out.println(maxProfit(price, n));
	}
}

