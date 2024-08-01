package com.telusko.model;

public class Course {
    private Integer cid;
    private String cname;
    private Integer duration;
    private Double fees;

    public Course() {
    }

    public Course(Integer cid, String cname, Integer duration, Double fees) {
        this.cid = cid;
        this.cname = cname;
        this.duration = duration;
        this.fees = fees;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Double getFees() {
        return fees;
    }

    public void setFees(Double fees) {
        this.fees = fees;
    }
}
