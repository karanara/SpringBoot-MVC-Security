# mvcsecurity

needed:
spring web mvc 
security support
thymeleaf view support
thymeleaf security support

1.Create Spring Security Configuration (@Configuration)
   InMemoryUserDetailsManager
   For custom login form:
            Configure security of web paths in application, login, logout using  SecurityFilterChain.[refer to code]
            Context path-- root path of your application
            Logout URL will be handled by Spring Security Filter.
            Invalidate user’s HTTP session and remove session cookies and sends user to login form.
  • Spring Security provides support for accessing user id and roles.
 Restricting access to roles: syntax-- requestMatchers(<< add path to match on >>).hasRole(<< authorized role >>)
 custom username and password from database---sql code.

