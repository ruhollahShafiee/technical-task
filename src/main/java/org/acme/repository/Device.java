package org.acme.repository;


import lombok.Data;

import java.util.Map;

@Data
public class Device {


    private String deviceTypeCode;
    private String name;
    private Map<String, Object> data;

}
