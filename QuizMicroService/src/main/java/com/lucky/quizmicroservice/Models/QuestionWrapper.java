package com.lucky.quizmicroservice.Models;


import lombok.Data;

@Data
public class QuestionWrapper {

    private Integer id;
    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;

    private String difficultyLevel;
    private String category;
}
