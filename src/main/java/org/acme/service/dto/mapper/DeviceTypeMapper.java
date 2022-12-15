package org.acme.service.dto.mapper;

import org.acme.repository.DeviceType;
import org.acme.service.dto.DeviceTypeDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "cdi")
public interface DeviceTypeMapper {



    DeviceType toDeviceType(DeviceTypeDto deviceTypeDto);

    DeviceTypeDto toDeviceTypeDto(DeviceType deviceType);

    List<DeviceTypeDto> toDeviceTypeDtos(List<DeviceType> deviceTypes);
}
