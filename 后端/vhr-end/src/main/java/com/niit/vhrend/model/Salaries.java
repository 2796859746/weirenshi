package com.niit.vhrend.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * salaries
 * @author 
 */
@Data
public class Salaries implements Serializable {
    /**
     * moveID
     */
    private Integer id;

    /**
     * 调动内容
     */
    private Integer moveThing;

    /**
     * 调动日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date moveDate;

    /**
     * 调动员工
     */
    private String name;

    /**
     * 编号
     */
    private Integer number;

    /**
     * 原工资
     */
    private Integer oldPrize;

    /**
     * 新工资
     */
    private Integer newPrize;

    /**
     * 备注
     */
    private String remark;

    private MoveThing moveThing1;

    private static final long serialVersionUID = 1L;


}