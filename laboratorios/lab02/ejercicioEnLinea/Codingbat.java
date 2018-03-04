
public class Codingbat
{
public int countEvens(int[] nums) {
  int count = 0;
  for (int i=0;i<nums.length;i++) {
      if (nums[i]%2 == 0){
      count = count + 1;
      }
  }
 return count;
}
public int bigDiff(int[] nums) {
  int max = nums[0];
  int min = nums[0];
  for (int i = 0; i<nums.length; i++){
   if (min > nums[i]){
     min=nums[i];
   }
   if(max < nums[i]){
     max = nums[i];
   }
  }
   return max-min;
}
public int centeredAverage(int[] nums) {
  int max = nums[0];
  int min = nums[0];
  int sum = 0;
  for (int i = 0; i<nums.length; i++){
    if(max < nums[i]){
    max = nums[i];
    }
    if(min > nums[i]){
    min = nums[i]  ;
    }
    sum = sum + nums[i];
 }
 sum = sum - (min + max);
 return sum /(nums.length-2);
}
public int sum13(int[] nums) {
  int sum = 0;
  if(nums.length==0){
  
  }else if(nums[0] != 13){
  sum = nums[0];
  }
  for(int i=1 ; i<nums.length; i++){
    if(nums[i] != 13 && nums[i-1] != 13){
      sum = sum + nums[i];
    }
  }
  return sum;
}
public boolean has22(int[] nums) {
  boolean wierd = false;
  for(int  i = 1;i<nums.length;i++){
    if (nums[i] == 2 && nums[i-1] == 2)
    wierd = true;
  }
  return wierd;
}
//array 2 
public int maxSpan(int[] nums) {
  int max = 0;
  int relative =0;
  if (nums.length == 0){
    max = -1;
  }
    
  for(int i=0;i<nums.length;i++){
    for(int j=i;j<nums.length;j++){
      if(nums[i] == nums [j]){
        relative = j-i;
        if(max < relative)
        max = relative;
      }
    }
  }
   return max + 1;
}
public int[] fix34(int[] nums) {
  int save = 0;
  for (int i = 0;i<nums.length;i++){
    if(nums[i] == 3){
      save = nums[i+1];
      nums[i+1] = 4;
      for(int j = i+2;j<nums.length;j++){
       if(nums[j] == 4){
         nums[j] = save;
       }
      }
    }
  }
  return nums;
}
public int[] fix45(int[] nums) {
  int save = 0;
  int depui = 0;
  for (int i = 0;i<nums.length;i++){
    if(nums[i] == 5 && i == 0 || nums[i] == 5 && nums[i - 1] != 4){
      depui = i;
      for(int j = 0;j<nums.length;j++){
       if(nums[j] == 4 && nums[j+1] !=5){
         save = nums[j+1];
         nums[j+1] = 5;
         nums[depui] = save;
         break;
       }
      }
    }
  }
  return nums;
}
public boolean canBalance(int[] nums) {
  boolean isit = false;
  for(int i = 0; i<nums.length; i++){
    int sum = 0;
    for(int j = 0; j < i;j++){
      sum = sum + nums[j];
    }
    for(int k = i; k<nums.length;k++){
      sum = sum -nums[k];
    }
      if (sum ==0){
      isit = true;
  }

  }
  return isit;
}
public boolean linearIn(int[] outer, int[] inner) {
    int i = 0;
    int j = 0;
    while (i < inner.length && j < outer.length) {
        if (outer[j] == inner[i]) {
            j++;
            i++;
        } else j++;
    }
    return (i == inner.length);
}
}
