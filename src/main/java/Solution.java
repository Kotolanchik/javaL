import java.util.Stack;

public class Solution {
    // * ?
    public boolean isMatch(String s, String p) {
        int i = 0, j = 0; // Инициализируем указатели для строк s и p.
        int sStar = -1, pStar = -1; // Инициализируем переменные для хранения позиций звездочек '*'.

        while (i < s.length()) { // Проходим по строке s.
            if (j < p.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?')) {
                // Если символы s и p совпадают или в p на месте j стоит '?',
                // переходим к следующим символам в обеих строках.
                i++;
                j++;
            } else if (j < p.length() && p.charAt(j) == '*') {
                // Если в p на месте j стоит '*', запоминаем позиции звездочки
                // и переходим к следующему символу в p.
                sStar = i;
                pStar = j;
                j++;
            } else if (pStar != -1) {
                // Если позиция звездочки '*' в p уже была найдена,
                // смещаем указатель i в строке s на следующий символ после
                // позиции звездочки, и j в строке p на символ после '*'.
                sStar++;
                i = sStar;
                j = pStar + 1;
            } else {
                // Если ни одно из условий не сработало, возвращаем false,
                // так как символы не совпадают.
                return false;
            }
        }

        while (j < p.length() && p.charAt(j) == '*') {
            // Пропускаем все оставшиеся звездочки в конце строки p.
            j++;
        }

        // Если указатель j дошел до конца строки p, значит, все символы совпали.
        return j == p.length();
    }



    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(': {
                    stack.push(')');
                    break;
                }
                case '{': {
                    stack.push('}');
                    break;
                }
                case '[': {
                    stack.push(']');
                    break;
                }
                default: {
                    if (stack.isEmpty() || stack.pop() != c) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}