package com.alura.travelagency.dao;

import com.alura.travelagency.model.TripPackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PackageDAO {
    public List<TripPackage> list() {
        return new ArrayList<>(Arrays.asList(
                new TripPackage("São Paulo", "sao_paulo_sp", 2, BigDecimal.valueOf(243.99)),
                new TripPackage("Belo Horizonte", "belo_horizonte_mg", 3, BigDecimal.valueOf(421.50)),
                new TripPackage("Recife", "recife_pe", 4, BigDecimal.valueOf(754.20)),
                new TripPackage("Rio de Janeiro", "rio_de_janeiro_rj", 6, BigDecimal.valueOf(532.55)),
                new TripPackage("Salvador", "salvador_ba", 5, BigDecimal.valueOf(899.99)),
                new TripPackage("Foz do Iguaçu", "foz_do_iguacu_pr", 1, BigDecimal.valueOf(289.90))));
    }
}
