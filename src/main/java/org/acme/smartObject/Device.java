package org.acme.smartObject;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.util.Map;

@Data
public class Device {


    private String deviceTypeCode;
    private String name;
    private Map<String, Object> data;

}
