// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/api/Endpoint.proto

package org.wso2.gateway.discovery.api;

public final class EndpointProto {
  private EndpointProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_discovery_api_Endpoint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_discovery_api_Endpoint_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!wso2/discovery/api/Endpoint.proto\022\rdis" +
      "covery.api\"I\n\010Endpoint\022\014\n\004host\030\001 \001(\t\022\020\n\010" +
      "basepath\030\002 \001(\t\022\017\n\007uRLType\030\003 \001(\t\022\014\n\004port\030" +
      "\004 \001(\rBp\n\036org.wso2.gateway.discovery.apiB" +
      "\rEndpointProtoP\001Z=github.com/envoyproxy/" +
      "go-control-plane/wso2/discovery/api;apib" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_discovery_api_Endpoint_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_discovery_api_Endpoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_discovery_api_Endpoint_descriptor,
        new java.lang.String[] { "Host", "Basepath", "URLType", "Port", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
