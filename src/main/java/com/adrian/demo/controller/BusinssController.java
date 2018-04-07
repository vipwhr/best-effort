package com.adrian.demo.controller;

import com.adrian.demo.utils.JsonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinssController {

    @RequestMapping("/buyTicket")
    JsonResult buyTicket(@RequestParam("id") Long id){

        return new JsonResult("YOUR TICKET IS " + id);

    }


}
