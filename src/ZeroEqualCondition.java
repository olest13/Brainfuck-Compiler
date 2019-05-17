public class ZeroEqualCondition implements ICondition {

    @Override
    public boolean compute(Contex contex) {
        return contex.getCurrent() == 0;
    }
}
