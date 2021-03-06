package com.ccffee.NotifyRobot.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class CqUser implements Serializable {
    @ApiModelProperty(value = "用户id")
    private Integer id;

    @ApiModelProperty(value = "用户qq号")
    private String qqnum;

    @ApiModelProperty(value = "用户昵称")
    private String name;

    @ApiModelProperty(value = "保存图片状态字，0未开启，1开启")
    private Integer saveimagestatus;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQqnum() {
        return qqnum;
    }

    public void setQqnum(String qqnum) {
        this.qqnum = qqnum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSaveimagestatus() {
        return saveimagestatus;
    }

    public void setSaveimagestatus(Integer saveimagestatus) {
        this.saveimagestatus = saveimagestatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", qqnum=").append(qqnum);
        sb.append(", name=").append(name);
        sb.append(", saveimagestatus=").append(saveimagestatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}