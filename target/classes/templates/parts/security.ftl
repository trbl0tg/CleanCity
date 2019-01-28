<#assign
known = Session.SPRING_SECURITY_CONTEXT??
>

<#if known>
    <#assign user = Session.SPRING_SECURITY_CONTEXT.authentication.principal
    isAdmin = user.isAdmin()
    name = user.getName()
    isRegistrated = true
    currentUserId = user.getId()
    >
<#else>
    <#assign
    name = "unknown"
    isAdmin = false
    isRegistrated = false
    currentUserId = -1
    >
</#if>
