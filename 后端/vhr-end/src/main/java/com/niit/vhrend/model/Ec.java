package com.niit.vhrend.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author Lenovo
 */
@Data
public class Ec implements Serializable {
    private Integer id;
    private String name;
    private Integer workId;
    private Integer sectorId;
    private Integer sectorName;
    private String thing;
    private String action;
    private String warning;
    private String demerit;
    private String bigDemerit;
    private String cite;
    private String merit;
    private String bigMerit;
    private Sector sector;
    private List<Ec> ecs;
}
