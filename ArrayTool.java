
/**
建立一个包含数组的工具类，其中包含常见的树组工具
@author 王滔
@version v0.1
*/

public class ArrayTool
{
    private ArrayTool()
    {}

    /**
     * 获取整数的最大值
     * @param arr 
     * @return 整数最大值
     */

    public static int getMax(int[] arr)
    {
        int max = arr[0];
        for(int x=1; x<arr.length; x++)
        {
            if(arr[x] > max)
                max = arr[x];
        }
        return max;
    }
    /**
     * 选择排序
     * @param arr
     * @return 返回已排好序的数组
     */
    public static int[] selectSort(int[] arr)
    {
            int[] sorted = new int[arr.length];
            for(int x=0; x<arr.length; x++)
                sorted[x] = arr[x];
            for(int x=0; x<arr.length-1; x++)
            {
                for(int y=x+1; y<arr.length; y++)
                {
                    if(sorted[x] > sorted[y])
                        exchange(sorted, x, y);
                }
            }
            return sorted;
    }
    //交换数值
    private static void exchange(int[] arr, int x, int y)
    {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void arrayToString(int[] arr) //数组转化为字符串输出
    {
        String str = "[";
        for(int x=0; x<arr.length; x++)
        {
            if(x != arr.length-1)
                System.out.print(str + arr[x] + ",");
            else
                System.out.println(str + arr[x] + "]");
        }
    }

    public static int getIndex(int[] arr, int value) //获取角标
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == value)
                return i;
        }
        return -1;
    }
}
