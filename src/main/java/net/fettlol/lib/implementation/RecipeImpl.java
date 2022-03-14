package net.fettlol.lib.implementation;

import com.google.gson.JsonObject;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.HashSet;

public class RecipeImpl {
    public static final HashSet<Identifier> blockedRecipes = new HashSet<>();
    public static HashMap<Identifier, JsonObject> addedRecipes = new HashMap<>();
}
