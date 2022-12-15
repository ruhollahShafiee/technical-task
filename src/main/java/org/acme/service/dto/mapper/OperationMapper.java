package org.acme.service.dto.mapper;

import org.acme.service.dto.OperationDto;
import org.acme.repository.Operation;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;


@Mapper(componentModel = "cdi",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface OperationMapper {


    OperationDto toOperationDto(Operation operation);

    List<OperationDto> toOperationDtos(List<Operation> operations);

    Operation toOperation(OperationDto operationDto);

    List<Operation> toOperation(List<OperationDto> operationDtos);
}
