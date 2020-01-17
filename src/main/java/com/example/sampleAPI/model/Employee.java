package com.example.sampleAPI.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "employees")
public class Employee {

//   @Id`
//   @Column(name = "id", nullable = false)
//   protected UUID id;

   @Id
   @GeneratedValue(generator = "UUID")
   @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
   @JsonProperty
   @Column(name = "id", updatable = false, nullable = false)
   private UUID id;

   @JsonProperty(value = "first_name")
   @Column(name = "first_name", nullable = false)
   private String firstName;

   @JsonProperty(value = "last_name")
   @Column(name = "last_name", nullable = false)
   private String lastName;

   @JsonProperty(value = "email_id")
   @Column(name = "email_address", nullable = false)
   private String emailId;

   public Employee() {
   }

   public Employee(String emailId, String firstName, UUID id, String lastName) {
      this.emailId = emailId;
      this.firstName = firstName;
      this.id = id;
      this.lastName = lastName;
   }

   public String getEmailId() {
      return emailId;
   }

   public void setEmailId(String emailId) {
      this.emailId = emailId;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public UUID getId() {
      return id;
   }

   public void setId(UUID id) {
      this.id = id;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   @Override
   public String toString() {
      return "Employee{" +
         "emailId='" + emailId + '\'' +
         ", firstName='" + firstName + '\'' +
         ", id=" + id +
         ", lastName='" + lastName + '\'' +
         '}';
   }
}
