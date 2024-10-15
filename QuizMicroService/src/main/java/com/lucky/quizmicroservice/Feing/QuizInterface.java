package com.lucky.quizmicroservice.Feing;

import com.lucky.quizmicroservice.Models.Question;
import com.lucky.quizmicroservice.Models.QuestionWrapper;
import com.lucky.quizmicroservice.Models.ResponseAns;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "QuestionMicroservice")
public interface QuizInterface {





    @GetMapping("question/generate/{category}/{noOfQue}")
    public List<Integer> getQuestionsOfQuiz(@PathVariable String category,@PathVariable Integer noOfQue);

    @PostMapping("question/getQuestions")
    public List<QuestionWrapper> getQuestionsFromId(@RequestBody List<Integer> que);


    @PostMapping("question/calculateresult")
    public Integer getQuizResult(@RequestBody List<ResponseAns> que);
}
