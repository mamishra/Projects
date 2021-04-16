package com.practice.Projects.mayur.checking.hackerearth;

import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by MAYUR on 7/21/20.
 */
public class Contact {

  private String            name;
  private String            organisation;
  private List<PhoneNumber> phoneNumbers;
  private List<Address>     addresses;

  public Contact(String name, String organisation) throws Exception {
    // TODO
    Pattern pattern = Pattern.compile("^[ A-Za-z]+$");
    if(!pattern.matcher(name).matches() || name.length()>255 || name.length()==0) {
      throw new Exception("name is invalid");
    } else{
      this.name=name;
    }
    if(organisation.length()>255) {
      throw new Exception("organisation is invalid");
    } else{
      this.organisation = organisation;
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getOrganisation() {
    return organisation;
  }

  public void setOrganisation(String organisation) {
    this.organisation = organisation;
  }

  public List<PhoneNumber> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  public List<Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }

  public void addPhoneNumber(PhoneNumber phoneNumber) {
    if (this.phoneNumbers == null) {
      this.phoneNumbers = new ArrayList<>();
    }
    this.phoneNumbers.add(phoneNumber);

  }

  public void addAddress(Address address) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(address);
  }

}
