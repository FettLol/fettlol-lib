package net.fettlol.lib.registry;

import com.google.gson.JsonObject;
import io.github.cottonmc.cotton.datapack.recipe.RecipeUtil;
import net.minecraft.util.Identifier;

import java.util.HashMap;

public class RecipeApi {

    public static HashMap<Identifier, JsonObject> FETTLOL_RECIPES = new HashMap<>();

    public static void add(Identifier recipeName, JsonObject recipeDefinition) {
        FETTLOL_RECIPES.put(recipeName, recipeDefinition);
    }

    public static void remove(String recipe) {
        RecipeUtil.removeRecipe(recipe);
    }

    // Overloaded versions of main methods below:

    public static void add(String recipeName, JsonObject recipeDefinition) {
        add(new Identifier(recipeName), recipeDefinition);
    }

    public static void remove(Identifier recipe) {
        remove(recipe.toString());
    }

    public static void remove(String namespace, String recipe) {
        remove(namespace + ":" + recipe);
    }

}
