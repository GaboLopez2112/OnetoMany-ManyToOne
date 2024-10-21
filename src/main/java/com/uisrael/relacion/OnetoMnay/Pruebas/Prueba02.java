package com.uisrael.relacion.OnetoMnay.Pruebas;

import com.uisrael.relacion.OnetoMnay.Model.Cliente;
import com.uisrael.relacion.OnetoMnay.Model.Ordenes;
import com.uisrael.relacion.OnetoMnay.Repository.ClienteRepository;
import com.uisrael.relacion.OnetoMnay.Repository.OrdenesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Prueba02 implements CommandLineRunner {
    @Autowired
    private OrdenesRepository ordenesRepository;
    @Autowired
    private ClienteRepository clienteRepository;

    public void run(String... args)throws Exception{
        Cliente cliente = new Cliente();
        cliente.setNombre("JUAN");
        Ordenes ordenes = new Ordenes();
        ordenes.setDetalle_orden("PELUQUERIA");
        ordenes.setCliente(cliente);
        cliente.getOrdenes().add(ordenes);
        clienteRepository.save(cliente);
    }


}
