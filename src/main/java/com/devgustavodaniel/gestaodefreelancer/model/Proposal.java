package com.devgustavodaniel.gestaodefreelancer.model;

import jakarta.persistence.Table;
import jdk.jfr.Enabled;

import java.math.BigDecimal;
import java.time.LocalDate;

@Enabled
@Table(name = "proposal")
public class Proposal {

    private Long idProposal;
    private BigDecimal valueOffered;
    private LocalDate deliveryTime;

}
