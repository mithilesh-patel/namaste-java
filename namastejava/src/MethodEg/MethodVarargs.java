package MethodEg;

public class MethodVarargs {

	static void showLength(int x, int... nums) {
		System.out.println(nums.length);
		System.out.println(nums[1]);

	}

	public static void main(String[] args) {
		showLength(2, 23, 56);
		System.out.println();
		showLength(2, new int[] {34,536,78,78});
	}
}