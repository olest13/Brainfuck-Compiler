package syntax;

import interpreter.Contex;

public class ZeroNotEqualCondition implements ICondition {

    @Override
    public boolean compute(Contex contex) {
        return contex.getCurrent() != 0;
    }
}
