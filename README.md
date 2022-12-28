# spring-jenkins
for jenkins testing purpose


1. Create spring-jenkins Spring Boot app.
2. Add code.
3. Create repository spring-jenkins in https://github.com/ganna60/
4. Add description text
5. Keep it Public
6. $ cd spring-jenkins
7. $ git init
8. $ git add *
9. $ git commit -m "First commit."
10. $ git remote add origin https://github.com/ganna60/spring-jenkins.git
11. $ git push -u origin master
12. remote: Invalid username or password.
    fatal: Authentication failed for 'https://github.com/ganna60/spring-jenkins.git/'
# Then configure git 
$ git config --list
$ git config --global user.name "Jadranka Stupar"
$ git config --global user.email "jaca.stupar@gmail.com"
$ git config --global color.ui "auto"
$ git config --list

# Again:
$ git push -u origin master
warning: could not find UI helper 'GitHub.UI'
Select an authentication method for 'https://github.com/':
1. Web browser (default)
2. Device code
3. Personal access token
   option (enter for default):
   info: please complete authentication in your browser...
# Enter 1 or just press enter
Check code in github repos


# Jenkins part
1. Start Jenkins service - 8080  admin/admin
2. Create new jobs
3. Enter item name: spring-jenkins
4. Freestyle project
5. Ok
6. Add desc
7. GitHub Project check
8. Project url: https://github.com/ganna60/spring-jenkins
9. Display Name: Spring Jenkins
10. Source Code Mgmt -> GitHub
11. Repository url: https://github.com/ganna60/spring-jenkins.git
12. Credentials: Add
13. ... Domain... Kind... Username: ganna60 Password: Jackoni_60
14. Add
15. Now select ganna60
16. Build Triggers: Poll SCM: Schedule: * * * * *
17. Build: Invoke top-level Maven targets: install
18. Post-Build Actions - E-mail Notification - Recipients: adria60@gmail.com
19. Apply

# Back to project tab
1. Select project - Build Now
2. View console log


# Test for build error - test part
# Remove void from

`@Test
public void contextLoads() {
log.info("Test case executing...");
assertEquals(true, true);`
}