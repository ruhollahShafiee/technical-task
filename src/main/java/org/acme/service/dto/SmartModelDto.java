package org.acme.service.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class SmartModelDto {

    private DeviceDto deviceDto;
    private List<ServiceDto> serviceDtos;

}
