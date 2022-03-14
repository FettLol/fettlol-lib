package net.fettlol.lib.registry;

import com.google.gson.JsonObject;
import net.fettlol.lib.implementation.RecipeImpl;
import net.minecraft.util.Identifier;

public class RecipeApi {

    public static void add(Identifier recipeName, JsonObject recipeDefinition) {
        RecipeImpl.addedRecipes.put(recipeName, recipeDefinition);
    }

    public static void add(String recipeName, JsonObject recipeDefinition) {
        add(new Identifier(recipeName), recipeDefinition);
    }

    public static void remove(Identifier recipe) {
        RecipeImpl.blockedRecipes.add(recipe);
    }

    public static void remove(String namespace, String recipe) {
        remove(new Identifier(namespace, recipe));
    }

}
