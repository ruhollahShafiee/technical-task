package org.acme.service;

import org.acme.service.dto.DeviceTypeDto;
import org.acme.service.dto.mapper.DeviceTypeMapper;
import org.acme.smartObject.DeviceType;

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
