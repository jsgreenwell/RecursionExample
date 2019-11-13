package edu.recursion;

import java.util.Date;

public class Users {

  private String firstName;
  private String lastName;
  private String userName;
  private Date dateOfBirth;
  private int houseNumber;
  private String streetAddress;
  private String city;
  private String state;
  private int zipcode;


  protected void setFirstName(final String firstName) {
    this.firstName = firstName;
  }

  protected void setLastName(final String lastName) {
    this.lastName = lastName;
  }

  protected void setUserName(final String userName) {
    this.userName = userName;
  }

  protected void setDateOfBirth(final Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  protected void sethHouseNumber(final int houseNumber) {
    this.houseNumber = houseNumber;
  }

  protected void setStreetAddress(final String streetAddress) {
    this.streetAddress = streetAddress;
  }

  protected void setCity(final String city) {
    this.city = city;
  }

  protected void setState(final String state) {
    this.state = state;
  }

  protected void setZipcode(final int zipcode) {
    this.zipcode = zipcode;
  }

  public Users() {
    this.firstName = "";
    this.lastName = "";
    this.userName = "";
  }
}