package apap.ti.silogistik2106750566.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PERMINTAAN_PENGIRIMAN_BARANG")
public class PermintaanPengirimanBarang {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_permintaan_pengiriman", nullable = false)
    private PermintaanPengiriman permintaanPengiriman;

    @ManyToOne
    @JoinColumn(name = "sku_barang", referencedColumnName = "sku", nullable = false)
    private Barang barang;

    @Column(name = "jumlah", nullable = false)
    private Integer jumlah;
}
