package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; // 3-1=2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the reminder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        //result = result +1;
        result++;
        System.out.println("1 + 1 = " + result);

        result--; // 2-1=1
        System.out.println("2-1 = " + result);

        //result = result + 2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 =" + result);

        //result = result * 10;
        result *= 10; // 3 * 10 = 30;
        System.out.println("3 * 10 = " + result);

        //result = result / 3
        result /= 3; // 30 / 3 = 10;
        System.out.println("30 / 3 = " + result);

        //result = result - 2
        result -= 2; // 10 - 2 = 8;
        System.out.println("10 - 2 = " + result);

        result++;
        System.out.println("something = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an Alien!");
            System.out.println("And I am scared of aliens!");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }
        int secondTopScore = 90;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("greater than second top score and less than 100");
        } else if (topScore > secondTopScore && topScore == 100) {
            System.out.println("top score is :" + topScore);
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");

        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is True");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;

        if (wasCar) {
            System.out.println("wasCar is true");
        }

        int ageOfGirl = 16;
        boolean isEighteenOrOver = (ageOfGirl >= 18) ? true : false;

        if (isEighteenOrOver) {
            System.out.println("Age of girl is indeed : 18 or over");
        } else {
            System.out.println("The girl's age is: " + ageOfGirl + " ,she is not legal you pervert! GET OF HER!");
        }


    }
}
