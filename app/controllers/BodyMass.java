package controllers;

import play.api.templates.Html;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.bmi;
import views.html.index;
import domain.Person;
import domain.Utils;
import domain.Adviser;

public class BodyMass extends Controller {

	public static Result index() {
		return ok(index.render());
	}

	public static Result compute() {
		// create a DynamicForm object to access the parameters sent from
		// index.scala.html
		DynamicForm myBmiParameters = Form.form().bindFromRequest();

		try {
			// read the parameters as String, convert into Double
			Double weight = Double.valueOf(myBmiParameters.get("weight"));
			Double size = Double.valueOf(myBmiParameters.get("size"))
					/ Utils.CENTIMETERS;

			// Create a new person, do bmi computation (takes place inside the
			// class constructor)
			Person myPerson = new Person(weight, size);

			// create a new HTML page with our bmi template filled with the
			// values of myPerson
			Html bmiPage = bmi.render(myPerson,
					Adviser.adviceSize(myPerson),
					Adviser.adviceWeight(myPerson),
					Adviser.assessCategory(myPerson));

			// send that page to the browser, with HTTP code 200 (everything OK)
			return ok(bmiPage);

		} catch (NumberFormatException e) {
			// just resend to the formular in case of problem ...
			return ok(index.render());
		}

	}
}
