package JavaEx_Certificate_808.ch2_Working_With_Java_Data_Types;

public class ex09 {

	static double dvalue;
	static ex09 ref;

	public static void main(String[] args) {
		System.out.println(ref);
		System.out.println(dvalue);
	}

}

/*
Given:

package p1;
 
public class Test {
 
    static double dvalue;
    static Test ref;
 
    public static void main(String[] args) {
        System.out.println(ref);
        System.out.println(dvalue);
    }
}
What is the result?

A.

p1.Test.class
0.0

B

0.000000
C.

null
0.0

D. Compilation fails
E. A NullPointerException is thrown at runtime



*/