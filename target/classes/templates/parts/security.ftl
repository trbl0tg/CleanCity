<#assign
known = Session.SPRING_SECURITY_CONTEXT??
>

<#if known>
    <#assign user = Session.SPRING_SECURITY_CONTEXT.authentication.principal
    name = user.getName()
    isRegistrated = true
    currentUserId = user.getId()
    >
<#else>
    <#assign
    name = "unknown"
    isRegistrated = false
    currentUserId = -1
    >
</#if>