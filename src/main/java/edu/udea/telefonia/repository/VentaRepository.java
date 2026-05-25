package edu.udea.telefonia.repository;

import edu.udea.telefonia.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<Venta, Long> {
}