package com.niit.vhrend.mapper;

import com.niit.vhrend.model.Ec;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EcMapper {
//    int deleteByPrimaryKey(Integer id);

    int insert(Ec record);

    int insertSelective(Ec record);

    Ec selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ec record);

    int updateByPrimaryKey(Ec record);

    List<Ec> getEcByPage(@Param("page") Integer page, @Param("size") Integer size, @Param("ecs") Ec ec);

    Long getTotal(@Param("ecs") Ec ec);

    List<Ec> getAllEc();

    Integer deleteEcById(Integer id);

    Integer addEcs(@Param("list") List<Ec> list);

    Integer maxWorkId();
//    List<Ec> getEcByPage(@Param("page") Integer page, @Param("size") Integer size, @Param("ec") Ec ec);
}