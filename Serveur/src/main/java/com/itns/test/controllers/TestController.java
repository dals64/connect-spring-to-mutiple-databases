package com.itns.test.controllers;

import com.itns.test.models.First;
import com.itns.test.models.ResponseMessage;
import com.itns.test.models.Second;
import com.itns.test.repositories.primary.FirstRepository;
import com.itns.test.repositories.secondary.SecondRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/test")
public class TestController {
    @Autowired
    FirstRepository firstRepository;

    @Autowired
    SecondRepository secondRepository;

    @GetMapping("/first/{name}")
    public ResponseEntity<?> saveFirst(@PathVariable String name) {
        firstRepository.save(new First(name));
        return ResponseEntity.ok(new ResponseMessage("créé"));
    }

    @GetMapping("/second/{name}")
    public ResponseEntity<?> saveSecond(@PathVariable String name) {
        secondRepository.save(new Second(name));
        return ResponseEntity.ok(new ResponseMessage("créé"));
    }
}
