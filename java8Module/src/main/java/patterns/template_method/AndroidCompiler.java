package patterns.template_method;

/**
 * Created by aleks on 12.05.17.
 */
public class AndroidCompiler extends CrossCompiler {
    @Override
    protected void collectSource() {
        System.out.println("AndroidCompiler.compileToTarget");
    }

    @Override
    protected void compileToTarget() {
        System.out.println("AndroidCompiler.compileToTarget");
    }
}
