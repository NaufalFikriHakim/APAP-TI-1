package apap.ti.silogistik2106750566.repository;

import apap.ti.silogistik2106750566.model.Barang;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface BarangDB extends JpaRepository<Barang, String>{
    List<Barang> findALlOrderByNamaBarangAsc();
}
