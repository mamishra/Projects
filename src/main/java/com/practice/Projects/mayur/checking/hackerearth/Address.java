package com.practice.Projects.mayur.checking.hackerearth;

import java.util.regex.Pattern;

public class Address {

  private String label;
  private String address;

  public Address(String label, String address) throws Exception {
    // TODO;
    Pattern pattern = Pattern.compile("^[ A-Za-z]+$");
    if (!pattern.matcher(label).matches() || label.length() > 255 || label.equals(null) || label.length()==0) {
      throw new Exception("label is incorrect");
    } else {
      this.label = label;
      this.address = address;
    }
  }

  public String getLabel() {
    return this.label;
  }

  public String getAddress() {
    return this.address;
  }
}

