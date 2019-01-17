<#include "/parts/security.ftl">

<html>

<body>

<#if isRegistrated>
    REGISTRATED
    <#else>
    NOT REGISTRATED
</#if>
${name?if_exists}

</body>

</html>