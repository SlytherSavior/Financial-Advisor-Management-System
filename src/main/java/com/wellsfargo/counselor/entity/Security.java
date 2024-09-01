package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;


@Entity
public class Security {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long securityId; 

  @ManyToOne
  @JoinColumn(name = "portfolio_id", nullable = false)
  private Portfolio portfolio; 

  @Column(nullable = false)
  private String name; 
  
  @Column(nullable = false)
  private String category;

  @Column(nullable = false)
  private  float purchasePrice; 

  @Column(nullable = false)
  private LocalDate purchasDate; 

  @Column(nullable = false)
  private int quantity;

  protected Security(){}

  public Security(String name, String category, float purchasePrice, LocalDate purchasDate, int quantity){
    this.name = name ; 
    this.category = category ;
    this.purchasDate = purchasDate ; 
    this.purchasePrice = purchasePrice ;
    this.quantity = quantity ;
  }

  public void setSecurityId(long securityId) {
    this.securityId = securityId;
  }

  public void setPortfolio(Portfolio portfolio) {
    this.portfolio = portfolio;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public void setPurchasePrice(Float purchasePrice) {
    this.purchasePrice = purchasePrice;
  }

  public void setPurchasDate(LocalDate purchasDate) {
    this.purchasDate = purchasDate;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public long getSecurityId() {
    return securityId;
  }

  public Portfolio getPortfolio() {
    return portfolio;
  }

  public String getName() {
    return name;
  }

  public String getCategory() {
    return category;
  }

  public Float getPurchasePrice() {
    return purchasePrice;
  }

  public LocalDate getPurchasDate() {
    return purchasDate;
  }

  public int getQuantity() {
    return quantity;
  }  
}
