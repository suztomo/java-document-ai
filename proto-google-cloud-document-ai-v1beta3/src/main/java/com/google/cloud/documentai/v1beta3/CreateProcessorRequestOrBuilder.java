/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1beta3/document_processor_service.proto

package com.google.cloud.documentai.v1beta3;

public interface CreateProcessorRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta3.CreateProcessorRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent (project and location) under which to create the processor.
   * Format: projects/{project}/locations/{location}
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent (project and location) under which to create the processor.
   * Format: projects/{project}/locations/{location}
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The processor to be created, requires [processor_type] and [display_name]
   * to be set. Also, the processor is under CMEK if CMEK fields are set.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1beta3.Processor processor = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the processor field is set.
   */
  boolean hasProcessor();
  /**
   *
   *
   * <pre>
   * Required. The processor to be created, requires [processor_type] and [display_name]
   * to be set. Also, the processor is under CMEK if CMEK fields are set.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1beta3.Processor processor = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The processor.
   */
  com.google.cloud.documentai.v1beta3.Processor getProcessor();
  /**
   *
   *
   * <pre>
   * Required. The processor to be created, requires [processor_type] and [display_name]
   * to be set. Also, the processor is under CMEK if CMEK fields are set.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1beta3.Processor processor = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.documentai.v1beta3.ProcessorOrBuilder getProcessorOrBuilder();
}
