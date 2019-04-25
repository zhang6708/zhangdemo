package com.aocismanage.modules.base.service;



import com.aocismanage.modules.base.dao.PermissionDao;
import com.aocismanage.modules.base.entity.Permission;
import com.aocismanage.modules.common.ZtreeResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class PermissionService {

    @Autowired
    private PermissionDao permissionDao;


    public List<Permission> selectAll(){
        return permissionDao.selectAll();
    }

    public List<ZtreeResult> select(int pid){

        Object object= permissionDao.select(pid);
        List<Permission> list= (List<Permission>)object;

       // List<Permission> list= permissionDao.select(pid);
        List<ZtreeResult> ResultList =new ArrayList<>();

        for (Permission  PermissionCat: list) {
            ZtreeResult ZtreeNode=new ZtreeResult();
            ZtreeNode.setId(PermissionCat.getPermission_id());
            ZtreeNode.setPid(PermissionCat.getPid());
            ZtreeNode.setName(PermissionCat.getName());

            //System.out.println("ZtreeNode. = " + ZtreeNode.getIsParent());
            if(PermissionCat.getType()== 3){
                ZtreeNode.setIsParent("false");
            }else{
                ZtreeNode.setIsParent("true");

            }
            ResultList.add(ZtreeNode);
        }
        System.out.println("ResultList.toString() = " + ResultList.toString().length());

        return ResultList;
    }


    public  int del(int permissionId){
        return permissionDao.del(permissionId);
    }

    public int insert(Permission permission){
        return permissionDao.insert(permission);
    }

    public int update(Permission permission){
        return permissionDao.update(permission);
    }
}
