package com.lucky.quizmicroservice;


import com.lucky.quizmicroservice.Models.QuestionWrapper;
import com.lucky.quizmicroservice.Models.Quiz;
import com.lucky.quizmicroservice.Models.QuizDto;
import com.lucky.quizmicroservice.Servies.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quiz/")
public class QuizController {

    @Autowired
        private QuizService quizService;


    @PostMapping("create")
    public Quiz GenerateQuiz(@RequestBody QuizDto quizDto){


        System.out.println(quizDto.getTitle());
        System.out.println(quizDto.getCategory());
        System.out.println(quizDto.getNoOfQ());

        return quizService.createQuiz(quizDto.getTitle(),quizDto.getCategory(),quizDto.getNoOfQ());
    }

    @GetMapping("get/{id}")
    public List<QuestionWrapper> getQuestions(@PathVariable Integer id){
        return quizService.getQuestions(id);

    }
}
