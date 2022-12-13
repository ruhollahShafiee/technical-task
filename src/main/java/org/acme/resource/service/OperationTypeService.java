package org.acme.resource.service;

import org.acme.resource.service.dto.OperationTypeDto;
import org.acme.resource.service.dto.mapper.OperationTypeMapper;
import org.acme.resource.smartObject.OperationType;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class OperationTypeService {

    @Inject
    OperationTypeMapper operationTypeMapper;

    public void add(OperationTypeDto operationTypeDto){

        OperationType operationType=operationTypeMapper.toOperationType(operationTypeDto);
        operationType.persist();

    }

    public List<OperationTypeDto> findAll(){

        return operationTypeMapper.toOperationTypeDtos(OperationType.listAll());
    }
}
