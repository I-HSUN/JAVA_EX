package ch9_Working_with_Selected_classes_from_the_Java_API;

public class ex02 {

	public static void main(String[] args) {
		String s = " Java Duke ";
		int len = s.trim().length();
		System.out.print(len);
	}

}
/*
Given:

public class MyClass {
 
    public static void main(String[] args) {
        String s = " Java Duke ";
        int len = s.trim().length();
        System.out.print(len);
    }
}

What is the result?

A. 8

B. 9

C. 11

D. 10

E. Compilation fails



*/