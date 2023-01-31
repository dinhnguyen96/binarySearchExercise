public class BSRercusive {

    public static int binarySearch(int[] array,int low, int high, int value)
    {
        if (low <= high)
        {
            int mid = (low + high) / 2;
            if (array[mid] == value)
            {
                return mid;
            }
            else if (array[mid] < value)
            {
                return binarySearch(array,mid + 1, high, value);
            }
            else
            {
                return binarySearch(array, low,mid - 1, value);
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] array = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

        int searchResult = binarySearch(array,0, array.length-1, 45);

        if (searchResult == -1)
        {
            System.out.println("Không tìm thấy phần tử");
        }
        else
        {
            System.out.printf("Vị trí phần tử : %d", searchResult);
        }
    }
}
