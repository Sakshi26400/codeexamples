package com.test.qbank.service;

import java.util.List;

import com.test.qbank.Question;

public interface QBankService {
	public Integer addAQuestion(Question q);
	public Question fetchAQuestion(Integer Id);
	public Integer addAQuestionPaper(List<Question> questions);
	public Integer fetchAQuestionPaper(Integer Id);
	
}
