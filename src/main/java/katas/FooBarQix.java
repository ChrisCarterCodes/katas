package katas;

public class FooBarQix {

	public String compute(String input) {
		int inputAsInt= Integer.parseInt(input);
		String outputString = input;
		if(inputAsInt % 3 == 0) {
			outputString = outputString.replaceAll("[0-9]", "") + "Foo";
		}
		if(inputAsInt % 5 == 0) {
			outputString = outputString.replaceAll("[0-9]", "") + "Bar";
		}
		if(inputAsInt % 7 == 0) {
			outputString = outputString.replaceAll("[0-9]", "") + "Qix";
		}
		if (input.contains("3")) {
			outputString = outputString.replace("3", "") + "Foo";
		}
		if (input.contains("5")) {
			outputString = outputString.replace("5", "") + "Bar";
		}
		if (input.contains("7")) {
			outputString = outputString.replace("7", "") + "Qix";
		}
		return outputString;
	}
}
