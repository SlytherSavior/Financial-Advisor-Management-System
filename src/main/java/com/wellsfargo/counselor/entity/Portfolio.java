package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long portfolioId ;


  
}
