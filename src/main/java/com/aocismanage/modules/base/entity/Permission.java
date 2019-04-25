package com.aocismanage.modules.base.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class Permission implements Serializable {

    private int permissionId;
    private int systemId;
    private int pid;
    private String name;
    private int type;
    private String permissionValue;
    private String uri;
    private String icon;
    private int status;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date ctime;
    private long orders;

    public Permission() {
        super();
    }

    public Permission(int permissionId, int systemId, int pid, String name, int type, String permission_value, String uri, String icon, int status, Date ctime, long orders) {
        this.permissionId = permissionId;
        this.systemId = systemId;
        this.pid = pid;
        this.name = name;
        this.type = type;
        this.permissionValue = permissionValue;
        this.uri = uri;
        this.icon = icon;
        this.status = status;
        this.ctime = ctime;
        this.orders = orders;
    }

    public int getPermission_id() {
        return permissionId;
    }

    public int getSystem_id() {
        return systemId;
    }

    public int getPid() {
        return pid;
    }

    public String getName() {
        return name;
    }

    public int getType() {
        return type;
    }

    public String getPermission_value() {
        return permissionValue;
    }

    public String getUri() {
        return uri;
    }

    public String getIcon() {
        return icon;
    }

    public int getStatus() {
        return status;
    }

    public Date getCtime() {
        return ctime;
    }

    public long getOrders() {
        return orders;
    }

    public void setPermission_id(int permission_id) {
        this.permissionId = permission_id;
    }

    public void setSystem_id(int system_id) {
        this.systemId = system_id;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setPermission_value(String permission_value) {
        this.permissionValue = permission_value;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public void setOrders(long orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "permissionId=" + permissionId +
                ", systemId=" + systemId +
                ", pid=" + pid +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", permissionValue='" + permissionValue + '\'' +
                ", uri='" + uri + '\'' +
                ", icon='" + icon + '\'' +
                ", status=" + status +
                ", ctime=" + ctime +
                ", orders=" + orders +
                '}';
    }
}
