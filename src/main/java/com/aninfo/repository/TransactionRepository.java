package com.aninfo.repository;

import java.util.List;

import com.aninfo.model.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TransactionRepository extends CrudRepository<Transaction, Long> {

    Transaction findTransactionById(Long id);

    List<Transaction> findTransactionsByCbuAccount(Long cbuAccount);

    @Override
    List<Transaction> findAll();

}