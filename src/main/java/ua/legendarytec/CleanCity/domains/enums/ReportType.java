package ua.legendarytec.CleanCity.domains.enums;

import javax.persistence.Enumerated;

public enum ReportType implements ReportEnumeration {
    PLASTIC("Plastic"), GLASS("Glass"), SCRAP_METAL("Scrap metal"), BIOHAZARD("Biohazard"), MIXED("Mixed");

    private final String fullState;
    ReportType(final String s )
    {
        this.fullState = s;
    }
    public String getFullState()
    {
        return fullState;
    }

}

