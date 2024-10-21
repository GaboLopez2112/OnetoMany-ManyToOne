package com.uisrael.relacion.OnetoMnay.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tbl_local")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Local {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ciudad;
    private String codigoPostal;
    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "producto_id")
    private List<Producto> producto = new ArrayList<>();

}