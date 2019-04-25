package com.aocismanage.modules.base.entity;

import java.util.Date;

public class User {
    private String user_code;
    private String loginCode;
    private String user_name;
    private String password;
    private String email;
    private String mobile;
    private String phone;
    private String sex;
    private String avatar;
    private String sign;
    private String wx_openid;
    private String mobile_imei;
    private String user_type;
    private String ref_code;
    private String ref_name;
    // 管理员类型（0非管理员 1系统管理员  2二级管理员）
    private int mgr_type;
    //密码安全级别（0初始 1很弱 2弱 3安全 4很安全）
    private int pwd_security_level;
    private Date pwd_update_date;
    private String pwd_update_record;
    private Date pwd_quest_update_date;
    private String last_login_ip;
    private Date last_login_date;
    private Date freeze_date;
    private String freeze_cause;
    private int user_weight;
    // 状态（0正常 1删除 2停用 3冻结）
    private String status;
    private String create_by;
    private Date create_date;
    private String update_by;
    private Date update_date;
    private String remarks;
    private String corp_code;
    private String corp_name;

    public User(String user_code, String loginCode, String user_name, String password, String email, String mobile, String phone, String sex, String avatar, String sign, String wx_openid, String mobile_imei, String user_type, String ref_code, String ref_name, int mgr_type, int pwd_security_level, Date pwd_update_date, String pwd_update_record, Date pwd_quest_update_date, String last_login_ip, Date last_login_date, Date freeze_date, String freeze_cause, int user_weight, String status, String create_by, Date create_date, String update_by, Date update_date, String remarks, String corp_code, String corp_name) {
        this.user_code = user_code;
        this.loginCode = loginCode;
        this.user_name = user_name;
        this.password = password;
        this.email = email;
        this.mobile = mobile;
        this.phone = phone;
        this.sex = sex;
        this.avatar = avatar;
        this.sign = sign;
        this.wx_openid = wx_openid;
        this.mobile_imei = mobile_imei;
        this.user_type = user_type;
        this.ref_code = ref_code;
        this.ref_name = ref_name;
        this.mgr_type = mgr_type;
        this.pwd_security_level = pwd_security_level;
        this.pwd_update_date = pwd_update_date;
        this.pwd_update_record = pwd_update_record;
        this.pwd_quest_update_date = pwd_quest_update_date;
        this.last_login_ip = last_login_ip;
        this.last_login_date = last_login_date;
        this.freeze_date = freeze_date;
        this.freeze_cause = freeze_cause;
        this.user_weight = user_weight;
        this.status = status;
        this.create_by = create_by;
        this.create_date = create_date;
        this.update_by = update_by;
        this.update_date = update_date;
        this.remarks = remarks;
        this.corp_code = corp_code;
        this.corp_name = corp_name;
    }

    public User() {
    }

    public String getUser_code() {
        return user_code;
    }

    public void setUser_code(String user_code) {
        this.user_code = user_code;
    }

    public String getLoginCode() {
        return loginCode;
    }

    public void setLoginCode(String loginCode) {
        this.loginCode = loginCode;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getWx_openid() {
        return wx_openid;
    }

    public void setWx_openid(String wx_openid) {
        this.wx_openid = wx_openid;
    }

    public String getMobile_imei() {
        return mobile_imei;
    }

    public void setMobile_imei(String mobile_imei) {
        this.mobile_imei = mobile_imei;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getRef_code() {
        return ref_code;
    }

    public void setRef_code(String ref_code) {
        this.ref_code = ref_code;
    }

    public String getRef_name() {
        return ref_name;
    }

    public void setRef_name(String ref_name) {
        this.ref_name = ref_name;
    }

    public int getMgr_type() {
        return mgr_type;
    }

    public void setMgr_type(int mgr_type) {
        this.mgr_type = mgr_type;
    }

    public int getPwd_security_level() {
        return pwd_security_level;
    }

    public void setPwd_security_level(int pwd_security_level) {
        this.pwd_security_level = pwd_security_level;
    }

    public Date getPwd_update_date() {
        return pwd_update_date;
    }

    public void setPwd_update_date(Date pwd_update_date) {
        this.pwd_update_date = pwd_update_date;
    }

    public String getPwd_update_record() {
        return pwd_update_record;
    }

    public void setPwd_update_record(String pwd_update_record) {
        this.pwd_update_record = pwd_update_record;
    }

    public Date getPwd_quest_update_date() {
        return pwd_quest_update_date;
    }

    public void setPwd_quest_update_date(Date pwd_quest_update_date) {
        this.pwd_quest_update_date = pwd_quest_update_date;
    }

    public String getLast_login_ip() {
        return last_login_ip;
    }

    public void setLast_login_ip(String last_login_ip) {
        this.last_login_ip = last_login_ip;
    }

    public Date getLast_login_date() {
        return last_login_date;
    }

    public void setLast_login_date(Date last_login_date) {
        this.last_login_date = last_login_date;
    }

    public Date getFreeze_date() {
        return freeze_date;
    }

    public void setFreeze_date(Date freeze_date) {
        this.freeze_date = freeze_date;
    }

    public String getFreeze_cause() {
        return freeze_cause;
    }

    public void setFreeze_cause(String freeze_cause) {
        this.freeze_cause = freeze_cause;
    }

    public int getUser_weight() {
        return user_weight;
    }

    public void setUser_weight(int user_weight) {
        this.user_weight = user_weight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public String getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(String update_by) {
        this.update_by = update_by;
    }

    public Date getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getCorp_code() {
        return corp_code;
    }

    public void setCorp_code(String corp_code) {
        this.corp_code = corp_code;
    }

    public String getCorp_name() {
        return corp_name;
    }

    public void setCorp_name(String corp_name) {
        this.corp_name = corp_name;
    }
}
