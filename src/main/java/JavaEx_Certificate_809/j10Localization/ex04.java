package j10Localization;



public class ex04 {

	public static void main(String[] args) {
		
		
	}

}
/*
Given the code fragment:

UnaryOperator<Integer> uo1 = s -> s * 2; //line n1
List<Double> loanValues = Arrays.asList(1000.0, 2000.0);
loanValues.stream()
        .filter(lv -> lv >= 1500)
        .map(lv -> uo1.apply(lv)) //line n2
        .forEach(s -> System.out.print(s + " "));
What is the result?

A. 4000.0
B. 4000
C. A compilation error occurs at line n1.
D. A compilation error occurs at line n2.



*/