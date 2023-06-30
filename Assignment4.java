import java.util.ArrayList;
import java.util.List;

public class Assignment4 {
    public static int[] findCommon(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> common = new ArrayList<>();

        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                common.add(arr1[i]);
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }

        int[] result = new int[common.size()];
        for (int idx = 0; idx < common.size(); idx++) {
            result[idx] = common.get(idx);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 5, 7, 9};
        int[] arr3 = {1, 3, 4, 5, 8};

        int[] commonIntegers = findCommon(arr1, arr2, arr3);
        System.out.print("Common Integers: ");
        for (int num : commonIntegers) {
            System.out.print(num + " ");
        }
    }
}
