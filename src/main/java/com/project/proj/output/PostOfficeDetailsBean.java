package com.project.proj.output;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data

public class PostOfficeDetailsBean {
    
    @JsonProperty("Name")
    private String name;

    @JsonProperty("Description")
    private String desc;

    @JsonProperty("BranchType")
    private String branchType;

    @JsonProperty("DeliveryStatus")
    private String delStatus;

    @JsonProperty("Circle")
    private String circle;

    @JsonProperty("District")
    private String district;

    @JsonProperty("Division")
    private String division;

    @JsonProperty("Region")
    private String region;

    @JsonProperty("State")
    private String state;

    @JsonProperty("Country")
    private String country;

    @JsonProperty("Pincode")
    private int pincode;
}
