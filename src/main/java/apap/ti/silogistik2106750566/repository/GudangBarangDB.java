package apap.ti.silogistik2106750566.repository;

import apap.ti.silogistik2106750566.model.GudangBarang;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GudangBarangDB extends JpaRepository<GudangBarang, Long> {
    List<GudangBarang> findAllByGudangId(Long id);
    List<GudangBarang> findAllByBarangSku(String sku);
}
