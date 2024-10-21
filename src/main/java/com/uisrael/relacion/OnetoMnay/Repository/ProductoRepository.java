package com.uisrael.relacion.OnetoMnay.Repository;

import com.uisrael.relacion.OnetoMnay.Model.Local;
import com.uisrael.relacion.OnetoMnay.Model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long> {
}
