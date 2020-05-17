package com.niit.vhrend.mapper;

import com.niit.vhrend.model.MenuRole;
import org.apache.ibatis.annotations.Param;

/**
 * @author Lenovo
 */
public interface MenuRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MenuRole record);

    int insertSelective(MenuRole record);

    MenuRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MenuRole record);

    int updateByPrimaryKey(MenuRole record);

    void deleteByRid(Integer rid);

    Integer insertRecord(@Param("rid") Integer rid,@Param("mids") Integer[] mids);
}
