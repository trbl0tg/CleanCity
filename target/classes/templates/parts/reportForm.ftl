<h1>

</h1>

<form>


</form>

<form action="/addreport" method="post">
    <div class="form-group">
        <label for="exampleInputEmail1">Report Name</label>
        <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="reportName" placeholder="Enter the name of report" name="reportName">
        <small id="emailHelp" class="form-text text-muted">A few words that describes a problem.</small>
        <label for="exampleInputEmail1">Report description</label>
        <input type="text" class="form-control" id="inputDescription" aria-describedby="reportName" placeholder="Enter the description of report" name="reportDescription">
        <small id="emailHelp" class="form-text text-muted">Describe a problem</small>
    <#--<ul>-->
        <#list reportTypes as report>
            <li style="display: inline-block">
                    <input type="radio" name="reportType" value="${report.toString()}"> <span>${report.getFullState()}</span>
            </li>
        </#list>
    <#--</ul>-->
    </div>
    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Submit report</button>
    </div>
</form>


<div id="map"></div>

<#--++++++++++++++++++++++++++++++++-->
