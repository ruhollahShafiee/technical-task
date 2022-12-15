package org.acme.service;

import org.acme.service.dto.OperationTypeDto;
import org.acme.service.dto.mapper.OperationTypeMapper;
import org.acme.repository.OperationType;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class OperationTypeService {

    OperationTypeMapper operationTypeMapper;

    @Inject
    public OperationTypeService(OperationTypeMapper operationTypeMapper) {

        this.operationTypeMapper = operationTypeMapper;

    }

    public void add(OperationTypeDto operationTypeDto) {

        OperationType operationType = operationTypeMapper.toOperationType(operationTypeDto);
        operationType.persist();

    }

    public List<OperationTypeDto> findAll() {

        return operationTypeMapper.toOperationTypeDtos(OperationType.listAll());
    }
}
