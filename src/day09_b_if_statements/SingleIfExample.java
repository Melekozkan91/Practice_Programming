package day09_b_if_statements;

public class SingleIfExample {
    //If condition is true print out  "Today is java day"
    public static void main(String[] args) {


        if (true) {
            System.out.println("Today is java day");

        }
        // mac number of day is feb 28
        int numberOfDay = 28;

        if (numberOfDay == 28) {

            System.out.println(" This month is february");
        }
        int quizRESULT = 50;
        int passRate = 40;
        if (quizRESULT >= passRate) {
            System.out.println("Passed the exam.");

        }
        if (quizRESULT < passRate) {
            System.out.println("Failing the exam");
        }
        int year = 2021;
        // if year is equal or bigger than 2020 and less than or equal to 2022 --- it is true
        boolean iscovidYears = year >= 2021 && year <= 2022; // year ==2021 ||year == 2022

        if (iscovidYears) {
            System.out.println("It was Covid a Covid year");
        }

    }

    }
