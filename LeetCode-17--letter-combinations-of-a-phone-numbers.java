class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> possibilities = new ArrayList<>();

        if (digits == null || digits.isEmpty()) {
            return possibilities;
        }

        List<List<String>> dialpad = Arrays.asList(
                Arrays.asList("a", "b", "c"),
                Arrays.asList("d", "e", "f"),
                Arrays.asList("g", "h", "i"),
                Arrays.asList("j", "k", "l"),
                Arrays.asList("m", "n", "o"),
                Arrays.asList("p", "q", "r", "s"),
                Arrays.asList("t", "u", "v"),
                Arrays.asList("w", "x", "y", "z")
        );

        possibilities.add(""); //have a 'nothing' to build off

        for (int i = 0; i < digits.length(); i++) {
            int num = digits.charAt(i) - '0';
            List<String> letters = dialpad.get(num - 2);

            List<String> newPossibilities = new ArrayList<>(); //to not change possibilities list while iterating through it

            for (String combo : possibilities) {
                for (String letter : letters) {
                    newPossibilities.add(combo + letter);
                }
            }
            possibilities = newPossibilities; //update possibilities after iterating
        }

        return possibilities;
    }
}
