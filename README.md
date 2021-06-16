# App

### This is a sample project for logging using SLF4J & LOG4J2 framework.

**- What is SLF4J?** 
  
  SLF4j stands for Simple Logging Facade for java. As name suggest it is a facade library which provide abstraction for logging libraries like log4j, logback , java.util.logger; and don't do actual logging.
  So Basically Simple Logging Facade for Java serves as a simple facade or abstraction for various logging frameworks allowing the end user to plug in the desired logging framework at deployment time. This allows for different logging frameworks to coexist. It also helps migrate from one framework to another. Finally, apart from standardized API, it also offers some “syntactic sugar”.

## Prerequisites
- Java 1.8+
- Apache Maven

## Use of SLF4J with LOG4J2

    <properties>
        <slf4j.version>1.7.30</slf4j.version>
        <log4j2.version>2.14.1</log4j2.version>
    </properties>

    <dependencies>
        <!-- slf4j -->
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-api</artifactId>
            <version>${slf4j.version}</version>
        </dependency>

        <!-- Binding for Log4J -->
        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-slf4j-impl</artifactId>
            <version>${log4j2.version}</version>
        </dependency>

        <!-- Log4j2 -->
        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-api</artifactId>
            <version>${log4j2.version}</version>
        </dependency>

        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-core</artifactId>
            <version>${log4j2.version}</version>
        </dependency>
    <dependencies>`

### To use SLF4J with LOG4J2 framework, we need to use following dependencies:

**- slf4j-api dependency**

**- log4j-core & log4j-api dependencies**

**- Log4j 2 SLF4J Binding dependency**

The Log4j 2 SLF4J Binding allows applications coded to the SLF4J API to use Log4j 2 as the implementation.

Due to a break in compatibility in the SLF4J binding, as of release 2.11.1 two SLF4J to Log4j Adapters are provided.

- log4j-slf4j-impl should be used with SLF4J 1.7.x releases or older.
- log4j-slf4j18-impl should be used with SLF4J 1.8.x releases or newer.

Applications that take advantage of the Java Module System should use SLF4J 1.8.x and log4j-slf4j18-impl.

### LOG4J2 Configuration

Configuration of Log4j 2 can be accomplished in 1 of 4 ways:

 - Through a configuration file written in XML, JSON, YAML, or properties format.
 - Programmatically, by creating a ConfigurationFactory and Configuration implementation.
 - Programmatically, by calling the APIs exposed in the Configuration interface to add components to the default configuration.
 - Programmatically, by calling methods on the internal Logger class.

Here I have used XML configuration file (log4j2.xml)

### Create Logger Instance in Java
Define a static logger variable so that it references the Logger instance and use it for logging:


    public class App {

        private final static Logger LOGGER = LoggerFactory.getLogger(App.class);

        public static void main(String[] args) {
            LOGGER.info("Hello World!");
            LOGGER.debug("Debugging the code");
            LOGGER.warn("Logging warning");
            LOGGER.error("Logging error");
            LOGGER.trace("Logging trace");
        }
    }