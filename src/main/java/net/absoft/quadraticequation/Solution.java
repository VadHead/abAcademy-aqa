package net.absoft.quadraticequation;

public class Solution {
	
	public int x1;
	public int x2;
	
	public Solution() {
	}
	
	public Solution(int x1, int x2) {
		this.x1 = x1;
		this.x2 = x2;
	}
	
	public static void main(String[] args) {
	}
	
	public static Solution equationResult(int a, int b, int c) {
		int d = determinant(a, b, c);
		if (d == 0) {
			return new Solution(rootSingle(a, b), rootSingle(a, b));
		}
		else if (d > 0) {
			return new Solution(rootsFirst(a, b, d), rootSecond(a, b, d));
		}
		else {
			return null;
		}
	}
	
	private static int determinant(int a, int b, int c) {
		return Math.multiplyExact(b, b) - Math.multiplyExact(a, c) * 4;
	}
	
	private static int rootSingle(int a, int b) {
		return -b / (2 * a);
	}
	
	private static int rootsFirst(int a, int b, int d) {
		return (-b + (int) Math.sqrt(d)) / (2 * a);
	}
	
	private static int rootSecond(int a, int b, int d) {
		return (-b - (int) Math.sqrt(d)) / (2 * a);
	}
	
}
