package vs.enums;

import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("devs")
public class DeveloperController {

    private List<Developer> developers = new ArrayList<>();

    @PostConstruct
    public void init() {
        developers.add(new Developer("Vasilis", ProgrammingLanguage.JAVA));
        developers.add(new Developer("Elina", ProgrammingLanguage.PHP));
    }

    @GetMapping
    public List<Developer> all() {
        return developers;
    }

    @PostMapping
    public void add(@RequestBody Developer developer) {
        developers.add(developer);
    }

}
