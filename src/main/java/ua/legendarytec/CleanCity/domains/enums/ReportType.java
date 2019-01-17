package ua.legendarytec.CleanCity.domains.enums;

import javax.persistence.Enumerated;

public enum ReportType {
    PLASTIC("PLASTIC"), GLASS("GLASS"), SCRAP_METAL("SCRAP_METAL"), MIXED("MIXED");

    private String fullState;

    private ReportType( String s )
    {
        fullState = s;
    }

    public String getFullState()
    {
        return fullState;
    }
}

