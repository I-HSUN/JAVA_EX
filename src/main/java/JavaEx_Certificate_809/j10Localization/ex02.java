package j10Localization;

import java.util.function.Supplier;

public class ex02 {

	public static void main(String[] args) {
		 

	}
	

}

/*
Given:

class Bird {
 
    public void fly() {
        System.out.print("Can fly");
    }
}
 
class Penguin extends Bird {
 
    public void fly() {
        System.out.print("Cannot fly");
    }
}
and the code fragment:


class Birdie {

    public static void main(String[] args) {
        fly(() -> new Bird());
        fly(Penguin::new);
    }
     --->line n1 
}


Which code fragment, when inserted at line n1, enables the Birdie class to compile?

A.
static void fly (Consumer<Bird> bird) {
    bird::fly();
}


B.
static void fly (Consumer<? extends Bird> bird) {
    bird.accept().fly();
}

C.
static void fly (Supplier<Bird> bird) {
    bird.get().fly();
}

D.
static void fly (Supplier<? extends Bird> bird) {
    bird::fly();
}


*/