package finalkeyword;
/*
 * We can declare a variable, method and class as final
 * if we declare a variable as final then we can't change it's value (for constant values)
 * if we declare a method as final we can't override that method in child class
 * if we declare a class as final we can't create child classes to that class but
 * it can have a parent
 */

public class FinalKeywordDemo {
	public static void main(String[] args) {
		FinalMethodParent fp = new FinalMethodChild();
		fp.methodOne();
		fp.methodTwo();
	}
}
