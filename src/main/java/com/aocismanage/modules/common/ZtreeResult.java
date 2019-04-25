package com.aocismanage.modules.common;

public class ZtreeResult {
    private long id;
    private long pid;
    private String name;
    private String isParent;

    public ZtreeResult(long id, long pid, String name, String isParent) {
        this.id = id;
        this.pid = pid;
        this.name = name;
        this.isParent = isParent;
    }

    public ZtreeResult() {
    }

    public long getId() {
        return id;
    }

    public long getPid() {
        return pid;
    }

    public String getName() {
        return name;
    }

    public String getIsParent() {
        return isParent;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsParent(String isParent) {
        this.isParent = isParent;
    }

    @Override
    public String toString() {
        return "ZtreeResult{" +
                "id=" + id +
                ", pid=" + pid +
                ", name='" + name + '\'' +
                ", isParent='" + isParent + '\'' +
                '}';
    }
}
