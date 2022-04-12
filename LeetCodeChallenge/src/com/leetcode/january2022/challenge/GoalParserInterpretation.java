package com.leetcode.january2022.challenge;

public class GoalParserInterpretation {
	
	
	public String interpret(String command) {
		int i=0;
		while (i < command.length()) {
			if (command.charAt(i)=='G') {
				i++;
				continue;
			}
			if (command.charAt(i)=='(' && command.charAt(i+1)==')') {
				command= command.substring(0,i)+'o'+command.substring(i+2);
				i++;
				continue;
				
			}
			if (command.charAt(i)=='(' && command.charAt(i+1)=='a') {
				command=command.substring(0,i)+"al"+command.substring(i+4);
				i+=2;
			}
		}
		
		return command;
        
    }

	public static void main(String[] args) {
		String command = "G()(al)";
		GoalParserInterpretation goalParserInterpretation = new GoalParserInterpretation();
		command= goalParserInterpretation.interpret(command);
		System.out.println(command);
	}

}
