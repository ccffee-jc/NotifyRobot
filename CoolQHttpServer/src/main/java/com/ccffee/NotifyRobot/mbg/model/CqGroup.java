package com.ccffee.NotifyRobot.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class CqGroup implements Serializable {
    @ApiModelProperty(value = "群组id")
    private Integer id;

    @ApiModelProperty(value = "群号")
    private String num;

    @ApiModelProperty(value = "连接码，0为不连接")
    private Integer connect;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Integer getConnect() {
        return connect;
    }

    public void setConnect(Integer connect) {
        this.connect = connect;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", num=").append(num);
        sb.append(", connect=").append(connect);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}