package JavaEx_Certificate_808.ch4_Using_Loop_Constructs;

public class ex18 {

	public static void main(String[] args) {
		String[] arr = {"A", "B", "C", "D"};
		for (int i = 0; i < arr.length; i++) {
		    System.out.print(arr[i] + " ");
		    if (arr[i].equals("C")) {
		        continue;
		    }
		    System.out.println("Work down");
		    break;
		}

	}

}
/*
Given the code fragment:

String[] arr = {"A", "B", "C", "D"};
for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
    if (arr[i].equals("C")) {
        continue;
    }
    System.out.println("Work down");
    break;
}
What is the result?

A.

A B C Work done

B.

A B C D Work done

C.

A Work done

D. Compilation fails



*/