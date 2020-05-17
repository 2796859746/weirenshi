package com.niit.vhrend.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * move
 * @author 
 */
@Data
public class Move implements Serializable {
    /**
     * moveID
     */
    private Integer id;

    /**
     * 调动内容
     */
    private String movething;

    /**
     * 调动日期
     */
    private Date movedate;

    /**
     * 调动员工
     */
    private String name;

    /**
     * 编号
     */
    private Integer number;

    /**
     * 原部门
     */
    private Integer oldsector;

    /**
     * 新部门
     */
    private Integer newsector;

    /**
     * 原职位
     */
    private String oldpostion;

    /**
     * 新职位
     */
    private String newpostion;

    /**
     * 备注
     */
    private String remark;

    private static final long serialVersionUID = 1L;
}