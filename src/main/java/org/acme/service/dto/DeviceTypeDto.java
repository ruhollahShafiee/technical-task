package org.acme.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Map;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeviceTypeDto {

    private String name;
    private String code;
    private Map<String,String> fields;

}
