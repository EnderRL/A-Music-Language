package data;

import music.AmlFigure;

public class Figure extends AttributeData {

    private AmlFigure dataFigure;

    public Figure() {
        dataFigure = null;
    }

    public Figure(AmlFigure dataFigureValue) {
        dataFigure = dataFigureValue;
    }

    @Override
    public AmlFigure getValue() {
        if (dataFigure == null) {
            throw new NullPointerException();
        }
        return dataFigure;
    }

    @Override
    public void setAttribute(String attribute, Object value) {
        switch (attribute) {
            case "duration":
                dataFigure.setDuration((Integer) value);
                break;
            default:
                throw new Error("This should never happen!");

        }
    }

    @Override
    public Data getAttributeValue(String attribute) {
        switch (attribute) {
            case "duration":
                return new Int(dataFigure.getDuration());
            default:
                throw new Error("This should never happen!");

        }
    }

    @Override
    public void setValue(Object value) { dataFigure = (AmlFigure)value; }

    @Override
    public Data clone() {
        return new Figure(dataFigure.clone());
    }

}
