import java.util.Arrays;

public class ArrayCombinator {

    private String[][] combinations;

    public String[][] combinateStringArray(String[] stringArray){
        this.combinations = new String[stringArray.length][stringArray.length];

        for (int row = 0; row < stringArray.length; row++){

            String last = stringArray[stringArray.length - 1];

            for (int i = stringArray.length - 1; i > 0; i--) {
                stringArray[i] = stringArray[i - 1];
            }
            stringArray[0] = last;

            addCombinationToMatrixCombinations(stringArray, row);
        }
        sortCombinationsAlphabetically();
        return this.combinations;
    }

    private void addCombinationToMatrixCombinations(String[] combination, int rowNumber){
        System.arraycopy(combination, 0, this.combinations[rowNumber], 0, combination.length);
    }

    private void sortCombinationsAlphabetically() {
        Arrays.sort(this.combinations, (row1, row2) -> {
            String str1 = String.join(" ", row1);
            String str2 = String.join(" ", row2);
            return str1.compareToIgnoreCase(str2);
        });
    }


}
