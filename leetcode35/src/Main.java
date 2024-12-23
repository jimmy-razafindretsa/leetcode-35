// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
int target = 2;
int[] nums = {1,3,5,6} ;


        for (int i = 0; i < nums.length; i++) {
         // checks if its the first or the last index
            if (i == 0) {
                if (nums[0] > target) {
                    target = 0;
                    break;
                }

                if (target > nums[nums.length - 1]) {
                    target = nums.length;
                    break;
                }
            }
                //checks if the target is in the array
                if (target == nums[i]) {
                    target = i;
                    break;
                } else {
                    // if its not, it gets the correct index of where it should be
                    if (nums[i] < target && nums[i + 1] > target) {
                        target = i + 1;

                    }
                }



        }

    }

}