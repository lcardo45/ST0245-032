// // @author Federico Banoy Restrepo
public class SumaGrupos
{
    private int start;
    private int[] nums;
    private int target;

    private static boolean SumaGrupos(int start, int[] nums, int target)
    {
        if (start>=nums.length) {
            return target == 0;
        }else{
            return SumaGrupos(start + 1, nums, target - nums[start]) || SumaGrupos(start+1, nums, target);
        }
    }

    public static boolean SumaGrupos(int[] nums,int target)
    {
        return SumaGrupos(0, nums, target);
    }

}