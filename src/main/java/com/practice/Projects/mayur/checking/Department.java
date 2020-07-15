package com.practice.Projects.mayur.checking;

public class Department {

  private long deptId;
  private String deptName;

  public Department(long deptId, String deptName) {
    this.deptId = deptId;
    this.deptName = deptName;
  }

  public long getDeptId() {
    return deptId;
  }

  public void setDeptId(long deptId) {
    this.deptId = deptId;
  }

  public String getDeptName() {
    return deptName;
  }

  public void setDeptName(String deptName) {
    this.deptName = deptName;
  }

  @Override public String toString() {
    return "Department{" + "deptId=" + deptId + ", deptName='" + deptName + '\'' + '}';
  }
}
