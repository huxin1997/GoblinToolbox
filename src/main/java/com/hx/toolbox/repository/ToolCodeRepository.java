package com.hx.toolbox.repository;

import com.hx.toolbox.entity.ToolCodeEntity;
import com.hx.toolbox.entity.ToolEntity;
import org.springframework.data.repository.Repository;

public interface ToolCodeRepository extends Repository<ToolCodeEntity,Integer> {


    ToolEntity findById(Integer id);
}
