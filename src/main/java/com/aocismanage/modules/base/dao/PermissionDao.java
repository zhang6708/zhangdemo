package com.aocismanage.modules.base.dao;

import com.aocismanage.modules.base.entity.Permission;
import com.aocismanage.modules.common.ZtreeResult;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface PermissionDao {

    List<Permission> selectAll();
    List<ZtreeResult> select(int pid);

    int del(int permissionId);

    int insert(Permission permission);

    int update(Permission permission);
}
