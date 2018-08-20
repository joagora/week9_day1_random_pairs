import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;

import static spark.Spark.get;

public class CohortController {
    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        Cohort cohort = new Cohort();
        get("/cohort", (req, res) -> {
            Student student = cohort.getRandomStudent();
            HashMap<String, Object> model = new HashMap<>();
            model.put("student", student.getName());
            return new ModelAndView(model, "random_student.vtl");
        }, velocityTemplateEngine);
    }
}
