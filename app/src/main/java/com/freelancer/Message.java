package com.freelancer;

import com.google.gson.annotations.SerializedName;

public class Message {

    @SerializedName("SenderId")
    int senderId;
    @SerializedName("ReceiverId")
    int receiverId;
    @SerializedName("Content")
    String content;

    Message(int senderId,int receiverId,String content){
        this.senderId=senderId;
        this.receiverId=receiverId;
        this.content=content;
    }

    public int getSenderId() { return senderId; }

    public void setSenderId(int senderId) { this.senderId = senderId; }

    public int getReceiverId() { return receiverId; }

    public void setReceiverId(int receiverId) { this.receiverId = receiverId; }

    public String getContent() { return content; }

    public void setContent(String content) { this.content = content; }
}
