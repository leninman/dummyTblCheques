package com.bdv.microservicios.Msvctblcheques.model.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.awt.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name="TblCheques")
public class Tblcheque implements Serializable {

    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name="FechaContable")
    String fechacontable;


    @Column(name="Cod_Banco")
    String codBanco;


    @Column(name="Agencia")
    String agencia;


    @Column(name="Cajero")
    String cajero;

    @Column(name="Din")
    String din;


    @Column(name="Serial")
    String serial;


    @Column(name="Banco")
    String banco;


    @Column(name="Oficina")
    String oficina;


    @Column(name="Dv")
    String dv;


    @Column(name="Cuenta")
    String cuenta;


    @Column(name="TranCode")
    String trancode;


    @Column(name="Monto")
    String monto;


    @Column(name="Front")
    String front;

    @Column(name="Rear")
    String rear;


    @Column(name="Corregido")
    String corregido;


    @Column(name="Transmitido")
    String trasmitido;


    @Column(name="CuentaDepo")
    String cuentadepo;


    @Column(name="SerialP")
    String serialp;


    @Column(name="Dna")
    String dna;


    @Column(name="Estatus")
    String estatus;


    @Column(name="Auxiliar1")
    String auxiliar1;

    @Column(name="Auxiliar2")
    String auxiliar2;

    @Column(name="Auxiliar3")
    String auxiliar3;

    @Column(name="Auxiliar4")
    String auxiliar4;

    @Column(name="Auxiliar5")
    String auxiliar5;


    @Column(name="TransmitidoOracle")
    String transmitidooracle;



}
