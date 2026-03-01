package Lambda;
import java.lang.*;
@FunctionalInterface
interface I{
    void m1();

}
@FunctionalInterface
interface i extends I{
    @Override
    void m1();
}



