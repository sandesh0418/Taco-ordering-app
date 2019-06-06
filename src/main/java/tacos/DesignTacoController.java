package tacos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tacos.Ingredient.Type;


@Controller
@RequestMapping("/design")
public class DesignTacoController {
	
	
	private List<Ingredient> filterByType(List<Ingredient> ingredients, Type type) {
		  return ingredients
		            .stream()
		            .filter(x -> x.getType().equals(type))
		            .collect(Collectors.toList());
	}
	
	@GetMapping
	public String showDesignForm(Model model) {

	List <Ingredient> ingredients = Arrays.asList(
			new Ingredient("FLTO", "Tortilla", Type.WRAP),
			new Ingredient("COTO", "Corn Tortilla", Type.WRAP),
			new Ingredient("GRBF", "Ground Beef", Type.PROTEIN),
			new Ingredient("CARN", "Carnitas", Type.PROTEIN),
			new Ingredient("CHIC", "Chicken", Type.PROTEIN),
			new Ingredient("TMT0","Diced Tomatoes",Type.VEGGIES),
			new Ingredient("ONIS","Diced Onions",Type.VEGGIES),
			new Ingredient("CHED", "Cheddar Cheese",Type.CHEESE),
			new Ingredient("SWSS", "Swiss Cheese",Type.CHEESE),
			new Ingredient("SLSA", "SALSA", Type.SAUCE),
			new Ingredient("HOTS", "HOT SAUCE", Type.SAUCE)
			);
	Type[] types =Ingredient.Type.values();
	for(Type type: types) {

		model.addAttribute(type.toString().toLowerCase(),
				filterByType(ingredients, type));
	}

	model.addAttribute("design", new TacoCloudApplication());
	return "design";
	
	}
	
	
	@PostMapping
	public String processDesign(@ModelAttribute Taco design) {

		
		
		return "redirect:/orders/current";
		
	}
}
