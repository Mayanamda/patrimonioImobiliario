package com.empresa.controller;

import com.empresa.model.BemImovel;
import com.empresa.model.Empresa;
import com.empresa.model.Pessoa;

import java.util.HashSet;
import java.util.Set;

public class EmpresaController {
    private Set<String> pessoasContabilizadas;

    public EmpresaController() {
        pessoasContabilizadas = new HashSet<>();
    }

    public double calcularPatrimonioImovel(Empresa empresa) {
        pessoasContabilizadas.clear();
        return calcularPatrimonioImovelRecursivo(empresa);
    }

    private double calcularPatrimonioImovelRecursivo(Pessoa pessoa) {
        if (pessoasContabilizadas.contains(pessoa.getIdentificacao())) {
            // Evita contabilizar a mesma pessoa mais de uma vez
            return 0;
        }

        double totalPatrimonio = 0;
        for (BemImovel bemImovel : pessoa.getBensImoveis()) {
            totalPatrimonio += bemImovel.getValor();
        }

        pessoasContabilizadas.add(pessoa.getIdentificacao());

        if (pessoa instanceof Empresa) {
            Empresa empresa = (Empresa) pessoa;
            for (Pessoa socio : empresa.getSocios()) {
                totalPatrimonio += calcularPatrimonioImovelRecursivo(socio);
            }
        }

        return totalPatrimonio;
    }
}