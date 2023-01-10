package com.alura.travelagency.dao;

import com.alura.travelagency.model.PackageDeal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PackageDAO {
    public List<PackageDeal> list() {
        return new ArrayList<>(Arrays.asList(
                new PackageDeal("São Paulo", "sao_paulo_sp", 2, BigDecimal.valueOf(243.99)),
                new PackageDeal("Belo Horizonte", "belo_horizonte_mg", 3, BigDecimal.valueOf(421.50)),
                new PackageDeal("Recife", "recife_pe", 4, BigDecimal.valueOf(754.20)),
                new PackageDeal("Rio de Janeiro", "rio_de_janeiro_rj", 6, BigDecimal.valueOf(532.55)),
                new PackageDeal("Salvador", "salvador_ba", 5, BigDecimal.valueOf(899.99)),
                new PackageDeal("Foz do Iguaçu", "foz_do_iguacu_pr", 1, BigDecimal.valueOf(289.90))));
    }
}
