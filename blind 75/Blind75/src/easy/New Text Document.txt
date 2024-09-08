//brute force solution
//time limit exceeded


//class Solution {
    //public int maxSubArray(int[] nums) {
        //int n = nums.length;
        //int maxSum = Integer.MIN_VALUE;

        //for(int i = 0; i<n; i++){
            //int subArrSum = 0;
            //for(int j = i; j<n; j++){
               // subArrSum += nums[j];

                //if(subArrSum > maxSum){
                    maxSum = subArrSum;
                //}
           // }
        //}

        //return maxSum;

    //}
//}












//==================================================================
//kadane's algorithm
//O(n) complexity


class Solution {
    public int maxSubArray(int[] nums) {
     
     int n = nums.length;

     int maxEnd = nums[0];
     int maxSoFar = nums[0];

     for(int i = 1; i<n; i++){
        maxEnd = Math.max(nums[i], maxEnd+nums[i]);

        maxSoFar = Math.max(maxSoFar, maxEnd);
     }

     return maxSoFar;

    }
}

==========================================================
Dry run

[-2, 1, -3, 4, -1, 2, 1, -5, 4]


maxEnd [0] => maxEnd = -2

maxSoFar [0] => maxSoFar = -2

for nums[1] = 1:

	maxEnd = max of[1, (1+(-2))] => 1
	maxSoFar = max of[-2, 1] => 1


for nums[2] = -3 

	maxEnd = max of[-3, (1+(-3))] => -2
	maxSoFar = max of[1, -2] => 1


for nums[3] = 4

	maxEnd = max of[4, (-2+(4))] => 4
	maxSoFar = max of[1, 4] => 4 


or nums[4] = -1 

	maxEnd = max of[-1, (4+(-1))] =>3
	maxSoFar = max of[4, 3] => 4


or nums[5] = 2 

	maxEnd = max of[2, (3+2)] =>5
	maxSoFar = max of[4, 5] => 5

or nums[6] = 1 

	maxEnd = max of[1, (5+1)] =>6
	maxSoFar = max of[5, 6] => 6

or nums[7] = -5 

	maxEnd = max of[-5, (6-5)] =>1
	maxSoFar = max of[6, 1] => 6


or nums[8] = 4 

	maxEnd = max of[4, (1+4)] =>5
	maxSoFar = max of[6, 5] => 6
==========================================================