package ua.legendarytec.CleanCity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.legendarytec.CleanCity.domains.Report;
import ua.legendarytec.CleanCity.domains.enums.ReportType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class ReportController {


    @Autowired
    private ua.legendarytec.CleanCity.repos.reportRepo reportRepo;

    @GetMapping("/addreport")
    public String reports(Model model){
        List<ReportType> reportTypes = new ArrayList<ReportType>( Arrays.asList(ReportType.values() ));
        model.addAttribute("reportTypes", reportTypes);
        return "reports";
    }

    @PostMapping
    public String addReport(
            @RequestParam String reportName,
            @RequestParam String reportDescription,
            @RequestParam(required = false) String reportType
                            ){
        Report reportToDatabase = new Report();
        reportToDatabase.setReportName(reportName);
        reportToDatabase.setReportDescription(reportDescription);
        reportToDatabase.setReportType(ReportType.valueOf(reportType));


        reportRepo.save(reportToDatabase);
        return "reports";
    }


}
