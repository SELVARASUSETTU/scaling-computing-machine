package com.sample.demo.sample.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

@Entity
    @Table(name = "users")
    public class Users{

    @jakarta.persistence.Id
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String firstName;

        private String lastName;

        private String emailId;

        private String password;

        private String address;

        @Transient // Exclude from database mapping
        private String confirmPassword;

        private String resetToken;

        public Users() {
        }

        public Users(String firstName, String lastName, String emailId, String password, String address) {
            super();
            this.firstName = firstName;
            this.lastName = lastName;
            this.emailId = emailId;
            this.password = password;
            this.address = address;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getEmailId() {
            return emailId;
        }

        public void setEmailId(String emailId) {
            this.emailId = emailId;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getResetToken() {
            return resetToken;
        }

        public void setResetToken(String resetToken) {
            this.resetToken = resetToken;
        }

        public String getConfirmPassword() {
            return confirmPassword;
        }

        public void setConfirmPassword(String confirmPassword) {
            this.confirmPassword = confirmPassword;
        }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

