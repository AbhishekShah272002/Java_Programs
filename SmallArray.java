import java.util.Arrays;

public class SmallArray{
  public static Integer findSecondSmallestItem(Integer[] arr)
  { 
    if(arr.length <= 1)
    {
      return null;
  }
    Arrays.sort(arr);
    for (int i = 0; i < arr.length - 1; i++){
      if (arr[i] != arr[i+1])
      {
    return arr[i+1];
      }
    }
      return null;
    //{3, 3, 3, 3, 3, }
  }

public static void main(String args[])
  {
    Integer[] arr = new Integer[] {5, 8, 3, 2, 6};
    System.out.println(findSecondSmallestItem(arr));

  Integer[] arr2 = new Integer[] {3, 8, 5, 2, 6};
    System.out.println(findSecondSmallestItem(arr2));

  Integer[] arr3 = new Integer[] {6, 8, 5, 2, 3};
    System.out.println(findSecondSmallestItem(arr3));

    Integer[] arr4 = new Integer[] {3, 3, 3, 3, 3};
    System.out.println(findSecondSmallestItem(arr4));

    Integer[] arr5 = new Integer[] {3, 3, 3, 2, 3};
    System.out.println(findSecondSmallestItem(arr5));
  
