package org.acme.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.acme.smartObject.Operation;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceDto {

    private String name;
    private String description;
    private List<OperationDto> operations;
}
