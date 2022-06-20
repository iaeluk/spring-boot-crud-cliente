package br.com.lucas.learn.cliente.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nome_cliente", nullable = false)
    private String nome;
    @Column(name = "email_cliente", nullable = false)
    private String email;
    @Column(name = "cpf_cliente")
    private String cpf;
}
