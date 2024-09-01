package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Portfolio {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long portfolioId;

  @OneToMany(mappedBy = "portfolio")
  private List<Security> security;

  @ManyToOne
  @JoinColumn(name = "client_id", nullable = false)
  private Client client;

  @Column(nullable = false)
  private LocalDate creationDate;

  protected Portfolio(){}

  public Portfolio(LocalDate creationDate){
    this.creationDate  = creationDate;
  }

  public long getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(long portfolioId) {
    this.portfolioId = portfolioId;
  }

  public List<Security> getSecurity() {
    return security;
  }

  public void setSecurity(List<Security> security) {
    this.security = security;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public LocalDate getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
  }
}
