<h1>
    Reports:
</h1>

<#list reports as report>
    <div>${report.getReportName()} <span>${report.getReportDescription()}</span> <i>${report.getReportType()}</i> </div>
<#else>
no reports
</#list>