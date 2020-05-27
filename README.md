# grpc-springboot-lin

[CSDN的blog](https://blog.csdn.net/alinyua/article/details/83030149)


## 运行

Server SpringBoot项目
Client SpringBoot项目

http://127.0.0.1:9090/

### 开发日常
写.proto文件，形成公功library
Server,Client导入lib

springboot配置文件中，server项目要设置自己的ip port
client要写server的ip，port

grpc跨语言调用原理：绑定c语言


```shell
2020-05-26 18:04:17.284 ERROR 46556 --- [ault-executor-0] io.grpc.internal.SerializingExecutor     : Exception while executing runnable io.grpc.internal.ServerImpl$JumpToApplicationThreadServerStreamListener$1HalfClosed@56fc5800

io.grpc.StatusRuntimeException: UNAVAILABLE: io exception
	at io.grpc.stub.ClientCalls.toStatusRuntimeException(ClientCalls.java:233) ~[grpc-stub-1.15.1.jar:1.15.1]
	at io.grpc.stub.ClientCalls.getUnchecked(ClientCalls.java:214) ~[grpc-stub-1.15.1.jar:1.15.1]
	at io.grpc.stub.ClientCalls.blockingUnaryCall(ClientCalls.java:139) ~[grpc-stub-1.15.1.jar:1.15.1]
	at ex.grpc.GreeterGrpc$GreeterBlockingStub.sayHello(GreeterGrpc.java:178) ~[classes/:na]
	at com.linshen.grpcserver.GreeterService.sayHello(GreeterService.java:26) ~[classes/:na]
	at com.linshen.grpc.lib.GreeterGrpc$MethodHandlers.invoke(GreeterGrpc.java:236) ~[classes/:na]
	at io.grpc.stub.ServerCalls$UnaryServerCallHandler$UnaryServerCallListener.onHalfClose(ServerCalls.java:171) ~[grpc-stub-1.15.1.jar:1.15.1]
	at io.grpc.internal.ServerCallImpl$ServerStreamListenerImpl.halfClosed(ServerCallImpl.java:283) ~[grpc-core-1.15.1.jar:1.15.1]
	at io.grpc.internal.ServerImpl$JumpToApplicationThreadServerStreamListener$1HalfClosed.runInContext(ServerImpl.java:707) ~[grpc-core-1.15.1.jar:1.15.1]
	at io.grpc.internal.ContextRunnable.run(ContextRunnable.java:37) ~[grpc-core-1.15.1.jar:1.15.1]
	at io.grpc.internal.SerializingExecutor.run(SerializingExecutor.java:123) ~[grpc-core-1.15.1.jar:1.15.1]
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) [na:1.8.0_231]
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) [na:1.8.0_231]
	at java.lang.Thread.run(Thread.java:748) [na:1.8.0_231]
Caused by: io.netty.channel.AbstractChannel$AnnotatedConnectException: Connection timed out: no further information: /193.112.34.55:50051
	at sun.nio.ch.SocketChannelImpl.checkConnect(Native Method) ~[na:1.8.0_231]
	at sun.nio.ch.SocketChannelImpl.finishConnect(SocketChannelImpl.java:717) ~[na:1.8.0_231]
	at io.netty.channel.socket.nio.NioSocketChannel.doFinishConnect(NioSocketChannel.java:325) ~[netty-transport-4.1.23.Final.jar:4.1.23.Final]
	at io.netty.channel.nio.AbstractNioChannel$AbstractNioUnsafe.finishConnect(AbstractNioChannel.java:340) ~[netty-transport-4.1.23.Final.jar:4.1.23.Final]
	at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:633) ~[netty-transport-4.1.23.Final.jar:4.1.23.Final]
	at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:580) ~[netty-transport-4.1.23.Final.jar:4.1.23.Final]
	at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:497) ~[netty-transport-4.1.23.Final.jar:4.1.23.Final]
	at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:459) ~[netty-transport-4.1.23.Final.jar:4.1.23.Final]
	at io.netty.util.concurrent.SingleThreadEventExecutor$5.run(SingleThreadEventExecutor.java:886) ~[netty-common-4.1.23.Final.jar:4.1.23.Final]
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30) ~[netty-common-4.1.23.Final.jar:4.1.23.Final]
	... 1 common frames omitted
Caused by: java.net.ConnectException: Connection timed out: no further information
	... 11 common frames omitted
```

不能在idea maven插件上跑，只能mvn package/install


```sbtshell
io.grpc.StatusRuntimeException: UNIMPLEMENTED
	at io.grpc.stub.ClientCalls.toStatusRuntimeException(ClientCalls.java:233) ~[grpc-stub-1.15.1.jar:1.15.1]
	at io.grpc.stub.ClientCalls.getUnchecked(ClientCalls.java:214) ~[grpc-stub-1.15.1.jar:1.15.1]
	at io.grpc.stub.ClientCalls.blockingUnaryCall(ClientCalls.java:139) ~[grpc-stub-1.15.1.jar:1.15.1]
	at cn.wdidada.grpc.lib.auth.AuthorizationGrpc$AuthorizationBlockingStub.sayHello(AuthorizationGrpc.java:178) ~[classes/:na]
	at com.linshen.grpcserver.IsoProxyService.rpcCall(IsoProxyService.java:28) ~[classes/:na]
	at cn.wdidada.grpc.lib.proxy.IsomerizationProxyGrpc$MethodHandlers.invoke(IsomerizationProxyGrpc.java:236) ~[classes/:na]
	at io.grpc.stub.ServerCalls$UnaryServerCallHandler$UnaryServerCallListener.onHalfClose(ServerCalls.java:171) ~[grpc-stub-1.15.1.jar:1.15.1]
	at io.grpc.internal.ServerCallImpl$ServerStreamListenerImpl.halfClosed(ServerCallImpl.java:283) ~[grpc-core-1.15.1.jar:1.15.1]
	at io.grpc.internal.ServerImpl$JumpToApplicationThreadServerStreamListener$1HalfClosed.runInContext(ServerImpl.java:707) ~[grpc-core-1.15.1.jar:1.15.1]
	at io.grpc.internal.ContextRunnable.run(ContextRunnable.java:37) ~[grpc-core-1.15.1.jar:1.15.1]
	at io.grpc.internal.SerializingExecutor.run(SerializingExecutor.java:123) ~[grpc-core-1.15.1.jar:1.15.1]
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) [na:1.8.0_231]
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) [na:1.8.0_231]
	at java.lang.Thread.run(Thread.java:748) [na:1.8.0_231]

```
