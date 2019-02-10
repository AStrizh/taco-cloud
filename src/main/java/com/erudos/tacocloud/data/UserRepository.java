package com.erudos.tacocloud.data;

import com.erudos.tacocloud.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, Long> {

    User findByUsername(String username);
}
