package com.hx.toolbox.repository;

import com.hx.toolbox.entity.ToolEntity;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ToolRepositoryTest {


    @Resource
    ToolRepository toolRepository;

    private final Log log = LogFactory.getLog(ToolRepositoryTest.class);

    @Test
    public void findById() {
        ToolEntity toolEntity = toolRepository.findById(1).get();
//        log.info(toolEntity);
        toolEntity.setSeoKeywords("hahah");
        toolRepository.save(toolEntity);
        ToolEntity toolEntity1 = toolRepository.findById(1).get();

        log.info("seokeywords:" + toolEntity1.getSeoKeywords());
        assertEquals("hahah", toolEntity1.getSeoKeywords());

    }
}