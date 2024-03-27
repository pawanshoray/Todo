package com.todo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="TodoData")
public class TodoData{

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long sNo;
  private String todoName;
  private String todoTask;
  private String todoStatus;

}
