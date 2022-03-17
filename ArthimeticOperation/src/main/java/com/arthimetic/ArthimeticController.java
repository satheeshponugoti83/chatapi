package com.arthimetic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.arthimetic.service.IQuestionService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
@RequestMapping(value = "/v1/arthimetic")
public class ArthimeticController {
	@Autowired
	IQuestionService questionService;
	
    @RequestMapping(value = "/answer", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<Question> getAnswer(@RequestBody Question question) {
    	Question questionAnswer = questionService.getQuestionAndAnswer(question);
    	
    	return new ResponseEntity<Question>(questionAnswer, HttpStatus.OK);
	}
}
