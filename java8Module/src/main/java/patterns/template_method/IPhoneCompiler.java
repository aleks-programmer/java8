package patterns.template_method;


public class IPhoneCompiler extends CrossCompiler {
    @Override
    protected void collectSource() {
        System.out.println("IPhoneCompiler.collectSource");
    }

    @Override
    protected void compileToTarget() {
        System.out.println("IPhoneCompiler.compileToTarget");
    }
}
