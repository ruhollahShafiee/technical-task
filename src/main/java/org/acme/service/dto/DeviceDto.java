package org.acme.service.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeviceDto {

    private String deviceTypeCode;
    private String name;
    private Map<String, Object> data;
}
