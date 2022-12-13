package org.acme.service.dto.mapper;

import org.acme.service.dto.DeviceTypeDto;
import org.acme.smartObject.DeviceType;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "cdi")
public interface DeviceTypeMapper {



    DeviceType toDeviceType(DeviceTypeDto deviceTypeDto);

    DeviceTypeDto toDeviceTypeDto(DeviceType deviceType);

    List<DeviceTypeDto> toDeviceTypeDtos(List<DeviceType> deviceTypes);
}
