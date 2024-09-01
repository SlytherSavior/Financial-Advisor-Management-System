package com.wellsfargo.counselor.entity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

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
  
    @ManyToOne
    @JoinColumn(name= "advisorId", nullable = false)
    private Advisor advisor; 
  
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Portfolio> portfolio;
    
    protected Client(){}

    public Client(String firstName, String lastName , String email, String phoneNumber, String address, Advisor advisor) {
      this.firstName = firstName;
      this.lastName = lastName ; 
      this.email = email;
      this.phone = phoneNumber;
      this.address = address;
      this.advisor = advisor;
  }

  public Long getClientId() {
    return clientId;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getAddress() {
    return address;
  }

  public String getPhone() {
    return phone;
  }

  public String getEmail() {
    return email;
  }

  public void setClientId(Long clientId) {
    this.clientId = clientId;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setAdvisor(Advisor advisor) {
    this.advisor = advisor;
  }



  public List<Portfolio> getPortfolio() {
    return portfolio;
  }

  public Advisor getAdvisor() {
    return advisor;
  }

  public void setPortfolio(List<Portfolio> portfolio) {
    this.portfolio = portfolio;
  }

  

  




  
}
