package com.gft.ms.email.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gft.ms.email.models.EmailModel;

@Repository
public interface EmailRepository extends JpaRepository<EmailModel, UUID>{

}
