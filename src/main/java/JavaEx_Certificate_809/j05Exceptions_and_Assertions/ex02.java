package j05Exceptions_and_Assertions;

public class ex02 {
	public static void main(String[] args) {
		int a = 10;
		int b = -1;
		assert (b >= 1) : "Invalid Denominator";
		int c = a / b;
		System.out.println(c);
	}

}
/*
Given:
public class Counter {
 
    public static void main(String[] args) {
        int a = 10;
        int b = -1;
        assert (b >= 1) : "Invalid Denominator";
        int c = a / b;
        System.out.println(c);
    }
}
What is the result of running the code with the -ea option?

A.

-10

B.

0

C. An AssertionError is thrown.
D. A compilation error occurs.


*/