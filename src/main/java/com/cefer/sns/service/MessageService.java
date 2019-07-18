package com.cefer.sns.service;

import com.cefer.sns.entity.Message;
import com.cefer.sns.mapper.MessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    @Autowired
    private MessageMapper messageMapper;

    public Message listMessage(int id){
        return messageMapper.listMessage(id);
    }

}
