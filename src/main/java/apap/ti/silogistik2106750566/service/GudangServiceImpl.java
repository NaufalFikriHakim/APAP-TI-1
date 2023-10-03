package apap.ti.silogistik2106750566.service;

import apap.ti.silogistik2106750566.DTO.response.CariBarangResponse;
import apap.ti.silogistik2106750566.DTO.response.DetailGudangResponse;
import apap.ti.silogistik2106750566.model.Barang;
import apap.ti.silogistik2106750566.model.Gudang;
import apap.ti.silogistik2106750566.model.GudangBarang;
import apap.ti.silogistik2106750566.repository.BarangDB;
import apap.ti.silogistik2106750566.repository.GudangBarangDB;
import apap.ti.silogistik2106750566.repository.GudangDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GudangServiceImpl implements GudangService{

    @Autowired
    GudangDB gudangDb;

    @Autowired
    BarangDB barangDb;

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
        detailGudangResponse.setListBarang(gudangBarang.stream().map(GudangBarang::getBarang).collect(Collectors.toList()));
        return detailGudangResponse;
    }

    @Override
    public List<CariBarangResponse> cariBarangWithParam(String sku){
        List<GudangBarang> gudangBarang = gudangBarangDb.findAllByBarangSku(sku);
        if (gudangBarang.isEmpty()){
            return null;
        }
        List<CariBarangResponse> cariBarangResponseList = gudangBarang.stream().map((barang) -> {
            CariBarangResponse cariBarangResponse = new CariBarangResponse();
            cariBarangResponse.setNama(barang.getGudang().getNama());
            cariBarangResponse.setAlamat(barang.getGudang().getAlamatGudang());
            cariBarangResponse.setJumlah(barang.getStok());
            return cariBarangResponse;
        }).toList();

        return cariBarangResponseList;
    }

    @Override
    public List<Barang> getListBarang(){
        List<Barang> barang = barangDb.findALlOrderByNamaBarangAsc();
        if (barang.isEmpty()){
            return null;
        }
        return barang;
    }
}
