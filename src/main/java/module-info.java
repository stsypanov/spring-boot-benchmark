module spring.boot.benchmark {
    requires jdk.unsupported;
    requires jmh.core;
    requires spring.boot;
    requires spring.context;
    requires spring.boot.autoconfigure;

    opens com.tsypanov.sbb;
}