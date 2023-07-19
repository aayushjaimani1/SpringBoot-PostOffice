package com.project.proj.Service;

import com.project.proj.output.PostOfficeResponseBean;

public interface iPostOffice {

    public PostOfficeResponseBean fetchPostOfficeDetailsByCity(String city);
    
}
