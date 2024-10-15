package com.lucky.quizmicroservice.Repo;


import com.lucky.quizmicroservice.Models.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepo extends JpaRepository<Quiz, Integer> {


 }
