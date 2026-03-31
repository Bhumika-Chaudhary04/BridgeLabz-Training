package leetcode;
class BuyAndSellStock {
	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(prices));
	}
	public static int maxProfit(int[] prices) {
		int minprice = Integer.MAX_VALUE;
		int maxprofit = 0;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < minprice) {
				minprice = prices[i];
			}
			maxprofit = Math.max(maxprofit, prices[i] - minprice);
		}
		return maxprofit;
	}
}
