package edu.fra.uas.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: StockQuote.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StockQuoteServiceGrpc {

  private StockQuoteServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "edu.fra.uas.grpc.StockQuoteService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<edu.fra.uas.grpc.StockQuoteOuterClass.Stock,
      edu.fra.uas.grpc.StockQuoteOuterClass.StockQuote> getServerSideStreamingGetListStockQuotesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "serverSideStreamingGetListStockQuotes",
      requestType = edu.fra.uas.grpc.StockQuoteOuterClass.Stock.class,
      responseType = edu.fra.uas.grpc.StockQuoteOuterClass.StockQuote.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<edu.fra.uas.grpc.StockQuoteOuterClass.Stock,
      edu.fra.uas.grpc.StockQuoteOuterClass.StockQuote> getServerSideStreamingGetListStockQuotesMethod() {
    io.grpc.MethodDescriptor<edu.fra.uas.grpc.StockQuoteOuterClass.Stock, edu.fra.uas.grpc.StockQuoteOuterClass.StockQuote> getServerSideStreamingGetListStockQuotesMethod;
    if ((getServerSideStreamingGetListStockQuotesMethod = StockQuoteServiceGrpc.getServerSideStreamingGetListStockQuotesMethod) == null) {
      synchronized (StockQuoteServiceGrpc.class) {
        if ((getServerSideStreamingGetListStockQuotesMethod = StockQuoteServiceGrpc.getServerSideStreamingGetListStockQuotesMethod) == null) {
          StockQuoteServiceGrpc.getServerSideStreamingGetListStockQuotesMethod = getServerSideStreamingGetListStockQuotesMethod =
              io.grpc.MethodDescriptor.<edu.fra.uas.grpc.StockQuoteOuterClass.Stock, edu.fra.uas.grpc.StockQuoteOuterClass.StockQuote>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "serverSideStreamingGetListStockQuotes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.fra.uas.grpc.StockQuoteOuterClass.Stock.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.fra.uas.grpc.StockQuoteOuterClass.StockQuote.getDefaultInstance()))
              .setSchemaDescriptor(new StockQuoteServiceMethodDescriptorSupplier("serverSideStreamingGetListStockQuotes"))
              .build();
        }
      }
    }
    return getServerSideStreamingGetListStockQuotesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edu.fra.uas.grpc.StockQuoteOuterClass.Stock,
      edu.fra.uas.grpc.StockQuoteOuterClass.StockQuote> getClientSideStreamingGetStatisticsOfStocksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "clientSideStreamingGetStatisticsOfStocks",
      requestType = edu.fra.uas.grpc.StockQuoteOuterClass.Stock.class,
      responseType = edu.fra.uas.grpc.StockQuoteOuterClass.StockQuote.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<edu.fra.uas.grpc.StockQuoteOuterClass.Stock,
      edu.fra.uas.grpc.StockQuoteOuterClass.StockQuote> getClientSideStreamingGetStatisticsOfStocksMethod() {
    io.grpc.MethodDescriptor<edu.fra.uas.grpc.StockQuoteOuterClass.Stock, edu.fra.uas.grpc.StockQuoteOuterClass.StockQuote> getClientSideStreamingGetStatisticsOfStocksMethod;
    if ((getClientSideStreamingGetStatisticsOfStocksMethod = StockQuoteServiceGrpc.getClientSideStreamingGetStatisticsOfStocksMethod) == null) {
      synchronized (StockQuoteServiceGrpc.class) {
        if ((getClientSideStreamingGetStatisticsOfStocksMethod = StockQuoteServiceGrpc.getClientSideStreamingGetStatisticsOfStocksMethod) == null) {
          StockQuoteServiceGrpc.getClientSideStreamingGetStatisticsOfStocksMethod = getClientSideStreamingGetStatisticsOfStocksMethod =
              io.grpc.MethodDescriptor.<edu.fra.uas.grpc.StockQuoteOuterClass.Stock, edu.fra.uas.grpc.StockQuoteOuterClass.StockQuote>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "clientSideStreamingGetStatisticsOfStocks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.fra.uas.grpc.StockQuoteOuterClass.Stock.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.fra.uas.grpc.StockQuoteOuterClass.StockQuote.getDefaultInstance()))
              .setSchemaDescriptor(new StockQuoteServiceMethodDescriptorSupplier("clientSideStreamingGetStatisticsOfStocks"))
              .build();
        }
      }
    }
    return getClientSideStreamingGetStatisticsOfStocksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edu.fra.uas.grpc.StockQuoteOuterClass.Stock,
      edu.fra.uas.grpc.StockQuoteOuterClass.StockQuote> getBidirectionalStreamingGetListsStockQuotesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bidirectionalStreamingGetListsStockQuotes",
      requestType = edu.fra.uas.grpc.StockQuoteOuterClass.Stock.class,
      responseType = edu.fra.uas.grpc.StockQuoteOuterClass.StockQuote.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<edu.fra.uas.grpc.StockQuoteOuterClass.Stock,
      edu.fra.uas.grpc.StockQuoteOuterClass.StockQuote> getBidirectionalStreamingGetListsStockQuotesMethod() {
    io.grpc.MethodDescriptor<edu.fra.uas.grpc.StockQuoteOuterClass.Stock, edu.fra.uas.grpc.StockQuoteOuterClass.StockQuote> getBidirectionalStreamingGetListsStockQuotesMethod;
    if ((getBidirectionalStreamingGetListsStockQuotesMethod = StockQuoteServiceGrpc.getBidirectionalStreamingGetListsStockQuotesMethod) == null) {
      synchronized (StockQuoteServiceGrpc.class) {
        if ((getBidirectionalStreamingGetListsStockQuotesMethod = StockQuoteServiceGrpc.getBidirectionalStreamingGetListsStockQuotesMethod) == null) {
          StockQuoteServiceGrpc.getBidirectionalStreamingGetListsStockQuotesMethod = getBidirectionalStreamingGetListsStockQuotesMethod =
              io.grpc.MethodDescriptor.<edu.fra.uas.grpc.StockQuoteOuterClass.Stock, edu.fra.uas.grpc.StockQuoteOuterClass.StockQuote>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "bidirectionalStreamingGetListsStockQuotes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.fra.uas.grpc.StockQuoteOuterClass.Stock.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.fra.uas.grpc.StockQuoteOuterClass.StockQuote.getDefaultInstance()))
              .setSchemaDescriptor(new StockQuoteServiceMethodDescriptorSupplier("bidirectionalStreamingGetListsStockQuotes"))
              .build();
        }
      }
    }
    return getBidirectionalStreamingGetListsStockQuotesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StockQuoteServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StockQuoteServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StockQuoteServiceStub>() {
        @java.lang.Override
        public StockQuoteServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StockQuoteServiceStub(channel, callOptions);
        }
      };
    return StockQuoteServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StockQuoteServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StockQuoteServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StockQuoteServiceBlockingStub>() {
        @java.lang.Override
        public StockQuoteServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StockQuoteServiceBlockingStub(channel, callOptions);
        }
      };
    return StockQuoteServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StockQuoteServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StockQuoteServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StockQuoteServiceFutureStub>() {
        @java.lang.Override
        public StockQuoteServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StockQuoteServiceFutureStub(channel, callOptions);
        }
      };
    return StockQuoteServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void serverSideStreamingGetListStockQuotes(edu.fra.uas.grpc.StockQuoteOuterClass.Stock request,
        io.grpc.stub.StreamObserver<edu.fra.uas.grpc.StockQuoteOuterClass.StockQuote> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getServerSideStreamingGetListStockQuotesMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<edu.fra.uas.grpc.StockQuoteOuterClass.Stock> clientSideStreamingGetStatisticsOfStocks(
        io.grpc.stub.StreamObserver<edu.fra.uas.grpc.StockQuoteOuterClass.StockQuote> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getClientSideStreamingGetStatisticsOfStocksMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<edu.fra.uas.grpc.StockQuoteOuterClass.Stock> bidirectionalStreamingGetListsStockQuotes(
        io.grpc.stub.StreamObserver<edu.fra.uas.grpc.StockQuoteOuterClass.StockQuote> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getBidirectionalStreamingGetListsStockQuotesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service StockQuoteService.
   */
  public static abstract class StockQuoteServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return StockQuoteServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service StockQuoteService.
   */
  public static final class StockQuoteServiceStub
      extends io.grpc.stub.AbstractAsyncStub<StockQuoteServiceStub> {
    private StockQuoteServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StockQuoteServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StockQuoteServiceStub(channel, callOptions);
    }

    /**
     */
    public void serverSideStreamingGetListStockQuotes(edu.fra.uas.grpc.StockQuoteOuterClass.Stock request,
        io.grpc.stub.StreamObserver<edu.fra.uas.grpc.StockQuoteOuterClass.StockQuote> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getServerSideStreamingGetListStockQuotesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<edu.fra.uas.grpc.StockQuoteOuterClass.Stock> clientSideStreamingGetStatisticsOfStocks(
        io.grpc.stub.StreamObserver<edu.fra.uas.grpc.StockQuoteOuterClass.StockQuote> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getClientSideStreamingGetStatisticsOfStocksMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<edu.fra.uas.grpc.StockQuoteOuterClass.Stock> bidirectionalStreamingGetListsStockQuotes(
        io.grpc.stub.StreamObserver<edu.fra.uas.grpc.StockQuoteOuterClass.StockQuote> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getBidirectionalStreamingGetListsStockQuotesMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service StockQuoteService.
   */
  public static final class StockQuoteServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<StockQuoteServiceBlockingStub> {
    private StockQuoteServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StockQuoteServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StockQuoteServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<edu.fra.uas.grpc.StockQuoteOuterClass.StockQuote> serverSideStreamingGetListStockQuotes(
        edu.fra.uas.grpc.StockQuoteOuterClass.Stock request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getServerSideStreamingGetListStockQuotesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service StockQuoteService.
   */
  public static final class StockQuoteServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<StockQuoteServiceFutureStub> {
    private StockQuoteServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StockQuoteServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StockQuoteServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SERVER_SIDE_STREAMING_GET_LIST_STOCK_QUOTES = 0;
  private static final int METHODID_CLIENT_SIDE_STREAMING_GET_STATISTICS_OF_STOCKS = 1;
  private static final int METHODID_BIDIRECTIONAL_STREAMING_GET_LISTS_STOCK_QUOTES = 2;

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
        case METHODID_SERVER_SIDE_STREAMING_GET_LIST_STOCK_QUOTES:
          serviceImpl.serverSideStreamingGetListStockQuotes((edu.fra.uas.grpc.StockQuoteOuterClass.Stock) request,
              (io.grpc.stub.StreamObserver<edu.fra.uas.grpc.StockQuoteOuterClass.StockQuote>) responseObserver);
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
        case METHODID_CLIENT_SIDE_STREAMING_GET_STATISTICS_OF_STOCKS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.clientSideStreamingGetStatisticsOfStocks(
              (io.grpc.stub.StreamObserver<edu.fra.uas.grpc.StockQuoteOuterClass.StockQuote>) responseObserver);
        case METHODID_BIDIRECTIONAL_STREAMING_GET_LISTS_STOCK_QUOTES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.bidirectionalStreamingGetListsStockQuotes(
              (io.grpc.stub.StreamObserver<edu.fra.uas.grpc.StockQuoteOuterClass.StockQuote>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getServerSideStreamingGetListStockQuotesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              edu.fra.uas.grpc.StockQuoteOuterClass.Stock,
              edu.fra.uas.grpc.StockQuoteOuterClass.StockQuote>(
                service, METHODID_SERVER_SIDE_STREAMING_GET_LIST_STOCK_QUOTES)))
        .addMethod(
          getClientSideStreamingGetStatisticsOfStocksMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              edu.fra.uas.grpc.StockQuoteOuterClass.Stock,
              edu.fra.uas.grpc.StockQuoteOuterClass.StockQuote>(
                service, METHODID_CLIENT_SIDE_STREAMING_GET_STATISTICS_OF_STOCKS)))
        .addMethod(
          getBidirectionalStreamingGetListsStockQuotesMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              edu.fra.uas.grpc.StockQuoteOuterClass.Stock,
              edu.fra.uas.grpc.StockQuoteOuterClass.StockQuote>(
                service, METHODID_BIDIRECTIONAL_STREAMING_GET_LISTS_STOCK_QUOTES)))
        .build();
  }

  private static abstract class StockQuoteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StockQuoteServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return edu.fra.uas.grpc.StockQuoteOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StockQuoteService");
    }
  }

  private static final class StockQuoteServiceFileDescriptorSupplier
      extends StockQuoteServiceBaseDescriptorSupplier {
    StockQuoteServiceFileDescriptorSupplier() {}
  }

  private static final class StockQuoteServiceMethodDescriptorSupplier
      extends StockQuoteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    StockQuoteServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (StockQuoteServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StockQuoteServiceFileDescriptorSupplier())
              .addMethod(getServerSideStreamingGetListStockQuotesMethod())
              .addMethod(getClientSideStreamingGetStatisticsOfStocksMethod())
              .addMethod(getBidirectionalStreamingGetListsStockQuotesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
