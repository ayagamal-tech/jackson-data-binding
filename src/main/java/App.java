import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        // create object mapper
        ObjectMapper mapper = new ObjectMapper();

        // read from JSON file and map to Java POJO
        Video video = mapper.readValue(new File("jsonInput.txt"), Video.class);

        // print
        System.out.println("The ID for Video: " + video.getVideo_id());
        System.out.println("The Title for Video: " + video.getTitle());
        System.out.println("(Not Allowed to be public)" + video.getInternal_budget());
        System.out.println("4K is available for Video: " + video.isIs_available_in_4k());

        // print a Nested Object values
        System.out.println("The Director FirstName: " + video.getDirector().getFirstName());
        System.out.println("The Director LastName: " +video.getDirector().getLastName());

        // print a List
        System.out.println("The Cast Members: " + video.getCastMembers());
    }
}
