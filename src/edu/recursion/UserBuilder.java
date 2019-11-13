package edu.recursion;

import java.util.Date;

public class UserBuilder extends Users {

  private String firstName;
  private String lastName;
  private String userName;
  private Date dateOfBirth;
  private int houseNumber;
  private String streetAddress;
  private String city;
  private String state;
  private int zipcode;

  public UserBuilder() {
    // yes, you need the constructor (not overridden)
  }


  public UserBuilder withFirstName(final String firstName) {
    this.firstName = firstName;
    return this;
  }

  public UserBuilder withLastName(final String lastName) {
    this.lastName = lastName;
    return this;
  }

  public UserBuilder withUserName(final String userName) {
    this.userName = userName;
    return this;
  }

  public UserBuilder withDateOfBirth(final Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  public UserBuilder withHouseNumber(final int houseNumber) {
    this.houseNumber = houseNumber;
    return this;
  }

  public UserBuilder withStreetAddress(final String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

  public UserBuilder withCity(final String city) {
    this.city = city;
    return this;
  }

  public UserBuilder withState(final String state) {
    this.state = state;
    return this;
  }

  public UserBuilder withZipcode(final int zipcode) {
    this.zipcode = zipcode;
    return this;
  }

  public UserBuilder(String firstName, String lastName, String userName,
      Date dateOfBirth, int houseNumber, String streetAddress,
      String city, String state, int zipcode)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.userName = userName;
    this.dateOfBirth = dateOfBirth;
    this.houseNumber = houseNumber;
    this.streetAddress = streetAddress;
    this.city = city;
    this.state = state;
    this.zipcode = zipcode;
  }

  public UserBuilder build() {
    return new UserBuilder(
        firstName,
        lastName,
        userName,
        dateOfBirth,
        houseNumber,
        streetAddress,
        city,
        state,
        zipcode);
  }
}
