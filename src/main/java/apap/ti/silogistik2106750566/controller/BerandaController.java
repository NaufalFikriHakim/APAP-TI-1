package apap.ti.silogistik2106750566.controller;

import apap.ti.silogistik2106750566.service.BarangService;
import apap.ti.silogistik2106750566.service.GudangService;
import apap.ti.silogistik2106750566.service.KaryawanService;
import apap.ti.silogistik2106750566.service.PermintaanPengirimanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BerandaController {
    @Autowired
    private BarangService barangService;

    @Autowired
    private GudangService gudangService;

    @Autowired
    private KaryawanService karyawanService;

    @Autowired
    private PermintaanPengirimanService permintaanPengirimanService;

    @GetMapping("/")
    public String beranda(Model model) {
        model.addAttribute("panjangListBarang", barangService.getListBarang().size());
        model.addAttribute("panjangListGudang", gudangService.getListGudang().size());
        model.addAttribute("panjangListKaryawan", karyawanService.getListKaryawan().size());
        model.addAttribute("panjangListPermintaanPengiriman", permintaanPengirimanService.getListPermintaanPengiriman().size());
        return "home";
    }
}
