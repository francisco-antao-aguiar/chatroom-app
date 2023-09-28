package com.chatroom.repository;

import com.chatroom.entity.Countries;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloWorldRepository extends JpaRepository<Countries, Integer> {

}
