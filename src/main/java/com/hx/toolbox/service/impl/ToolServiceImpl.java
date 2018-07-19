package com.hx.toolbox.service.impl;

import com.hx.toolbox.mapper.ToolMapper;
import com.hx.toolbox.service.ToolService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ToolServiceImpl implements ToolService{

    @Resource
    ToolMapper toolMapper;

    @Override
    public List<?> listTool() {
        return toolMapper.listTool();
    }

}
