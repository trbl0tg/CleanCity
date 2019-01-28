package ua.legendarytec.CleanCity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.legendarytec.CleanCity.domains.Report;
import ua.legendarytec.CleanCity.domains.enums.ReportStatus;
import ua.legendarytec.CleanCity.domains.enums.ReportType;
import ua.legendarytec.CleanCity.repos.ReportRepo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class ReportController {


    @Autowired
    private ReportRepo reportRepo;

    @GetMapping("/addreport")
    public String reports(Model model){
        List<ReportType> reportTypes = new ArrayList<ReportType>( Arrays.asList(ReportType.values() ));
        model.addAttribute("reportTypes", reportTypes);
        return "reports";
    }

    @GetMapping("/map")
    public String map(){

        return "map";
    }

    @PostMapping
    public String addReport(
            @RequestParam String reportName,
            @RequestParam String reportDescription,
            @RequestParam String reportType
    ){

        Report reportToDatabase = new Report();
        reportToDatabase.setReportName(reportName);
        reportToDatabase.setReportDescription(reportDescription);
//        reportToDatabase.setReportType((ReportType) ReportUtils.getTypeOfReport(reportType));
        reportToDatabase.setReportStatus(ReportStatus.UNDER_CONSIDERATION);
        reportToDatabase.setReportType(ReportType.valueOf(reportType));

        reportRepo.save(reportToDatabase);
        return "main";
    }




}
