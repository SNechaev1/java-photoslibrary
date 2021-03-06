// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/photos/types/media_item.proto

package com.google.photos.types.proto;

public interface PhotoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.photos.types.Photo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Brand of the camera with which the photo was taken.
   * </pre>
   *
   * <code>string camera_make = 1;</code>
   */
  java.lang.String getCameraMake();
  /**
   *
   *
   * <pre>
   * Brand of the camera with which the photo was taken.
   * </pre>
   *
   * <code>string camera_make = 1;</code>
   */
  com.google.protobuf.ByteString getCameraMakeBytes();

  /**
   *
   *
   * <pre>
   * Model of the camera with which the photo was taken.
   * </pre>
   *
   * <code>string camera_model = 2;</code>
   */
  java.lang.String getCameraModel();
  /**
   *
   *
   * <pre>
   * Model of the camera with which the photo was taken.
   * </pre>
   *
   * <code>string camera_model = 2;</code>
   */
  com.google.protobuf.ByteString getCameraModelBytes();

  /**
   *
   *
   * <pre>
   * Focal length of the camera lens with which the photo was taken.
   * </pre>
   *
   * <code>float focal_length = 3;</code>
   */
  float getFocalLength();

  /**
   *
   *
   * <pre>
   * Aperture f number of the camera lens with which the photo was taken.
   * </pre>
   *
   * <code>float aperture_f_number = 4;</code>
   */
  float getApertureFNumber();

  /**
   *
   *
   * <pre>
   * ISO of the camera with which the photo was taken.
   * </pre>
   *
   * <code>int32 iso_equivalent = 5;</code>
   */
  int getIsoEquivalent();

  /**
   *
   *
   * <pre>
   * Exposure time of the camera aperture when the photo was taken.
   * </pre>
   *
   * <code>.google.protobuf.Duration exposure_time = 6;</code>
   */
  boolean hasExposureTime();
  /**
   *
   *
   * <pre>
   * Exposure time of the camera aperture when the photo was taken.
   * </pre>
   *
   * <code>.google.protobuf.Duration exposure_time = 6;</code>
   */
  com.google.protobuf.Duration getExposureTime();
  /**
   *
   *
   * <pre>
   * Exposure time of the camera aperture when the photo was taken.
   * </pre>
   *
   * <code>.google.protobuf.Duration exposure_time = 6;</code>
   */
  com.google.protobuf.DurationOrBuilder getExposureTimeOrBuilder();
}
