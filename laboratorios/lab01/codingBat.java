
public class codingBat
{
public int triangle(int rows) {
  if(rows==0) return 0;
  return rows + triangle(rows-1);
}
public String noX(String str) {
  if(str.length() == 0) return "";
  if(str.charAt(0) == 'x') return noX(str.substring(1));
  return str.charAt(0) + noX(str.substring(1));
  
}
public int countPairs(String str) {
  if(str.length() <=2) return 0;
  if(str.charAt(0) == str.charAt(2)) return 1 + countPairs(str.substring(1));
  return countPairs(str.substring(1));
}
public int array11(int[] nums, int index) {
  if(nums.length == index) return 0;
  if (nums[index] == 11) return 1 + array11(nums , index + 1);
  return array11(nums,index + 1);
}
public String changePi(String str) {
  if(str.length() < 2) return str;
  if(str.substring(0,2).equals("pi")) return "3.14" + changePi(str.substring(2));
  return str.charAt(0)+changePi(str.substring(1));
}
public boolean groupSum6(int start, int[] nums, int target) {
    if (start >= nums.length) return target == 0;
    if (nums[start] == 6)
        return groupSum6(start + 1, nums, target - nums[start]);
    return groupSum6(start + 1, nums, target - nums[start])
            || groupSum6(start + 1, nums, target);
}
public boolean groupNoAdj(int start, int[] nums, int target) {
    if (start >= nums.length) return target == 0;
    return groupNoAdj(start + 2, nums, target - nums[start])
            || groupNoAdj(start + 1, nums, target);
}
public boolean groupSum5(int start, int[] nums, int target) {
    if (start >= nums.length) return target == 0;
    if (nums[start] % 5 == 0) {
        if (start < nums.length - 1 && nums[start + 1] == 1)
            return groupSum5(start + 2, nums, target - nums[start]);
        return groupSum5(start + 1, nums, target - nums[start]);
    }
    return groupSum5(start + 1, nums, target - nums[start])
            || groupSum5(start + 1, nums, target);
}
public boolean groupSumClump(int start, int[] nums, int target) {
    if (start >= nums.length) return target == 0;
    int sum = nums[start];
    int count = 1;
    for (int i = start + 1; i < nums.length; i++)
        if (nums[i] == nums[start]) {
            sum += nums[i];
            count++;
        }
    return groupSumClump(start + count, nums, target - sum)
            || groupSumClump(start + count, nums, target);
}
public boolean splitArray(int[] nums) {
    return helper(0, nums, 0, 0);
}
private boolean helper(int start, int[] nums, int sum1, int sum2) {
    if (start >= nums.length) return sum1 == sum2;
    return helper(start + 1, nums, sum1 + nums[start], sum2)
            || helper(start + 1, nums, sum1, sum2 + nums[start]);
}
}
