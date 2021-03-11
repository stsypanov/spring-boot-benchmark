package com.tsypanov;

import com.tsypanov.sbb.SpringBootApplicationBenchmark;
import org.openjdk.jmh.profile.GCProfiler;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class BenchmarkRunner {

  public static void main(String[] args) throws Exception {

    Options opt = new OptionsBuilder()
            .include(SpringBootApplicationBenchmark.class.getSimpleName())
//            .warmupIterations(10)
//            .warmupTime(TimeValue.seconds(1))
            .measurementIterations(1)
//            .measurementTime(TimeValue.seconds(10))
            .forks(200) //0 makes debugging possible
            .shouldFailOnError(true)
            .addProfiler(GCProfiler.class)
            .build();

    new Runner(opt).run();
  }
}
