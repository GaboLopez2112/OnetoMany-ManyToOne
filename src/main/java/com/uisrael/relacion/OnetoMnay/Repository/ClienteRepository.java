package com.uisrael.relacion.OnetoMnay.Repository;

import com.uisrael.relacion.OnetoMnay.Model.Cliente;
import jakarta.persistence.GeneratedValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
