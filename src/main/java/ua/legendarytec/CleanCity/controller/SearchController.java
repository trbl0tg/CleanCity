package ua.legendarytec.CleanCity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.legendarytec.CleanCity.domains.Report;
import ua.legendarytec.CleanCity.repos.ReportRepo;

import java.util.List;

@Controller
public class SearchController {



    @Autowired
    private ReportRepo reportRepo;

    @GetMapping("/search")
    public String search(@RequestParam(required = false)String searchword, Model model){

        if (!StringUtils.isEmpty(searchword)){
            List<Report> reportsFromDb = reportRepo.findReportsByReportNameContains(searchword);
            model.addAttribute("filteredReports", reportsFromDb);
        } else {
            Iterable<Report> reports = reportRepo.findAll();
            model.addAttribute("filteredReports", reports);
        }

        return "search";
    }



}
