package com.adrian.demo.controller;

import com.adrian.demo.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.*;

@RestController
public class BusinssController {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private Queue queue;

    @RequestMapping("/buyTicket")
    JsonResult buyTicket(@RequestParam("id") Long id){

        return new JsonResult("YOUR TICKET IS " + id);

    }

    @RequestMapping("/send")
    public void send(){
        jmsTemplate.send("sample.queue", new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                TextMessage textMessage = session.createTextMessage();
                textMessage.setText("send data");
                return textMessage;
            }
        });
    }
}
