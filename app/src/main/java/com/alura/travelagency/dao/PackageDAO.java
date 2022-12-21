package com.alura.travelagency.dao;

import com.alura.travelagency.model.PackageDeal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PackageDAO {
    public List<PackageDeal> list() {
        return new ArrayList<>(Arrays.asList(
                new PackageDeal("São Paulo", "sao_paulo_sp", 2, new BigDecimal(243.99)),
                new PackageDeal("Belo Horizonte", "belo_horizonte_mg", 3, new BigDecimal(421.50)),
                new PackageDeal("Recife", "recife_pe", 4, new BigDecimal(754.20)),
                new PackageDeal("Rio de Janeiro", "rio_de_janeiro_rj", 6, new BigDecimal(532.55)),
                new PackageDeal("Salvador", "salvador_ba", 5, new BigDecimal(899.99)),
                new PackageDeal("Foz do Iguaçu", "foz_do_iguacu_pr", 1, new BigDecimal(289.90))));
    }

}
