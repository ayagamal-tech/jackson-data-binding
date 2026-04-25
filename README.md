# jackson-data-binding
A simple Java application demonstrating how to map JSON to POJO and POJO to JSON using the Jackson library.

# Technologies Used
* **IDE** Intellij IDEA
* **Java Version** JDK 1.8 (Java 8)
* **Maven Dependencies:**
   * `jackson-core` (v2.16.1)
   * `jackson-databind` (v2.16.1)

    
# Errors and Troubleshooting
If you are testing this code and remove some parts, you might run into this error:

> `Exception in thread "main" com.fasterxml.jackson.databind.exc.InvalidDefinitionException: Cannot construct instance of Student (no Creators, like default constructor, exist): cannot deserialize from Object value no delegate- or property-based Creator ....`

**Why it happens:** Jackson requires a blank, default constructor (such as `public Student() { }`) to build the empty object before it can inject the JSON data.

**Same Solution for similar case:** If you're interested, you can read this discussion: [Stackoverflow Discussion](https://stackoverflow.com/questions/55032293/cannot-construct-instance-of-class-name-although-at-least-on-creator-exists?newreg=4373655aa3904ed1b705fe94d2eed971) 
