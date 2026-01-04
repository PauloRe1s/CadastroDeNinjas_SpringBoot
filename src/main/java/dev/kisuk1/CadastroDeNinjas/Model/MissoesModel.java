package dev.kisuk1.CadastroDeNinjas.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_missoes")
    private Long id;

    @Column(name = "nome",nullable = false)
    private String nome;

    @Column(name = "dificuldade",nullable = false)
    private String dificuldade;

    @OneToMany(mappedBy = "missoes")
    private List<NinjasModel> ninja;
}
