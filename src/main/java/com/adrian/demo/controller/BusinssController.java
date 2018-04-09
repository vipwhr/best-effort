package com.adrian.demo.controller;

import com.adrian.demo.service.BusinessService;
import com.adrian.demo.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;

@RestController
public class BusinssController {

    @Autowired
    private BusinessService businessService;

    @Autowired
    private Queue queue;

    @RequestMapping("/buyTicket")
    JsonResult buyTicket(@RequestParam("id") Long id){

        return new JsonResult("YOUR TICKET IS " + id);

    }

    @RequestMapping("/send")
    public void send(){
        businessService.localBusiness();
    }
}
