package io.github.bhuwanupadhyay.catalogservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "catalogs", collectionResourceRel = "catalogs", itemResourceRel = "catalog")
public interface CatalogsApi extends JpaRepository<Catalog, Long> {
    
}
