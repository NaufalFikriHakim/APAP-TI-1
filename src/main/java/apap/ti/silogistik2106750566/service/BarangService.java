package apap.ti.silogistik2106750566.service;

import apap.ti.silogistik2106750566.model.Barang;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BarangService {
    List<Barang> getListBarang();
}
