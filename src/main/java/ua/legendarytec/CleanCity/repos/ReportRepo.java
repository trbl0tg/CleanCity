package ua.legendarytec.CleanCity.repos;

import org.springframework.data.repository.CrudRepository;
import ua.legendarytec.CleanCity.domains.Report;

import java.util.List;

public interface ReportRepo extends CrudRepository<Report, Long> {

   List<Report> findReportsByReportNameContains(String searchword);

}
