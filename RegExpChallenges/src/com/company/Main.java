package com.company;

import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String challenge1 = "I want a bike.";
        System.out.println(challenge1.matches("I want a bike."));

        System.out.println("========================================================");

        String regExp = "I want a \\w+.";
        String challenge2 = "I want a ball.";
        System.out.println(challenge1.matches(regExp));
        System.out.println(challenge2.matches(regExp));
        String regExp2 = "I want a (bike|ball).";
        System.out.println(challenge1.matches(regExp2));
        System.out.println(challenge2.matches(regExp2));

        System.out.println("========================================================");

        String regExp3 = "I want a \\w+.";
        Pattern pattern = Pattern.compile(regExp3);
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());

        matcher = pattern.matcher(challenge2);
        System.out.println(matcher.matches());

        System.out.println("========================================================");

        String challenge4 = "Replace all blanks with underscores.";
        System.out.println(challenge4.replaceAll(" ", "_"));
        System.out.println(challenge4.replaceAll("\\s", "_"));

        System.out.println("========================================================");

        String challenge5 = "aaabccccccccdddefffg";
        System.out.println(challenge5.matches("[abcdefg]+"));
        System.out.println(challenge5.matches("[a-g]+"));

        System.out.println("========================================================");

        System.out.println(challenge5.matches("^a{3}bc{8}d{3}ef{3}g$"));
        System.out.println(challenge5.replaceAll("^a{3}bc{8}d{3}ef{3}g$", "REPLACED"));

        System.out.println("========================================================");

        String challenge7 = "abcd.135";
        System.out.println(challenge7.matches("^[A-z][a-z]+\\.+\\d+$"));

        System.out.println("========================================================");

        String challenge8 = "abcd.135uvqz.7tzik.999";
        Pattern pattern8 = Pattern.compile("[A-Za-z]+\\.(\\d+)");
        Matcher matcher8 = pattern8.matcher(challenge8);
        while (matcher8.find()) {
            System.out.println("Occurrence: " + matcher8.group(1));
        }

        System.out.println("========================================================");

        String challenge9 = "abcd.135\tuvqz.7\ttzik.999\n";

        Pattern pattern9 = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
        Matcher matcher9 = pattern9.matcher(challenge9);
        while (matcher9.find()) {
            System.out.println("Occurrence: " + matcher9.group(1));
        }

        System.out.println("========================================================");

        String challenge10 = "abcd.135\tuvqz.7\ttzik.999\n";

        Pattern pattern10 = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
        Matcher matcher10 = pattern10.matcher(challenge10);
        while (matcher10.find()) {
            System.out.println("Occurrence: start = " + matcher10.start(1) + " end = " + (matcher10.end(1) - 1));
        }

        System.out.println("========================================================");

        String challenge11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
        Pattern pattern11 = Pattern.compile("\\{(.+?)\\}");
        Matcher matcher11 = pattern11.matcher(challenge11);
        while (matcher11.find()) {
            System.out.println("Occurrence: " + matcher11.group(1));
        }

        System.out.println();
        String challenge11a = "{0, 2}, {0, 5}, {1, 3}, {2, 4}, {x, y}, {6, 34}, {11, 12}";
        Pattern pattern11a = Pattern.compile("\\{(\\d+, \\d+)\\}");
        Matcher matcher11a = pattern11a.matcher(challenge11a);
        while (matcher11a.find()) {
            System.out.println("Occurrence: " + matcher11a.group(1));
        }

        System.out.println("========================================================");

        String challenge12 = "11111"; // supposedly US zip code
        System.out.println(challenge12.matches("^\\d{5}$"));

        System.out.println("========================================================");

        String challenge13 = "11111-1111"; // supposedly another kind of US zip code
        System.out.println(challenge13.matches("^\\d{5}-\\d{4}$"));

        System.out.println("========================================================");

        String challenge14a = "11111";
        String challenge14b = "11111-1111";
        System.out.println(challenge14a.matches("^\\d{5}(-\\d{4})?$"));
        System.out.println(challenge14b.matches("^\\d{5}(-\\d{4})?$"));

        System.out.println("========================================================");
    }
}
