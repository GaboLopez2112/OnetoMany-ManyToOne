package com.uisrael.relacion.OnetoMnay.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tbl_ordenes")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cliente;
    private String nombre;
    @OneToMany(mappedBy = "ordenes",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Ordenes> ordenes = new ArrayList<>();
}
