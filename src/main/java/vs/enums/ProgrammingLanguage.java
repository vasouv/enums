package vs.enums;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.List;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum ProgrammingLanguage {

    JAVA("Java", List.of("Spring Boot", "Jakarta EE")),
    PHP("PHP", List.of("Laravel", "Symfony")),
    NODE("Node", List.of("NestJS", "Angular"));

    ProgrammingLanguage(String name, List<String> frameworks) {
        this.name = name;
        this.frameworks = frameworks;
    }

    private final String name;
    private final List<String> frameworks;

    public String getName() {
        return name;
    }

    public List<String> getFrameworks() {
        return frameworks;
    }
}
