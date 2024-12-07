package org.xproce.lab;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: messages.proto")
public final class CreatorServiceGrpc {

  private CreatorServiceGrpc() {}

  public static final String SERVICE_NAME = "org.xproce.lab.CreatorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.xproce.lab.CreatorIdRequest,
      org.xproce.lab.Creator> getGetCreatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCreator",
      requestType = org.xproce.lab.CreatorIdRequest.class,
      responseType = org.xproce.lab.Creator.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.xproce.lab.CreatorIdRequest,
      org.xproce.lab.Creator> getGetCreatorMethod() {
    io.grpc.MethodDescriptor<org.xproce.lab.CreatorIdRequest, org.xproce.lab.Creator> getGetCreatorMethod;
    if ((getGetCreatorMethod = CreatorServiceGrpc.getGetCreatorMethod) == null) {
      synchronized (CreatorServiceGrpc.class) {
        if ((getGetCreatorMethod = CreatorServiceGrpc.getGetCreatorMethod) == null) {
          CreatorServiceGrpc.getGetCreatorMethod = getGetCreatorMethod = 
              io.grpc.MethodDescriptor.<org.xproce.lab.CreatorIdRequest, org.xproce.lab.Creator>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.xproce.lab.CreatorService", "getCreator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.xproce.lab.CreatorIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.xproce.lab.Creator.getDefaultInstance()))
                  .setSchemaDescriptor(new CreatorServiceMethodDescriptorSupplier("getCreator"))
                  .build();
          }
        }
     }
     return getGetCreatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.xproce.lab.CreatorIdRequest,
      org.xproce.lab.VideoStream> getGetCreatorVideosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCreatorVideos",
      requestType = org.xproce.lab.CreatorIdRequest.class,
      responseType = org.xproce.lab.VideoStream.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.xproce.lab.CreatorIdRequest,
      org.xproce.lab.VideoStream> getGetCreatorVideosMethod() {
    io.grpc.MethodDescriptor<org.xproce.lab.CreatorIdRequest, org.xproce.lab.VideoStream> getGetCreatorVideosMethod;
    if ((getGetCreatorVideosMethod = CreatorServiceGrpc.getGetCreatorVideosMethod) == null) {
      synchronized (CreatorServiceGrpc.class) {
        if ((getGetCreatorVideosMethod = CreatorServiceGrpc.getGetCreatorVideosMethod) == null) {
          CreatorServiceGrpc.getGetCreatorVideosMethod = getGetCreatorVideosMethod = 
              io.grpc.MethodDescriptor.<org.xproce.lab.CreatorIdRequest, org.xproce.lab.VideoStream>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.xproce.lab.CreatorService", "getCreatorVideos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.xproce.lab.CreatorIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.xproce.lab.VideoStream.getDefaultInstance()))
                  .setSchemaDescriptor(new CreatorServiceMethodDescriptorSupplier("getCreatorVideos"))
                  .build();
          }
        }
     }
     return getGetCreatorVideosMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CreatorServiceStub newStub(io.grpc.Channel channel) {
    return new CreatorServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CreatorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CreatorServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CreatorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CreatorServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CreatorServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getCreator(org.xproce.lab.CreatorIdRequest request,
        io.grpc.stub.StreamObserver<org.xproce.lab.Creator> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCreatorMethod(), responseObserver);
    }

    /**
     */
    public void getCreatorVideos(org.xproce.lab.CreatorIdRequest request,
        io.grpc.stub.StreamObserver<org.xproce.lab.VideoStream> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCreatorVideosMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCreatorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.xproce.lab.CreatorIdRequest,
                org.xproce.lab.Creator>(
                  this, METHODID_GET_CREATOR)))
          .addMethod(
            getGetCreatorVideosMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.xproce.lab.CreatorIdRequest,
                org.xproce.lab.VideoStream>(
                  this, METHODID_GET_CREATOR_VIDEOS)))
          .build();
    }
  }

  /**
   */
  public static final class CreatorServiceStub extends io.grpc.stub.AbstractStub<CreatorServiceStub> {
    private CreatorServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CreatorServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreatorServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CreatorServiceStub(channel, callOptions);
    }

    /**
     */
    public void getCreator(org.xproce.lab.CreatorIdRequest request,
        io.grpc.stub.StreamObserver<org.xproce.lab.Creator> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCreatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCreatorVideos(org.xproce.lab.CreatorIdRequest request,
        io.grpc.stub.StreamObserver<org.xproce.lab.VideoStream> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCreatorVideosMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CreatorServiceBlockingStub extends io.grpc.stub.AbstractStub<CreatorServiceBlockingStub> {
    private CreatorServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CreatorServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreatorServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CreatorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.xproce.lab.Creator getCreator(org.xproce.lab.CreatorIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCreatorMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.xproce.lab.VideoStream getCreatorVideos(org.xproce.lab.CreatorIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCreatorVideosMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CreatorServiceFutureStub extends io.grpc.stub.AbstractStub<CreatorServiceFutureStub> {
    private CreatorServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CreatorServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreatorServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CreatorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.xproce.lab.Creator> getCreator(
        org.xproce.lab.CreatorIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCreatorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.xproce.lab.VideoStream> getCreatorVideos(
        org.xproce.lab.CreatorIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCreatorVideosMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CREATOR = 0;
  private static final int METHODID_GET_CREATOR_VIDEOS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CreatorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CreatorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CREATOR:
          serviceImpl.getCreator((org.xproce.lab.CreatorIdRequest) request,
              (io.grpc.stub.StreamObserver<org.xproce.lab.Creator>) responseObserver);
          break;
        case METHODID_GET_CREATOR_VIDEOS:
          serviceImpl.getCreatorVideos((org.xproce.lab.CreatorIdRequest) request,
              (io.grpc.stub.StreamObserver<org.xproce.lab.VideoStream>) responseObserver);
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

  private static abstract class CreatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CreatorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.xproce.lab.Messages.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CreatorService");
    }
  }

  private static final class CreatorServiceFileDescriptorSupplier
      extends CreatorServiceBaseDescriptorSupplier {
    CreatorServiceFileDescriptorSupplier() {}
  }

  private static final class CreatorServiceMethodDescriptorSupplier
      extends CreatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CreatorServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CreatorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CreatorServiceFileDescriptorSupplier())
              .addMethod(getGetCreatorMethod())
              .addMethod(getGetCreatorVideosMethod())
              .build();
        }
      }
    }
    return result;
  }
}
