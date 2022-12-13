package org.acme.service;


import io.quarkus.panache.common.Sort;
import org.acme.service.dto.SmartModelDto;
import org.acme.service.dto.mapper.SmartModelMapper;
import org.acme.smartObject.SmartModel;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;


@ApplicationScoped
public class SmartModelService {

    @Inject
    SmartModelMapper smartModelMapper;

    public void add(SmartModelDto smartModelDto) {

        SmartModel sm = smartModelMapper.toSmartModel(smartModelDto);
        sm.persist();

    }

    public List<SmartModelDto> findAll() {

        return smartModelMapper.toSmartModelDtos(SmartModel.listAll());
    }


    public List<SmartModelDto> findAll(String property, String sortOp) {

        if (sortOp.equals("asc")) {
            return smartModelMapper.toSmartModelDtos(SmartModel.listAll(Sort.by(property).ascending()));
        } else {
            return smartModelMapper.toSmartModelDtos(SmartModel.listAll(Sort.by(property).descending()));
        }
    }


}
