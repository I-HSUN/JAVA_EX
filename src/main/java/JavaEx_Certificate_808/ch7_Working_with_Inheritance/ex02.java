package JavaEx_Certificate_808.ch7_Working_with_Inheritance;

public class ex02 {

	public static void main(String[] args) {

	}

}
/*
Given:

Acc.java
package p1;
 
public class Acc {
 
    int p;
    private int q;
    protected int r;
    public int s;
}
Test.java
package p2;
 
import p1.Acc;
 
public class Test extends Acc {
 
    public static void main(String[] args) {
        Acc obj = new Test();
    }
}
Which statement is true?

A. Both p and s are accessible by obj.
B. Only s is accessible by obj.
C. Both r and s are accessible by obj.
D. p, r, and s are accessible by obj.




*/