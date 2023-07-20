package com.project.proj.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.proj.output.PostOfficeResponseBean;
import com.project.proj.Service.PostOfficeServiceImpl;
import com.project.proj.Service.iPostOffice;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/postal")
public class PostDetailsController {

    @Autowired
    iPostOffice PostOfficeServiceImpl;
    
    @RequestMapping(value="/byCity", method=RequestMethod.GET,
    consumes = MediaType.ALL_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
    public PostOfficeResponseBean getPostByCity(@RequestParam String city) {
        PostOfficeResponseBean postResponse;

        postResponse=PostOfficeServiceImpl.fetchPostOfficeDetailsByCity(city);
        return postResponse;
    }
    
}
