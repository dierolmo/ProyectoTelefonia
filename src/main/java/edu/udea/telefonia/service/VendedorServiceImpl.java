package edu.udea.telefonia.service;

import edu.udea.telefonia.model.Vendedor;
import edu.udea.telefonia.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VendedorServiceImpl implements VendedorService {

    @Autowired
    private VendedorRepository vendedorRepository;

    @Override
    public List<Vendedor> listarVendedores() {
        return vendedorRepository.findAll();
    }

    @Override
    public void guardarVendedor(Vendedor vendedor) {
        vendedorRepository.save(vendedor);
    }
}