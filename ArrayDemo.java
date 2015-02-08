import java.util.*;
class ArrayDemo
{    
    public static void main(String[] args)
    {
        int[] arr = {8,22,34,40,45};
        int index = Arrays.binarySearch(arr,34);
        System.out.println(index);
    }
}
