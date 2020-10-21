# SpringSecurityDemo
Spring Security demo with Spring Boot

# Important Classes
    - @Configuration: "WebSecurityConfigurerAdapter" 
        - Has methods
            - Authentication: configure(AuthenticationManagerBuilder auth)
            - Authorization: configure(HttpSecurity http)
        - Authentication code uses "UserDetailsService" & "PasswordEncoder"
    - @Service : "UserDetailsService"
        - Has method: loadUserByUsername(String username), get user from Database using UserRepositoruy
        - CustomSecurityUser is returned from this method
    - @Entity: CustomAuthority implements "GrantedAuthority"
    - CustomSecurityUser implements UserDetails
    - Method level Security: "GlobalMethodSecurityConfiguration"
# Important Concepts
    - CSRF: Cross Site Request Forgery
