package co.samtel.repo.repositories.admint.entities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.samtel.repo.admint.entities.AplicacionIntegraEntity;

@Repository
public interface IAplicacionIntegraRepository extends CrudRepository<AplicacionIntegraEntity, Long>, JpaRepository<AplicacionIntegraEntity, Long>{

}
