package com.example.demo.controller;

import com.example.demo.util.AiUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

import static java.awt.SystemColor.text;

@RestController
@CrossOrigin
public class AiController {
    @RequestMapping(value = "/img", method = RequestMethod.POST)
    public String img(@RequestParam("file") MultipartFile file) throws IOException {
        return AiUtils.img(file);
    }

    @RequestMapping(value = "/word", method = RequestMethod.POST)
    public String word(@RequestParam("file") MultipartFile file) throws IOException {
        return AiUtils.word(file);
    }

    @RequestMapping(value = "/nlp",method = RequestMethod.GET)
    public String nlp(@RequestParam("text") String text){
        return AiUtils.nlp(text);

    }
}
