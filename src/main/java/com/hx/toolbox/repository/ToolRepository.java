package com.hx.toolbox.repository;

import com.hx.toolbox.entity.ToolEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.tools.Tool;
import java.util.List;
import java.util.Optional;

/**
 * @author HuXin
 */
public interface ToolRepository extends JpaRepository<ToolEntity,Integer> {


    ToolEntity findByIdAndSeoKeywords(Integer id, String keyworld);

    @Override
    List<ToolEntity> findAll();

    @Override
    ToolEntity getOne(Integer integer);
}
