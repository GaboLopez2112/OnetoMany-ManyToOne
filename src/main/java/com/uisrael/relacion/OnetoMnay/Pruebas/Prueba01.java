package com.uisrael.relacion.OnetoMnay.Pruebas;

import com.uisrael.relacion.OnetoMnay.Model.Local;
import com.uisrael.relacion.OnetoMnay.Model.Producto;
import com.uisrael.relacion.OnetoMnay.Repository.LocalRepository;
import com.uisrael.relacion.OnetoMnay.Repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class Prueba01 implements CommandLineRunner {
    @Autowired
    private LocalRepository localRepository;
    @Autowired
    private ProductoRepository productoRepository;
    @Override
    public void run(String... args)throws Exception{
        Local local = new Local();
        local.setCiudad("QUITO");
        local.setCodigoPostal("1234");

        Producto producto1 = new Producto();
        Producto producto2 = new Producto();
        producto1.setTipo_producto("Cuchillos");
        producto2.setTipo_producto("Almohada");
        local.getProducto().add(producto1);
        local.getProducto().add(producto2);
        localRepository.save(local);

        Optional<Local> localGuardado = localRepository.findById(local.getId());
        localGuardado.ifPresent(l ->{
            System.out.println("local leido por ID"+ l.getCiudad());
            l.setCiudad("Nueva cuidad");
            localRepository.save(l);
            System.out.println("LOCAL ACTUALIZADO"+l.getCiudad());
        });
        List<Local> locales = localRepository.findAll();
        System.out.println("-"+ local.getCiudad());

        localRepository.delete(local);

        System.out.println("Locales eliminados");


    }
}
