import java.lang.*;
class Main {
  public static void main(String[] args) {
    //part 1
    boolean assertTest = true;
    System.out.println("The Assert statement is true");
    assert assertTest;
    assertTest = false;
    System.out.println("The assert statement is false");
    assert assertTest;
//part 2 (#9)
int x = 10;
assert x>9;
System.out.println("if you're here, the assert passed.");
assert x<9;
System.out.println("if you're here, the second assert passed.");
  }
}