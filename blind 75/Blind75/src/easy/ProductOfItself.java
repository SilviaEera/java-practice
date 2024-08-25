package easy;

public class ProductOfItself {

    //
    // BRUTE FORCE O(n2)
    //
    // public int[] productExceptSelf(int[] nums) {
    // int n = nums.length;
    // int ans[] = new int[n];
    //
    // for(int i=0; i<n; i++){
    // int product = 1;
    // for(int j=0; j<n; j++){
    // if(i==j){
    // continue;
    // }else {
    // product *= nums[j];
    // }
    // }
    // ans[i] = product;
    // }
    // return ans;
    // }

    // O(n) solution
    //
    // class Solution {
    // public int[] productExceptSelf(int[] nums) {
    // int[] left = new int[nums.length];

    // int[] right = new int[nums.length];

    // int[] productArr = new int[nums.length];

    // left[0] = 1; //first index value is one
    // for(int i=1; i<nums.length; i++){
    // left[i] = left[i-1] * nums[i-1]; //keeping the result in index one
    // }

    // right[nums.length -1] = 1; //last index value is one
    // for(int i = (nums.length)-2; i>=0; i--){
    // right[i] = right[i+1] * nums[i+1]; // keeping the value in second last index
    // }

    // for(int i = 0; i<nums.length; i++){
    // productArr[i] = left[i]*right[i];
    // }

    // return productArr;
    // }
    // }

    //
}
