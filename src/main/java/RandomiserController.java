import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;

import static spark.Spark.get;
import static spark.SparkBase.staticFileLocation;

public class RandomiserController {

    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();

        staticFileLocation("/public");

        get("/one", (req, res) -> {

            Randomiser randomiser = new Randomiser();

            String result = randomiser.randomise();

            HashMap<String, Object> model = new HashMap();
            model.put("result", result);
            model.put("template", "thing.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/two", (req, res) -> {

            Randomiser randomiser = new Randomiser();

            String result1 = randomiser.randomise();
            String result2 = randomiser.randomise();

            HashMap<String, Object> model = new HashMap();
            model.put("result1", result1);
            model.put("result2", result2);
            model.put("template", "things.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);



    }

}
