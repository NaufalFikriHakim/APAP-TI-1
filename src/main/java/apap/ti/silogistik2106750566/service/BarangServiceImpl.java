package apap.ti.silogistik2106750566.service;

import apap.ti.silogistik2106750566.model.Barang;
import apap.ti.silogistik2106750566.repository.BarangDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarangServiceImpl implements BarangService{
    @Autowired
    BarangDB barangDB;

    @Override
    public List<Barang> getListBarang(){
        return barangDB.findAll();
    }
}
