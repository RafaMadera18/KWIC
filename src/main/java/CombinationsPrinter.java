public class CombinationsPrinter {

    public void printCombinations(String[][] combinations){
        for (String[] combination : combinations) {
            for (int j = 0; j < combinations.length; j++) {
                System.out.print(combination[j] + " ");
            }
            System.out.println();
        }
    }
}
