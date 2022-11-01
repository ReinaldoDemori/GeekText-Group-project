package com.geektext.GeekText.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Rank {
    @Id
    public Integer rank;
    
    
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "isbn")
    public Book book;
}
