public class BSNonRercusive
{
    public static int binarySearch(int[] array, int value)
    {
        int low = 0, high = array.length - 1;
        while (low <= high)
        {
            int mid = (low + high) / 2;
            if (array[mid] == value)
            {
                return mid;
            }
            else if (array[mid] < value)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] array = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

        int searchResult = binarySearch(array,59);

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