package net.fettlol.lib.registry;

import com.google.gson.JsonObject;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.HashSet;

public class RecipeApi {

    // TODO move out of the API
    public static final HashSet<Identifier> blockedRecipes = new HashSet<>();

    public static HashMap<Identifier, JsonObject> FETTLOL_RECIPES = new HashMap<>();

    public static void add(Identifier recipeName, JsonObject recipeDefinition) {
        FETTLOL_RECIPES.put(recipeName, recipeDefinition);
    }

    public static void remove(Identifier recipe) {
        blockedRecipes.add(recipe);
    }

    // Overloaded versions of main methods:

    public static void add(String recipeName, JsonObject recipeDefinition) {
        add(new Identifier(recipeName), recipeDefinition);
    }

    public static void remove(String namespace, String recipe) {
        remove(new Identifier(namespace, recipe));
    }

}
