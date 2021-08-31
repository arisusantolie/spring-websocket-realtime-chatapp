package com.arisusantolie.springwebsocketrealtimechatapp.dto;

public class MessageGroupDTO extends MessageDTO{
    private Integer groupId;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }
}
