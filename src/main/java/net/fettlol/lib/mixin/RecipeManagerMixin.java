package net.fettlol.lib.mixin;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.fettlol.lib.implementation.RecipeImpl;
import net.minecraft.recipe.RecipeManager;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.profiler.Profiler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;
import java.util.stream.Collectors;

@Mixin(RecipeManager.class)
public class RecipeManagerMixin {

    // remove recipes before they are processed
    @ModifyVariable(method = "apply(Ljava/util/Map;Lnet/minecraft/resource/ResourceManager;Lnet/minecraft/util/profiler/Profiler;)V", at = @At("HEAD"), ordinal = 0, argsOnly = true)
    protected Map<Identifier, JsonElement> filterRecipes(Map<Identifier, JsonElement> recipes) {
        return recipes.entrySet().stream()
            .filter(entry -> !RecipeImpl.blockedRecipes.contains(entry.getKey()))
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    @Inject(method = "apply", at = @At("HEAD"))
    public void applyFettlolRecipes(
        Map<Identifier, JsonElement> map,
        ResourceManager resourceManager,
        Profiler profiler,
        CallbackInfo callbackInfo
    ) {
        RecipeImpl.addedRecipes.forEach((Identifier identifier, JsonObject object) -> {
            addRecipe(map, identifier, object);
        });
    }

    private void addRecipe(Map<Identifier, JsonElement> map, Identifier identifier, JsonObject definition) {
        if (definition != null) {
            map.put(identifier, definition);
        }
    }

}
