package apap.ti.silogistik2106750566.service;

import apap.ti.silogistik2106750566.model.PermintaanPengiriman;
import apap.ti.silogistik2106750566.repository.PermintaanPengirimanDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermintaanPengirimanServiceImpl implements PermintaanPengirimanService{
    @Autowired
    PermintaanPengirimanDB permintaanPengirimanDB;

    @Override
    public List<PermintaanPengiriman> getListPermintaanPengiriman(){
        return permintaanPengirimanDB.findAll();
    }
}
