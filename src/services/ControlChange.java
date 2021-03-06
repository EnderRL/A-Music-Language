package services;

import exceptions.AmlMusicException;
import midi.AmlMidiEvent;
import midi.AmlShortMessage;
import music.AmlTrack;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;

public abstract class ControlChange {

    public static void setVolume(AmlTrack track,  int volume) throws AmlMusicException {
        if (volume < 0 || volume > 127) throw new AmlMusicException("Volume must be between 0 and 127");
        try {
            AmlShortMessage message = new AmlShortMessage(ShortMessage.CONTROL_CHANGE,  7, volume);
            track.addEvent(new AmlMidiEvent(message, track.getCurrentTick(), false, "Volume", AmlMidiEvent.Volume));
        } catch (InvalidMidiDataException e) {
            throw new Error(e);
        }
    }
}
