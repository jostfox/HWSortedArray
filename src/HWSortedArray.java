import java.util.Arrays;

public class HWSortedArray {

    public static void main(String[] args) {

        String[][] staffArray = {{"Christian", "Novikov"},
                                 {"Daniil", "Bekker"},
                                 {"Christian", "Schultz"},
                                 {"Hellen", "Jungerhans"},
                                 {"Daniil", "Hefel"}};

        System.out.println("Unsorted array.\n=========================");
        System.out.println(Arrays.deepToString(staffArray));
        System.out.println();

        Arrays.sort(staffArray, new CustomComparator());

        System.out.println("Sorted array.\n=========================");
        System.out.println(Arrays.deepToString(staffArray));
    }
}



