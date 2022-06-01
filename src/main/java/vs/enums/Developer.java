package vs.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Developer(@JsonProperty("name") String name, @JsonProperty("programmingLanguage") ProgrammingLanguage language) {
}
