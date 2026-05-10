package ArraysQuestion;

public class question {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 2, 2, 2, 4, 5 };
    int target = 2;
    System.out.println(occurance(nums, target));
  }

  static int occurance(int[] nums, int target) {
    int count = 0;
    int start = 0;
    int end = nums.length - 1;

    for (int i = 0; i < nums.length; i++) {
      for (int j = nums.length; j > nums[0]; j--) {
        if (target == nums[i]) {
          start = i;
        }
        if (target == nums[j]) {
          end = j;
        }else{
          
        }

        return count = end - start;
      }

    }
    return -1;

  }
}
