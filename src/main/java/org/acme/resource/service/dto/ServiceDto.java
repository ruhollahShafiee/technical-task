package org.acme.resource.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceDto {

    private String name;
    private String description;
    private List<OperationDto> operations;
}