import java.util.Comparator;

public class CustomComparator implements Comparator<String[]> {

    @Override
    public int compare(String[] o1, String[] o2) {
        int resultByName = o1[0].compareTo(o2[0]);
        int resultBySurname = o1[1].compareTo(o2[1]);
        return resultByName == 0 ? resultBySurname : resultByName;
    }
}
