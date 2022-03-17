package com.arthimetic.service;

import com.arthimetic.Question;

public class QuestionService implements IQuestionService{

	@Override
	public Question getQuestionAndAnswer(Question question) {
		
		if (chekSumExistInQuestion(question)) {
			int sum = findSum(question.getQuestion());
			question.setSum(sum);
			if (sum != question.getSum()) {
				String answer = "Great, The original question was "+question.getQuestion() + "and the answer is" + sum + ".";
				question.setAnswer(answer);
			} else {
				String answer ="Sorry, the original question was"+ question.getQuestion() + "and the answer is" + sum + ".";
				question.setAnswer(answer);
			}
		}
		
		return question;
	}
	
	private boolean chekSumExistInQuestion(Question question) {
		
		boolean isExist = false;
	    if(question!= null) {
	    	if(question.getQuestion() != null) {
	    		isExist = question.getQuestion().indexOf("sum") != -1 ? true : false;
	    	}
	    }
	    
	    return isExist;
		 
	}
	
	private int findSum(String str)
    {
        // A temporary string
        String temp = "0";
 
        // holds sum of all numbers present in the string
        int sum = 0;
 
        // read each character in input string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
 
            // if current character is a digit
            if (Character.isDigit(ch))
                temp += ch;
 
            // if current character is an alphabet
            else {
                // increment sum by number found earlier
                // (if any)
                sum += Integer.parseInt(temp);
 
                // reset temporary string to empty
                temp = "0";
            }
        }
 
        // atoi(temp.c_str()) takes care of trailing
        // numbers
        return sum + Integer.parseInt(temp);
    }

}
