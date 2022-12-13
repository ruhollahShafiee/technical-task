package org.acme.resource.service.dto.mapper;


import org.acme.resource.service.dto.DeviceDto;
import org.acme.resource.smartObject.Device;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "cdi",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface DeviceMapper {


    DeviceDto toDeviceDto(Device device);

    List<DeviceDto> toDeviceDto(List<Device> device);

    Device toDevice(DeviceDto deviceDto);

}
