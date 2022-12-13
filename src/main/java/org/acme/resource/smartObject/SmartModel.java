package org.acme.resource.smartObject;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.codecs.pojo.annotations.BsonDiscriminator;

import java.util.Date;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@BsonDiscriminator
public class SmartModel extends PanacheMongoEntity {

    private Device device;
    private List<Service> services;
    private Date creationDate;


}
