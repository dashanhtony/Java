package com.baobaotao.reflect;

/**
 * Created by Administrator on 2017/12/11.
 *
 */
/*类装载工作由ClassLoader及其子类负责，ClassLoader是一个重要的Java运行时系统组件，它负责在运行时查找和装入Class字节码
文件。JVM在运行时会产生三个ClassLoader：根装载器、ExtClassLoader（扩展类装载器）和AppClassLoader（系统类装载器）。其
中，根装载器不是ClassLoader的子类，它使用C++编写，因此我们在Java中看不到它，根装载器负责装载JRE的核心类库，如JRE目标下
的rt.jar、charsets.jar等。ExtClassLoader和AppClassLoader都是ClassLoader的子类。其中ExtClassLoader负责装载JRE扩展目
录ext中的JAR类包；AppClassLoader负责装载Classpath路径下的类包。*/

public class ClassLoaderTest {
    public static void main(String[] args) {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        System.out.println("current loader:" + loader);
        System.out.println("parent loader:" + loader.getParent());
        //①根装载器在Java中访问不到，所以返回null
        System.out.println("grandparent loader:" + loader.getParent().getParent());
    }
}
