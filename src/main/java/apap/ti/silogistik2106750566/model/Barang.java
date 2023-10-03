package apap.ti.silogistik2106750566.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "BARANG")
public class Barang {
    @Id
    @Column(name = "sku", nullable = false)
    private String sku;

    @Column(name = "tipe_barang", nullable = false)
    private Integer tipeBarang;

    @Column(name = "merk", nullable = false, length = 255)
    private String merk;

    @Column(name = "harga_barang", nullable = false)
    private Long hargaBarang;
}
