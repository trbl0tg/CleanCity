package ua.legendarytec.CleanCity.repos;

import org.springframework.data.repository.CrudRepository;
import ua.legendarytec.CleanCity.domains.Report;

public interface reportRepo extends CrudRepository<Report, Long> {
}
