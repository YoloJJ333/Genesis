package kingphoenix.genesis;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CustomSounds {
    public static final Identifier SOUND_ID = new Identifier("genesis:sound_id");
    public static SoundEvent SOUND_EVENT = new SoundEvent(SOUND_ID);

    public static void registerSounds(){
        Registry.register(Registry.SOUND_EVENT, SOUND_ID, SOUND_EVENT);
    }
}
