package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String string = "I am a string. Yes, I am.";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(alphanumeric.replaceAll(".", "Y")); // . matches any character
        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY")); // ^ looks at the start

        String secondString = "abcDeeeF12GhhabcDeeeiiiijkl99z";
        System.out.println(secondString.replaceAll("^abcDeee", "YYY")); // ^ looks at the start

        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abcDeee"));
        System.out.println(alphanumeric.matches("abcDeeeF12Ghhiiiijkl99z"));

        System.out.println(alphanumeric.replaceAll("iijkl99z$", "THE END")); // $ looks at the end
        System.out.println(alphanumeric.replaceAll("[aei]", "X")); // replaces all occurrences of individual letters of a e i
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X")); // replaces all occurrences of individual letters of a e i that are followed by F or j


        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));

        String newAlphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(newAlphanumeric.replaceAll("[^ej]", "X")); // ^ negates the pattern if used in [], selects all other characters other than ej
        System.out.println(newAlphanumeric.replaceAll("[abcdef345678]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[a-fA-F3-8]", "X"));
        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-8]", "X")); // (?i) ignores case sensitivity
        System.out.println(newAlphanumeric.replaceAll("[0-9]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[\\d]", "X")); // \d matches any digit
        System.out.println(newAlphanumeric.replaceAll("[\\D]", "X")); // \D matches all non digits

        System.out.println("=====================================================");
        String hasWhitespace = "I have blanks and\ta tab, and also a newline\n";
        System.out.println(hasWhitespace);
        System.out.println(hasWhitespace.replaceAll("\\s", "")); // \s matches all spaces
        System.out.println(hasWhitespace.replaceAll("\\t", "X")); // \t matches all tabs
        System.out.println(hasWhitespace.replaceAll("\\S", "X")); // \S matches all non spaces

        System.out.println(newAlphanumeric.replaceAll("\\w", "X")); // \w matches a-z 0-9 _
        System.out.println(hasWhitespace.replaceAll("\\w", "X")); // \w matches a-z 0-9 _
        System.out.println(hasWhitespace.replaceAll("\\b", "X")); // \b matches word boundaries

        System.out.println("=====================================================================");

        String thirdAlphanumericString = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe{3}", "YYY")); // {3} indicates number of preceding number to match
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe+", "YYY")); // + means we don't care how many 1 or more e there are
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe*", "YYY")); // * means we don't care how many e are there
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe{2,5}", "YYY")); // needs to have at least 2 but not more than 5 e
        System.out.println(thirdAlphanumericString.replaceAll("h+i*j", "Y")); // we want to find h followed by any amount of i followed by j

        System.out.println("=====================================================================");

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something/</p>");
        htmlText.append("<p>This is a another paragraph about something else/</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary./</p>");

        String h2Pattern = ".*<h2>.*"; // .* matches 0 or more (any) characters
//        Pattern pattern = Pattern.compile(h2Pattern, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Pattern pattern = Pattern.compile(h2Pattern, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

    }
}
