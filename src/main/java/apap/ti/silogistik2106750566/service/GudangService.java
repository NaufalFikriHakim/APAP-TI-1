package apap.ti.silogistik2106750566.service;

import apap.ti.silogistik2106750566.DTO.response.CariBarangResponse;
import apap.ti.silogistik2106750566.DTO.response.DetailGudangResponse;
import apap.ti.silogistik2106750566.model.Barang;
import apap.ti.silogistik2106750566.model.Gudang;
import apap.ti.silogistik2106750566.model.GudangBarang;

import java.util.List;

public interface GudangService {
    List<Gudang> getListGudang();
    DetailGudangResponse getDetailGudang(Long id);
    List<CariBarangResponse> cariBarangWithParam(String sku);
    List<Barang> getListBarang();
}
