package com.lucky.quizmicroservice.Servies;



import com.lucky.quizmicroservice.Feing.QuizInterface;
import com.lucky.quizmicroservice.Models.Question;
import com.lucky.quizmicroservice.Models.QuestionWrapper;
import com.lucky.quizmicroservice.Models.Quiz;
import com.lucky.quizmicroservice.Repo.QuizRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

//    @Autowired
//
//    private QuestionRepo questionRepo;

    @Autowired
    private QuizRepo quizRepo;


    @Autowired
     QuizInterface quizInterface;

    public Quiz createQuiz(String title, String category, Integer noofQuestions) {

        Quiz quiz=new Quiz();
List<Integer> questions=quizInterface.getQuestionsOfQuiz(category,noofQuestions);
quiz.setTitle(title);
quiz.setQuestionIds(questions);

        quizRepo.save(quiz);


        return quiz;
    }

    public List<QuestionWrapper> getQuestions(Integer id){
        Optional<Quiz> quiz=quizRepo.findById(id);

        List<QuestionWrapper> questionWrappers=quizInterface.getQuestionsFromId(quiz.get().getQuestionIds());


        return questionWrappers;
    }
}
