class ArrayToolDemo
{
    public static void main(String[] args)
    {
        int[] arr = {4,2,12,43,52,3,15,64,41};
        ArrayTool tool = new ArrayTool();
        System.out.println(tool.getMax(arr));
        tool.arrayToString(arr);
        int[] arrSort = tool.selectSort(arr);
        tool.arrayToString(arrSort);
    }
}
