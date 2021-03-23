package com.golabek.campaignapp.web;

import com.golabek.campaignapp.model.Keyword;
import com.golabek.campaignapp.service.KeywordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class KeywordController {

    @Autowired
    KeywordService keywordService;

    @GetMapping("/keyword/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) throws Exception {
        Keyword keyword = keywordService.findById(id);
        return new ResponseEntity<Keyword>(keyword, HttpStatus.OK);
    }

    @GetMapping("/keyword/getAll")
    public ResponseEntity<?> getAll()
    { List<Keyword> sellers = keywordService.getAll();
        return new ResponseEntity<List<Keyword>>(sellers, HttpStatus.OK);
    }
}
