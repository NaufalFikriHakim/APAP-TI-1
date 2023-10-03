package apap.ti.silogistik2106750566.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "GUDANG")
public class Gudang {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nama", nullable = false, length = 255)
    private String nama;

    @Column(name = "alamat_gudang", nullable = false, length = 255)
    private String alamatGudang;
}
