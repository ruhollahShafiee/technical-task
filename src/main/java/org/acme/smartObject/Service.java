package org.acme.smartObject;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Service {

    private String name;
    private String description;
    private List<Operation> operations;
}
