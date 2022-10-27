package org.example.controller;

import com.google.gson.Gson;
import org.example.dao.NeoMapMapper;
import org.example.dto.NeoMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class HomeController {

    @Autowired
    private NeoMapMapper neoMapMapper;

    @GetMapping(value = "1")
    public ResponseEntity<String> displayWelcomeMessage() {
        List<NeoMap> list = neoMapMapper.listAll();
        return new ResponseEntity<>(new Gson().toJson(list), HttpStatus.OK);
    }

    @GetMapping(value = "2")
    @ResponseBody
    public String test() {
        return "123123123";
    }
}
