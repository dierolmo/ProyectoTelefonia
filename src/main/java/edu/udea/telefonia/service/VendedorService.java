package edu.udea.telefonia.service;

import edu.udea.telefonia.model.Vendedor;
import java.util.List;

public interface VendedorService {
    List<Vendedor> listarVendedores();
    void guardarVendedor(Vendedor vendedor);
}