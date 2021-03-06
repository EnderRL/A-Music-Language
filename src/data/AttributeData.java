package data;

import exceptions.AmlRunTimeException;

import java.util.ArrayList;

/**
 * Created by Carlos on 26/05/2017.
 */
public abstract class AttributeData extends Data {

    public abstract Data method(String funcName, ArrayList<Data> arguments)  throws AmlRunTimeException;

    public abstract void setAttribute(String attribute, Object value);

    public abstract Data getAttributeValue(String attribute);


}
