package com.niit.vhrend.mapper;

import com.niit.vhrend.model.MoveThing;

public interface MoveThingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MoveThing record);

    int insertSelective(MoveThing record);

    MoveThing selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MoveThing record);

    int updateByPrimaryKey(MoveThing record);
}