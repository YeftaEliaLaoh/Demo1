package com.example.demo.repositories;

import com.example.demo.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public class CustomerRepository implements CrudRepository<Customer, Long>
{

    List<Customer> findByLastName(String lastName);

    Customer findById(long id);
    @Override
    public <S extends Customer> S save( S entity )
    {
        return null;
    }

    @Override
    public <S extends Customer> Iterable<S> saveAll( Iterable<S> entities )
    {
        return null;
    }

    @Override
    public Optional<Customer> findById( Long aLong )
    {
        return Optional.empty();
    }

    @Override
    public boolean existsById( Long aLong )
    {
        return false;
    }

    @Override
    public Iterable<Customer> findAll()
    {
        return null;
    }

    @Override
    public Iterable<Customer> findAllById( Iterable<Long> longs )
    {
        return null;
    }

    @Override
    public long count()
    {
        return 0;
    }

    @Override
    public void deleteById( Long aLong )
    {

    }

    @Override
    public void delete( Customer entity )
    {

    }

    @Override
    public void deleteAll( Iterable<? extends Customer> entities )
    {

    }

    @Override
    public void deleteAll()
    {

    }
}


