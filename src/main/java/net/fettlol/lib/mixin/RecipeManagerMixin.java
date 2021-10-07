package net.fettlol.lib.mixin;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.fettlol.lib.registry.RecipeApi;
import net.minecraft.recipe.RecipeManager;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.profiler.Profiler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;

@Mixin(RecipeManager.class)
public class RecipeManagerMixin {

    @Inject(method = "apply", at = @At("HEAD"))
    public void applyFettlolRecipes(
        Map<Identifier, JsonElement> map,
        ResourceManager resourceManager,
        Profiler profiler,
        CallbackInfo callbackInfo
    ) {
        RecipeApi.FETTLOL_RECIPES.forEach((Identifier identifier, JsonObject object) -> {
            addRecipe(map, identifier, object);
        });
    }

    private void addRecipe(Map<Identifier, JsonElement> map, Identifier identifier, JsonObject definition) {
        if (definition != null) {
            map.put(identifier, definition);
        }
    }

}
