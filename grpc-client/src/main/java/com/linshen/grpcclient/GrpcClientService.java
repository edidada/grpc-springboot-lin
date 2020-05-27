package com.linshen.grpcclient;

import cn.wdidada.grpc.lib.proxy.IsomerizationProxyGrpc;
import cn.wdidada.grpc.lib.proxy.Proxy;
import io.grpc.Channel;
import net.devh.springboot.autoconfigure.grpc.client.GrpcClient;
import org.springframework.stereotype.Service;


@Service
public class GrpcClientService {

    @GrpcClient("local-grpc-server")
    private Channel serverChannel;

    public String sendMessage(String name) {
        IsomerizationProxyGrpc.IsomerizationProxyBlockingStub stub= IsomerizationProxyGrpc.newBlockingStub(serverChannel);
        Proxy.ProxyReply response = stub.rpcCall(Proxy.ProxyRequest.newBuilder().setName(name).build());
        return response.getMessage();
    }
}
