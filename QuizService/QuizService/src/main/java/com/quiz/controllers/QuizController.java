package com.quiz.controllers;

import com.quiz.entities.Quiz;
import org.springframework.web.bind.annotation.*;
import services.QuizService;

import java.util.List;

@RestController

@RequestMapping
public class QuizController {
    private final QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }


    //create
    @PostMapping
    public Quiz create(@RequestBody Quiz quiz){
        return quizService.add(quiz);
    }

    //getAll
    @GetMapping
    public List<Quiz> get(){
        return quizService.get();
    }

    //get One
    @GetMapping("/{id}")
    public Quiz getOne(@PathVariable Long id){
        return quizService.get(id);
    }

}
