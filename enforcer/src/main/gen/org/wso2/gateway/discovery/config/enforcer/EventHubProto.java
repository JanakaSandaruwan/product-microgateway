// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/config/enforcer/event_hub.proto

package org.wso2.gateway.discovery.config.enforcer;

public final class EventHubProto {
  private EventHubProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wso2_discovery_config_enforcer_EventHub_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wso2_discovery_config_enforcer_EventHub_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.wso2/discovery/config/enforcer/event_h" +
      "ub.proto\022\036wso2.discovery.config.enforcer" +
      "\"I\n\010EventHub\022\017\n\007enabled\030\001 \001(\010\022\022\n\nservice" +
      "Url\030\002 \001(\t\022\030\n\020listenerEndpoint\030\003 \001(\tB\215\001\n*" +
      "org.wso2.gateway.discovery.config.enforc" +
      "erB\rEventHubProtoP\001ZNgithub.com/envoypro" +
      "xy/go-control-plane/wso2/discovery/confi" +
      "g/enforcer;enforcerb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_wso2_discovery_config_enforcer_EventHub_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_wso2_discovery_config_enforcer_EventHub_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wso2_discovery_config_enforcer_EventHub_descriptor,
        new java.lang.String[] { "Enabled", "ServiceUrl", "ListenerEndpoint", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
