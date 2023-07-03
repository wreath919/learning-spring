package com.example.demo.data.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="GUEST")
@Data
public class Guest {
  @Id
  @Column
  @GeneratedValue
  private long guestId;

  @Column(name="FIRST_NAME")
  private String FirstName;

  @Column(name="LAST_NAME")
  private String lastName;

  @Column(name="EMAIL_ADDRESS")
  private String emailAddress;

  @Column(name="ADDRESS")
  private String address;

  @Column(name="COUNTRY")
  private String country;

  @Column(name="STATE")
  private String state;

  @Column(name="PHONE_NUMBER")
  private String phoneNumber;
}
