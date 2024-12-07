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
public final class VideoServiceGrpc {

  private VideoServiceGrpc() {}

  public static final String SERVICE_NAME = "org.xproce.lab.VideoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.xproce.lab.UploadVideoRequest,
      org.xproce.lab.Video> getUploadVideoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "uploadVideo",
      requestType = org.xproce.lab.UploadVideoRequest.class,
      responseType = org.xproce.lab.Video.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.xproce.lab.UploadVideoRequest,
      org.xproce.lab.Video> getUploadVideoMethod() {
    io.grpc.MethodDescriptor<org.xproce.lab.UploadVideoRequest, org.xproce.lab.Video> getUploadVideoMethod;
    if ((getUploadVideoMethod = VideoServiceGrpc.getUploadVideoMethod) == null) {
      synchronized (VideoServiceGrpc.class) {
        if ((getUploadVideoMethod = VideoServiceGrpc.getUploadVideoMethod) == null) {
          VideoServiceGrpc.getUploadVideoMethod = getUploadVideoMethod = 
              io.grpc.MethodDescriptor.<org.xproce.lab.UploadVideoRequest, org.xproce.lab.Video>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.xproce.lab.VideoService", "uploadVideo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.xproce.lab.UploadVideoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.xproce.lab.Video.getDefaultInstance()))
                  .setSchemaDescriptor(new VideoServiceMethodDescriptorSupplier("uploadVideo"))
                  .build();
          }
        }
     }
     return getUploadVideoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.xproce.lab.VideoIdRequest,
      org.xproce.lab.Video> getGetVideoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVideo",
      requestType = org.xproce.lab.VideoIdRequest.class,
      responseType = org.xproce.lab.Video.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.xproce.lab.VideoIdRequest,
      org.xproce.lab.Video> getGetVideoMethod() {
    io.grpc.MethodDescriptor<org.xproce.lab.VideoIdRequest, org.xproce.lab.Video> getGetVideoMethod;
    if ((getGetVideoMethod = VideoServiceGrpc.getGetVideoMethod) == null) {
      synchronized (VideoServiceGrpc.class) {
        if ((getGetVideoMethod = VideoServiceGrpc.getGetVideoMethod) == null) {
          VideoServiceGrpc.getGetVideoMethod = getGetVideoMethod = 
              io.grpc.MethodDescriptor.<org.xproce.lab.VideoIdRequest, org.xproce.lab.Video>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.xproce.lab.VideoService", "getVideo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.xproce.lab.VideoIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.xproce.lab.Video.getDefaultInstance()))
                  .setSchemaDescriptor(new VideoServiceMethodDescriptorSupplier("getVideo"))
                  .build();
          }
        }
     }
     return getGetVideoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VideoServiceStub newStub(io.grpc.Channel channel) {
    return new VideoServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VideoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new VideoServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VideoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new VideoServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class VideoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void uploadVideo(org.xproce.lab.UploadVideoRequest request,
        io.grpc.stub.StreamObserver<org.xproce.lab.Video> responseObserver) {
      asyncUnimplementedUnaryCall(getUploadVideoMethod(), responseObserver);
    }

    /**
     */
    public void getVideo(org.xproce.lab.VideoIdRequest request,
        io.grpc.stub.StreamObserver<org.xproce.lab.Video> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVideoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUploadVideoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.xproce.lab.UploadVideoRequest,
                org.xproce.lab.Video>(
                  this, METHODID_UPLOAD_VIDEO)))
          .addMethod(
            getGetVideoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.xproce.lab.VideoIdRequest,
                org.xproce.lab.Video>(
                  this, METHODID_GET_VIDEO)))
          .build();
    }
  }

  /**
   */
  public static final class VideoServiceStub extends io.grpc.stub.AbstractStub<VideoServiceStub> {
    private VideoServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VideoServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VideoServiceStub(channel, callOptions);
    }

    /**
     */
    public void uploadVideo(org.xproce.lab.UploadVideoRequest request,
        io.grpc.stub.StreamObserver<org.xproce.lab.Video> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUploadVideoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVideo(org.xproce.lab.VideoIdRequest request,
        io.grpc.stub.StreamObserver<org.xproce.lab.Video> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVideoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class VideoServiceBlockingStub extends io.grpc.stub.AbstractStub<VideoServiceBlockingStub> {
    private VideoServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VideoServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VideoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.xproce.lab.Video uploadVideo(org.xproce.lab.UploadVideoRequest request) {
      return blockingUnaryCall(
          getChannel(), getUploadVideoMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.xproce.lab.Video getVideo(org.xproce.lab.VideoIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVideoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class VideoServiceFutureStub extends io.grpc.stub.AbstractStub<VideoServiceFutureStub> {
    private VideoServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VideoServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VideoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.xproce.lab.Video> uploadVideo(
        org.xproce.lab.UploadVideoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUploadVideoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.xproce.lab.Video> getVideo(
        org.xproce.lab.VideoIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVideoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPLOAD_VIDEO = 0;
  private static final int METHODID_GET_VIDEO = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VideoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VideoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPLOAD_VIDEO:
          serviceImpl.uploadVideo((org.xproce.lab.UploadVideoRequest) request,
              (io.grpc.stub.StreamObserver<org.xproce.lab.Video>) responseObserver);
          break;
        case METHODID_GET_VIDEO:
          serviceImpl.getVideo((org.xproce.lab.VideoIdRequest) request,
              (io.grpc.stub.StreamObserver<org.xproce.lab.Video>) responseObserver);
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

  private static abstract class VideoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VideoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.xproce.lab.Messages.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VideoService");
    }
  }

  private static final class VideoServiceFileDescriptorSupplier
      extends VideoServiceBaseDescriptorSupplier {
    VideoServiceFileDescriptorSupplier() {}
  }

  private static final class VideoServiceMethodDescriptorSupplier
      extends VideoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VideoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (VideoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VideoServiceFileDescriptorSupplier())
              .addMethod(getUploadVideoMethod())
              .addMethod(getGetVideoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
