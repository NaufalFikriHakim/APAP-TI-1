package apap.ti.silogistik2106750566.service;

import apap.ti.silogistik2106750566.DTO.response.DetailGudangResponse;
import apap.ti.silogistik2106750566.model.Barang;
import apap.ti.silogistik2106750566.model.Gudang;
import apap.ti.silogistik2106750566.model.GudangBarang;
import apap.ti.silogistik2106750566.repository.GudangBarangDB;
import apap.ti.silogistik2106750566.repository.GudangDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GudangServiceImpl implements GudangService{

    @Autowired
    GudangDB gudangDb;

    @Autowired
    GudangBarangDB gudangBarangDb;

    @Override
    public List<Gudang> getListGudang(){
        return gudangDb.findAll();
    }

    @Override
    public DetailGudangResponse getDetailGudang(Long id){
        List<GudangBarang> gudangBarang = gudangBarangDb.findAllByGudangId(id);
        if (gudangBarang.isEmpty()){
            return null;
        }
        DetailGudangResponse detailGudangResponse = new DetailGudangResponse();
        detailGudangResponse.setNama(gudangBarang.get(0).getGudang().getNama());
        detailGudangResponse.setAlamatGedung(gudangBarang.get(0).getGudang().getAlamatGudang());
        detailGudangResponse.setListBarang(gudangBarang.stream().map(GudangBarang::getBarang).toList());
        return detailGudangResponse;
    }

    @Override
    public List<GudangBarang> cariBarang(String sku){
        List<GudangBarang> gudangBarang = gudangBarangDb.findAllByBarangSku(sku);
        return gudangBarang;
    }
}
