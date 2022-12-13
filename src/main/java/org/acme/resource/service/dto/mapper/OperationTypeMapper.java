package org.acme.resource.service.dto.mapper;

import org.acme.resource.smartObject.OperationType;
import org.acme.resource.service.dto.OperationTypeDto;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "cdi",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface OperationTypeMapper {

    OperationTypeDto toOperationTypeDto(OperationType operationType);

    List<OperationTypeDto> toOperationTypeDtos(List<OperationType> operationTypes);

    OperationType toOperationType(OperationTypeDto operationTypeDto);


}
