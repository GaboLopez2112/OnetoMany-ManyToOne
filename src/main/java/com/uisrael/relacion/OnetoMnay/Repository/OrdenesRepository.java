package com.uisrael.relacion.OnetoMnay.Repository;

import com.uisrael.relacion.OnetoMnay.Model.Ordenes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdenesRepository extends JpaRepository<Ordenes,Long> {
}
