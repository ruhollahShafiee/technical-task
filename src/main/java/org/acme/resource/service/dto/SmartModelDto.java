package org.acme.resource.service.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmartModelDto {

    private DeviceDto deviceDto;
    private List<ServiceDto> serviceDtos;

}
