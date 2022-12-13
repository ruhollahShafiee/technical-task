package org.acme.resource.service.dto.mapper;

import org.acme.resource.smartObject.SmartModel;
import org.acme.resource.service.dto.SmartModelDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "cdi",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface SmartModelMapper {


    @Mapping(target = "deviceDto",source = "device")
    @Mapping(target = "serviceDtos",source = "services")
    SmartModelDto toSmartModelDto(SmartModel smartModel);

    List<SmartModelDto> toSmartModelDtos(List<SmartModel> smartModel);

    @Mapping(target = "device",source = "deviceDto")
    @Mapping(target = "services",source = "serviceDtos")
    @Mapping(target = "creationDate", expression = "java(new java.util.Date())")
    SmartModel toSmartModel(SmartModelDto smartModelDto);

}
