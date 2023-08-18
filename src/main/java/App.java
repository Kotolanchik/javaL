import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("solution.isMatch(\"aa\",\"aa\") = " + solution.isMatch("aa", "aa"));
        System.out.println("solution.isMatch(\"aa\", \"??\") = " + solution.isMatch("aa", "??"));
        System.out.println("solution.isMatch(\"aa\", \"**\") = " + solution.isMatch("aa", "**"));
        System.out.println("solution.isMatch(\"aa\", \"*\") = " + solution.isMatch("aa", "*"));
        System.out.println("solution.isMatch(\"aad\", \"*d\") = " + solution.isMatch("aad", "*d"));
        System.out.println("solution.isMatch(\"aaabbbaabaaaaababaabaaabbabbbbbbbbaabababbabbbaaaaba\", \"a**b\") = " + solution.isMatch("aaabbbaabaaaaababaabaaabbabbbbbbbbaabababbabbbaaaaba", "a*******b"));
        System.out.println("solution.isMatch(\"\", \"*****\") = " + solution.isMatch("", "*****"));
        System.out.println("solution.isMatch(\"abcabczzzde\", \"*abc???de*\") = "
                + solution.isMatch("abcabczzzde", "*abc???de*"));
    }
}
