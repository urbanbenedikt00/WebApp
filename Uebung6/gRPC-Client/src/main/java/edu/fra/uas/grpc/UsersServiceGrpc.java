package edu.fra.uas.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: UsersService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UsersServiceGrpc {

  private UsersServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "edu.fra.uas.grpc.UsersService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<edu.fra.uas.grpc.UsersServiceOuterClass.UsersRequest,
      edu.fra.uas.grpc.UsersServiceOuterClass.UsersResponse> getListUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listUsers",
      requestType = edu.fra.uas.grpc.UsersServiceOuterClass.UsersRequest.class,
      responseType = edu.fra.uas.grpc.UsersServiceOuterClass.UsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.fra.uas.grpc.UsersServiceOuterClass.UsersRequest,
      edu.fra.uas.grpc.UsersServiceOuterClass.UsersResponse> getListUsersMethod() {
    io.grpc.MethodDescriptor<edu.fra.uas.grpc.UsersServiceOuterClass.UsersRequest, edu.fra.uas.grpc.UsersServiceOuterClass.UsersResponse> getListUsersMethod;
    if ((getListUsersMethod = UsersServiceGrpc.getListUsersMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getListUsersMethod = UsersServiceGrpc.getListUsersMethod) == null) {
          UsersServiceGrpc.getListUsersMethod = getListUsersMethod =
              io.grpc.MethodDescriptor.<edu.fra.uas.grpc.UsersServiceOuterClass.UsersRequest, edu.fra.uas.grpc.UsersServiceOuterClass.UsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.fra.uas.grpc.UsersServiceOuterClass.UsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.fra.uas.grpc.UsersServiceOuterClass.UsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("listUsers"))
              .build();
        }
      }
    }
    return getListUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      edu.fra.uas.grpc.UsersServiceOuterClass.UserProto> getFindUserByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findUserById",
      requestType = com.google.protobuf.Int64Value.class,
      responseType = edu.fra.uas.grpc.UsersServiceOuterClass.UserProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      edu.fra.uas.grpc.UsersServiceOuterClass.UserProto> getFindUserByIdMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Int64Value, edu.fra.uas.grpc.UsersServiceOuterClass.UserProto> getFindUserByIdMethod;
    if ((getFindUserByIdMethod = UsersServiceGrpc.getFindUserByIdMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getFindUserByIdMethod = UsersServiceGrpc.getFindUserByIdMethod) == null) {
          UsersServiceGrpc.getFindUserByIdMethod = getFindUserByIdMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Int64Value, edu.fra.uas.grpc.UsersServiceOuterClass.UserProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findUserById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Int64Value.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.fra.uas.grpc.UsersServiceOuterClass.UserProto.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("findUserById"))
              .build();
        }
      }
    }
    return getFindUserByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edu.fra.uas.grpc.UsersServiceOuterClass.UserProto,
      edu.fra.uas.grpc.UsersServiceOuterClass.UserProto> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createUser",
      requestType = edu.fra.uas.grpc.UsersServiceOuterClass.UserProto.class,
      responseType = edu.fra.uas.grpc.UsersServiceOuterClass.UserProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.fra.uas.grpc.UsersServiceOuterClass.UserProto,
      edu.fra.uas.grpc.UsersServiceOuterClass.UserProto> getCreateUserMethod() {
    io.grpc.MethodDescriptor<edu.fra.uas.grpc.UsersServiceOuterClass.UserProto, edu.fra.uas.grpc.UsersServiceOuterClass.UserProto> getCreateUserMethod;
    if ((getCreateUserMethod = UsersServiceGrpc.getCreateUserMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getCreateUserMethod = UsersServiceGrpc.getCreateUserMethod) == null) {
          UsersServiceGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<edu.fra.uas.grpc.UsersServiceOuterClass.UserProto, edu.fra.uas.grpc.UsersServiceOuterClass.UserProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.fra.uas.grpc.UsersServiceOuterClass.UserProto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.fra.uas.grpc.UsersServiceOuterClass.UserProto.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("createUser"))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edu.fra.uas.grpc.UsersServiceOuterClass.UserProto,
      edu.fra.uas.grpc.UsersServiceOuterClass.UserProto> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateUser",
      requestType = edu.fra.uas.grpc.UsersServiceOuterClass.UserProto.class,
      responseType = edu.fra.uas.grpc.UsersServiceOuterClass.UserProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.fra.uas.grpc.UsersServiceOuterClass.UserProto,
      edu.fra.uas.grpc.UsersServiceOuterClass.UserProto> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<edu.fra.uas.grpc.UsersServiceOuterClass.UserProto, edu.fra.uas.grpc.UsersServiceOuterClass.UserProto> getUpdateUserMethod;
    if ((getUpdateUserMethod = UsersServiceGrpc.getUpdateUserMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getUpdateUserMethod = UsersServiceGrpc.getUpdateUserMethod) == null) {
          UsersServiceGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<edu.fra.uas.grpc.UsersServiceOuterClass.UserProto, edu.fra.uas.grpc.UsersServiceOuterClass.UserProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.fra.uas.grpc.UsersServiceOuterClass.UserProto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.fra.uas.grpc.UsersServiceOuterClass.UserProto.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("updateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      com.google.protobuf.BoolValue> getDeleteUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteUser",
      requestType = com.google.protobuf.Int64Value.class,
      responseType = com.google.protobuf.BoolValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      com.google.protobuf.BoolValue> getDeleteUserMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Int64Value, com.google.protobuf.BoolValue> getDeleteUserMethod;
    if ((getDeleteUserMethod = UsersServiceGrpc.getDeleteUserMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getDeleteUserMethod = UsersServiceGrpc.getDeleteUserMethod) == null) {
          UsersServiceGrpc.getDeleteUserMethod = getDeleteUserMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Int64Value, com.google.protobuf.BoolValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Int64Value.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.BoolValue.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("deleteUser"))
              .build();
        }
      }
    }
    return getDeleteUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UsersServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersServiceStub>() {
        @java.lang.Override
        public UsersServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersServiceStub(channel, callOptions);
        }
      };
    return UsersServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UsersServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersServiceBlockingStub>() {
        @java.lang.Override
        public UsersServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersServiceBlockingStub(channel, callOptions);
        }
      };
    return UsersServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UsersServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersServiceFutureStub>() {
        @java.lang.Override
        public UsersServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersServiceFutureStub(channel, callOptions);
        }
      };
    return UsersServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * lista all users
     * </pre>
     */
    default void listUsers(edu.fra.uas.grpc.UsersServiceOuterClass.UsersRequest request,
        io.grpc.stub.StreamObserver<edu.fra.uas.grpc.UsersServiceOuterClass.UsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUsersMethod(), responseObserver);
    }

    /**
     * <pre>
     * finds a user by id
     * </pre>
     */
    default void findUserById(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<edu.fra.uas.grpc.UsersServiceOuterClass.UserProto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindUserByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * creates a new user
     * </pre>
     */
    default void createUser(edu.fra.uas.grpc.UsersServiceOuterClass.UserProto request,
        io.grpc.stub.StreamObserver<edu.fra.uas.grpc.UsersServiceOuterClass.UserProto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * updates a user
     * </pre>
     */
    default void updateUser(edu.fra.uas.grpc.UsersServiceOuterClass.UserProto request,
        io.grpc.stub.StreamObserver<edu.fra.uas.grpc.UsersServiceOuterClass.UserProto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * deletes a user
     * </pre>
     */
    default void deleteUser(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UsersService.
   */
  public static abstract class UsersServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UsersServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UsersService.
   */
  public static final class UsersServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UsersServiceStub> {
    private UsersServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * lista all users
     * </pre>
     */
    public void listUsers(edu.fra.uas.grpc.UsersServiceOuterClass.UsersRequest request,
        io.grpc.stub.StreamObserver<edu.fra.uas.grpc.UsersServiceOuterClass.UsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * finds a user by id
     * </pre>
     */
    public void findUserById(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<edu.fra.uas.grpc.UsersServiceOuterClass.UserProto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindUserByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * creates a new user
     * </pre>
     */
    public void createUser(edu.fra.uas.grpc.UsersServiceOuterClass.UserProto request,
        io.grpc.stub.StreamObserver<edu.fra.uas.grpc.UsersServiceOuterClass.UserProto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * updates a user
     * </pre>
     */
    public void updateUser(edu.fra.uas.grpc.UsersServiceOuterClass.UserProto request,
        io.grpc.stub.StreamObserver<edu.fra.uas.grpc.UsersServiceOuterClass.UserProto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * deletes a user
     * </pre>
     */
    public void deleteUser(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UsersService.
   */
  public static final class UsersServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UsersServiceBlockingStub> {
    private UsersServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * lista all users
     * </pre>
     */
    public edu.fra.uas.grpc.UsersServiceOuterClass.UsersResponse listUsers(edu.fra.uas.grpc.UsersServiceOuterClass.UsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * finds a user by id
     * </pre>
     */
    public edu.fra.uas.grpc.UsersServiceOuterClass.UserProto findUserById(com.google.protobuf.Int64Value request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindUserByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * creates a new user
     * </pre>
     */
    public edu.fra.uas.grpc.UsersServiceOuterClass.UserProto createUser(edu.fra.uas.grpc.UsersServiceOuterClass.UserProto request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * updates a user
     * </pre>
     */
    public edu.fra.uas.grpc.UsersServiceOuterClass.UserProto updateUser(edu.fra.uas.grpc.UsersServiceOuterClass.UserProto request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * deletes a user
     * </pre>
     */
    public com.google.protobuf.BoolValue deleteUser(com.google.protobuf.Int64Value request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UsersService.
   */
  public static final class UsersServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UsersServiceFutureStub> {
    private UsersServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * lista all users
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.fra.uas.grpc.UsersServiceOuterClass.UsersResponse> listUsers(
        edu.fra.uas.grpc.UsersServiceOuterClass.UsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUsersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * finds a user by id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.fra.uas.grpc.UsersServiceOuterClass.UserProto> findUserById(
        com.google.protobuf.Int64Value request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindUserByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * creates a new user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.fra.uas.grpc.UsersServiceOuterClass.UserProto> createUser(
        edu.fra.uas.grpc.UsersServiceOuterClass.UserProto request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * updates a user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.fra.uas.grpc.UsersServiceOuterClass.UserProto> updateUser(
        edu.fra.uas.grpc.UsersServiceOuterClass.UserProto request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * deletes a user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.BoolValue> deleteUser(
        com.google.protobuf.Int64Value request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_USERS = 0;
  private static final int METHODID_FIND_USER_BY_ID = 1;
  private static final int METHODID_CREATE_USER = 2;
  private static final int METHODID_UPDATE_USER = 3;
  private static final int METHODID_DELETE_USER = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_USERS:
          serviceImpl.listUsers((edu.fra.uas.grpc.UsersServiceOuterClass.UsersRequest) request,
              (io.grpc.stub.StreamObserver<edu.fra.uas.grpc.UsersServiceOuterClass.UsersResponse>) responseObserver);
          break;
        case METHODID_FIND_USER_BY_ID:
          serviceImpl.findUserById((com.google.protobuf.Int64Value) request,
              (io.grpc.stub.StreamObserver<edu.fra.uas.grpc.UsersServiceOuterClass.UserProto>) responseObserver);
          break;
        case METHODID_CREATE_USER:
          serviceImpl.createUser((edu.fra.uas.grpc.UsersServiceOuterClass.UserProto) request,
              (io.grpc.stub.StreamObserver<edu.fra.uas.grpc.UsersServiceOuterClass.UserProto>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((edu.fra.uas.grpc.UsersServiceOuterClass.UserProto) request,
              (io.grpc.stub.StreamObserver<edu.fra.uas.grpc.UsersServiceOuterClass.UserProto>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((com.google.protobuf.Int64Value) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getListUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              edu.fra.uas.grpc.UsersServiceOuterClass.UsersRequest,
              edu.fra.uas.grpc.UsersServiceOuterClass.UsersResponse>(
                service, METHODID_LIST_USERS)))
        .addMethod(
          getFindUserByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Int64Value,
              edu.fra.uas.grpc.UsersServiceOuterClass.UserProto>(
                service, METHODID_FIND_USER_BY_ID)))
        .addMethod(
          getCreateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              edu.fra.uas.grpc.UsersServiceOuterClass.UserProto,
              edu.fra.uas.grpc.UsersServiceOuterClass.UserProto>(
                service, METHODID_CREATE_USER)))
        .addMethod(
          getUpdateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              edu.fra.uas.grpc.UsersServiceOuterClass.UserProto,
              edu.fra.uas.grpc.UsersServiceOuterClass.UserProto>(
                service, METHODID_UPDATE_USER)))
        .addMethod(
          getDeleteUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Int64Value,
              com.google.protobuf.BoolValue>(
                service, METHODID_DELETE_USER)))
        .build();
  }

  private static abstract class UsersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UsersServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return edu.fra.uas.grpc.UsersServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UsersService");
    }
  }

  private static final class UsersServiceFileDescriptorSupplier
      extends UsersServiceBaseDescriptorSupplier {
    UsersServiceFileDescriptorSupplier() {}
  }

  private static final class UsersServiceMethodDescriptorSupplier
      extends UsersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UsersServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (UsersServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UsersServiceFileDescriptorSupplier())
              .addMethod(getListUsersMethod())
              .addMethod(getFindUserByIdMethod())
              .addMethod(getCreateUserMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getDeleteUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
