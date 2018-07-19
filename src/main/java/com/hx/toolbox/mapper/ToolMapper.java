package com.hx.toolbox.mapper;

import com.hx.toolbox.entity.ToolEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ToolMapper {

    @Select("SELECT * FROM  tool ")
     List<ToolEntity> listTool();

}
