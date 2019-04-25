package com.aocismanage.modules.base.controller;

import com.aocismanage.modules.base.entity.Permission;
import com.aocismanage.modules.base.service.PermissionService;
import com.aocismanage.modules.common.ZtreeResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class PermissionController {

    private static final Logger LOG = LoggerFactory.getLogger(PermissionController.class);

    @Autowired
    private PermissionService permissionService;


    @RequestMapping("/cr_list")
    public List select(){
        return permissionService.selectAll();
    }
    @RequestMapping("/list")
    public List<ZtreeResult> select(@RequestParam(name = "pid", defaultValue = "0")int pid){
        List<ZtreeResult> list=permissionService.select(pid);
        LOG.info("pid"+pid);
        return list;
    }

    @RequestMapping("/del")
    public int del(int permissionId){
        return permissionService.del(permissionId);
    }
    @RequestMapping("/insert")
    public int insert(Permission permission){
        //LOG.info("分类");
        //System.out.println("permission.toString() = " + permission.toString());
        return permissionService.insert(permission);
    }

    @RequestMapping("/update")
    public int update(Permission permission){
        return permissionService.update(permission);
    }

}
