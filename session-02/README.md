#topics
* Difference between servlet 2.5 vs 3.x
* load-on-startup
* configure servet with 3.0 version
* content type `text/html`
* Integrate tomcat with STS

#Difference between provided vs compile (maven)

* `Provided` dependencies are used for compilation but are not packaged into your application. 
* `compile` dependencies are packaged into your application

# Servlet 2.5

```xml

<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns="http://java.sun.com/xml/ns/javaee"
	xsi:schemaLocation="http://java.sun.com/xml/ns/javaee 
	http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd" id="WebApp_ID" version="2.5">
```


# Servlet 3.0 

```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
xmlns="http://java.sun.com/xml/ns/javaee" xsi:schemaLocation="http://java.sun.com/xml/ns/javaee 
http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd" id="WebApp_ID" version="3.0">

```
The following annotations are applicable starting from Servlet 3.0 specification,

* `@WebServlet`
* `@WebServletContextListener`
* `@ServletFilter`
* `@InitParam`

# Build failure with java version- add below properties in pom.xml

```xml
<properties>
		<maven.compiler.source>17</maven.compiler.source>
		<maven.compiler.target>17</maven.compiler.target>
</properties>
```


#content type `text/html`


#Demo - After integrating tomcat with STS(check the context path)

- http://localhost:8080/session-02/hello-3.1
- http://localhost:8080/session-02/hello-3.0
