package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes2.dex */
public class GcamModuleJNI {
    public static final native void AeMetadata_exposure_compensation_set(long j, AeMetadata aeMetadata, float f);

    public static final native void AeMetadata_lock_set(long j, AeMetadata aeMetadata, boolean z);

    public static final native long AeMetadata_metering_rectangles_get(long j, AeMetadata aeMetadata);

    public static final native void AeMetadata_mode_set(long j, AeMetadata aeMetadata, int i);

    public static final native void AeMetadata_precapture_trigger_set(long j, AeMetadata aeMetadata, int i);

    public static final native void AeMetadata_state_set(long j, AeMetadata aeMetadata, int i);

    public static final native void AeModeResult_final_tet_set(long j, AeModeResult aeModeResult, float f);

    public static final native void AeModeResult_ideal_tet_set(long j, AeModeResult aeModeResult, float f);

    public static final native void AeModeResult_log_scene_brightness_set(long j, AeModeResult aeModeResult, float f);

    public static final native boolean AeResults_Check(long j, AeResults aeResults);

    public static final native float AeResults_FinalTet(long j, AeResults aeResults, int i);

    public static final native float AeResults_LogSceneBrightness(long j, AeResults aeResults);

    public static final native void AeResults_mode_result_set(long j, AeResults aeResults, long[] jArr);

    public static final native void AeResults_portrait_result_set(long j, AeResults aeResults, long j2, AeModeResult aeModeResult);

    public static final native void AeResults_predicted_image_brightness_set(long j, AeResults aeResults, float f);

    public static final native void AeResults_pure_fraction_of_pixels_from_long_exposure_set(long j, AeResults aeResults, float f);

    public static final native void AeResults_safe_underexposure_set(long j, AeResults aeResults, float f);

    public static final native void AeResults_weighted_fraction_of_pixels_from_long_exposure_set(long j, AeResults aeResults, float f);

    public static final native long AeShotParams_crop_get(long j, AeShotParams aeShotParams);

    public static final native void AeShotParams_crop_set(long j, AeShotParams aeShotParams, long j2, NormalizedRect normalizedRect);

    public static final native void AeShotParams_exposure_compensation_set(long j, AeShotParams aeShotParams, float f);

    public static final native long AeShotParams_merged_crop_get(long j, AeShotParams aeShotParams);

    public static final native void AeShotParams_merged_crop_set(long j, AeShotParams aeShotParams, long j2, NormalizedRect normalizedRect);

    public static final native void AeShotParams_relighting_expected_set(long j, AeShotParams aeShotParams, boolean z);

    public static final native void AeShotParams_spoofed_touch_rectangle_set(long j, AeShotParams aeShotParams, boolean z);

    public static final native void AeShotParams_target_height_set(long j, AeShotParams aeShotParams, int i);

    public static final native void AeShotParams_target_width_set(long j, AeShotParams aeShotParams, int i);

    public static final native void AeShotParams_ux_mode_set(long j, AeShotParams aeShotParams, int i);

    public static final native long AeShotParams_weighted_metering_areas_get(long j, AeShotParams aeShotParams);

    public static final native long AfMetadata_metering_rectangles_get(long j, AfMetadata afMetadata);

    public static final native void AfMetadata_mode_set(long j, AfMetadata afMetadata, int i);

    public static final native void AfMetadata_state_set(long j, AfMetadata afMetadata, int i);

    public static final native void AfMetadata_trigger_set(long j, AfMetadata afMetadata, int i);

    public static final native void ApplySensorBinning__SWIG_0(int i, boolean z, boolean z2, long j, FrameMetadata frameMetadata);

    public static final native boolean ApplySensorBinning__SWIG_1(int i, long j, StaticMetadata staticMetadata);

    public static final native boolean AwbInfo_IsValid(long j, AwbInfo awbInfo);

    public static final native long AwbInfo_rgb2rgb_get(long j, AwbInfo awbInfo);

    public static final native void AwbInfo_rgb2rgb_set(long j, AwbInfo awbInfo, long j2, FloatArray9 floatArray9);

    public static final native long AwbInfo_rggb_gains_get(long j, AwbInfo awbInfo);

    public static final native void AwbInfo_rggb_gains_set(long j, AwbInfo awbInfo, long j2, FloatArray4 floatArray4);

    public static final native void AwbMetadata_lock_set(long j, AwbMetadata awbMetadata, boolean z);

    public static final native long AwbMetadata_metering_rectangles_get(long j, AwbMetadata awbMetadata);

    public static final native void AwbMetadata_mode_set(long j, AwbMetadata awbMetadata, int i);

    public static final native void AwbMetadata_state_set(long j, AwbMetadata awbMetadata, int i);

    public static final native void BuildPayloadBurstSpecOptions_include_ultra_short_frame_set(long j, BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions, boolean z);

    public static final native void BuildPayloadBurstSpecOptions_max_exposure_time_ms_set(long j, BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions, float f);

    public static final native void BuildPayloadBurstSpecOptions_max_frame_count_set(long j, BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions, int i);

    public static final native void BuildPayloadBurstSpecOptions_max_total_capture_time_ms_set(long j, BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions, float f);

    public static final native void BuildPayloadBurstSpecOptions_recompute_ae_set(long j, BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions, boolean z);

    public static final native void BuildPayloadBurstSpecOptions_shasta_zsl_set(long j, BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions, boolean z);

    public static final native float BurstSpec_TotalCaptureTimeMs__SWIG_0(long j, BurstSpec burstSpec, float f, boolean z);

    public static final native long BurstSpec_frame_requests_get(long j, BurstSpec burstSpec);

    public static final native void BurstSpec_frame_requests_set(long j, BurstSpec burstSpec, long j2, FrameRequestVector frameRequestVector);

    public static final native void ClientShotMetadata_location_set(long j, ClientShotMetadata clientShotMetadata, long j2, LocationData locationData);

    public static final native long DEBUG_SAVE_INPUT_METERING_get();

    public static final native long DEBUG_SAVE_INPUT_PAYLOAD_get();

    public static final native long DEBUG_SAVE_METADATA_get();

    public static final native long DebugParams_image_saver_params_get(long j, DebugParams debugParams);

    public static final native void DebugParams_image_saver_params_set(long j, DebugParams debugParams, long j2, ImageSaverParams imageSaverParams);

    public static final native void DebugParams_save_bitmask_set(long j, DebugParams debugParams, long j2);

    public static final native int DegreesToImageRotation(int i);

    public static final native long DeserializeFromBytes(long j, long j2);

    public static final native boolean DirtyLensHistory_AddRawScore(long j, DirtyLensHistory dirtyLensHistory, float f);

    public static final native void DirtyLensHistory_Reset(long j, DirtyLensHistory dirtyLensHistory);

    public static final native void DirtyLensHistory_frame_influence_decay_rate__set(long j, DirtyLensHistory dirtyLensHistory, float f);

    public static final native void DirtyLensHistory_initial_score__set(long j, DirtyLensHistory dirtyLensHistory, float f);

    public static final native void DirtyLensHistory_max_photo_count__set(long j, DirtyLensHistory dirtyLensHistory, int i);

    public static final native long DirtyLensHistory_raw_score_history__get(long j, DirtyLensHistory dirtyLensHistory);

    public static final native void DirtyLensHistory_raw_score_history__set(long j, DirtyLensHistory dirtyLensHistory, long j2, FloatDeque floatDeque);

    public static final native void DirtyLensHistory_weighted_score_threshold__set(long j, DirtyLensHistory dirtyLensHistory, float f);

    public static final native void DngColorCalibrationVector_add(long j, DngColorCalibrationVector dngColorCalibrationVector, long j2, DngColorCalibration dngColorCalibration);

    public static final native void DngColorCalibration_illuminant_set(long j, DngColorCalibration dngColorCalibration, int i);

    public static final native void DngColorCalibration_model_rgb_to_device_rgb_set(long j, DngColorCalibration dngColorCalibration, long j2, FloatArray9 floatArray9);

    public static final native void DngColorCalibration_xyz_to_model_rgb_set(long j, DngColorCalibration dngColorCalibration, long j2, FloatArray9 floatArray9);

    public static final native void FaceInfoVector_add(long j, FaceInfoVector faceInfoVector, long j2, FaceInfo faceInfo);

    public static final native void FaceInfo_Landmark_x_set(long j, FaceInfo.Landmark landmark, float f);

    public static final native void FaceInfo_Landmark_y_set(long j, FaceInfo.Landmark landmark, float f);

    public static final native void FaceInfo_confidence_set(long j, FaceInfo faceInfo, float f);

    public static final native void FaceInfo_familiarity_set(long j, FaceInfo faceInfo, float f);

    public static final native long FaceInfo_landmarks_get(long j, FaceInfo faceInfo);

    public static final native void FaceInfo_pos_x_set(long j, FaceInfo faceInfo, float f);

    public static final native void FaceInfo_pos_y_set(long j, FaceInfo faceInfo, float f);

    public static final native void FaceInfo_size_set(long j, FaceInfo faceInfo, float f);

    public static final native float FloatArray4_get(long j, FloatArray4 floatArray4, int i);

    public static final native void FloatArray4_set(long j, FloatArray4 floatArray4, int i, float f);

    public static final native long FloatArray4_size(long j, FloatArray4 floatArray4);

    public static final native float FloatArray9_get(long j, FloatArray9 floatArray9, int i);

    public static final native void FloatArray9_set(long j, FloatArray9 floatArray9, int i, float f);

    public static final native long FloatArray9_size(long j, FloatArray9 floatArray9);

    public static final native float FloatDeque_getitem(long j, FloatDeque floatDeque, int i);

    public static final native void FloatDeque_push_back(long j, FloatDeque floatDeque, float f);

    public static final native long FloatDeque_size(long j, FloatDeque floatDeque);

    public static final native void FloatVector_add(long j, FloatVector floatVector, float f);

    public static final native float FloatVector_get(long j, FloatVector floatVector, int i);

    public static final native boolean FloatVector_isEmpty(long j, FloatVector floatVector);

    public static final native float FrameMetadata_actual_analog_gain_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_actual_analog_gain_set(long j, FrameMetadata frameMetadata, float f);

    public static final native float FrameMetadata_actual_exposure_time_ms_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_actual_exposure_time_ms_set(long j, FrameMetadata frameMetadata, float f);

    public static final native long FrameMetadata_ae_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_ae_results_set(long j, FrameMetadata frameMetadata, long j2, AeResults aeResults);

    public static final native long FrameMetadata_af_get(long j, FrameMetadata frameMetadata);

    public static final native float FrameMetadata_applied_digital_gain_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_applied_digital_gain_set(long j, FrameMetadata frameMetadata, float f);

    public static final native long FrameMetadata_awb_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_black_levels_bayer_set(long j, FrameMetadata frameMetadata, long j2, FloatArray4 floatArray4);

    public static final native void FrameMetadata_burst_frame_type_set(long j, FrameMetadata frameMetadata, int i);

    public static final native void FrameMetadata_control_mode_set(long j, FrameMetadata frameMetadata, int i);

    public static final native void FrameMetadata_dng_noise_model_bayer_set(long j, FrameMetadata frameMetadata, long j2, NoiseModel noiseModel);

    public static final native void FrameMetadata_exposure_time_boost_set(long j, FrameMetadata frameMetadata, float f);

    public static final native void FrameMetadata_f_number_set(long j, FrameMetadata frameMetadata, float f);

    public static final native long FrameMetadata_faces_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_flash_set(long j, FrameMetadata frameMetadata, int i);

    public static final native void FrameMetadata_focal_length_mm_set(long j, FrameMetadata frameMetadata, float f);

    public static final native void FrameMetadata_focus_distance_diopters_set(long j, FrameMetadata frameMetadata, float f);

    public static final native long FrameMetadata_geometric_calibration_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_geometric_calibration_set(long j, FrameMetadata frameMetadata, long j2, GeometricCalibrationVector geometricCalibrationVector);

    public static final native void FrameMetadata_gyro_samples_set(long j, FrameMetadata frameMetadata, long j2, GyroSampleVector gyroSampleVector);

    public static final native void FrameMetadata_isp_metadata_set(long j, FrameMetadata frameMetadata, long j2, IspAwbMetadata ispAwbMetadata);

    public static final native void FrameMetadata_lens_state_set(long j, FrameMetadata frameMetadata, int i);

    public static final native long FrameMetadata_live_hdr_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_live_hdr_set(long j, FrameMetadata frameMetadata, long j2, LiveHdrMetadata liveHdrMetadata);

    public static final native long FrameMetadata_mesh_warp_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_mesh_warp_set(long j, FrameMetadata frameMetadata, long j2, MeshWarp meshWarp);

    public static final native void FrameMetadata_ois_metadata_set(long j, FrameMetadata frameMetadata, long j2, OisMetadata oisMetadata);

    public static final native long FrameMetadata_portrait_mask_get(long j, FrameMetadata frameMetadata);

    public static final native float FrameMetadata_post_raw_digital_gain_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_post_raw_digital_gain_set(long j, FrameMetadata frameMetadata, float f);

    public static final native void FrameMetadata_scene_flicker_set(long j, FrameMetadata frameMetadata, long j2, SceneFlicker sceneFlicker);

    public static final native int FrameMetadata_sensor_id_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_sensor_id_set(long j, FrameMetadata frameMetadata, int i);

    public static final native void FrameMetadata_sensor_temp_set(long j, FrameMetadata frameMetadata, int i);

    public static final native void FrameMetadata_timestamp_faces_ns_set(long j, FrameMetadata frameMetadata, long j2);

    public static final native long FrameMetadata_timestamp_ns_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_timestamp_ns_set(long j, FrameMetadata frameMetadata, long j2);

    public static final native void FrameMetadata_was_black_level_locked_set(long j, FrameMetadata frameMetadata, boolean z);

    public static final native long FrameMetadata_wb_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_wb_set(long j, FrameMetadata frameMetadata, long j2, AwbInfo awbInfo);

    public static final native void FrameRequestVector_add(long j, FrameRequestVector frameRequestVector, long j2, FrameRequest frameRequest);

    public static final native long FrameRequestVector_get(long j, FrameRequestVector frameRequestVector, int i);

    public static final native boolean FrameRequestVector_isEmpty(long j, FrameRequestVector frameRequestVector);

    public static final native long FrameRequestVector_size(long j, FrameRequestVector frameRequestVector);

    public static final native long FrameRequest_awb_get(long j, FrameRequest frameRequest);

    public static final native float FrameRequest_desired_analog_gain_get(long j, FrameRequest frameRequest);

    public static final native void FrameRequest_desired_analog_gain_set(long j, FrameRequest frameRequest, float f);

    public static final native float FrameRequest_desired_digital_gain_get(long j, FrameRequest frameRequest);

    public static final native float FrameRequest_desired_exposure_time_ms_get(long j, FrameRequest frameRequest);

    public static final native void FrameRequest_desired_exposure_time_ms_set(long j, FrameRequest frameRequest, float f);

    public static final native boolean FrameRequest_try_to_lock_black_level_get(long j, FrameRequest frameRequest);

    public static final native int FrameRequest_type_get(long j, FrameRequest frameRequest);

    public static final native void Gcam_AbortShot(long j, Gcam gcam, int i);

    public static final native boolean Gcam_AllSensorIdsUnique(long j, Gcam gcam);

    public static final native void Gcam_BeginPayloadFrames(long j, Gcam gcam, int i, long j2, BurstSpec burstSpec);

    public static final native long Gcam_BuildAfBurstSpec(long j, Gcam gcam, int i, long j2, RawReadView rawReadView, long j3, FrameMetadata frameMetadata, long j4, SpatialGainMap spatialGainMap);

    public static final native long Gcam_BuildPayloadBurstSpec(long j, Gcam gcam, int i, long j2, RawReadView rawReadView, long j3, FrameMetadata frameMetadata, long j4, SpatialGainMap spatialGainMap, long j5, BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions);

    public static final native boolean Gcam_ClaimFrameForBinning(long j, Gcam gcam, long j2, FrameMetadataKey frameMetadataKey);

    public static final native long Gcam_ComputeAeResults(long j, StaticMetadata staticMetadata, long j2, Tuning tuning, long j3, AeShotParams aeShotParams, long j4, RawReadView rawReadView, long j5, FrameMetadata frameMetadata, long j6, SpatialGainMap spatialGainMap, boolean z);

    public static final native void Gcam_ConfigureViewfinderProcessing(long j, Gcam gcam, long j2, ViewfinderProcessingOptions viewfinderProcessingOptions);

    public static final native long Gcam_Create(long j, InitParams initParams, long j2, StaticMetadataVector staticMetadataVector);

    public static final native boolean Gcam_EndPayloadFrames(long j, Gcam gcam, int i, long j2, ClientShotMetadata clientShotMetadata);

    public static final native boolean Gcam_EndShotCapture(long j, Gcam gcam, int i);

    public static final native void Gcam_EndZslPayloadFrames(long j, Gcam gcam, int i);

    public static final native int Gcam_FindFirstCamera(long j, Gcam gcam, int i);

    public static final native void Gcam_FlushTemporalBinning(long j, Gcam gcam, int i);

    public static final native void Gcam_FlushViewfinder(long j, Gcam gcam, int i);

    public static final native long Gcam_GenerateRgbImage(long j, StaticMetadata staticMetadata, long j2, ShotParams shotParams, long j3, FrameMetadata frameMetadata, long j4, SpatialGainMap spatialGainMap, long j5, RawWriteView rawWriteView, int i, long j6, ThreadPoolConfig threadPoolConfig, long j7, GenerateRgbImageOptions generateRgbImageOptions);

    public static final native long Gcam_GetLatestViewfinderResults(long j, Gcam gcam, int i);

    public static final native int Gcam_GetNumCameras(long j, Gcam gcam);

    public static final native long Gcam_GetStaticMetadata(long j, Gcam gcam, int i);

    public static final native long Gcam_GetTuning(long j, Gcam gcam, int i);

    public static final native boolean Gcam_LimitShotCpuUsage(long j, Gcam gcam, int i, float f);

    public static final native boolean Gcam_LockFrameFromFutureBinning(long j, Gcam gcam, long j2, FrameMetadataKey frameMetadataKey);

    public static final native boolean Gcam_OverrideFrameMetadata(long j, Gcam gcam, long j2, FrameMetadataKey frameMetadataKey, long j3, FrameMetadata frameMetadata);

    public static final native int Gcam_StartShotCapture(long j, Gcam gcam, int i, long j2, ShotParams shotParams, long j3, ShotCallbacks shotCallbacks, int i2, long j4, PostviewParams postviewParams, long j5, DebugParams debugParams);

    public static final native void GenerateRgbImageOptions_actual_number_of_frames_set(long j, GenerateRgbImageOptions generateRgbImageOptions, int i);

    public static final native void GenerateRgbImageOptions_expected_number_of_frames_set(long j, GenerateRgbImageOptions generateRgbImageOptions, int i);

    public static final native void GenerateRgbImageOptions_verbose_set(long j, GenerateRgbImageOptions generateRgbImageOptions, boolean z);

    public static final native void GeometricCalibrationVector_add(long j, GeometricCalibrationVector geometricCalibrationVector, long j2, GeometricCalibration geometricCalibration);

    public static final native boolean GeometricCalibrationVector_isEmpty(long j, GeometricCalibrationVector geometricCalibrationVector);

    public static final native void GeometricCalibration_active_rectangle_set(long j, GeometricCalibration geometricCalibration, int[] iArr);

    public static final native float[] GeometricCalibration_lens_distortion_extended_get(long j, GeometricCalibration geometricCalibration);

    public static final native void GeometricCalibration_lens_distortion_extended_set(long j, GeometricCalibration geometricCalibration, float[] fArr);

    public static final native float[] GeometricCalibration_lens_distortion_get(long j, GeometricCalibration geometricCalibration);

    public static final native void GeometricCalibration_lens_distortion_set(long j, GeometricCalibration geometricCalibration, float[] fArr);

    public static final native float[] GeometricCalibration_lens_intrinsic_calibration_get(long j, GeometricCalibration geometricCalibration);

    public static final native void GeometricCalibration_lens_intrinsic_calibration_set(long j, GeometricCalibration geometricCalibration, float[] fArr);

    public static final native void GeometricCalibration_lens_pose_rotation_set(long j, GeometricCalibration geometricCalibration, float[] fArr);

    public static final native void GeometricCalibration_lens_pose_translation_set(long j, GeometricCalibration geometricCalibration, float[] fArr);

    public static final native void GeometricCalibration_quality_set(long j, GeometricCalibration geometricCalibration, int i);

    public static final native void GeometricCalibration_valid_rectangle_set(long j, GeometricCalibration geometricCalibration, int[] iArr);

    public static final native String GetVersion();

    public static final native long GrayReadViewU8_data(long j, GrayReadViewU8 grayReadViewU8);

    public static final native int GrayReadViewU8_height(long j, GrayReadViewU8 grayReadViewU8);

    public static final native int GrayReadViewU8_width(long j, GrayReadViewU8 grayReadViewU8);

    public static final native int GrayReadViewU8_x_stride(long j, GrayReadViewU8 grayReadViewU8);

    public static final native int GrayReadViewU8_y_stride(long j, GrayReadViewU8 grayReadViewU8);

    public static final native void GyroSampleVector_add(long j, GyroSampleVector gyroSampleVector, long j2, GyroSample gyroSample);

    public static final native void GyroSample_timestamp_ns_set(long j, GyroSample gyroSample, long j2);

    public static final native void GyroSample_x_set(long j, GyroSample gyroSample, float f);

    public static final native void GyroSample_y_set(long j, GyroSample gyroSample, float f);

    public static final native void GyroSample_z_set(long j, GyroSample gyroSample, float f);

    public static final native int ImageRotationToDegrees(int i);

    public static final native String ImageSaverParams_dest_folder_get(long j, ImageSaverParams imageSaverParams);

    public static final native void ImageSaverParams_dest_folder_set(long j, ImageSaverParams imageSaverParams, String str);

    public static final native void InitParams_allow_unknown_devices_set(long j, InitParams initParams, boolean z);

    public static final native void InitParams_capture_threads_set(long j, InitParams initParams, long j2, ThreadPoolConfig threadPoolConfig);

    public static final native int InitParams_execute_finish_on_get(long j, InitParams initParams);

    public static final native void InitParams_execute_finish_on_set(long j, InitParams initParams, int i);

    public static final native void InitParams_execute_postview_on_set(long j, InitParams initParams, int i);

    public static final native long InitParams_finish_threads_get(long j, InitParams initParams);

    public static final native void InitParams_finish_threads_set(long j, InitParams initParams, long j2, ThreadPoolConfig threadPoolConfig);

    public static final native void InitParams_max_zsl_payload_frames_set(long j, InitParams initParams, int i);

    public static final native void InitParams_merge_threads_set(long j, InitParams initParams, long j2, ThreadPoolConfig threadPoolConfig);

    public static final native void InitParams_portrait_brightening_enabled_set(long j, InitParams initParams, boolean z);

    public static final native void InitParams_reference_focal_length_35mm_set(long j, InitParams initParams, float[] fArr);

    public static final native void InitParams_serialized_cache_dir_set(long j, InitParams initParams, String str);

    public static final native void InitParams_simultaneous_merge_and_finish_set(long j, InitParams initParams, boolean z);

    public static final native long InterleavedImageU16_read_view(long j, InterleavedImageU16 interleavedImageU16);

    public static final native long InterleavedImageU16_write_view(long j, InterleavedImageU16 interleavedImageU16);

    public static final native int InterleavedImageU8_channels(long j, InterleavedImageU8 interleavedImageU8);

    public static final native boolean InterleavedImageU8_empty(long j, InterleavedImageU8 interleavedImageU8);

    public static final native int InterleavedImageU8_height(long j, InterleavedImageU8 interleavedImageU8);

    public static final native long InterleavedImageU8_read_view(long j, InterleavedImageU8 interleavedImageU8);

    public static final native int InterleavedImageU8_width(long j, InterleavedImageU8 interleavedImageU8);

    public static final native long InterleavedImageU8_write_view(long j, InterleavedImageU8 interleavedImageU8);

    public static final native int InterleavedReadViewU8_c_stride(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native int InterleavedReadViewU8_channels(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native long InterleavedReadViewU8_data(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native int InterleavedReadViewU8_height(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native int InterleavedReadViewU8_width(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native int InterleavedReadViewU8_x_stride(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native int InterleavedReadViewU8_y_stride(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native int InterleavedWriteViewU8_channels(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native int InterleavedWriteViewU8_height(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native long InterleavedWriteViewU8_read_view(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native int InterleavedWriteViewU8_width(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native boolean IsLogical(int i);

    public static final native boolean IsRgb(int i);

    public static final native boolean IsRgb8(int i);

    public static final native void JpgEncodeOptions_quality_set(long j, JpgEncodeOptions jpgEncodeOptions, int i);

    public static final native void JpgEncodeOptions_shot_metadata_set(long j, JpgEncodeOptions jpgEncodeOptions, long j2, ShotMetadata shotMetadata);

    public static final native void LandmarkMap_set(long j, LandmarkMap landmarkMap, int i, long j2, FaceInfo.Landmark landmark);

    public static final native void LiveHdrMetadata_filtered_motion_speed_pix_per_ms_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native void LiveHdrMetadata_manual_ec_short_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native void LiveHdrMetadata_manual_long_tet_override_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native void LiveHdrMetadata_manual_portrait_tet_override_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native void LiveHdrMetadata_manual_short_tet_override_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native void LiveHdrMetadata_max_hdr_ratio_override_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native void LiveHdrMetadata_metering_interval_ms_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native void LiveHdrMetadata_motion_magnitude_pix_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native void LiveHdrMetadata_night_factor_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native void LiveHdrMetadata_viewfinder_long_tet_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native void LiveHdrMetadata_viewfinder_portrait_tet_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native void LiveHdrMetadata_viewfinder_short_tet_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native void LocationData_altitude_set(long j, LocationData locationData, double d);

    public static final native void LocationData_degree_of_precision_set(long j, LocationData locationData, double d);

    public static final native void LocationData_latitude_set(long j, LocationData locationData, double d);

    public static final native void LocationData_longitude_set(long j, LocationData locationData, double d);

    public static final native void LocationData_processing_method_set(long j, LocationData locationData, String str);

    public static final native void LocationData_timestamp_unix_set(long j, LocationData locationData, long j2);

    public static final native int MeshTranslation_x_get(long j, MeshTranslation meshTranslation);

    public static final native int MeshTranslation_y_get(long j, MeshTranslation meshTranslation);

    public static final native long MeshWarp_TranslationHint(long j, MeshWarp meshWarp);

    public static final native int MeshWarp_grid_cols_get(long j, MeshWarp meshWarp);

    public static final native void MeshWarp_grid_cols_set(long j, MeshWarp meshWarp, int i);

    public static final native int MeshWarp_grid_rows_get(long j, MeshWarp meshWarp);

    public static final native void MeshWarp_grid_rows_set(long j, MeshWarp meshWarp, int i);

    public static final native long MeshWarp_mesh_warp_crop_region_get(long j, MeshWarp meshWarp);

    public static final native void MeshWarp_mesh_warp_crop_region_set(long j, MeshWarp meshWarp, long j2, PixelRect pixelRect);

    public static final native long MeshWarp_mesh_warp_data_get(long j, MeshWarp meshWarp);

    public static final native void MeshWarp_mesh_warp_data_set(long j, MeshWarp meshWarp, long j2, FloatVector floatVector);

    public static final native void MeshWarp_mesh_warp_dst_region_set(long j, MeshWarp meshWarp, long j2, PixelRect pixelRect);

    public static final native long NoiseModel_FromShotReadNoise__SWIG_0(long j, FloatVector floatVector, long j2, FloatVector floatVector2);

    public static final native boolean NormalizedRect_IsEmpty(long j, NormalizedRect normalizedRect);

    public static final native void NormalizedRect_x0_set(long j, NormalizedRect normalizedRect, float f);

    public static final native void NormalizedRect_x1_set(long j, NormalizedRect normalizedRect, float f);

    public static final native void NormalizedRect_y0_set(long j, NormalizedRect normalizedRect, float f);

    public static final native void NormalizedRect_y1_set(long j, NormalizedRect normalizedRect, float f);

    public static final native void OisMetadata_lens_optical_stabilization_mode_set(long j, OisMetadata oisMetadata, int i);

    public static final native long OisMetadata_ois_positions_get(long j, OisMetadata oisMetadata);

    public static final native void OisMetadata_timestamp_ois_clock_ns_set(long j, OisMetadata oisMetadata, long j2);

    public static final native void OisPositionVector_add(long j, OisPositionVector oisPositionVector, long j2, OisPosition oisPosition);

    public static final native void OisPosition_shift_pixel_x_set(long j, OisPosition oisPosition, float f);

    public static final native void OisPosition_shift_pixel_y_set(long j, OisPosition oisPosition, float f);

    public static final native void OisPosition_timestamp_ns_set(long j, OisPosition oisPosition, long j2);

    public static final native float PhysicalStabilityParams_max_handheld_shot_capture_time_ms_get(long j, PhysicalStabilityParams physicalStabilityParams);

    public static final native long PhysicalStabilityParams_thresholds_get(long j, PhysicalStabilityParams physicalStabilityParams);

    public static final native float PhysicalStabilityThresholds_braced_speed_rad_per_sec_get(long j, PhysicalStabilityThresholds physicalStabilityThresholds);

    public static final native float PhysicalStabilityThresholds_tripod_speed_rad_per_sec_get(long j, PhysicalStabilityThresholds physicalStabilityThresholds);

    public static final native void PixelRectVector_add(long j, PixelRectVector pixelRectVector, long j2, PixelRect pixelRect);

    public static final native long PixelRectVector_size(long j, PixelRectVector pixelRectVector);

    public static final native int PixelRect_height(long j, PixelRect pixelRect);

    public static final native int PixelRect_width(long j, PixelRect pixelRect);

    public static final native int PixelRect_x0_get(long j, PixelRect pixelRect);

    public static final native void PixelRect_x0_set(long j, PixelRect pixelRect, int i);

    public static final native int PixelRect_x1_get(long j, PixelRect pixelRect);

    public static final native void PixelRect_x1_set(long j, PixelRect pixelRect, int i);

    public static final native int PixelRect_y0_get(long j, PixelRect pixelRect);

    public static final native void PixelRect_y0_set(long j, PixelRect pixelRect, int i);

    public static final native int PixelRect_y1_get(long j, PixelRect pixelRect);

    public static final native void PixelRect_y1_set(long j, PixelRect pixelRect, int i);

    public static final native void PortraitMask_crop_set(long j, PortraitMask portraitMask, long j2, NormalizedRect normalizedRect);

    public static final native void PortraitMask_data_set(long j, PortraitMask portraitMask, long j2, Uint8Vector uint8Vector);

    public static final native void PortraitMask_size_set(long j, PortraitMask portraitMask, long j2, Size size);

    public static final native void PortraitOutputs_dynamic_depth_result_ptr_set(long j, PortraitOutputs portraitOutputs, long j2);

    public static final native long PortraitRequest_ae_results_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_allow_raw_blur_front_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native void PortraitRequest_allow_raw_blur_rear_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native void PortraitRequest_apply_portrait_matting_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native void PortraitRequest_cache_directory_set(long j, PortraitRequest portraitRequest, String str);

    public static final native void PortraitRequest_depth_processing_set(long j, PortraitRequest portraitRequest, int i);

    public static final native void PortraitRequest_embed_gdepth_metadata_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native void PortraitRequest_execute_finish_on_set(long j, PortraitRequest portraitRequest, int i);

    public static final native long PortraitRequest_faces_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_faces_set(long j, PortraitRequest portraitRequest, long j2, PixelRectVector pixelRectVector);

    public static final native long PortraitRequest_frame_metadata_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_frame_metadata_set(long j, PortraitRequest portraitRequest, long j2, StringFrameMetadataMap stringFrameMetadataMap);

    public static final native long PortraitRequest_gain_map_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_horizontal_flip_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native int PortraitRequest_image_rotation_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_image_rotation_set(long j, PortraitRequest portraitRequest, int i);

    public static final native boolean PortraitRequest_manually_rotate_xmp_jpg_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_manually_rotate_xmp_jpg_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native void PortraitRequest_output_format_primary_set(long j, PortraitRequest portraitRequest, int i);

    public static final native void PortraitRequest_output_height_set(long j, PortraitRequest portraitRequest, int i);

    public static final native void PortraitRequest_output_width_set(long j, PortraitRequest portraitRequest, int i);

    public static final native void PortraitRequest_portrait_raw_path_set(long j, PortraitRequest portraitRequest, String str);

    public static final native void PortraitRequest_post_resample_sharpening_set(long j, PortraitRequest portraitRequest, float f);

    public static final native void PortraitRequest_relighting_option_set(long j, PortraitRequest portraitRequest, int i);

    public static final native void PortraitRequest_shot_prefix_set(long j, PortraitRequest portraitRequest, String str);

    public static final native long PortraitRequest_static_metadata_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_static_metadata_set(long j, PortraitRequest portraitRequest, long j2, StringStaticMetadataMap stringStaticMetadataMap);

    public static final native boolean PortraitRequest_use_gpu_resample_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_use_gpu_resample_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native void PortraitRequest_use_internal_rectiface_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native void PortraitRequest_use_opencl_depth_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native void PortraitRequest_use_spotlight_enhance_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native void PortraitRequest_use_spotlight_enhance_v2_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native void PostviewParams_pixel_format_set(long j, PostviewParams postviewParams, int i);

    public static final native void PostviewParams_target_height_set(long j, PostviewParams postviewParams, int i);

    public static final native void PostviewParams_target_width_set(long j, PostviewParams postviewParams, int i);

    public static final native void QcColorCalibration_IlluminantData_bg_ratio_set(long j, QcColorCalibration.IlluminantData illuminantData, float f);

    public static final native void QcColorCalibration_IlluminantData_rg_ratio_set(long j, QcColorCalibration.IlluminantData illuminantData, float f);

    public static final native void QcColorCalibration_grgb_ratio_set(long j, QcColorCalibration qcColorCalibration, float f);

    public static final native void QcColorCalibration_illuminant_data_set(long j, QcColorCalibration qcColorCalibration, long j2, QcIlluminantVector qcIlluminantVector);

    public static final native void QcIlluminantVector_add(long j, QcIlluminantVector qcIlluminantVector, long j2, QcColorCalibration.IlluminantData illuminantData);

    public static final native long RawImage_SWIGUpcast(long j);

    public static final native boolean RawReadView_empty(long j, RawReadView rawReadView);

    public static final native long RawWriteView_SWIGUpcast(long j);

    public static final native boolean RotateShotMetadata__SWIG_1(long j, ShotMetadata shotMetadata, int i);

    public static final native void SceneFlicker_confidence_set(long j, SceneFlicker sceneFlicker, float f);

    public static final native void SceneFlicker_frequency_set(long j, SceneFlicker sceneFlicker, float f);

    public static final native long ShotMetadata_ae_results_get(long j, ShotMetadata shotMetadata);

    public static final native void ShotMetadata_client_shot_metadata_set(long j, ShotMetadata shotMetadata, long j2, ClientShotMetadata clientShotMetadata);

    public static final native void ShotMetadata_exposure_compensation_set(long j, ShotMetadata shotMetadata, float f);

    public static final native void ShotMetadata_flash_mode_set(long j, ShotMetadata shotMetadata, int i);

    public static final native long ShotMetadata_frame_metadata_get(long j, ShotMetadata shotMetadata);

    public static final native void ShotMetadata_frame_metadata_set(long j, ShotMetadata shotMetadata, long j2, FrameMetadata frameMetadata);

    public static final native long ShotMetadata_gain_map_rggb_get(long j, ShotMetadata shotMetadata);

    public static final native void ShotMetadata_gain_map_rggb_set(long j, ShotMetadata shotMetadata, long j2, InterleavedImageF interleavedImageF);

    public static final native int ShotMetadata_icc_profile_get(long j, ShotMetadata shotMetadata);

    public static final native int ShotMetadata_image_rotation_get(long j, ShotMetadata shotMetadata);

    public static final native void ShotMetadata_image_rotation_set(long j, ShotMetadata shotMetadata, int i);

    public static final native String ShotMetadata_makernote_get(long j, ShotMetadata shotMetadata);

    public static final native void ShotMetadata_makernote_set(long j, ShotMetadata shotMetadata, String str);

    public static final native boolean ShotMetadata_should_apply_deblur_badge_get(long j, ShotMetadata shotMetadata);

    public static final native String ShotMetadata_software_suffix_get(long j, ShotMetadata shotMetadata);

    public static final native void ShotMetadata_software_suffix_set(long j, ShotMetadata shotMetadata, String str);

    public static final native long ShotMetadata_static_metadata_get(long j, ShotMetadata shotMetadata);

    public static final native void ShotMetadata_static_metadata_set(long j, ShotMetadata shotMetadata, long j2, StaticMetadata staticMetadata);

    public static final native long ShotMetadata_timestamp_unix_us_get(long j, ShotMetadata shotMetadata);

    public static final native void ShotMetadata_wb_mode_set(long j, ShotMetadata shotMetadata, int i);

    public static final native String ShotMetadata_xmp_metadata_extended_get(long j, ShotMetadata shotMetadata);

    public static final native String ShotMetadata_xmp_metadata_main_get(long j, ShotMetadata shotMetadata);

    public static final native boolean ShotParams_GcamAwbDesired(long j, ShotParams shotParams);

    public static final native long ShotParams_ae_get(long j, ShotParams shotParams);

    public static final native void ShotParams_ae_set(long j, ShotParams shotParams, long j2, AeShotParams aeShotParams);

    public static final native void ShotParams_allow_base_frame_reuse_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_allow_sabre_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_allow_spatial_rgb_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_allow_temporal_binning_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_base_frame_override_index_set(long j, ShotParams shotParams, int i);

    public static final native void ShotParams_compress_merged_dng_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_device_is_on_tripod_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_downsample_by_2_before_merge_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_flash_mode_set(long j, ShotParams shotParams, int i);

    public static final native void ShotParams_force_wb_set(long j, ShotParams shotParams, long j2, AwbInfo awbInfo);

    public static final native void ShotParams_icc_output_profile_override_set(long j, ShotParams shotParams, int i);

    public static final native void ShotParams_image_rotation_set(long j, ShotParams shotParams, int i);

    public static final native void ShotParams_manually_rotate_final_jpg_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_merge_method_override_set(long j, ShotParams shotParams, int i);

    public static final native void ShotParams_motion_ef_enabled_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_nonzsl_extended_base_frame_selection_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_optimize_sky_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_previous_viewfinder_tet_set(long j, ShotParams shotParams, float f);

    public static final native void ShotParams_previous_viewfinder_wb_set(long j, ShotParams shotParams, long j2, AwbInfo awbInfo);

    public static final native void ShotParams_psaf_frame_count_set(long j, ShotParams shotParams, int i);

    public static final native void ShotParams_psaf_log_scene_brightness_threshold_override_set(long j, ShotParams shotParams, float f);

    public static final native void ShotParams_psaf_max_exposure_time_ms_set(long j, ShotParams shotParams, float f);

    public static final native void ShotParams_recompute_wb_on_base_frame_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_rerun_face_detection_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_resampling_method_override_set(long j, ShotParams shotParams, int i);

    public static final native void ShotParams_save_merged_dng_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_shasta_enabled_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_shasta_factor_set(long j, ShotParams shotParams, float f);

    public static final native void ShotParams_shasta_force_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_shutter_press_down_timestamp_ns_set(long j, ShotParams shotParams, long j2);

    public static final native void ShotParams_shutter_press_up_timestamp_ns_set(long j, ShotParams shotParams, long j2);

    public static final native void ShotParams_software_suffix_set(long j, ShotParams shotParams, String str);

    public static final native void ShotParams_tripod_max_exposure_time_ms_set(long j, ShotParams shotParams, float f);

    public static final native void ShotParams_tripod_max_total_capture_time_ms_set(long j, ShotParams shotParams, float f);

    public static final native void ShotParams_wb_mode_set(long j, ShotParams shotParams, int i);

    public static final native void ShotParams_zsl_base_frame_index_hint_set(long j, ShotParams shotParams, int i);

    public static final native void ShotParams_zsl_set(long j, ShotParams shotParams, boolean z);

    public static final native void Size_height_set(long j, Size size, int i);

    public static final native void Size_width_set(long j, Size size, int i);

    public static final native void SpatialGainMap_WriteRggb(long j, SpatialGainMap spatialGainMap, int i, int i2, int i3, float f);

    public static final native long SpatialGainMap_gain_map(long j, SpatialGainMap spatialGainMap);

    public static final native void StaticMetadataVector_add(long j, StaticMetadataVector staticMetadataVector, long j2, StaticMetadata staticMetadata);

    public static final native long StaticMetadataVector_get(long j, StaticMetadataVector staticMetadataVector, int i);

    public static final native long StaticMetadataVector_size(long j, StaticMetadataVector staticMetadataVector);

    public static final native float StaticMetadata_FocalLength35mm(long j, StaticMetadata staticMetadata);

    public static final native long StaticMetadata_active_area_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_active_area_set(long j, StaticMetadata staticMetadata, long j2, PixelRect pixelRect);

    public static final native void StaticMetadata_available_f_numbers_set(long j, StaticMetadata staticMetadata, long j2, FloatVector floatVector);

    public static final native void StaticMetadata_available_focal_lengths_mm_set(long j, StaticMetadata staticMetadata, long j2, FloatVector floatVector);

    public static final native void StaticMetadata_bayer_pattern_set(long j, StaticMetadata staticMetadata, int i);

    public static final native void StaticMetadata_device_os_unix_ms_set(long j, StaticMetadata staticMetadata, long j2);

    public static final native void StaticMetadata_device_os_version_set(long j, StaticMetadata staticMetadata, String str);

    public static final native void StaticMetadata_device_set(long j, StaticMetadata staticMetadata, String str);

    public static final native void StaticMetadata_dng_color_calibration_set(long j, StaticMetadata staticMetadata, long j2, DngColorCalibrationVector dngColorCalibrationVector);

    public static final native void StaticMetadata_exposure_time_range_ms_set(long j, StaticMetadata staticMetadata, float[] fArr);

    public static final native void StaticMetadata_frame_raw_max_height_set(long j, StaticMetadata staticMetadata, int i);

    public static final native void StaticMetadata_frame_raw_max_width_set(long j, StaticMetadata staticMetadata, int i);

    public static final native void StaticMetadata_frame_readout_time_ms_set(long j, StaticMetadata staticMetadata, float f);

    public static final native void StaticMetadata_hardware_revision_set(long j, StaticMetadata staticMetadata, String str);

    public static final native void StaticMetadata_has_flash_set(long j, StaticMetadata staticMetadata, boolean z);

    public static final native void StaticMetadata_has_ois_set(long j, StaticMetadata staticMetadata, boolean z);

    public static final native void StaticMetadata_iso_range_set(long j, StaticMetadata staticMetadata, float[] fArr);

    public static final native int StaticMetadata_lens_facing_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_lens_facing_set(long j, StaticMetadata staticMetadata, int i);

    public static final native void StaticMetadata_make_set(long j, StaticMetadata staticMetadata, String str);

    public static final native void StaticMetadata_max_analog_iso_set(long j, StaticMetadata staticMetadata, float f);

    public static final native void StaticMetadata_model_set(long j, StaticMetadata staticMetadata, String str);

    public static final native void StaticMetadata_optically_black_regions_set(long j, StaticMetadata staticMetadata, long j2, PixelRectVector pixelRectVector);

    public static final native void StaticMetadata_pixel_array_height_set(long j, StaticMetadata staticMetadata, int i);

    public static final native void StaticMetadata_pixel_array_width_set(long j, StaticMetadata staticMetadata, int i);

    public static final native void StaticMetadata_qc_color_calibration_set(long j, StaticMetadata staticMetadata, long j2, QcColorCalibration qcColorCalibration);

    public static final native void StaticMetadata_raw_bits_per_pixel_set(long j, StaticMetadata staticMetadata, int i);

    public static final native int StaticMetadata_sensor_id_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_sensor_id_set(long j, StaticMetadata staticMetadata, int i);

    public static final native void StaticMetadata_sensor_physical_height_mm_set(long j, StaticMetadata staticMetadata, float f);

    public static final native void StaticMetadata_sensor_physical_width_mm_set(long j, StaticMetadata staticMetadata, float f);

    public static final native void StaticMetadata_software_set(long j, StaticMetadata staticMetadata, String str);

    public static final native void StaticMetadata_white_level_set(long j, StaticMetadata staticMetadata, int i);

    public static final native void StringAeResultsMap_set(long j, StringAeResultsMap stringAeResultsMap, String str, long j2, AeResults aeResults);

    public static final native void StringFrameMetadataMap_set(long j, StringFrameMetadataMap stringFrameMetadataMap, String str, long j2, FrameMetadata frameMetadata);

    public static final native void StringRawReadViewMap_set(long j, StringRawReadViewMap stringRawReadViewMap, String str, long j2, RawReadView rawReadView);

    public static final native void StringSpatialGainMap_set(long j, StringSpatialGainMap stringSpatialGainMap, String str, long j2, SpatialGainMap spatialGainMap);

    public static final native void StringStaticMetadataMap_set(long j, StringStaticMetadataMap stringStaticMetadataMap, String str, long j2, StaticMetadata staticMetadata);

    public static final native void ThreadPoolConfig_count_set(long j, ThreadPoolConfig threadPoolConfig, int i);

    public static final native void ThreadPoolConfig_priority_set(long j, ThreadPoolConfig threadPoolConfig, long j2, ThreadPriority threadPriority);

    public static final native void ThreadPriority_explicitly_set_set(long j, ThreadPriority threadPriority, boolean z);

    public static final native void ThreadPriority_value_set(long j, ThreadPriority threadPriority, int i);

    public static final native long Tuning_physical_stability_params_get(long j, Tuning tuning);

    public static final native long Union(long j, NormalizedRect normalizedRect, long j2, NormalizedRect normalizedRect2);

    public static final native void ViewfinderProcessingOptions_motion_processing_method_set(long j, ViewfinderProcessingOptions viewfinderProcessingOptions, int i);

    public static final native void ViewfinderProcessingOptions_process_gyro_set(long j, ViewfinderProcessingOptions viewfinderProcessingOptions, boolean z);

    public static final native void ViewfinderProcessingOptions_save_motion_trace_set(long j, ViewfinderProcessingOptions viewfinderProcessingOptions, boolean z);

    public static final native void ViewfinderProcessingOptions_verbose_set(long j, ViewfinderProcessingOptions viewfinderProcessingOptions, boolean z);

    public static final native float ViewfinderResults_gyro_speed_rad_per_sec_get(long j, ViewfinderResults viewfinderResults);

    public static final native void WeightedNormalizedRectVector_add(long j, WeightedNormalizedRectVector weightedNormalizedRectVector, long j2, WeightedNormalizedRect weightedNormalizedRect);

    public static final native long WeightedNormalizedRectVector_size(long j, WeightedNormalizedRectVector weightedNormalizedRectVector);

    public static final native long WeightedNormalizedRect_rect_get(long j, WeightedNormalizedRect weightedNormalizedRect);

    public static final native void WeightedNormalizedRect_rect_set(long j, WeightedNormalizedRect weightedNormalizedRect, long j2, NormalizedRect normalizedRect);

    public static final native void WeightedNormalizedRect_weight_set(long j, WeightedNormalizedRect weightedNormalizedRect, float f);

    public static final native void WeightedPixelRectVector_add(long j, WeightedPixelRectVector weightedPixelRectVector, long j2, WeightedPixelRect weightedPixelRect);

    public static final native long WeightedPixelRect_rect_get(long j, WeightedPixelRect weightedPixelRect);

    public static final native void WeightedPixelRect_weight_set(long j, WeightedPixelRect weightedPixelRect, float f);

    public static final native long YuvImage_SWIGUpcast(long j);

    public static final native long YuvReadView_chroma_read_view(long j, YuvReadView yuvReadView);

    public static final native int YuvReadView_height(long j, YuvReadView yuvReadView);

    public static final native long YuvReadView_luma_read_view(long j, YuvReadView yuvReadView);

    public static final native int YuvReadView_width(long j, YuvReadView yuvReadView);

    public static final native int YuvReadView_yuv_format(long j, YuvReadView yuvReadView);

    public static final native void YuvWriteView_FastCrop(long j, YuvWriteView yuvWriteView, int i, int i2, int i3, int i4);

    public static final native long YuvWriteView_SWIGUpcast(long j);

    public static final native void delete_AeModeResult(long j);

    public static final native void delete_AeResults(long j);

    public static final native void delete_AeShotParams(long j);

    public static final native void delete_AwbInfo(long j);

    public static final native void delete_BuildPayloadBurstSpecOptions(long j);

    public static final native void delete_BurstSpec(long j);

    public static final native void delete_ClientShotMetadata(long j);

    public static final native void delete_DebugParams(long j);

    public static final native void delete_DirtyLensHistory(long j);

    public static final native void delete_DngColorCalibration(long j);

    public static final native void delete_DngColorCalibrationVector(long j);

    public static final native void delete_FaceInfo(long j);

    public static final native void delete_FaceInfoVector(long j);

    public static final native void delete_FaceInfo_Landmark(long j);

    public static final native void delete_FloatArray4(long j);

    public static final native void delete_FloatArray9(long j);

    public static final native void delete_FloatDeque(long j);

    public static final native void delete_FloatVector(long j);

    public static final native void delete_FrameMetadata(long j);

    public static final native void delete_FrameMetadataKey(long j);

    public static final native void delete_FrameRequest(long j);

    public static final native void delete_FrameRequestVector(long j);

    public static final native void delete_Gcam(long j);

    public static final native void delete_GenerateRgbImageOptions(long j);

    public static final native void delete_GeometricCalibration(long j);

    public static final native void delete_GeometricCalibrationVector(long j);

    public static final native void delete_GrayReadViewU8(long j);

    public static final native void delete_GrayWriteViewU16(long j);

    public static final native void delete_GyroSample(long j);

    public static final native void delete_GyroSampleVector(long j);

    public static final native void delete_ImageSaverParams(long j);

    public static final native void delete_InitParams(long j);

    public static final native void delete_InterleavedImageU16(long j);

    public static final native void delete_InterleavedImageU8(long j);

    public static final native void delete_InterleavedReadViewU16(long j);

    public static final native void delete_InterleavedReadViewU8(long j);

    public static final native void delete_InterleavedWriteViewU16(long j);

    public static final native void delete_InterleavedWriteViewU8(long j);

    public static final native void delete_IspAwbMetadata(long j);

    public static final native void delete_JpgEncodeOptions(long j);

    public static final native void delete_LiveHdrMetadata(long j);

    public static final native void delete_LocationData(long j);

    public static final native void delete_MeshTranslation(long j);

    public static final native void delete_MeshWarp(long j);

    public static final native void delete_NoiseModel(long j);

    public static final native void delete_NormalizedRect(long j);

    public static final native void delete_OisMetadata(long j);

    public static final native void delete_OisPosition(long j);

    public static final native void delete_PixelRect(long j);

    public static final native void delete_PixelRectVector(long j);

    public static final native void delete_PortraitDepthArguments(long j);

    public static final native void delete_PortraitOutputs(long j);

    public static final native void delete_PortraitRequest(long j);

    public static final native void delete_PostviewParams(long j);

    public static final native void delete_QcColorCalibration(long j);

    public static final native void delete_QcColorCalibration_IlluminantData(long j);

    public static final native void delete_QcIlluminantVector(long j);

    public static final native void delete_RawImage(long j);

    public static final native void delete_RawReadView(long j);

    public static final native void delete_RawWriteView(long j);

    public static final native void delete_SceneFlicker(long j);

    public static final native void delete_ShotCallbacks(long j);

    public static final native void delete_ShotMetadata(long j);

    public static final native void delete_ShotParams(long j);

    public static final native void delete_Size(long j);

    public static final native void delete_SpatialGainMap(long j);

    public static final native void delete_StaticMetadata(long j);

    public static final native void delete_StaticMetadataVector(long j);

    public static final native void delete_StringFrameMetadataMap(long j);

    public static final native void delete_StringRawReadViewMap(long j);

    public static final native void delete_StringStaticMetadataMap(long j);

    public static final native void delete_ThreadPoolConfig(long j);

    public static final native void delete_ThreadPriority(long j);

    public static final native void delete_Uint8Vector(long j);

    public static final native void delete_ViewfinderProcessingOptions(long j);

    public static final native void delete_ViewfinderResults(long j);

    public static final native void delete_WeightedNormalizedRect(long j);

    public static final native void delete_WeightedPixelRect(long j);

    public static final native void delete_YuvImage(long j);

    public static final native void delete_YuvReadView(long j);

    public static final native void delete_YuvWriteView(long j);

    public static final native long kInvalidAllocationId_get();

    public static final native int kInvalidShotId_get();

    public static final native String kRequestCameraPrimary_get();

    public static final native String kRequestCameraSecondaryTele_get();

    public static final native String kRequestCameraSecondaryWide_get();

    public static final native int kSensorTempUnknown_get();

    public static final native long new_AeMetadata();

    public static final native long new_AeModeResult();

    public static final native long new_AeResults();

    public static final native long new_AeShotParams__SWIG_0();

    public static final native long new_AeShotParams__SWIG_1(long j, AeShotParams aeShotParams);

    public static final native long new_AfMetadata();

    public static final native long new_AwbInfo__SWIG_0();

    public static final native long new_AwbInfo__SWIG_1(long j, AwbInfo awbInfo);

    public static final native long new_AwbMetadata();

    public static final native long new_BuildPayloadBurstSpecOptions__SWIG_0();

    public static final native long new_BuildPayloadBurstSpecOptions__SWIG_1(long j, BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions);

    public static final native long new_BurstSpec();

    public static final native long new_ClientShotMetadata();

    public static final native long new_DebugParams();

    public static final native long new_DirtyLensHistory();

    public static final native long new_DngColorCalibration();

    public static final native long new_DngColorCalibrationVector__SWIG_0();

    public static final native long new_FaceInfo();

    public static final native long new_FaceInfoVector__SWIG_0();

    public static final native long new_FaceInfo_Landmark();

    public static final native long new_FloatArray4__SWIG_0();

    public static final native long new_FloatArray9__SWIG_0();

    public static final native long new_FloatDeque__SWIG_0();

    public static final native long new_FloatVector__SWIG_0();

    public static final native long new_FrameMetadata();

    public static final native long new_FrameMetadataKey(long j, int i);

    public static final native long new_FrameRequestVector__SWIG_0();

    public static final native long new_FrameRequest__SWIG_0();

    public static final native long new_FrameRequest__SWIG_1(long j, FrameRequest frameRequest);

    public static final native long new_GenerateRgbImageOptions();

    public static final native long new_GeometricCalibration();

    public static final native long new_GeometricCalibrationVector__SWIG_0();

    public static final native long new_GrayReadViewU8__SWIG_0();

    public static final native long new_GrayWriteViewU16__SWIG_0();

    public static final native long new_GrayWriteViewU16__SWIG_1(int i, int i2, int i3, long j, int i4);

    public static final native long new_GyroSample();

    public static final native long new_GyroSampleVector__SWIG_0();

    public static final native long new_ImageSaverParams();

    public static final native long new_InitParams();

    public static final native long new_InterleavedImageF();

    public static final native long new_InterleavedImageU16__SWIG_0();

    public static final native long new_InterleavedImageU16__SWIG_1(int i, int i2, int i3);

    public static final native long new_InterleavedImageU8__SWIG_0();

    public static final native long new_InterleavedImageU8__SWIG_1(int i, int i2, int i3);

    public static final native long new_InterleavedReadViewU16__SWIG_0();

    public static final native long new_InterleavedReadViewU8__SWIG_0();

    public static final native long new_InterleavedWriteViewU16__SWIG_0();

    public static final native long new_InterleavedWriteViewU8__SWIG_0();

    public static final native long new_InterleavedWriteViewU8__SWIG_1(int i, int i2, int i3, long j, int i4);

    public static final native long new_IspAwbMetadata();

    public static final native long new_JpgEncodeOptions();

    public static final native long new_LandmarkMap__SWIG_0();

    public static final native long new_LiveHdrMetadata();

    public static final native long new_LocationData();

    public static final native long new_MeshTranslation();

    public static final native long new_MeshWarp();

    public static final native long new_NormalizedRect();

    public static final native long new_OisMetadata();

    public static final native long new_OisPosition();

    public static final native long new_OisPositionVector__SWIG_0();

    public static final native long new_PhysicalStabilityParams();

    public static final native long new_PhysicalStabilityThresholds();

    public static final native long new_PixelRect();

    public static final native long new_PixelRectVector__SWIG_0();

    public static final native long new_PortraitDepthArguments(long j, InterleavedReadViewU16 interleavedReadViewU16, long j2, StringRawReadViewMap stringRawReadViewMap);

    public static final native long new_PortraitMask();

    public static final native long new_PortraitOutputs();

    public static final native long new_PortraitRequest();

    public static final native long new_PostviewParams();

    public static final native long new_QcColorCalibration();

    public static final native long new_QcColorCalibration_IlluminantData();

    public static final native long new_QcIlluminantVector__SWIG_0();

    public static final native long new_RawImage__SWIG_0();

    public static final native long new_RawImage__SWIG_1(int i, int i2, int i3);

    public static final native long new_RawWriteView__SWIG_0();

    public static final native long new_RawWriteView__SWIG_1(int i, int i2, int i3, int i4, long j);

    public static final native long new_SceneFlicker();

    public static final native long new_ShotCallbacks();

    public static final native long new_ShotMetadata__SWIG_0();

    public static final native long new_ShotMetadata__SWIG_1(long j, ShotMetadata shotMetadata);

    public static final native long new_ShotParams__SWIG_0();

    public static final native long new_ShotParams__SWIG_1(long j, ShotParams shotParams);

    public static final native long new_Size();

    public static final native long new_SpatialGainMap__SWIG_0();

    public static final native long new_SpatialGainMap__SWIG_1(long j, InterleavedImageF interleavedImageF, boolean z);

    public static final native long new_SpatialGainMap__SWIG_2(int i, int i2, boolean z);

    public static final native long new_StaticMetadataVector__SWIG_0();

    public static final native long new_StaticMetadata__SWIG_0();

    public static final native long new_StaticMetadata__SWIG_1(long j, StaticMetadata staticMetadata);

    public static final native long new_StringAeResultsMap__SWIG_0();

    public static final native long new_StringFrameMetadataMap__SWIG_0();

    public static final native long new_StringRawReadViewMap__SWIG_0();

    public static final native long new_StringSpatialGainMap__SWIG_0();

    public static final native long new_StringStaticMetadataMap__SWIG_0();

    public static final native long new_ThreadPoolConfig();

    public static final native long new_ThreadPriority();

    public static final native long new_Uint8Vector__SWIG_0();

    public static final native long new_ViewfinderProcessingOptions__SWIG_0();

    public static final native long new_ViewfinderProcessingOptions__SWIG_1(long j, ViewfinderProcessingOptions viewfinderProcessingOptions);

    public static final native long new_ViewfinderResults();

    public static final native long new_WeightedNormalizedRect();

    public static final native long new_WeightedNormalizedRectVector__SWIG_0();

    public static final native long new_WeightedPixelRect();

    public static final native long new_WeightedPixelRectVector__SWIG_0();

    public static final native long new_YuvImage__SWIG_0(int i, int i2, int i3);

    public static final native long new_YuvReadView__SWIG_2(int i, int i2, int i3, long j, int i4, int i5, int i6, long j2, int i7);

    public static final native long new_YuvReadView__SWIG_3();

    public static final native long new_YuvWriteView__SWIG_0();

    public static final native long new_YuvWriteView__SWIG_3(int i, int i2, int i3, long j, int i4, int i5, int i6, long j2, int i7);
}
