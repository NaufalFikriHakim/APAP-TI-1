package apap.ti.silogistik2106750566.DTO.response;

import apap.ti.silogistik2106750566.model.Barang;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DetailGudangResponse {
    private String nama;
    private String alamatGedung;
    private List<Barang> listBarang;
}
