# geb-grails

An example project demonstratrating the use of geb to execute functional tests within the following tooling constraints:

* Grails 2.0.3 (latest is 3.x)
* JDK 1.7 (latest is 1.8)
* JUnit 4

When setting up this project, I set out to achieve the following outcomes within the aforementioned constraints:

* Create a suite of functional tests 
* The tests must interact with the web based interface of the application when inputting data
* Make test assertions by analysing the html output
* Be able to execute tests by running grails task - test-app functional: -inline
* Leverage the nice abstractions offered by Geb - Page Object Pattern, jQuery-like navigator API
