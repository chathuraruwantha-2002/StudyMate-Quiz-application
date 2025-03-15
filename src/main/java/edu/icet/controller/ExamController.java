package edu.icet.controller;

import edu.icet.dto.Exam;
import edu.icet.service.ExamService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exam")
@RequiredArgsConstructor
@CrossOrigin
public class ExamController {

    private final ExamService service;

    @PostMapping("/create-exam")
    public String createExam(@RequestBody Exam exam){
        return service.createExam(exam);
    }

    @GetMapping("/get-exam/{id}")
    public Exam getExam(@PathVariable("id") Integer id){
        return new Exam();
    }

    @PutMapping("/update-exam")
    public String updateExam(@RequestBody Exam exam){
        return "exam updated";
    }

    @DeleteMapping("/delete-exam/{id}")
    public String deleteExam(@PathVariable("id") Integer id){
        return "exam deleted";
    }

}
