package org.acme.resource.service;

import org.acme.resource.service.dto.DeviceTypeDto;
import org.acme.resource.service.dto.mapper.DeviceTypeMapper;
import org.acme.resource.smartObject.DeviceType;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;


@ApplicationScoped
public class DeviceTypeService {

    @Inject
    DeviceTypeMapper deviceTypeMapper;

    public void add(DeviceTypeDto deviceTypeDto) {

        DeviceType deviceType = deviceTypeMapper.toDeviceType(deviceTypeDto);
        deviceType.persist();

    }

    public List<DeviceTypeDto> findAll() {

        return deviceTypeMapper.toDeviceTypeDtos(DeviceType.listAll());

    }
}
