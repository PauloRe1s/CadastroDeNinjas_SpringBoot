package dev.kisuk1.CadastroDeNinjas.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_ninjas")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ninjas")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email",nullable = false,unique = true)
    private String email;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "idade",nullable = false)
    private int idade;

    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private List<MissoesModel> missoes;
}
