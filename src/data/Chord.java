package data;

import music.AmlChord;
import music.AmlFigure;

public class Chord extends AttributeData {

    private AmlChord dataChord;

    public Chord(){}

    public Chord(AmlChord dataChordValue) {
        dataChord = dataChordValue;
    }

    public AmlChord getValue() {
        return dataChord;
    }

    public void setValue(AmlChord value) { dataChord = value; }

    @Override
    public void setAttribute(String attribute, Object value) {
        switch (attribute) {
            case "figure" :
                dataChord.setFigure(AmlFigure.Figure.valueOf((String) value));
                break;
            default:
                throw new Error("This should never happen!");

        }
    }

    @Override
    public Data clone() {
        return new Chord(dataChord);
    }
}
