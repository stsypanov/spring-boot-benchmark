module spring.boot.benchmark {
    requires jdk.unsupported;
    requires jmh.core;
    requires spring.boot;
    requires spring.core;
    requires spring.beans;
    requires spring.context;
    requires spring.boot.autoconfigure;

    opens com.tsypanov.sbb;
    opens com.tsypanov.sbb.jmh_generated;
}