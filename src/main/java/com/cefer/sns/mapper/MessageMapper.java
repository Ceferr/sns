package com.cefer.sns.mapper;

import com.cefer.sns.entity.Message;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageMapper {
    Message listMessage(int id);
}
