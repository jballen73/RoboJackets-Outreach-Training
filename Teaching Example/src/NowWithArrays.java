
public class NowWithArrays {

	public static void main(String[] args) {
		int[] nums = {82,85,92,83,42,27};
		int average = 0;
		for (int i = 0; i < nums.length; i++) {
			average += nums[i];
		}
		average /= nums.length;
		System.out.println(average);
	}

}
