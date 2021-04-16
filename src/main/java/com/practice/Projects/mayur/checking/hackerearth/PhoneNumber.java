package com.practice.Projects.mayur.checking.hackerearth;

import java.util.regex.Pattern;

/**
 * Created by MAYUR on 7/21/20.
 */
public class PhoneNumber {
  private String label;
  private String phoneNumber;

  public PhoneNumber(String label, String phoneNumber) throws Exception {
    // TODO
    Pattern labelPattern = Pattern.compile("^[ A-Za-z]+$");
    if(!labelPattern.matcher(label).matches() || label.length() >255 || label.equals(null) || label.length()==0) {
      throw new Exception("label is invalid");
    } else{
      this.label = label;
    }
    Pattern phoneNumberPattern = Pattern.compile("^\\d{10}$");
    if(!phoneNumberPattern.matcher(phoneNumber).matches() || phoneNumber.length() != 10) {
      throw new Exception("phone number is invalid");
    } else{
      this.phoneNumber = phoneNumber;
    }
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
}

