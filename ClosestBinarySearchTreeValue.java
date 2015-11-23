package Leetcode;

public class ClosestBinarySearchTreeValue {
	public int closestValue(TreeNode root, double target) {

		double minus = Math.abs(root.val - target);
		int result = root.val;
		while (root != null) {
			if (root.val > target) {

				if (Math.abs(root.val - target) < minus) {
					minus = Math.abs(root.val - target);
					result = root.val;
				}
				root = root.left;

			} else {

				if (Math.abs(root.val - target) < minus) {
					minus = Math.abs(root.val - target);
					result = root.val;
				}
				root = root.right;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		ClosestBinarySearchTreeValue solution = new ClosestBinarySearchTreeValue();
		TreeNode root = new TreeNode(1);
		System.out.println(solution.closestValue(root, 4.4));
	}
}
