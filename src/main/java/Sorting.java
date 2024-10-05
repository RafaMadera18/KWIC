import java.util.Arrays;

public class Sorting extends Filter<String[][], String[][]> {

    private String[][] sortCombinationsAlphabetically(String[][] combinations) {
        Arrays.sort(combinations, (row1, row2) -> {
            String str1 = String.join(" ", row1);
            String str2 = String.join(" ", row2);
            return str1.compareToIgnoreCase(str2);
        });
        return combinations;
    }

    @Override
    protected String[][] run(String[][] combinations) {
        return sortCombinationsAlphabetically(combinations);
    }
}
