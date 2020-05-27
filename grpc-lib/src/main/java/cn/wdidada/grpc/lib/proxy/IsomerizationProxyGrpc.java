package cn.wdidada.grpc.lib.proxy;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The greeter service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.1)",
    comments = "Source: proxy.proto")
public final class IsomerizationProxyGrpc {

  private IsomerizationProxyGrpc() {}

  public static final String SERVICE_NAME = "IsomerizationProxy";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cn.wdidada.grpc.lib.proxy.Proxy.ProxyRequest,
      cn.wdidada.grpc.lib.proxy.Proxy.ProxyReply> getRpcCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RpcCall",
      requestType = cn.wdidada.grpc.lib.proxy.Proxy.ProxyRequest.class,
      responseType = cn.wdidada.grpc.lib.proxy.Proxy.ProxyReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cn.wdidada.grpc.lib.proxy.Proxy.ProxyRequest,
      cn.wdidada.grpc.lib.proxy.Proxy.ProxyReply> getRpcCallMethod() {
    io.grpc.MethodDescriptor<cn.wdidada.grpc.lib.proxy.Proxy.ProxyRequest, cn.wdidada.grpc.lib.proxy.Proxy.ProxyReply> getRpcCallMethod;
    if ((getRpcCallMethod = IsomerizationProxyGrpc.getRpcCallMethod) == null) {
      synchronized (IsomerizationProxyGrpc.class) {
        if ((getRpcCallMethod = IsomerizationProxyGrpc.getRpcCallMethod) == null) {
          IsomerizationProxyGrpc.getRpcCallMethod = getRpcCallMethod = 
              io.grpc.MethodDescriptor.<cn.wdidada.grpc.lib.proxy.Proxy.ProxyRequest, cn.wdidada.grpc.lib.proxy.Proxy.ProxyReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "IsomerizationProxy", "RpcCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.wdidada.grpc.lib.proxy.Proxy.ProxyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.wdidada.grpc.lib.proxy.Proxy.ProxyReply.getDefaultInstance()))
                  .setSchemaDescriptor(new IsomerizationProxyMethodDescriptorSupplier("RpcCall"))
                  .build();
          }
        }
     }
     return getRpcCallMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IsomerizationProxyStub newStub(io.grpc.Channel channel) {
    return new IsomerizationProxyStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IsomerizationProxyBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IsomerizationProxyBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IsomerizationProxyFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IsomerizationProxyFutureStub(channel);
  }

  /**
   * <pre>
   * The greeter service definition.
   * </pre>
   */
  public static abstract class IsomerizationProxyImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void rpcCall(cn.wdidada.grpc.lib.proxy.Proxy.ProxyRequest request,
        io.grpc.stub.StreamObserver<cn.wdidada.grpc.lib.proxy.Proxy.ProxyReply> responseObserver) {
      asyncUnimplementedUnaryCall(getRpcCallMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRpcCallMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cn.wdidada.grpc.lib.proxy.Proxy.ProxyRequest,
                cn.wdidada.grpc.lib.proxy.Proxy.ProxyReply>(
                  this, METHODID_RPC_CALL)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeter service definition.
   * </pre>
   */
  public static final class IsomerizationProxyStub extends io.grpc.stub.AbstractStub<IsomerizationProxyStub> {
    private IsomerizationProxyStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IsomerizationProxyStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IsomerizationProxyStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IsomerizationProxyStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void rpcCall(cn.wdidada.grpc.lib.proxy.Proxy.ProxyRequest request,
        io.grpc.stub.StreamObserver<cn.wdidada.grpc.lib.proxy.Proxy.ProxyReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRpcCallMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeter service definition.
   * </pre>
   */
  public static final class IsomerizationProxyBlockingStub extends io.grpc.stub.AbstractStub<IsomerizationProxyBlockingStub> {
    private IsomerizationProxyBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IsomerizationProxyBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IsomerizationProxyBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IsomerizationProxyBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public cn.wdidada.grpc.lib.proxy.Proxy.ProxyReply rpcCall(cn.wdidada.grpc.lib.proxy.Proxy.ProxyRequest request) {
      return blockingUnaryCall(
          getChannel(), getRpcCallMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeter service definition.
   * </pre>
   */
  public static final class IsomerizationProxyFutureStub extends io.grpc.stub.AbstractStub<IsomerizationProxyFutureStub> {
    private IsomerizationProxyFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IsomerizationProxyFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IsomerizationProxyFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IsomerizationProxyFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.wdidada.grpc.lib.proxy.Proxy.ProxyReply> rpcCall(
        cn.wdidada.grpc.lib.proxy.Proxy.ProxyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRpcCallMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RPC_CALL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IsomerizationProxyImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IsomerizationProxyImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RPC_CALL:
          serviceImpl.rpcCall((cn.wdidada.grpc.lib.proxy.Proxy.ProxyRequest) request,
              (io.grpc.stub.StreamObserver<cn.wdidada.grpc.lib.proxy.Proxy.ProxyReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class IsomerizationProxyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IsomerizationProxyBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cn.wdidada.grpc.lib.proxy.Proxy.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IsomerizationProxy");
    }
  }

  private static final class IsomerizationProxyFileDescriptorSupplier
      extends IsomerizationProxyBaseDescriptorSupplier {
    IsomerizationProxyFileDescriptorSupplier() {}
  }

  private static final class IsomerizationProxyMethodDescriptorSupplier
      extends IsomerizationProxyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IsomerizationProxyMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (IsomerizationProxyGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IsomerizationProxyFileDescriptorSupplier())
              .addMethod(getRpcCallMethod())
              .build();
        }
      }
    }
    return result;
  }
}
