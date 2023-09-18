package com.kareem.ormnativequery.orm.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kareem.ormnativequery.orm.entities.User;
import com.kareem.ormnativequery.orm.entities.UserJoin;

@Repository
public interface UserRepo extends JpaRepository<User, Long>  {
      
    List<User> findByName(String name);
    User findById(long id);

    @Query(value = "SELECT * FROM user_account u join stories s on u.id = s.user_id having u.id = ?1", nativeQuery = true)
    UserJoin findByNativeQuery(long id);

}
