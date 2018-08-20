import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static spark.Spark.get;

public class CohortController {
    public static void main(String[] args) {

        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        Cohort cohort = new Cohort();
        ArrayList<ArrayList> allPairs = cohort.getAllPairs();


        get("/random_student", (req, res) -> {
            Student student = cohort.getRandomStudent();
            HashMap<String, Object> model = new HashMap<>();
            model.put("student", student.getName());
            return new ModelAndView(model, "random_student.vtl");
        }, velocityTemplateEngine);

        get("/random_pair", (req, res) -> {
            List<Student> randomPair = cohort.getRandomPair();
            HashMap<String, Object> model = new HashMap<>();
            model.put("randomPair", randomPair);
            return new ModelAndView(model, "random_pair.vtl");
        }, velocityTemplateEngine);

        get("/all_pairs", (req, res) -> {
            HashMap<String, Object> model = new HashMap<>();
            model.put("allPairs", allPairs);
            return new ModelAndView(model, "all_pairs.vtl");
        }, velocityTemplateEngine);
    }
}
