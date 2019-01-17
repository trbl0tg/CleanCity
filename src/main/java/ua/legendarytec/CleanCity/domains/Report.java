package ua.legendarytec.CleanCity.domains;


import lombok.Data;
import ua.legendarytec.CleanCity.domains.enums.ReportType;

import javax.persistence.*;

@Data
@Entity
@Table(name = "reports")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reportName;
    private String reportDescription;

    @Enumerated(EnumType.STRING)
    private ReportType reportType;

    public Report() {
    }

    public Report(String reportName, String reportDescription, ReportType reportType) {
        this.reportName = reportName;
        this.reportDescription = reportDescription;
        this.reportType = reportType;
    }
}
