public class Day7 {
   public static String lookAndSaySequence(int n) {
    if (n <= 0) {
        return "";
    }

    if (n == 1) {
        return "1";
    }

    return generateNextTerm(lookAndSaySequence(n - 1));
}

private static String generateNextTerm(String term) {
    StringBuilder nextTerm = new StringBuilder();
    int count = 1;
    char prevChar = term.charAt(0);

    for (int j = 1; j < term.length(); j++) {
        char currentChar = term.charAt(j);

        if (currentChar == prevChar) {
            count++;
        } else {
            nextTerm.append(count).append(prevChar);
            prevChar = currentChar;
            count = 1;
        }
    }

    nextTerm.append(count).append(prevChar);
    return nextTerm.toString();
}
}