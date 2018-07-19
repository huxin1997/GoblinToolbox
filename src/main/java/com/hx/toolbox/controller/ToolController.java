package com.hx.toolbox.controller;

import com.hx.toolbox.service.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ToolController {

    @Autowired
    private ToolService toolService;

    @GetMapping("/tool")
    public List<?> listTool() {
        return toolService.listTool();
    }

}
