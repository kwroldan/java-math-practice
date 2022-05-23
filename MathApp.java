import java.util.Random;
public class MathApp {
  public static void main(String[] args) {  
    //1
    int job1Salary = 45_000;
    int job2Salary = 55_000;
    System.out.println(Math.max(job1Salary, job2Salary));
    //2
    int carPrice = 21_945;
    int truckPrice = 55_945;
    System.out.println(Math.min(carPrice, truckPrice));
    //3
    double pi = 3.14;
    double areaOfCircle = pi * Math.pow(7.25, 2);
    System.out.println(areaOfCircle);
    //4
    int num1 = 5;
    System.out.println(Math.sqrt(num1));
    //5
    int differenceOfX = 85 - 5;
    int differenceOfY = 50 - 10;
    System.out.println(Math.sqrt(Math.pow(differenceOfX, 2) + Math.pow(differenceOfY, 2)));
    //6
    double num2 = -3.8;
    System.out.println(Math.abs(num2));
    //7
    double rand = Math.random() * 1;
    System.out.println(rand);
  }
}
