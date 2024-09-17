package org.example;

//Step 1: Write code to output the current date and time.
//Step 2: Add a timespan of 2 weeks to the current date and output the new date.
//Step 3: Compare the current date with a specified future date and output whether the current date is before or after the specified date.
//Step 4: Calculate the difference in days between two arbitrary dates and output the result.

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        System.out.println(Instant.now());

        Instant nowTime = Instant.now();
        Instant nowPlusTwoWeeks = nowTime.plus(14, ChronoUnit.DAYS);
        System.out.println(nowPlusTwoWeeks);

        if (nowPlusTwoWeeks.compareTo(nowTime) < 0) {
            System.out.println(nowPlusTwoWeeks + " is before than " + nowTime);
        }
        else if (nowPlusTwoWeeks.compareTo(nowTime) > 0) {
            System.out.println(nowPlusTwoWeeks + " is after than " + nowTime);
        }
        else {
            System.out.println(nowPlusTwoWeeks + " is equal to " + nowTime);
        }

        System.out.println("The difference in days between " + nowPlusTwoWeeks + " and " + nowTime + " is " + ChronoUnit.DAYS.between(nowTime, nowPlusTwoWeeks));
    }
}