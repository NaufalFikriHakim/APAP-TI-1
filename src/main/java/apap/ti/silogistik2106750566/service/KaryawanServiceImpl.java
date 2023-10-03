package apap.ti.silogistik2106750566.service;

import apap.ti.silogistik2106750566.model.Karyawan;
import apap.ti.silogistik2106750566.repository.KaryawanDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KaryawanServiceImpl implements KaryawanService{

    @Autowired
    KaryawanDB karyawanDb;

    @Override
    public List<Karyawan> getListKaryawan(){
        return karyawanDb.findAll();
    }
}
