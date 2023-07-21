package com.project.proj.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.project.proj.output.PostOfficeDetailsBean;
import com.project.proj.output.PostOfficeResponseBean;

@Service("PostOfficeServiceImpl")
public class PostOfficeServiceImpl implements iPostOffice{

    @Autowired
    RestTemplate restTemplate;

    @Override
    public PostOfficeResponseBean fetchPostOfficeDetailsByCity(String cityValue){

        String url = "https://api.postalpincode.in/postoffice/{city}";
        url = url.replace("{city}", cityValue);

        System.out.println("Url is :" + url);

        ResponseEntity<PostOfficeResponseBean[]> postalResponseEntity = restTemplate.getForEntity(url, PostOfficeResponseBean[].class);

        System.out.println("Response Status code is: "+postalResponseEntity.getStatusCode());
        PostOfficeResponseBean[] responseBeanArray = postalResponseEntity.getBody();

        // for(PostOfficeResponseBean responseBean: responseBeanArray){
        //     List<PostOfficeDetailsBean> postOfficeDet = responseBean.getPostOffice();
        //     for (PostOfficeDetailsBean pod : postOfficeDet) {
        //         // System.out.println(pod.getName()+"**"+pod.getPincode()+"***"+pod.getDistrict());
                
        //     }
        // }

        return responseBeanArray[0];
    }
    
}
