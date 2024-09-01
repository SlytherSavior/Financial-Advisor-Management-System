package com.wellsfargo.counselor.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Client {

  @Id
  @GeneratedValue()
  private Long clientId;
  
  @Column(nullable = false)
  private String firstName;
  
  @Column(nullable = false)
  private String lastName;

  @Column(nullable = false)
  private String address;
  
  @Column(nullable = false)
  private String phone;

  @Column(nullable = false)
  private String email;


  protected Client(){}


  
}
