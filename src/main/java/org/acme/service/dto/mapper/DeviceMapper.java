package org.acme.service.dto.mapper;


import org.acme.service.dto.DeviceDto;
import org.acme.repository.Device;
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
