package com.niit.vhrend.model;

import java.io.Serializable;
import lombok.Data;

/**
 * move_thing
 * @author 
 */
@Data
public class MoveThing implements Serializable {
    /**
     * moveThingID
     */
    private Integer id;

    /**
     * 调动事项
     */
    private String name;

    private static final long serialVersionUID = 1L;
}