package com.linshen.grpcserver;


import cn.wdidada.grpc.lib.auth.Auth;
import cn.wdidada.grpc.lib.auth.AuthorizationGrpc;
import cn.wdidada.grpc.lib.proxy.IsomerizationProxyGrpc;
import cn.wdidada.grpc.lib.proxy.Proxy;
import io.grpc.Channel;
import io.grpc.netty.NegotiationType;
import io.grpc.netty.NettyChannelBuilder;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.springboot.autoconfigure.grpc.server.GrpcService;

@Slf4j
@GrpcService(Proxy.class)
public class IsoProxyService extends IsomerizationProxyGrpc.IsomerizationProxyImplBase {

    @Override
    public void rpcCall(Proxy.ProxyRequest request, StreamObserver<Proxy.ProxyReply> responseObserver) {
        String message = "rpcCall " + request.getName();
        final Proxy.ProxyReply.Builder replyBuilder = Proxy.ProxyReply.newBuilder().setMessage(message);
        responseObserver.onNext(replyBuilder.build());
        responseObserver.onCompleted();

        Channel channel = NettyChannelBuilder.forAddress("193.112.34.55", 50051).negotiationType(NegotiationType.PLAINTEXT).build();
        AuthorizationGrpc.AuthorizationBlockingStub greeterBlockingStub = AuthorizationGrpc.newBlockingStub(channel);
        Auth.AuthReply authReply = greeterBlockingStub.sayHello(Auth.AuthRequest.newBuilder().setName("hello ,cpp").build());
        log.info("Returning " +message);
        log.info("Returning " +authReply.getMessage());
    }
}