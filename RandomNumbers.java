//Jasmine Baclig
//AP Computer Science A - Period 3
//September 14, 2020

import java.util.*;

public class RandomNumbers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //Challenge 1
    System.out.print("Type a negative number: ");
    int negNum = input.nextInt();
    System.out.print("Type a positive number that is greater than " + Math.abs(negNum) + ": ");
    int posNum = input.nextInt();

    int range = posNum - negNum;
    int randNum1 = (int) ((Math.random() * range) + negNum);
    int randNum2 = (int) ((Math.random() * range) + negNum);

    System.out.println("You got a " + randNum1 + " and a " + randNum2);

    //Challenge 2
    System.out.print("Write an adjective: ");
    String adj = input.nextLine();
    System.out.print("Write an integer: ");
    int num = input.nextInt();
    int days = num * 7;

    System.out.println("A vacation is when you take a trip to some " + adj + " place by yourself or with your family. My ideal vacation lasts for " + num + " weeks or about " + days + " days. I usually ");
  }
}