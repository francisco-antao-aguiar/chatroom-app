package com.chatroom.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//esta merda nao precisa de ter o @table?????????????????????? chico
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Countries {
    @Id
    private Integer id;
    private String name;
}
