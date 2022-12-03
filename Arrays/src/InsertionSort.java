import java.util.Arrays;



public class InsertionSort
{
    public static void main(String[] args)
    {
        int [] randomorder=getRandomArray(9);
        System.out.println("random integer array before sorting : "+ Arrays.toString(randomorder));
        insertionSort(randomorder);
        System.out.println("sorted array using insertion sort : "+Arrays.toString(randomorder));

        randomorder=getRandomArray(7);
        System.out.println("before Sorting : "+Arrays.toString(randomorder));
        insertionSort(randomorder);
        System.out.println("After Sroting : "+Arrays.toString(randomorder));
        String [] cities={"india","chaina","korien","malesiya","dubai"};
        System.out.println("string array before sorting : "+Arrays.toString(cities));
        insertionSort(cities);
        System.out.println("String array after sorting : "+Arrays.toString(cities));
    }
    private static int[] getRandomArray(int length)
    {
        int [] numbers=new int[length];
        for(int i=0;i<length;i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        return numbers;
    }
    public static void insertionSort(int [] array)
    {
        for (int i=1;i<array.length;i++)
        {
            int numberToInsert=array[i];
            int compereIndex=i;
            while(compereIndex>0&&array[compereIndex-1]>numberToInsert)
            {
                array[compereIndex]=array[compereIndex-1];
                compereIndex--;
            }
            array[compereIndex]=numberToInsert;
        }
    }
    public static void insertionSort(Comparable[]objArray)
    {
        for(int i=1;i<objArray.length;i++)
        {
            Comparable objectToStort=objArray[i];

            int j=i;
            while(j>0&&objArray[j-1].compareTo(objectToStort)>1)
            {
                objArray[j]=objArray[j-1];
                j--;
            }
            objArray[j]=objectToStort;
        }
    }

}


