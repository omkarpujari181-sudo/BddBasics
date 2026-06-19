package steps;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefOutlineDatatabale 
{
	
	@Given ("user is at the base page")
	public void user_is_at_the_base_page ()
	{
		System.out.println("The user is at base page");
	}
	
	
	@When("user clicks on {string} button")
	public void user_clicks_on_button(String buttonName) 
	{
		System.out.println("user clicks on a button having text = "+ buttonName);
	   
	}
	
	
	@When("provides the static data as below")
	public void provides_the_static_data_as_below(DataTable dataTable) 
	{
		List <Map <String, String>> data = dataTable.asMaps();
		Map<String, String> mp = data.get(0);
		
		for (String key : mp.keySet())
		{
            System.out.println(key);			
		}
		
		System.out.println(mp);
	    
	}
	
	
	@When("clicks on save button")
	public void clicks_on_save_button() 
	{
	   System.out.println("Clicked on save button");
	}
	
	
	@When("provides the grade obtained for the subject {string} , {string} in standard respective {int}")
	public void provides_the_grade_obtained_for_the_subject_in_standard_respective(String string, String string2, Integer int1) 
	{
	   System.out.print("student marks from standard = "+ int1  );
	   
	   System.out.print(" ;" + "English :" + string );
	   
	   System.out.println(" ;" + "Marathi :" + string2 );
	}
	
	
	@Then("sutudents marks get entered")
	public void sutudents_marks_get_entered() {
	  System.out.println("form filled");
	}


}
