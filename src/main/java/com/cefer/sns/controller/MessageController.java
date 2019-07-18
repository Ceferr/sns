package com.cefer.sns.controller;

import com.cefer.sns.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @RequestMapping("/listMessage/{id}")
    public String listMessage(@PathVariable int id){
        return messageService.listMessage(id).toString();
    }
}
