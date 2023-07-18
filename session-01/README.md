## download below tools

* download & install `maven` - https://maven.apache.org/download.cgi?.
* download `eclipse` - https://www.eclipse.org/downloads/
* download `tomcat` - https://tomcat.apache.org/


### add maven war plugin to pom.xml
```xml
<build>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-war-plugin</artifactId>
				<version>3.3.1</version>
			</plugin>
		</plugins>
	</build>
```
