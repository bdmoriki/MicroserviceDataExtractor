package com.itau.microserviceDataExtract.az1.dao.az2;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.itau.microserviceDataExtract.domain.az2.Cliente;

@Repository
public interface ClienteRepositoryAz2 extends CrudRepository<Cliente, Integer> {

}
