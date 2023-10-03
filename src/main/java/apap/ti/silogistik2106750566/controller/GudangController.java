package apap.ti.silogistik2106750566.controller;

import apap.ti.silogistik2106750566.DTO.response.CariBarangResponse;
import apap.ti.silogistik2106750566.DTO.response.DetailGudangResponse;
import apap.ti.silogistik2106750566.model.Barang;
import apap.ti.silogistik2106750566.model.Gudang;
import apap.ti.silogistik2106750566.model.GudangBarang;
import apap.ti.silogistik2106750566.service.GudangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class GudangController {
    @Autowired
    private GudangService gudangService;

    @GetMapping("/gudang")
    private String daftarGudang(Model model){
        List<Gudang> listGudang = gudangService.getListGudang();
        model.addAttribute("listGudang", listGudang);
        return "gudang";
    }

    @GetMapping("/gudang/{id}")
    private String detailGudang(@PathVariable Long id,  Model model){
        DetailGudangResponse listGudang = gudangService.getDetailGudang(id);
        model.addAttribute("listGudang", listGudang);
        return "gudang";
    }

    @GetMapping("/gudang/cari-barang")
    private String cariBarangWithParam(@RequestParam String sku, Model model){
        List<CariBarangResponse> listGudang = gudangService.cariBarangWithParam(sku);
        model.addAttribute("listGudang", listGudang);
        return "gudang";
    }

    @GetMapping("/gudang/cari-barang")
    private String cariBarang(Model model){
        List<Barang> listBarang = gudangService.getListBarang();
        model.addAttribute("listBarang", listBarang);
        return "gudang";
    }

}
