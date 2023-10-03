package apap.ti.silogistik2106750566.service;

import apap.ti.silogistik2106750566.DTO.response.DetailGudangResponse;
import apap.ti.silogistik2106750566.model.Gudang;
import apap.ti.silogistik2106750566.model.GudangBarang;

import java.util.List;

public interface GudangService {
    List<Gudang> getListGudang();
    DetailGudangResponse getDetailGudang(Long id);
    List<GudangBarang> cariBarang(String sku);
}
