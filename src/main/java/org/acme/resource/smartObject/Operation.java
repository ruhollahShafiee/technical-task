package org.acme.resource.smartObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Operation {

    private String name;
    private OperationType type;
    private Map<String, Object> operationInputParam;
    private String description;
}
