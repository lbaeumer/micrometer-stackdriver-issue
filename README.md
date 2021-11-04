# Steps to reproduce

cmp.
https://github.com/micrometer-metrics/micrometer/issues/1335

1. deploy to gae 

    mvn clean package appengine:deploy

2. invoke rest api and force multiple instances to be created 

    ./test.sh


# Output
```
   2021-11-04 22:01:25.473 CET
   __ ____ __ _____ ___ __ ____ ______
   2021-11-04 22:01:25.473 CET
   --/ __ \/ / / / _ | / _ \/ //_/ / / / __/
   2021-11-04 22:01:25.473 CET
   -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
   2021-11-04 22:01:25.473 CET
   --\___\_\____/_/ |_/_/|_/_/|_|\____/___/
   2021-11-04 22:01:25.473 CET
   2021-11-04 21:01:25,471 INFO [io.quarkus] (main) quaestio24-service stackdriver1 on JVM (powered by Quarkus 2.2.3.Final) started in 2.843s. Listening on: http://0.0.0.0:8081
   2021-11-04 22:01:25.473 CET
   2021-11-04 21:01:25,473 INFO [io.quarkus] (main) Profile prod activated.
   2021-11-04 22:01:25.473 CET
   2021-11-04 21:01:25,473 INFO [io.quarkus] (main) Installed features: [cdi, micrometer, resteasy, resteasy-jackson, smallrye-context-propagation]
   2021-11-04 22:01:25.541 CET
   __ ____ __ _____ ___ __ ____ ______
   2021-11-04 22:01:25.541 CET
   --/ __ \/ / / / _ | / _ \/ //_/ / / / __/
   2021-11-04 22:01:25.542 CET
   -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
   2021-11-04 22:01:25.542 CET
   --\___\_\____/_/ |_/_/|_/_/|_|\____/___/
   2021-11-04 22:01:25.542 CET
   2021-11-04 21:01:25,510 INFO [io.quarkus] (main) quaestio24-service stackdriver1 on JVM (powered by Quarkus 2.2.3.Final) started in 2.865s. Listening on: http://0.0.0.0:8081
   2021-11-04 22:01:25.542 CET
   2021-11-04 21:01:25,541 INFO [io.quarkus] (main) Profile prod activated.
   2021-11-04 22:01:25.542 CET
   2021-11-04 21:01:25,542 INFO [io.quarkus] (main) Installed features: [cdi, micrometer, resteasy, resteasy-jackson, smallrye-context-propagation]
   2021-11-04 22:01:25.588 CET
   __ ____ __ _____ ___ __ ____ ______
   2021-11-04 22:01:25.588 CET
   --/ __ \/ / / / _ | / _ \/ //_/ / / / __/
   2021-11-04 22:01:25.588 CET
   -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
   2021-11-04 22:01:25.588 CET
   --\___\_\____/_/ |_/_/|_/_/|_|\____/___/
   2021-11-04 22:01:25.588 CET
   2021-11-04 21:01:25,586 INFO [io.quarkus] (main) quaestio24-service stackdriver1 on JVM (powered by Quarkus 2.2.3.Final) started in 2.938s. Listening on: http://0.0.0.0:8081
   2021-11-04 22:01:25.588 CET
   2021-11-04 21:01:25,588 INFO [io.quarkus] (main) Profile prod activated.
   2021-11-04 22:01:25.589 CET
   2021-11-04 21:01:25,588 INFO [io.quarkus] (main) Installed features: [cdi, micrometer, resteasy, resteasy-jackson, smallrye-context-propagation]
   2021-11-04 22:01:27.704 CET
   [] [d-0] I d.q.w.ConfigResources - tags(test1) [tag(instance1835788759_1636059687683_-810978324=value1835788759_1636059687693_331866512),tag(ns_test1=test1),tag(user=me)]
   2021-11-04 22:01:27.741 CET
   [] [d-0] I d.q.w.ConfigResources - tags(test2) [tag(instance2075008252_1636059687720_736924141=value2075008252_1636059687731_248724415),tag(ns_test2=test2),tag(user=me)]
   2021-11-04 22:01:27.816 CET
   [] [d-0] I d.q.w.ConfigResources - tags(test3) [tag(instance222786865_1636059687796_1385965099=value222786865_1636059687805_-1606512822),tag(ns_test3=test3),tag(user=me)]
   2021-11-04 22:01:28.301 CET
   [] [d-0] I i.m.c.i.p.PushMeterRegistry - publishing metrics for StackdriverMeterRegistry every 1m
   2021-11-04 22:01:28.336 CET
   [] [d-0] I i.m.c.i.p.PushMeterRegistry - publishing metrics for StackdriverMeterRegistry every 1m
   2021-11-04 22:01:28.416 CET
   [] [d-0] I i.m.c.i.p.PushMeterRegistry - publishing metrics for StackdriverMeterRegistry every 1m
   2021-11-04 22:01:30.380 CET
   [] [d-0] I d.q.w.ConfigResources - tags(test4) [tag(instance1835788759_1636059690379_-1208750794=value1835788759_1636059690379_2027642253),tag(ns_test4=test4),tag(user=me)]
   2021-11-04 22:02:00.295 CET
   [] [r-0] W i.g.n.s.i.n.u.i.MacAddressUtil - Failed to find a usable hardware address from the network interfaces; using random bytes: 7e:80:f6:6a:db:fa:fc:dc
   2021-11-04 22:02:00.300 CET
   [] [r-0] W i.g.n.s.i.n.u.i.MacAddressUtil - Failed to find a usable hardware address from the network interfaces; using random bytes: 5a:50:0e:a3:52:c0:1c:4e
   2021-11-04 22:02:00.302 CET
   [] [r-0] W i.g.n.s.i.n.u.i.MacAddressUtil - Failed to find a usable hardware address from the network interfaces; using random bytes: 98:61:d5:f3:e5:ed:97:fe
   2021-11-04 22:02:03.467 CET
   [] [her] W i.m.s.StackdriverMeterRegistry - failed to send metrics to Stackdriver
   2021-11-04 22:02:03.481 CET
   [] [her] W i.m.s.StackdriverMeterRegistry - failed to send metrics to Stackdriver
   2021-11-04 22:02:04.556 CET
   com.google.api.gax.rpc.InvalidArgumentException: io.grpc.StatusRuntimeException: INVALID_ARGUMENT: One or more TimeSeries could not be written: Points must be written in order. One or more of the points specified had an older start time than the most recent point.: timeSeries[0,2-6,8,10-15,19-29,33-37,39-48,50-58,60-62,64,65,67-71] at com.google.api.gax.rpc.ApiExceptionFactory.createException(ApiExceptionFactory.java:49) at com.google.api.gax.grpc.GrpcApiExceptionFactory.create(GrpcApiExceptionFactory.java:72) at com.google.api.gax.grpc.GrpcApiExceptionFactory.create(GrpcApiExceptionFactory.java:60) at com.google.api.gax.grpc.GrpcExceptionCallable$ExceptionTransformingFuture.onFailure(GrpcExceptionCallable.java:97) at com.google.api.core.ApiFutures$1.onFailure(ApiFutures.java:68) at com.google.common.util.concurrent.Futures$CallbackListener.run(Futures.java:1074) at com.google.common.util.concurrent.DirectExecutor.execute(DirectExecutor.java:30) at com.google.common.util.concurrent.AbstractFuture.executeListener(AbstractFuture.java:1213) at com.google.common.util.concurrent.AbstractFuture.complete(AbstractFuture.java:983) at com.google.common.util.concurrent.AbstractFuture.setException(AbstractFuture.java:771) at io.grpc.stub.ClientCalls$GrpcFuture.setException(ClientCalls.java:563) at io.grpc.stub.ClientCalls$UnaryStreamToFuture.onClose(ClientCalls.java:533) at io.grpc.internal.ClientCallImpl.closeObserver(ClientCallImpl.java:553) at io.grpc.internal.ClientCallImpl.access$300(ClientCallImpl.java:68) at io.grpc.internal.ClientCallImpl$ClientStreamListenerImpl$1StreamClosed.runInternal(ClientCallImpl.java:739) at io.grpc.internal.ClientCallImpl$ClientStreamListenerImpl$1StreamClosed.runInContext(ClientCallImpl.java:718) at io.grpc.internal.ContextRunnable.run(ContextRunnable.java:37) at io.grpc.internal.SerializingExecutor.run(SerializingExecutor.java:123) at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515) at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264) at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304) at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128) at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628) at java.base/java.lang.Thread.run(Thread.java:829) Suppressed: com.google.api.gax.rpc.AsyncTaskException: Asynchronous task failed at com.google.api.gax.rpc.ApiExceptions.callAndTranslateApiException(ApiExceptions.java:57) at com.google.api.gax.rpc.UnaryCallable.call(UnaryCallable.java:112) at com.google.cloud.monitoring.v3.MetricServiceClient.createTimeSeries(MetricServiceClient.java:1145) at io.micrometer.stackdriver.StackdriverMeterRegistry.publish(StackdriverMeterRegistry.java:167) at io.micrometer.core.instrument.push.PushMeterRegistry.publishSafely(PushMeterRegistry.java:52) at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515) at java.base/java.util.concurrent.FutureTask.runAndReset(FutureTask.java:305) at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:305) ... 3 common frames omitted Caused by: io.grpc.StatusRuntimeException: INVALID_ARGUMENT: One or more TimeSeries could not be written: Points must be written in order. One or more of the points specified had an older start time than the most recent point.: timeSeries[0,2-6,8,10-15,19-29,33-37,39-48,50-58,60-62,64,65,67-71] at io.grpc.Status.asRuntimeException(Status.java:535) ... 13 common frames omitted
   2021-11-04 22:02:04.556 CET
   com.google.api.gax.rpc.InvalidArgumentException: io.grpc.StatusRuntimeException: INVALID_ARGUMENT: One or more TimeSeries could not be written: Points must be written in order. One or more of the points specified had an older start time than the most recent point.: timeSeries[0,2-6,8-25,27-31,33,37-45,49-57,59-61,63,64,66-70] at com.google.api.gax.rpc.ApiExceptionFactory.createException(ApiExceptionFactory.java:49) at com.google.api.gax.grpc.GrpcApiExceptionFactory.create(GrpcApiExceptionFactory.java:72) at com.google.api.gax.grpc.GrpcApiExceptionFactory.create(GrpcApiExceptionFactory.java:60) 
   at com.google.api.gax.grpc.GrpcExceptionCallable$ExceptionTransformingFuture.onFailure(GrpcExceptionCallable.java:97) at com.google.api.core.ApiFutures$1.onFailure(ApiFutures.java:68) at com.google.common.util.concurrent.Futures$CallbackListener.run(Futures.java:1074) at com.google.common.util.concurrent.DirectExecutor.execute(DirectExecutor.java:30) at com.google.common.util.concurrent.AbstractFuture.executeListener(AbstractFuture.java:1213) at com.google.common.util.concurrent.AbstractFuture.complete(AbstractFuture.java:983) at com.google.common.util.concurrent.AbstractFuture.setException(AbstractFuture.java:771) at io.grpc.stub.ClientCalls$GrpcFuture.setException(ClientCalls.java:563) at io.grpc.stub.ClientCalls$UnaryStreamToFuture.onClose(ClientCalls.java:533) at io.grpc.internal.ClientCallImpl.closeObserver(ClientCallImpl.java:553) at io.grpc.internal.ClientCallImpl.access$300(ClientCallImpl.java:68) at io.grpc.internal.ClientCallImpl$ClientStreamListenerImpl$1StreamClosed.runInternal(ClientCallImpl.java:739) at io.grpc.internal.ClientCallImpl$ClientStreamListenerImpl$1StreamClosed.runInContext(ClientCallImpl.java:718) at io.grpc.internal.ContextRunnable.run(ContextRunnable.java:37) at io.grpc.internal.SerializingExecutor.run(SerializingExecutor.java:123) at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515) at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264) at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304) at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128) at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628) at java.base/java.lang.Thread.run(Thread.java:829) Suppressed: com.google.api.gax.rpc.AsyncTaskException: Asynchronous task failed at com.google.api.gax.rpc.ApiExceptions.callAndTranslateApiException(ApiExceptions.java:57) at com.google.api.gax.rpc.UnaryCallable.call(UnaryCallable.java:112) at com.google.cloud.monitoring.v3.MetricServiceClient.createTimeSeries(MetricServiceClient.java:1145) at io.micrometer.stackdriver.StackdriverMeterRegistry.publish(StackdriverMeterRegistry.java:167) at io.micrometer.core.instrument.push.PushMeterRegistry.publishSafely(PushMeterRegistry.java:52) at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515) at java.base/java.util.concurrent.FutureTask.runAndReset(FutureTask.java:305) at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:305) ... 3 common frames omitted Caused by: io.grpc.StatusRuntimeException: INVALID_ARGUMENT: One or more TimeSeries could not be written: Points must be written in order. One or more of the points specified had an older start time than the most recent point.: timeSeries[0,2-6,8-25,27-31,33,37-45,49-57,59-61,63,64,66-70] at io.grpc.Status.asRuntimeException(Status.java:535) ... 13 common frames omitted
```

## Exception
```
   com.google.api.gax.rpc.InvalidArgumentException: io.grpc.StatusRuntimeException: INVALID_ARGUMENT: One or more TimeSeries could not be written: Points must be written in order. One or more of the points specified had an older start time than the most recent point.: timeSeries[0,2-6,8-25,27-31,33,37-45,49-57,59-61,63,64,66-70] 
   at com.google.api.gax.rpc.ApiExceptionFactory.createException(ApiExceptionFactory.java:49)
   at com.google.api.gax.grpc.GrpcApiExceptionFactory.create(GrpcApiExceptionFactory.java:72) 
   at com.google.api.gax.grpc.GrpcApiExceptionFactory.create(GrpcApiExceptionFactory.java:60) 
   at com.google.api.gax.grpc.GrpcExceptionCallable$ExceptionTransformingFuture.onFailure(GrpcExceptionCallable.java:97) 
   at com.google.api.core.ApiFutures$1.onFailure(ApiFutures.java:68) at com.google.common.util.concurrent.Futures$CallbackListener.run(Futures.java:1074) 
   at com.google.common.util.concurrent.DirectExecutor.execute(DirectExecutor.java:30) 
   at com.google.common.util.concurrent.AbstractFuture.executeListener(AbstractFuture.java:1213) at com.google.common.util.concurrent.AbstractFuture.complete(AbstractFuture.java:983) 
   at com.google.common.util.concurrent.AbstractFuture.setException(AbstractFuture.java:771) at io.grpc.stub.ClientCalls$GrpcFuture.setException(ClientCalls.java:563) at io.grpc.stub.ClientCalls$UnaryStreamToFuture.onClose(ClientCalls.java:533) 
   at io.grpc.internal.ClientCallImpl.closeObserver(ClientCallImpl.java:553) 
   at io.grpc.internal.ClientCallImpl.access$300(ClientCallImpl.java:68) 
   at io.grpc.internal.ClientCallImpl$ClientStreamListenerImpl$1StreamClosed.runInternal(ClientCallImpl.java:739) 
   at io.grpc.internal.ClientCallImpl$ClientStreamListenerImpl$1StreamClosed.runInContext(ClientCallImpl.java:718) 
   at io.grpc.internal.ContextRunnable.run(ContextRunnable.java:37) 
   at io.grpc.internal.SerializingExecutor.run(SerializingExecutor.java:123) 
   at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515) 
   at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264) 
   at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304) 
   at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128) 
   at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628) 
   at java.base/java.lang.Thread.run(Thread.java:829) Suppressed: com.google.api.gax.rpc.AsyncTaskException: Asynchronous task failed 
   at com.google.api.gax.rpc.ApiExceptions.callAndTranslateApiException(ApiExceptions.java:57) 
   at com.google.api.gax.rpc.UnaryCallable.call(UnaryCallable.java:112) 
   at com.google.cloud.monitoring.v3.MetricServiceClient.createTimeSeries(MetricServiceClient.java:1145) 
   at io.micrometer.stackdriver.StackdriverMeterRegistry.publish(StackdriverMeterRegistry.java:167) 
   at io.micrometer.core.instrument.push.PushMeterRegistry.publishSafely(PushMeterRegistry.java:52) 
   at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515) 
   at java.base/java.util.concurrent.FutureTask.runAndReset(FutureTask.java:305) 
   at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:305) ... 3 common frames omitted Caused by: io.grpc.StatusRuntimeException: INVALID_ARGUMENT: One or more TimeSeries could not be written: Points must be written in order. One or more of the points specified had an older start time than the most recent point.: timeSeries[0,2-6,8-25,27-31,33,37-45,49-57,59-61,63,64,66-70] 
   at io.grpc.Status.asRuntimeException(Status.java:535) ... 13 common frames omitted
```