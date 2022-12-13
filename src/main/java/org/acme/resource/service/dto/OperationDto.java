package org.acme.resource.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OperationDto {

    private String name;
    private String operationTypeCode;
    private Map<String, Object> operationInputParam;
    private String description;
}
