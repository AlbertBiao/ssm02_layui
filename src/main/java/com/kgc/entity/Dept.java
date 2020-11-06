package com.kgc.entity;

public class Dept {
    private Integer deptid;

    private String deptnname;

    private String deptloaction;

    private Integer pdeptid;

    public Dept(Integer deptid, String deptnname, String deptloaction, Integer pdeptid) {
        this.deptid = deptid;
        this.deptnname = deptnname;
        this.deptloaction = deptloaction;
        this.pdeptid = pdeptid;
    }

    public Dept() {
        super();
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public String getDeptnname() {
        return deptnname;
    }

    public void setDeptnname(String deptnname) {
        this.deptnname = deptnname == null ? null : deptnname.trim();
    }

    public String getDeptloaction() {
        return deptloaction;
    }

    public void setDeptloaction(String deptloaction) {
        this.deptloaction = deptloaction == null ? null : deptloaction.trim();
    }

    public Integer getPdeptid() {
        return pdeptid;
    }

    public void setPdeptid(Integer pdeptid) {
        this.pdeptid = pdeptid;
    }
}