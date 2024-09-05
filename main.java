public class main {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		System.out.println("The average is: " +
		average(numbers));
		}
	public static double average(int[] nums) {
		double average = 0;
		for (int i = 0; i < nums.length; i++) {
			average += nums[i];
		}
		return (average / nums.length);
		}
}