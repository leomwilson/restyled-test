import java.util.ArrayList; // out of alphebetical order (3.3.3)

import java.io.File; // no newlines between nonstatic imports (3.3.3)
import javax.swing.*; // no wildcard imports (3.3.1)

package googlejava; // package should be the first statement (3)

public class Test { // should have a javadoc (7.3)
  public Test(int a) {
    // first constructor
  }
  public void doSomething() { // should also have a javadoc (7.3)
    // overloaded methods/constructors should be together (3.4.2.1)
  }
  public Test(int a, int b) {
    // second constructor
  }
  public int doOtherThings() { // there should be a newline before this method (4.6.1) and a javadoc (7.3)
    if (true) // should have braces (4.1.1)
      System.out.println("indeed");
    while (false)
    {
      // K&R braces (4.1.2)
    }
    if (false) {
      System.out.println("	"); // tabs should be escaped (2.3.1)
    }
    else {
      // no newline between parts of multiblock statements (4.1.2)
        System.out.println("2 space indents (4.2)");
	System.out.println("Here's an illegal tab indent (4.2)");
    }
    try {
      doSomething();
    } catch (Exception e) {} // no concise empty parts of multiblock statements (4.1.3)
    System.out.println("Only one statement per line"); System.out.println("(4.3)");
    System.out.println("this line is longer than 100 characters 012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789"); // (4.4)
    System.out.
        println("Should break before the symbol"); // (4.5.1)
    System.out
      .println("Should be indented by 4 spaces"); // (4.5.2)
    if(false) { // there should be a space between if and ( (4.6.2)
      return 1;
    } else{ // space before brace (4.6.2)
      return (true?2:3); // there should be some spaces here (4.6.2)
    }
    return 0;
  }

  public void someOtherMethod() {
    int c, d; // should be declared seperately (4.8.2.1)
    int e = 5; // not used until later (4.8.2.2)
    System.out.println("some random code");
    system.out.println(e * 5 + 6 + 7 * 8 - 9); // should have grouping parentheses (4.7)
    int f[] = new int[7]; // should be int[] f (4.8.3.2)
    switch (e) {
      case 0: // this is ok (4.8.4.2)
      case 1:
	System.out.println("There should be a comment denoting fall through (4.8.4.2)");
      case 2:
	System.out.println(e);
      break; // Bad indentation (4.8.4.1)
      default:
	System.out.println("This is ok (4.8.4.2)");
    }
    switch (e) {
      case 3:
	System.out.println("do something");
	break;
      case 4:
      case 5:
	System.out.println("do something else");
	// there should be a default here (4.8.4.3)
    }
    /*
    * Bad alignment of
    * asterisks in multiline
    * comments (4.8.6.1)
    */
    long g = 35l; // should be 35L (4.8.8)
  }

  static final double pi = 3.14159; // should be PI (5.2.4)
  static final String[] LEGIT_CONSTANT = {"mutable", "Strings"}; // should be legitConstant (5.2.4)
  
  private int SpeedOfLight = 299_792_458; // should be speedOfLight (5.2.5)

  /** Just some random code */
  public void execute_some_code() { // should be executeSomeCode() (5.2.3)
    int SomeNumber = 9; // should be someNumber (5.2.7)
    try {
      System.out.println(1 / 0);
    } catch (Exception e) {
    } // do not ignore errors (6.2)
  }

  /** Returns the speed of light */
  public int getSpeedOfLight() { // superfluous and unnecessary javadoc (7.3.1)
    return SpeedOfLight; // use an improperly named variable (5.2.5)
  }
}
