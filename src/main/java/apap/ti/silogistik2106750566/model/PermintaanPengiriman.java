package apap.ti.silogistik2106750566.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PERMINTAAN_PENGIRIMAN")
public class PermintaanPengiriman {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nama_penerima", nullable = false, length = 255)
    private String namaPenerima;

    @Column(name = "alamat_penerima", nullable = false, length = 255)
    private String alamatPenerima;

    @Column(name = "biaya_pengiriman", nullable = false)
    private Long biayaPengiriman;

    @Column(name = "jenis_layanan", nullable = false, length = 255)
    private String jenisLayanan;

    @Column(name = "waktu_permintaan", nullable = false)
    private Date waktuPermintaan;
}
