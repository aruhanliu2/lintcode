public class Solution {
    /**
     * @param nums: An integer array.
     * @return: The second max number in the array.
     */
    public int secondMax(int[] nums) {
        int max = Math.max(nums[0], nums[1]);
        int second = Math.min(nums[0], nums[1]);
        
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] > max) {
                second = max;
                max = nums[i];
            } else if (nums[i] > second) {
                second = nums[i];
            }
        }
        
        return second;
    }
}

public class Solution {
    /**
     * @param nums: An integer array
     * @return: The second max number in the array.
     */
    public int secondMax(int[] nums) {
        // 先排序，数列的最后一个数是最大值，倒数第二个数就是返回值
        Arrays.sort(nums);
        int secNum = nums.length - 2;
        return nums[secNum];
    }
}

public class Solution {
    /*
     * @param nums: An integer array
     * @return: The second max number in the array.
     */
    public int secondMax(int[] nums) {
        // write your code here
        //int [] score = new int [] {};
        int max = nums[0];
        int second = nums[1];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                second = max;
                max = nums[i];
            } else if (nums[i] <= max && nums[i] >= second) {
                second = nums[i];
            }
        }
        return second;
    }
}

public class Solution {
    /**
     * @param nums: An integer array
     * @return: The second max number in the array.
     */
    public int secondMax(int[] nums) {
        // write your code here
        Queue<Integer> heap = new PriorityQueue<>();
        
        heap.offer(nums[0]);
        heap.offer(nums[1]);
        
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] > heap.peek()) {
                heap.poll();
                heap.offer(nums[i]);
            }
        }
        
        return heap.poll();
    }
}
