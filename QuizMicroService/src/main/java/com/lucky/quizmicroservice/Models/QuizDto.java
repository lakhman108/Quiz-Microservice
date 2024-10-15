package com.lucky.quizmicroservice.Models;


import lombok.Data;


@Data
public class QuizDto {

    String title;
    Integer NoOfQ;
    String category;
}
