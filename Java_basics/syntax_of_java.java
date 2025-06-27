long myNum = 15000000000L;
System.out.println(myNum);
float myNum = 5.75f;
System.out.println(myNum);
double myNum = 19.99d;
System.out.println(myNum);

float f1 = 35e3f;
double d1 = 12E4d;
System.out.println(f1);
System.out.println(d1);

String firstName = "John ";
String lastName = "Doe";
System.out.println(firstName.concat(lastName));

// Java uses the + operator for both addition and concatenation.
// Numbers are added. Strings are concatenated.
String x = "10";
String y = "20";
String z = x + y;  // z will be 1020 (a String)
String x = "10";
int y = 20;
String z = x + y;  // z will be 1020 (a String)

// The backslash (\) escape character turns special characters into string characters:
String txt = "We are the so-called \"Vikings\" from the north."

// Math.random() returns a random double between 0 (inclusive) and 1 (exclusive).
Math.random();
int randomNum = (int)(Math.random() * 101);  // 0 to 100
Math.max(5, 10);

String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}

int[] myNum = {10, 20, 30, 40};

int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
System.out.println(myNumbers[1][2]); // Outputs 7

// Throw an exception if age is below 18 (print "Access denied"). If age is 18 or older, print "Access granted":
public class Main {
  static void checkAge(int age) {
    if (age < 18) {
      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
    }
    else {
      System.out.println("Access granted - You are old enough!");
    }
  }

  public static void main(String[] args) {
    checkAge(15); // Set age to 15 (which is below 18...)
  }
}