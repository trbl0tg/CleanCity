package ua.legendarytec.CleanCity.domains.enums;

public enum ReportStatus implements ReportEnumeration {
    UNDER_CONSIDERATION("Under consideration"), QUEUE("Queue"), REJECTED("Rejected"), SOLVED("Solved");

    private final String fullState;
    ReportStatus(final String s )
    {
        this.fullState = s;
    }
    public String getFullState()
    {
        return fullState;
    }
}
