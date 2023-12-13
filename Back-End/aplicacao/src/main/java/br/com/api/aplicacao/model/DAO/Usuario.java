package br.com.api.aplicacao.model.DAO;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;


@Data
@Entity
@Table (name="tb_usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (length = 200, nullable = true)
    private String nome;

    @Column(length = 50, nullable = true)
    private String senha;
    @Column(columnDefinition = "TEXT", nullable = true)
    private String email;
    @Column(length = 200, nullable = true)
    private String telefone;

}

