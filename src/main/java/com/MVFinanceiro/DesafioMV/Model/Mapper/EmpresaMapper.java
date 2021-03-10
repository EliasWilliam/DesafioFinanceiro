package com.MVFinanceiro.DesafioMV.Model.Mapper;

import com.MVFinanceiro.DesafioMV.Model.Empresa.EmpresaDTO;

public class EmpresaMapper {


    private EmpresaMapper() {

    }

    public static EmpresaDTO mapper (Empresa empresa) {

        EmpresaDTO empresaDTO = new EmpresaDTO();

        empresaDTO.setId(empresa.getId());
        empresaDTO.setCnpj(empresa.getCnpj());
        empresaDTO.setNome(empresa.getNome());

        return empresaDTO;
    }
}
