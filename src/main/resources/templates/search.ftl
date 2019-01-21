<#include "parts/security.ftl">
<#import "parts/common.ftl" as c>

<@c.page>

<div class="container">

    <#include "parts/searchForm.ftl">

<div class="display-4">Reports:</div>


    <#--${report.getId()}-->
    <#--${report.getReportName()}-->
    <#--${report.getReportDescription()}-->








        <#list filteredReports as report>

        <div class="card my-3" style="height: 200px; width: 100%; display: flex; flex-flow: row" >

              <span style="position: absolute; right: 3%; top: 10px;">
                  ${report.getReportType().getFullState()}
              </span>


            <div style="width:200px; height: 200px; background-color:lightgreen;"></div>

            <#--<div class="redblock" style="width: 100px; height: 100px; background-color: red;">-->

            <#--</div>-->

            <div class="row" >
                <div class="col">
                    <ul class="list-group list-group-flush">
                        <li class="list-group-item">
                            <h1>
                                ${report.getReportName()}
                            </h1>


                        </li>
                    </ul>

                    <ul class="list-group list-group-flush">
                        <li class="list-group-item">
                            <p>
                                ${report.getReportDescription()}
                            </p>
                        </li>
                    </ul>
                </div>
            </div>

        </div>

        <#else>
        <h1>Sorry, no reports available.</h1>
        </#list>


</div>

</@c.page>

