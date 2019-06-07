package tacos;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Taco {
	
	@NotNull
	@Size(min=5, message="Name must be 5 characters long")
	private String name;
	@Size(min=1, message="At least one ingredient needs to be selected")
	private List<String> ingredients;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getIngredients() {
		return ingredients;
	}
	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
		
	}
	

}
