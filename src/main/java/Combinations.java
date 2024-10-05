public class Combinations extends Filter<String[], String[][]> {

    private String[][] combinations;

    private String[][] combinateArray(String[] stringArray){
        this.combinations = new String[stringArray.length][stringArray.length];

        for (int row = 0; row < stringArray.length; row++){

            String last = stringArray[stringArray.length - 1];

            for (int i = stringArray.length - 1; i > 0; i--) {
                stringArray[i] = stringArray[i - 1];
            }
            stringArray[0] = last;

            addCombinationToMatrixCombinations(stringArray, row);
        }
        return this.combinations;
    }

    private void addCombinationToMatrixCombinations(String[] combination, int rowNumber){
        System.arraycopy(combination, 0, this.combinations[rowNumber], 0, combination.length);
    }


    @Override
    protected String[][] run(String[] strings) {
        return combinateArray(strings);
    }
}
