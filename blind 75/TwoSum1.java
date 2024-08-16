import java.util.HashMap;
import java.util.Map;

class TwoSum1 {
    public static void main(String[] args) {
        int nums[] = { 1, 3, 4, 1 };

        Map<Integer, Integer> hm = new HashMap<>();
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            } else {
                hm.put(nums[i], count);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (hm.get(nums[i]) > 1) {
                return true;
            }
        }

        return false;

        // System.out.println(hm);

    }
}