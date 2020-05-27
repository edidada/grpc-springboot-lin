package cn.wdidada.grpc.lib.auth;

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
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.1)",
    comments = "Source: auth.proto")
public final class AuthorizationGrpc {

  private AuthorizationGrpc() {}

  public static final String SERVICE_NAME = "helloworld.Authorization";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cn.wdidada.grpc.lib.auth.Auth.AuthRequest,
      cn.wdidada.grpc.lib.auth.Auth.AuthReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = cn.wdidada.grpc.lib.auth.Auth.AuthRequest.class,
      responseType = cn.wdidada.grpc.lib.auth.Auth.AuthReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cn.wdidada.grpc.lib.auth.Auth.AuthRequest,
      cn.wdidada.grpc.lib.auth.Auth.AuthReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<cn.wdidada.grpc.lib.auth.Auth.AuthRequest, cn.wdidada.grpc.lib.auth.Auth.AuthReply> getSayHelloMethod;
    if ((getSayHelloMethod = AuthorizationGrpc.getSayHelloMethod) == null) {
      synchronized (AuthorizationGrpc.class) {
        if ((getSayHelloMethod = AuthorizationGrpc.getSayHelloMethod) == null) {
          AuthorizationGrpc.getSayHelloMethod = getSayHelloMethod = 
              io.grpc.MethodDescriptor.<cn.wdidada.grpc.lib.auth.Auth.AuthRequest, cn.wdidada.grpc.lib.auth.Auth.AuthReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "helloworld.Authorization", "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.wdidada.grpc.lib.auth.Auth.AuthRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.wdidada.grpc.lib.auth.Auth.AuthReply.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthorizationMethodDescriptorSupplier("SayHello"))
                  .build();
          }
        }
     }
     return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthorizationStub newStub(io.grpc.Channel channel) {
    return new AuthorizationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthorizationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AuthorizationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthorizationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AuthorizationFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class AuthorizationImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(cn.wdidada.grpc.lib.auth.Auth.AuthRequest request,
        io.grpc.stub.StreamObserver<cn.wdidada.grpc.lib.auth.Auth.AuthReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cn.wdidada.grpc.lib.auth.Auth.AuthRequest,
                cn.wdidada.grpc.lib.auth.Auth.AuthReply>(
                  this, METHODID_SAY_HELLO)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class AuthorizationStub extends io.grpc.stub.AbstractStub<AuthorizationStub> {
    private AuthorizationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthorizationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthorizationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthorizationStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(cn.wdidada.grpc.lib.auth.Auth.AuthRequest request,
        io.grpc.stub.StreamObserver<cn.wdidada.grpc.lib.auth.Auth.AuthReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class AuthorizationBlockingStub extends io.grpc.stub.AbstractStub<AuthorizationBlockingStub> {
    private AuthorizationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthorizationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthorizationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthorizationBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public cn.wdidada.grpc.lib.auth.Auth.AuthReply sayHello(cn.wdidada.grpc.lib.auth.Auth.AuthRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class AuthorizationFutureStub extends io.grpc.stub.AbstractStub<AuthorizationFutureStub> {
    private AuthorizationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthorizationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthorizationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthorizationFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.wdidada.grpc.lib.auth.Auth.AuthReply> sayHello(
        cn.wdidada.grpc.lib.auth.Auth.AuthRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthorizationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthorizationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((cn.wdidada.grpc.lib.auth.Auth.AuthRequest) request,
              (io.grpc.stub.StreamObserver<cn.wdidada.grpc.lib.auth.Auth.AuthReply>) responseObserver);
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

  private static abstract class AuthorizationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthorizationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cn.wdidada.grpc.lib.auth.Auth.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Authorization");
    }
  }

  private static final class AuthorizationFileDescriptorSupplier
      extends AuthorizationBaseDescriptorSupplier {
    AuthorizationFileDescriptorSupplier() {}
  }

  private static final class AuthorizationMethodDescriptorSupplier
      extends AuthorizationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthorizationMethodDescriptorSupplier(String methodName) {
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
      synchronized (AuthorizationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthorizationFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
