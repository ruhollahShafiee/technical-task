package org.acme.smartObject;


import io.quarkus.mongodb.panache.PanacheMongoEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.codecs.pojo.annotations.BsonDiscriminator;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeviceType extends PanacheMongoEntity {

    private String name;
    private String code;
    private Map<String,String> fields;
}
