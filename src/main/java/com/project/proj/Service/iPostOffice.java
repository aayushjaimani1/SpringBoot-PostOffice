package com.project.proj.service;

import com.project.proj.output.PostOfficeResponseBean;

public interface iPostOffice {

    public PostOfficeResponseBean fetchPostOfficeDetailsByCity(String city);
    
}
