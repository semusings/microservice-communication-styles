package io.github.bhuwanupadhyay.catalogservice;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "catalogs")
@Getter
@Setter
public class Catalog {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String catalogName;

    @OneToMany(mappedBy = "catalog")
    private Set<Product> products;

}
