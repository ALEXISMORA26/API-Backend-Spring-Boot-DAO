package com.arma.personaDao;

import com.arma.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PersonaDao extends JpaRepository<Persona, Long> {
    
}
