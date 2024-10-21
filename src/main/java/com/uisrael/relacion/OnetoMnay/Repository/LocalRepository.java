package com.uisrael.relacion.OnetoMnay.Repository;

import com.uisrael.relacion.OnetoMnay.Model.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalRepository extends JpaRepository<Local,Long> {

}
