package org.acme.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class OperationDto {

    private String name;
    private String operationTypeCode;
    private Map<String, Object> operationInputParam;
    private String description;
}
