<h1>

</h1>

<form action="/addreport" method="post">

    <input type="text" name="reportName">
    <input type="text" name="reportDescription">
    <select name="reportType" id="">
    <#list reportTypes as reportType>
        <option value="${reportType.getFullState()}">${reportType.getFullState()}</option>
    </#list>
    </select>
    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Submit report</button>
</form>