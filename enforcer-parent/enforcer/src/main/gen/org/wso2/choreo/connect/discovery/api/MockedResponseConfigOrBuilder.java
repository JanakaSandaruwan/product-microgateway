// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/api/mocked_api_config.proto

package org.wso2.choreo.connect.discovery.api;

public interface MockedResponseConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wso2.discovery.api.MockedResponseConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string value = 1;</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <code>string value = 1;</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();

  /**
   * <code>repeated .wso2.discovery.api.MockedHeaderConfig headers = 2;</code>
   */
  java.util.List<org.wso2.choreo.connect.discovery.api.MockedHeaderConfig> 
      getHeadersList();
  /**
   * <code>repeated .wso2.discovery.api.MockedHeaderConfig headers = 2;</code>
   */
  org.wso2.choreo.connect.discovery.api.MockedHeaderConfig getHeaders(int index);
  /**
   * <code>repeated .wso2.discovery.api.MockedHeaderConfig headers = 2;</code>
   */
  int getHeadersCount();
  /**
   * <code>repeated .wso2.discovery.api.MockedHeaderConfig headers = 2;</code>
   */
  java.util.List<? extends org.wso2.choreo.connect.discovery.api.MockedHeaderConfigOrBuilder> 
      getHeadersOrBuilderList();
  /**
   * <code>repeated .wso2.discovery.api.MockedHeaderConfig headers = 2;</code>
   */
  org.wso2.choreo.connect.discovery.api.MockedHeaderConfigOrBuilder getHeadersOrBuilder(
      int index);

  /**
   * <code>int32 code = 3;</code>
   * @return The code.
   */
  int getCode();

  /**
   * <code>repeated .wso2.discovery.api.MockedContentConfig content = 4;</code>
   */
  java.util.List<org.wso2.choreo.connect.discovery.api.MockedContentConfig> 
      getContentList();
  /**
   * <code>repeated .wso2.discovery.api.MockedContentConfig content = 4;</code>
   */
  org.wso2.choreo.connect.discovery.api.MockedContentConfig getContent(int index);
  /**
   * <code>repeated .wso2.discovery.api.MockedContentConfig content = 4;</code>
   */
  int getContentCount();
  /**
   * <code>repeated .wso2.discovery.api.MockedContentConfig content = 4;</code>
   */
  java.util.List<? extends org.wso2.choreo.connect.discovery.api.MockedContentConfigOrBuilder> 
      getContentOrBuilderList();
  /**
   * <code>repeated .wso2.discovery.api.MockedContentConfig content = 4;</code>
   */
  org.wso2.choreo.connect.discovery.api.MockedContentConfigOrBuilder getContentOrBuilder(
      int index);
}