public class Output {

    private void printCombinations(String[][] combinations){
        for (String[] combination : combinations) {
            for (int j = 0; j < combinations.length; j++) {
                System.out.print(combination[j] + " ");
            }
            System.out.println();
        }
    }

    public void execute(String[][] combinations) {
        printCombinations(combinations);
    }
}
