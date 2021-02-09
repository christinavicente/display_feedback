package com.hcl.display_feedback.controllers;

import com.hcl.display_feedback.model.Feedback;
import com.hcl.display_feedback.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class feedbackController {
    @Autowired
    private FeedbackRepository repo;

    @PostMapping("/submittedfeedback")
    public Feedback addFeedback(RequestBody newFeedback){
        //TODO -add to repository
        return Feedback;
    }

    public Feedback showFeedBackByID(@PathVariable Integer id){
        //TODO retrieve from repository

        return Feedback;
    }

}
