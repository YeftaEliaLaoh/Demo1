package com.example.demo.repositories;

import com.example.demo.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public class UserRepository implements CrudRepository<User, Long>
{


     @Override
     public <S extends User> S save( S entity )
     {
          return null;
     }

     @Override
     public <S extends User> Iterable<S> saveAll( Iterable<S> entities )
     {
          return null;
     }

     @Override
     public Optional<User> findById( Long aLong )
     {
          return Optional.empty();
     }

     @Override
     public boolean existsById( Long aLong )
     {
          return false;
     }

     @Override
     public Iterable<User> findAll()
     {
          return null;
     }

     @Override
     public Iterable<User> findAllById( Iterable<Long> longs )
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
     public void delete( User entity )
     {

     }

     @Override
     public void deleteAll( Iterable<? extends User> entities )
     {

     }

     @Override
     public void deleteAll()
     {

     }
}