.class public Lcom/Helper;
.super Ljava/lang/Object;


# static fields
.field public static DistanceFar:F

.field public static DistanceInfinity:F

.field public static DistanceNear:F

.field public static Exynos:I

.field public static GeometricCalibration:I

.field public static GetISO:I

.field public static GetISOsystem:I

.field public static GetMode:I

.field public static IsMode:I

.field public static NeedRestart:I

.field public static TrFocusStateInv:I

.field public static getSunlightFix:I

.field public static getVFDenoise:I

.field public static mv_h:I

.field public static mv_w:I

.field public static sAppsPhotosGallery:Ljava/lang/String;

.field public static sAutoNS:I

.field public static sC2API:I

.field public static sC2APIl:I

.field public static sCam:I

.field public static sColorTransform:I

.field public static sColorTransformFront:I

.field public static sFront:I

.field public static sGetMaxISO:F

.field private static sHdrProcessTime:J

.field public static sHdr_process:I

.field public static sImg:I

.field public static sModeExperimental:I

.field public static sModeMORE_MODES:I

.field public static sModeNS:I

.field public static sModePhoto:I

.field public static sModePortrait:I

.field public static sModeSlowMotion:I

.field public static sModeTIME_LAPSE:I

.field public static sModeTo:Ljrl;

.field public static sModeUninitialized:I

.field public static sModeVideo:I

.field public static sZoom:F

.field public static sams:I

.field public static samsu:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/Helper;->getApplicationContext()Landroid/content/Context;

    invoke-static {}, Lcom/Helper;->setKeyOnStart()V

    invoke-static {}, Lcom/Helper;->c2a()V

    invoke-static {}, Lcom/Helper;->c2aa()V

    invoke-static {}, Lcom/Helper;->setMVresolution()V

    invoke-static {}, Lcom/Helper;->setColorTransform()V

    invoke-static {}, Lcom/Helper;->c2aaa()V

    invoke-static {}, Lcom/Helper;->Exynos()V

    invoke-static {}, Lcom/Helper;->createAutoPath()V

    new-instance v0, Lcom/NoiseModels;

    invoke-direct {v0}, Lcom/NoiseModels;-><init>()V

    invoke-static {}, Lcom/Helper;->LogDirsReady()V

    const/4 p0, 0x0

    return-void
.end method

.method public static Exynos()V
    .locals 2

    const-string v0, "pref_exynosfix_key"

    invoke-static {v0}, Lcom/SDE/LensValue;->SetLensValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_1

    if-gtz v0, :cond_0

    sget-object v1, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    const-string v0, ".*EXYNOS.*"

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->matches(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    const/16 v0, 0x0

    sput v0, Lcom/Helper;->Exynos:I

    return-void

    :cond_1
    const/16 v0, 0x1

    sput v0, Lcom/Helper;->Exynos:I

    return-void
.end method

.method public static Exynos()Z
    .locals 5

    sget-object v1, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    const-string v0, ".*EXYNOS.*"

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->matches(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "VIVO 1901"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    :cond_0
    return v1
.end method

.method public static GetAeCompension(I)I
    .locals 9

    const-string v0, "auto_exp_key"

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_7

    sget-object v0, Lcom/Helper;->sModeTo:Ljrl;

    sget-object v1, Ljrl;->g:Ljrl;

    if-ne v0, v1, :cond_0

    const-string v0, "pref_exposure_portrait_option_available_key"

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/Helper;->sModeTo:Ljrl;

    sget-object v1, Ljrl;->m:Ljrl;

    if-ne v0, v1, :cond_1

    const-string v0, "pref_exposure_ns_option_available_key"

    goto :goto_0

    :cond_1
    sget v0, Lcom/Helper;->sFront:I

    if-eqz v0, :cond_2

    const-string v0, "pref_exposure_front_option_available_key"

    goto :goto_0

    :cond_2
    const-string v1, "pref_aux_key"

    invoke-static {v1}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v1

    const v2, 0x1

    if-eq v1, v2, :cond_3

    const v2, 0x2

    if-eq v1, v2, :cond_4

    const v2, 0x3

    if-eq v1, v2, :cond_5

    const v2, 0x4

    if-eq v1, v2, :cond_6

    const-string v0, "pref_exposure_option_available_key"

    goto :goto_0

    :cond_3
    const-string v0, "pref_exposure_tele_key"

    goto :goto_0

    :cond_4
    const-string v0, "pref_exposure_wide_key"

    goto :goto_0

    :cond_5
    const-string v0, "pref_exposure_4th_key"

    goto :goto_0

    :cond_6
    const-string v0, "pref_exposure_5th_key"

    :goto_0
    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    return v0

    :cond_7
    return p0
.end method

.method public static GetBlackLevel(Llvp;Llzv;)[F
    .locals 10

    const-string v0, "pref_black_level_key"

    invoke-static {v0}, Lcom/SDE/LensValue;->SetLensValueWithFront(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_BLACK_LEVEL_PATTERN:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-interface {p0, v1}, Llvp;->l(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/hardware/camera2/params/BlackLevelPattern;

    if-eqz v1, :cond_1

    const/4 v2, 0x4

    new-array v3, v2, [F

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v2, :cond_0

    rem-int/lit8 v2, v6, 0x2

    div-int/lit8 v4, v6, 0x2

    invoke-virtual {v1, v2, v4}, Landroid/hardware/camera2/params/BlackLevelPattern;->getOffsetForIndex(II)I

    move-result v2

    int-to-float v2, v2

    aput v2, v3, v6

    add-int/lit8 v6, v6, 0x1

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    return-object v3

    :cond_1
    const/4 v0, 0x4

    new-array v0, v0, [F

    fill-array-data v0, :array_2

    return-object v0

    :pswitch_0
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_BLACK_LEVEL_PATTERN:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-interface {p0, v1}, Llvp;->l(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/hardware/camera2/params/BlackLevelPattern;

    if-eqz v1, :cond_3

    const/4 v2, 0x4

    new-array v3, v2, [F

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v2, :cond_2

    rem-int/lit8 v2, v6, 0x2

    div-int/lit8 v4, v6, 0x2

    invoke-virtual {v1, v2, v4}, Landroid/hardware/camera2/params/BlackLevelPattern;->getOffsetForIndex(II)I

    move-result v2

    int-to-float v2, v2

    aput v2, v3, v6

    add-int/lit8 v6, v6, 0x1

    const/4 v2, 0x4

    goto :goto_1

    :cond_2
    return-object v3

    :cond_3
    const/4 v0, 0x4

    new-array v0, v0, [F

    fill-array-data v0, :array_2

    return-object v0

    :pswitch_1
    sget-object v1, Landroid/hardware/camera2/CaptureResult;->SENSOR_DYNAMIC_BLACK_LEVEL:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-interface {p1, v1}, Llzv;->d(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [F

    if-eqz v1, :cond_4

    return-object v1

    :cond_4
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_BLACK_LEVEL_PATTERN:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-interface {p0, v1}, Llvp;->l(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/hardware/camera2/params/BlackLevelPattern;

    if-eqz v1, :cond_6

    const/4 v2, 0x4

    new-array v3, v2, [F

    const/4 v6, 0x0

    :goto_2
    if-ge v6, v2, :cond_5

    rem-int/lit8 v2, v6, 0x2

    div-int/lit8 v4, v6, 0x2

    invoke-virtual {v1, v2, v4}, Landroid/hardware/camera2/params/BlackLevelPattern;->getOffsetForIndex(II)I

    move-result v2

    int-to-float v2, v2

    aput v2, v3, v6

    add-int/lit8 v6, v6, 0x1

    const/4 v2, 0x4

    goto :goto_2

    :cond_5
    return-object v3

    :cond_6
    const/4 v0, 0x4

    new-array v0, v0, [F

    fill-array-data v0, :array_2

    return-object v0

    :pswitch_2
    const/4 v0, 0x4

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    return-object v0

    :pswitch_3
    const/4 v0, 0x4

    new-array v0, v0, [F

    fill-array-data v0, :array_1

    return-object v0

    :pswitch_4
    const/4 v0, 0x4

    new-array v0, v0, [F

    fill-array-data v0, :array_2

    return-object v0

    :pswitch_5
    const/4 v0, 0x4

    new-array v0, v0, [F

    fill-array-data v0, :array_3

    return-object v0

    :pswitch_6
    const/4 v0, 0x4

    new-array v0, v0, [F

    fill-array-data v0, :array_4

    return-object v0

    :pswitch_7
    const/4 v0, 0x4

    new-array v0, v0, [F

    fill-array-data v0, :array_5

    return-object v0

    :pswitch_8
    const/4 v0, 0x4

    new-array v0, v0, [F

    fill-array-data v0, :array_6

    return-object v0

    :pswitch_9
    const/4 v0, 0x4

    new-array v0, v0, [F

    fill-array-data v0, :array_7

    return-object v0

    :pswitch_a
    const/4 v0, 0x4

    new-array v0, v0, [F

    fill-array-data v0, :array_8

    return-object v0

    :pswitch_b
    const/4 v0, 0x4

    new-array v0, v0, [F

    const-string v1, "bl0_key"

    invoke-static {v1}, Lcom/SDE/LensValue;->SetLensValueWithFront(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/Fix/Pref;->getFloatValue(Ljava/lang/String;)F

    move-result v1

    const/16 v2, 0x0

    aput v1, v0, v2

    const-string v1, "bl1_key"

    invoke-static {v1}, Lcom/SDE/LensValue;->SetLensValueWithFront(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/Fix/Pref;->getFloatValue(Ljava/lang/String;)F

    move-result v1

    const/16 v2, 0x1

    aput v1, v0, v2

    const-string v1, "bl2_key"

    invoke-static {v1}, Lcom/SDE/LensValue;->SetLensValueWithFront(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/Fix/Pref;->getFloatValue(Ljava/lang/String;)F

    move-result v1

    const/16 v2, 0x2

    aput v1, v0, v2

    const-string v1, "bl3_key"

    invoke-static {v1}, Lcom/SDE/LensValue;->SetLensValueWithFront(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/Fix/Pref;->getFloatValue(Ljava/lang/String;)F

    move-result v1

    const/16 v2, 0x3

    aput v1, v0, v2

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
    .end packed-switch

    :array_0
    .array-data 4
        0x0
        0x0
        0x0
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x41800000    # 16.0f
        0x41800000    # 16.0f
        0x41800000    # 16.0f
        0x41800000    # 16.0f
    .end array-data

    :array_2
    .array-data 4
        0x42800000    # 64.0f
        0x42800000    # 64.0f
        0x42800000    # 64.0f
        0x42800000    # 64.0f
    .end array-data

    :array_3
    .array-data 4
        0x42a00000    # 80.0f
        0x42a00000    # 80.0f
        0x42a00000    # 80.0f
        0x42a00000    # 80.0f
    .end array-data

    :array_4
    .array-data 4
        0x42c80000    # 100.0f
        0x42c80000    # 100.0f
        0x42c80000    # 100.0f
        0x42c80000    # 100.0f
    .end array-data

    :array_5
    .array-data 4
        0x43800000    # 256.0f
        0x43800000    # 256.0f
        0x43800000    # 256.0f
        0x43800000    # 256.0f
    .end array-data

    :array_6
    .array-data 4
        0x427f70a4    # 63.86f
        0x427fb852    # 63.93f
        0x427fb852    # 63.93f
        0x428047ae    # 64.14f
    .end array-data

    :array_7
    .array-data 4
        0x42800000    # 64.0f
        0x42806666    # 64.2f
        0x42803333    # 64.1f
        0x42800000    # 64.0f
    .end array-data

    :array_8
    .array-data 4
        0x4281999a    # 64.8f
        0x427ccccd    # 63.2f
        0x427ccccd    # 63.2f
        0x42793333    # 62.3f
    .end array-data
.end method

.method public static GetCameraStamp()Ljava/lang/String;
    .locals 8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Camera Lens:- "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v2, Lcom/Helper;->sFront:I

    if-eqz v2, :cond_0

    const-string v1, "Front"

    sget v3, Lcom/Fix/Lens;->sAuxSwitchMain:I

    goto :goto_0

    :cond_0
    const-string v2, "pref_aux_key"

    invoke-static {v2}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    :pswitch_0
    const-string v1, "Main"

    sget v3, Lcom/Fix/Lens;->sAuxMain:I

    goto :goto_0

    :pswitch_1
    const-string v1, "Telephoto"

    sget v3, Lcom/Fix/Lens;->sAuxTele:I

    goto :goto_0

    :pswitch_2
    const-string v1, "Ultra wide"

    sget v3, Lcom/Fix/Lens;->sAuxWide:I

    goto :goto_0

    :pswitch_3
    const-string v1, "Camera 4"

    sget v3, Lcom/Fix/Lens;->sAuxInfinity:I

    goto :goto_0

    :pswitch_4
    const-string v1, "Camera 5"

    sget v3, Lcom/Fix/Lens;->sAux5:I

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " (ID= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public static GetCorrectionDBL([F[F)[F
    .locals 6

    const/4 v0, 0x4

    const-string v1, "pref_dbl_key"

    invoke-static {v1}, Lcom/SDE/LensValue;->SetLensValueWithFront(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/Fix/Pref;->getFloatValue(Ljava/lang/String;)F

    move-result v1

    const/high16 v2, 0x447a0000    # 1000.0f

    div-float/2addr v1, v2

    new-array v2, v0, [F

    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_0

    aget v3, p1, v0

    aget v4, p0, v0

    aget v5, p0, v0

    sub-float v3, v4, v3

    mul-float/2addr v3, v1

    sub-float v3, v5, v3

    aput v3, v2, v0

    goto :goto_0

    :cond_0
    return-object v2
.end method

.method public static GetEachModeIndividually(Landroid/content/Intent;)V
    .locals 6

    sget v0, Lcom/Helper;->GetMode:I

    sparse-switch v0, :sswitch_data_0

    const-string v1, "android.media.action.STILL_IMAGE_CAMERA"

    invoke-virtual {p0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    :sswitch_0
    const-string v1, "android.media.action.STILL_IMAGE_CAMERA"

    invoke-virtual {p0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    :sswitch_1
    const-string v1, "android.media.action.VIDEO_CAMERA"

    invoke-virtual {p0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    :sswitch_2
    const-string v1, "android.media.action.PORTRAIT"

    invoke-virtual {p0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    :sswitch_3
    const-string v1, "android.media.action.NIGHTSIGHT"

    invoke-virtual {p0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    :sswitch_4
    const-string v1, "android.media.action.TIME_LAPSE"

    invoke-virtual {p0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x6 -> :sswitch_2
        0xc -> :sswitch_3
        0xd -> :sswitch_4
    .end sparse-switch

    :goto_0
    return-void
.end method

.method public static GetIdFromResources(Ljava/lang/String;I)I
    .locals 12

    invoke-static {}, Landroid/app/AppGlobals;->getInitialApplication()Landroid/app/Application;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/Application;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    const-string v5, "drawable"

    goto :goto_0

    :pswitch_1
    const-string v5, "layout"

    goto :goto_0

    :pswitch_2
    const-string v5, "array"

    goto :goto_0

    :pswitch_3
    const-string v5, "color"

    goto :goto_0

    :pswitch_4
    const-string v5, "id"

    goto :goto_0

    :pswitch_5
    const-string v5, "raw"

    goto :goto_0

    :pswitch_6
    const-string v5, "string"

    :goto_0
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, p0, v5, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method public static GetLens(Llvp;)V
    .locals 2

    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_INFO_SENSITIVITY_RANGE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-interface {p0, v0}, Llvp;->n(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Range;

    invoke-virtual {v0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :try_start_0
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_MAX_ANALOG_SENSITIVITY:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-interface {p0, v0}, Llvp;->n(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    :goto_0
    div-int/2addr v0, v1

    int-to-float v0, v0

    sput v0, Lcom/Fix/IsoTime;->shotMaxISO:F

    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-interface {p0, v0}, Llvp;->n(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sput v0, Lcom/Helper;->sCam:I

    return-void

    :catchall_0
    move-exception v0

    const/16 v0, 0x184

    goto :goto_0
.end method

.method public static GetRawFormatFix()[I
    .locals 6

    const/16 v5, 0x25

    const/16 v4, 0x20

    const/4 v3, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x1

    sget v0, Lcom/Helper;->sFront:I

    if-eqz v0, :cond_0

    const-string v0, "pref_raw_key_front"

    goto :goto_0

    :cond_0
    const-string v0, "pref_aux_key"

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    const-string v0, "pref_raw_key_main"

    goto :goto_0

    :pswitch_1
    const-string v0, "pref_raw_key_tele"

    goto :goto_0

    :pswitch_2
    const-string v0, "pref_raw_key_wide"

    goto :goto_0

    :pswitch_3
    const-string v0, "pref_raw_key_id4"

    goto :goto_0

    :pswitch_4
    const-string v0, "pref_raw_key_id5"

    :goto_0
    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    if-eq v0, v2, :cond_1

    if-ne v0, v3, :cond_2

    new-array v0, v2, [I

    aput v4, v0, v1

    goto :goto_1

    :cond_1
    new-array v0, v2, [I

    aput v5, v0, v1

    goto :goto_1

    :cond_2
    const/4 v0, 0x3

    new-array v0, v0, [I

    aput v5, v0, v1

    const/16 v1, 0x26

    aput v1, v0, v2

    aput v4, v0, v3

    :goto_1
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public static GetRestartMethodFront()V
    .locals 5

    sget v0, Lcom/Helper;->sHdr_process:I

    if-nez v0, :cond_1

    const-wide/16 v0, 0x1f4

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    invoke-static {}, Landroid/app/AppGlobals;->getInitialApplication()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Application;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/app/Application;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object v2

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/google/android/apps/camera/legacy/app/activity/main/CameraActivity;

    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const v1, 0x8000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const v1, 0x10000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    sget v3, Lcom/Helper;->sCam:I

    if-eqz v3, :cond_0

    const-string v3, "android.intent.extra.USE_FRONT_CAMERA"

    const/4 v1, 0x1

    invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    :cond_0
    invoke-static {v0}, Lcom/Helper;->GetEachModeIndividually(Landroid/content/Intent;)V

    invoke-virtual {v2, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    :cond_1
    const v1, 0x7f140288

    invoke-static {v1}, Lcom/Helper;->Toast(I)V

    return-void
.end method

.method public static IsMode(Landroid/content/Intent;I)V
    .locals 2

    if-eqz p1, :cond_0

    const-string v0, "android.intent.extra.USE_FRONT_CAMERA"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    :cond_0
    sget v0, Lcom/Visibility;->IsMode:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x6

    if-eq v0, v1, :cond_3

    const/16 v1, 0xc

    if-eq v0, v1, :cond_4

    const/16 v1, 0xd

    if-eq v0, v1, :cond_5

    goto :goto_0

    :cond_1
    const-string v1, "android.media.action.STILL_IMAGE_CAMERA"

    invoke-virtual {p0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    :cond_2
    const-string v1, "android.media.action.VIDEO_CAMERA"

    invoke-virtual {p0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    :cond_3
    const-string v1, "android.media.action.PORTRAIT"

    invoke-virtual {p0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    :cond_4
    const-string v1, "android.media.action.NIGHTSIGHT"

    invoke-virtual {p0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    :cond_5
    const-string v1, "android.media.action.TIME_LAPSE"

    invoke-virtual {p0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    :goto_0
    return-void
.end method

.method public static IsMode(Ljrl;)V
    .locals 1

    sput-object p0, Lcom/Helper;->sModeTo:Ljrl;

    const/4 v0, 0x0

    sput v0, Lcom/Helper;->sModeVideo:I

    sput v0, Lcom/Helper;->sModeSlowMotion:I

    sput v0, Lcom/Helper;->sModeNS:I

    sput v0, Lcom/Helper;->sModePortrait:I

    sput v0, Lcom/Helper;->sModeTIME_LAPSE:I

    sput v0, Lcom/Helper;->sModeMORE_MODES:I

    sput v0, Lcom/Helper;->sModePhoto:I

    sput v0, Lcom/Helper;->sModeExperimental:I

    sget-object v0, Ljrl;->c:Ljrl;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    sput v0, Lcom/Helper;->sModeVideo:I

    goto :goto_0

    :cond_0
    sget-object v0, Ljrl;->f:Ljrl;

    if-ne p0, v0, :cond_1

    const/4 v0, 0x1

    sput v0, Lcom/Helper;->sModeSlowMotion:I

    goto :goto_0

    :cond_1
    sget-object v0, Ljrl;->m:Ljrl;

    if-ne p0, v0, :cond_2

    const/4 v0, 0x1

    sput v0, Lcom/Helper;->sModeNS:I

    goto :goto_0

    :cond_2
    sget-object v0, Ljrl;->g:Ljrl;

    if-ne p0, v0, :cond_3

    const/4 v0, 0x1

    sput v0, Lcom/Helper;->sModePortrait:I

    goto :goto_0

    :cond_3
    sget-object v0, Ljrl;->n:Ljrl;

    if-ne p0, v0, :cond_4

    const/4 v0, 0x1

    sput v0, Lcom/Helper;->sModeTIME_LAPSE:I

    goto :goto_0

    :cond_4
    sget-object v0, Ljrl;->p:Ljrl;

    if-ne p0, v0, :cond_5

    const/4 v0, 0x1

    sput v0, Lcom/Helper;->sModeMORE_MODES:I

    :cond_5
    goto :goto_0

    sget-object v0, Ljrl;->b:Ljrl;

    if-ne p0, v0, :cond_6

    const/4 v0, 0x1

    sput v0, Lcom/Helper;->sModePhoto:I

    goto :goto_0

    :cond_6
    goto :goto_0

    sget-object v0, Ljrl;->a:Ljrl;

    if-ne p0, v0, :cond_7

    const/4 v0, 0x1

    sput v0, Lcom/Helper;->sModeExperimental:I

    goto :goto_0

    :cond_7
    :goto_0
    return-void
.end method

.method public static LogDirsReady()V
    .locals 4

    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/LMC8.5/patchedlibs/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_0
    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/LMC8.5/libs/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_1
    return-void
.end method

.method public static LogWriteToFile(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    new-instance v2, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/LMC8.5/files/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :try_start_0
    new-instance v1, Ljava/io/OutputStreamWriter;

    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    invoke-virtual {v1, p1}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/OutputStreamWriter;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static MenuValueFloat2(Ljava/lang/String;)F
    .locals 0

    invoke-static {p0}, Lcom/Helper;->MenuValueString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0

    return p0
.end method

.method public static MenuValueString(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    invoke-static {}, Landroid/app/AppGlobals;->getInitialApplication()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Application;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1, p0}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, p0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static MnFix()Z
    .locals 2

    sget-object v0, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;

    const-string/jumbo v1, "27"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;

    const-string/jumbo v1, "28"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;

    const-string/jumbo v1, "29"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;

    const-string/jumbo v1, "30"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    :cond_0
    return v0
.end method

.method public static SelectTint()I
    .locals 1

    sget v0, Lcom/Helper;->sFront:I

    if-eqz v0, :cond_0

    const-string v0, "pref_fix_awbgains_key_1"

    goto :goto_0

    :cond_0
    const-string v0, "pref_aux_key"

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    const-string v0, "pref_fix_awbgains_key_0"

    goto :goto_0

    :pswitch_1
    const-string v0, "pref_fix_awbgains_key_2"

    goto :goto_0

    :pswitch_2
    const-string v0, "pref_fix_awbgains_key_3"

    goto :goto_0

    :pswitch_3
    const-string v0, "pref_fix_awbgains_key_4"

    goto :goto_0

    :pswitch_4
    const-string v0, "pref_fix_awbgains_key_5"

    :goto_0
    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public static SetDevice(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    const-string v0, "taimen"

    goto :goto_0

    :pswitch_0
    const-string v0, "taimen"

    goto :goto_0

    :pswitch_1
    const-string v0, "marlin"

    goto :goto_0

    :pswitch_2
    const-string v0, "walleye"

    goto :goto_0

    :pswitch_3
    const-string v0, "sailfish"

    goto :goto_0

    :pswitch_4
    const-string v0, "blueline"

    goto :goto_0

    :pswitch_5
    const-string v0, "crosshatch"

    goto :goto_0

    :pswitch_6
    const-string v0, "sargo"

    goto :goto_0

    :pswitch_7
    const-string v0, "bonito"

    goto :goto_0

    :pswitch_8
    const-string v0, "flame"

    goto :goto_0

    :pswitch_9
    const-string v0, "coral"

    goto :goto_0

    :pswitch_a
    const-string v0, "sunfish"

    goto :goto_0

    :pswitch_b
    const-string v0, "bramble"

    goto :goto_0

    :pswitch_c
    const-string v0, "redfin"

    goto :goto_0

    :pswitch_d
    const-string v0, "barbet"

    goto :goto_0

    :pswitch_e
    const-string v0, "oriole"

    goto :goto_0

    :pswitch_f
    const-string v0, "raven"

    goto :goto_0

    :pswitch_10
    const-string v0, "bluejay"

    goto :goto_0

    :pswitch_11
    const-string v0, "cloudripper"

    goto :goto_0

    :pswitch_12
    const-string v0, "pipit"

    goto :goto_0

    :pswitch_13
    sget-object v0, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_10
        :pswitch_11
        :pswitch_12
        :pswitch_13
    .end packed-switch
.end method

.method public static SetDevice1(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    const-string v0, "raven"

    goto :goto_0

    :pswitch_0
    const-string v0, "taimen"

    goto :goto_0

    :pswitch_1
    const-string v0, "marlin"

    goto :goto_0

    :pswitch_2
    const-string v0, "walleye"

    goto :goto_0

    :pswitch_3
    const-string v0, "sailfish"

    goto :goto_0

    :pswitch_4
    const-string v0, "blueline"

    goto :goto_0

    :pswitch_5
    const-string v0, "crosshatch"

    goto :goto_0

    :pswitch_6
    const-string v0, "sargo"

    goto :goto_0

    :pswitch_7
    const-string v0, "bonito"

    goto :goto_0

    :pswitch_8
    const-string v0, "flame"

    goto :goto_0

    :pswitch_9
    const-string v0, "coral"

    goto :goto_0

    :pswitch_a
    const-string v0, "sunfish"

    goto :goto_0

    :pswitch_b
    const-string v0, "bramble"

    goto :goto_0

    :pswitch_c
    const-string v0, "redfin"

    goto :goto_0

    :pswitch_d
    const-string v0, "barbet"

    goto :goto_0

    :pswitch_e
    const-string v0, "oriole"

    goto :goto_0

    :pswitch_f
    const-string v0, "raven"

    goto :goto_0

    :pswitch_10
    const-string v0, "bluejay"

    goto :goto_0

    :pswitch_11
    const-string v0, "cloudripper"

    goto :goto_0

    :pswitch_12
    const-string v0, "pipit"

    goto :goto_0

    :pswitch_13
    sget-object v0, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_10
        :pswitch_11
        :pswitch_12
        :pswitch_13
    .end packed-switch
.end method

.method public static SetHDRInterface()Ljava/lang/String;
    .locals 12

    const-string v6, "pref_frontcam_value_restart_key"

    invoke-static {v6}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v6

    if-eqz v6, :cond_0

    const-string v1, "pref_model_key_front"

    goto :goto_0

    :cond_0
    const-string v6, "pref_aux_key"

    invoke-static {v6}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v6

    packed-switch v6, :pswitch_data_0

    const-string v1, "pref_model_key"

    goto :goto_0

    :pswitch_0
    const-string v1, "pref_model_key"

    goto :goto_0

    :pswitch_1
    const-string v1, "pref_model_key_tele"

    goto :goto_0

    :pswitch_2
    const-string v1, "pref_model_key_wide"

    goto :goto_0

    :pswitch_3
    const-string v1, "pref_model_key_id4"

    goto :goto_0

    :pswitch_4
    const-string v1, "pref_model_key_id5"

    :goto_0
    invoke-static {v1}, Lcom/Helper;->SetDevice1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public static SetInterface()Ljava/lang/String;
    .locals 12

    const-string v6, "pref_frontcam_value_restart_key"

    invoke-static {v6}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v6

    if-eqz v6, :cond_0

    const-string v1, "pref_device_key_front"

    goto :goto_0

    :cond_0
    const-string v6, "pref_aux_key"

    invoke-static {v6}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v6

    packed-switch v6, :pswitch_data_0

    const-string v1, "pref_device_key"

    goto :goto_0

    :pswitch_0
    const-string v1, "pref_device_key"

    goto :goto_0

    :pswitch_1
    const-string v1, "pref_device_key_tele"

    goto :goto_0

    :pswitch_2
    const-string v1, "pref_device_key_wide"

    goto :goto_0

    :pswitch_3
    const-string v1, "pref_device_key_id4"

    goto :goto_0

    :pswitch_4
    const-string v1, "pref_device_key_id5"

    :goto_0
    invoke-static {v1}, Lcom/Helper;->SetDevice(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public static ShowToastDirect(Ljava/lang/String;)V
    .locals 11

    invoke-static {}, Landroid/app/AppGlobals;->getInitialApplication()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Application;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, p0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public static Toast(I)V
    .locals 6

    invoke-static {}, Landroid/app/AppGlobals;->getInitialApplication()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Application;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    const/4 v2, 0x1

    invoke-static {v5, p0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v1

    const/16 v0, 0x11

    const/4 v4, 0x0

    invoke-virtual {v1, v0, v4, v4}, Landroid/widget/Toast;->setGravity(III)V

    invoke-virtual {v1}, Landroid/widget/Toast;->getView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    new-instance v2, Landroid/widget/ImageView;

    invoke-direct {v2, v5}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    const v3, 0x7f080729

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {v0, v2, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;I)V

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public static c2a()V
    .locals 2

    const-string v0, "pref_c2a_key"

    invoke-static {v0}, Lcom/SDE/LensValue;->SetLensValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_1

    if-gtz v0, :cond_0

    sget-object v0, Landroid/os/Build;->BOARD:Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "SDM845"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "SDM710"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "SDM712"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    sput v0, Lcom/Helper;->sC2API:I

    const/4 v0, 0x0

    sput v0, Lcom/Helper;->sC2APIl:I

    return-void

    :cond_1
    const/4 v0, 0x0

    sput v0, Lcom/Helper;->sC2API:I

    const/4 v0, 0x1

    sput v0, Lcom/Helper;->sC2APIl:I

    return-void
.end method

.method public static c2aa()V
    .locals 2

    const-string v0, "pref_img_key"

    invoke-static {v0}, Lcom/SDE/LensValue;->SetLensValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_1

    if-gtz v0, :cond_0

    sget-object v0, Landroid/os/Build;->BOARD:Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "SDM845"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "SDM710"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "SDM712"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    const/16 v0, 0x23

    sput v0, Lcom/Helper;->sImg:I

    return-void

    :cond_1
    const/16 v0, 0x100

    sput v0, Lcom/Helper;->sImg:I

    return-void
.end method

.method public static c2aaa()V
    .locals 2

    const-string v0, "pref_samsungfix_key"

    invoke-static {v0}, Lcom/SDE/LensValue;->SetLensValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_1

    if-gtz v0, :cond_0

    invoke-static {}, LMC/Device;->isInfinixOrTecno()Z

    move-result v0

    if-eqz v0, :cond_transsion_check

    goto :cond_1

    :cond_transsion_check
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "SAMSUNG"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "ULEFONE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "TECNO MOBILE LIMITED"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "VIVO"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "OPPO"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    const/16 v0, 0x26

    sput v0, Lcom/Helper;->samsu:I

    const/16 v0, 0x20

    sput v0, Lcom/Helper;->sams:I

    return-void

    :cond_1
    const/16 v0, 0x20

    sput v0, Lcom/Helper;->samsu:I

    const/16 v0, 0x23

    sput v0, Lcom/Helper;->sams:I

    return-void
.end method

.method public static createAutoPath()V
    .locals 4

    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/LMC8.5/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_root

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_root
    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/LMC8.5/AWB/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_0
    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/LMC8.5/NOISE MODELER/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_1
    return-void
.end method

.method public static execCommands(Landroid/content/Context;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v1, "TouchPoint"

    check-cast p0, Landroid/app/Activity;

    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Display;->getRotation()I

    move-result v3

    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    invoke-virtual {v2, v0}, Landroid/view/Display;->getRealMetrics(Landroid/util/DisplayMetrics;)V

    iget v5, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v6, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v4

    const-string v0, "navigation_bar_height"

    const-string v2, "dimen"

    const-string v7, "android"

    invoke-virtual {v4, v0, v2, v7}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v4, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    :cond_0
    const v4, 0x2

    div-int v5, v5, v4

    div-int v6, v6, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "input tap "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v3, :cond_1

    sub-int v6, v6, v2

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const/4 v0, 0x3

    if-eq v0, v3, :cond_2

    sub-int v5, v5, v2

    goto :goto_0

    :cond_2
    add-int v5, v5, v2

    :goto_0
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :goto_1
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    const-string v1, "sh"

    invoke-virtual {v0, v1}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v1

    new-instance v2, Ljava/io/DataOutputStream;

    invoke-virtual {v1}, Ljava/lang/Process;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\n"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/DataOutputStream;->flush()V

    return-void
.end method

.method public static getApplicationContext()Landroid/content/Context;
    .locals 3

    invoke-static {}, Landroid/app/AppGlobals;->getInitialApplication()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Application;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public static getAwbLog([F[FI)V
    .locals 11

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\n\n"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lsgcam/Shamim;->GetCameraStamp()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "\n\nArray length= "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, "\n\nR_G=\n"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, p2, :cond_0

    aget v4, p0, v3

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    if-ge v3, p2, :cond_0

    const-string v6, "\n"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v6, "\n\n\nArray length= "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, "\n\nB_G=\n"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v3, 0x0

    :goto_1
    if-ge v3, p2, :cond_1

    aget v4, p1, v3

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    if-ge v3, p2, :cond_1

    const-string v6, "\n"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const-string v6, "\n\nGB/GR= "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v2, Lcom/SDE/Awb;->awbArr_GR_GB:F

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v0, "AWB"

    invoke-static {v0}, Lcom/SDE/LensValue;->SetLensValueLog(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v5}, Lcom/Helper;->LogWriteToFile(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static getISONm(Llzr;)I
    .locals 9

    const-string v5, "pref_iso_noise_key"

    invoke-static {v5}, Lcom/SDE/LensValue;->SetLensValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v5

    packed-switch v5, :pswitch_data_0

    sget-object v5, Landroid/hardware/camera2/CaptureResult;->SENSOR_SENSITIVITY:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-interface {p0, v5}, Llzr;->d(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    return v5

    :pswitch_0
    sget-object v5, Landroid/hardware/camera2/CaptureResult;->SENSOR_SENSITIVITY:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-interface {p0, v5}, Llzr;->d(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    return v5

    :pswitch_1
    const/16 v5, 0x64

    return v5

    :pswitch_2
    const/16 v5, 0xc8

    return v5

    :pswitch_3
    const/16 v5, 0x12c

    return v5

    :pswitch_4
    sget-object v5, Landroid/hardware/camera2/CaptureResult;->SENSOR_SENSITIVITY:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-interface {p0, v5}, Llzr;->d(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    int-to-float v5, v5

    const v1, 0x42480000    # 50.0f

    sub-float/2addr v5, v1

    const-string v3, "pref_iso_noise_coeff_key"

    invoke-static {v3}, Lcom/SDE/LensValue;->SetLensValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/Fix/Pref;->getFloatValue(Ljava/lang/String;)F

    move-result v3

    mul-float/2addr v5, v3

    add-float/2addr v5, v1

    float-to-int v5, v5

    return v5

    :pswitch_5
    const-string v5, "pref_manual_iso_noise_key"

    invoke-static {v5}, Lcom/SDE/LensValue;->SetLensValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v5

    return v5

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public static getJPGQuality()I
    .locals 5

    const-string v0, "pref_qjpg_key"

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_0
    const/16 v3, 0x64

    return v3
.end method

.method public static getMerge()I
    .locals 1

    sget v0, Lcom/Helper;->sFront:I

    if-eqz v0, :cond_0

    const-string v0, "pref_merge_key_front"

    goto :goto_0

    :cond_0
    const-string v0, "pref_aux_key"

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    const-string v0, "pref_merge_key_main"

    goto :goto_0

    :pswitch_1
    const-string v0, "pref_merge_key_tele"

    goto :goto_0

    :pswitch_2
    const-string v0, "pref_merge_key_wide"

    goto :goto_0

    :pswitch_3
    const-string v0, "pref_merge_key_id4"

    goto :goto_0

    :pswitch_4
    const-string v0, "pref_merge_key_id5"

    :goto_0
    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public static getNoiseModelerLog([Landroid/util/Pair;Llzv;)V
    .locals 12

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/Helper;->GetCameraStamp()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v6, Landroid/hardware/camera2/CaptureResult;->SENSOR_NOISE_PROFILE:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-interface {p1, v6}, Llzv;->d(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [Landroid/util/Pair;

    const-string v0, "System Noise modeler:-"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n\n\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "First Pair values:- \n\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v3, 0x4

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_0

    aget-object v4, v6, v5

    iget-object v4, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v5, v5, 0x1

    if-ge v5, v3, :cond_0

    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v0, "\n\nSecond Pair values:- \n\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v3, 0x4

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v3, :cond_1

    aget-object v4, v6, v5

    iget-object v4, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v5, v5, 0x1

    if-ge v5, v3, :cond_1

    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const-string v0, "\n\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "System ISO:- "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Lcom/Helper;->GetISOsystem:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "\n\n\n\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "Working Noise modeler:-"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n\n\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "First Pair values:- \n\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v3, 0x4

    const/4 v5, 0x0

    :goto_2
    if-ge v5, v3, :cond_2

    aget-object v4, p0, v5

    iget-object v4, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v5, v5, 0x1

    if-ge v5, v3, :cond_2

    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_2
    sget-object v2, Lcom/NoiseModels;->NM_SC:[Landroid/util/Pair;

    if-eqz v2, :cond_3

    array-length v3, v2

    if-eqz v3, :cond_3

    const-string v0, "\n\nArray length = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "\n\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v5, 0x0

    :goto_3
    if-ge v5, v3, :cond_3

    aget-object v4, v2, v5

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v5, v5, 0x1

    if-ge v5, v3, :cond_3

    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_3
    const-string v0, "\n\nSecond Pair values:- \n\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v3, 0x4

    const/4 v5, 0x0

    :goto_4
    if-ge v5, v3, :cond_4

    aget-object v4, p0, v5

    iget-object v4, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v5, v5, 0x1

    if-ge v5, v3, :cond_4

    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_4
    sget-object v2, Lcom/NoiseModels;->NM_OFF:[Landroid/util/Pair;

    if-eqz v2, :cond_5

    array-length v3, v2

    if-eqz v3, :cond_5

    const-string v0, "\n\nArray length = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "\n\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v5, 0x0

    :goto_5
    if-ge v5, v3, :cond_5

    aget-object v4, v2, v5

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v5, v5, 0x1

    if-ge v5, v3, :cond_5

    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_5

    :cond_5
    const-string v0, "\n\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "Working ISO:- "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Lcom/Helper;->GetISO:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "NOISE_MODELER"

    invoke-static {v2}, Lcom/SDE/LensValue;->SetLensValueLog(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lcom/Helper;->LogWriteToFile(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static getUpscale()I
    .locals 1

    const-string v0, "pref_upscale_key"

    invoke-static {v0}, Lcom/SDE/LensValue;->SetLensValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static getValue(Ljava/lang/String;)I
    .locals 3

    invoke-static {}, Landroid/app/AppGlobals;->getInitialApplication()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Application;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1, p0}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, p0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    :cond_0
    return v2
.end method

.method public static getizoom()I
    .locals 2

    const-string v0, "pref_frontcam_value_restart_key"

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "pref_izoom_key_front"

    goto :goto_0

    :cond_0
    const-string v0, "pref_aux_key"

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    const-string v0, "pref_izoom_key_main"

    goto :goto_0

    :pswitch_0
    const-string v0, "pref_izoom_key_main"

    goto :goto_0

    :pswitch_1
    const-string v0, "pref_izoom_key_tele"

    goto :goto_0

    :pswitch_2
    const-string v0, "pref_izoom_key_wide"

    goto :goto_0

    :pswitch_3
    const-string v0, "pref_izoom_key_id4"

    goto :goto_0

    :pswitch_4
    const-string v0, "pref_izoom_key_id5"

    :goto_0
    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public static getizoomv(I)F
    .locals 0

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    const/high16 p0, 0x40000000    # 2.0f

    goto :goto_0

    :pswitch_1
    const/high16 p0, 0x3f8c0000    # 1.09375f

    goto :goto_0

    :pswitch_2
    const/high16 p0, 0x3f990000    # 1.1953125f

    goto :goto_0

    :pswitch_3
    const/high16 p0, 0x3fa60000    # 1.296875f

    goto :goto_0

    :pswitch_4
    const/high16 p0, 0x3fb30000    # 1.3984375f

    goto :goto_0

    :pswitch_5
    const/high16 p0, 0x3fc00000    # 1.5f

    goto :goto_0

    :pswitch_6
    const/high16 p0, 0x3fcc0000    # 1.59375f

    goto :goto_0

    :pswitch_7
    const/high16 p0, 0x3fd90000    # 1.6953125f

    goto :goto_0

    :pswitch_8
    const/high16 p0, 0x3fe60000    # 1.796875f

    goto :goto_0

    :pswitch_9
    const/high16 p0, 0x3ff30000    # 1.8984375f

    goto :goto_0

    :pswitch_a
    const/high16 p0, 0x40060000    # 2.09375f

    goto :goto_0

    :pswitch_b
    const/high16 p0, 0x400c0000    # 2.1875f

    goto :goto_0

    :pswitch_c
    const/high16 p0, 0x40130000    # 2.296875f

    goto :goto_0

    :pswitch_d
    const/high16 p0, 0x40190000    # 2.390625f

    goto :goto_0

    :pswitch_e
    const/high16 p0, 0x40200000    # 2.5f

    goto :goto_0

    :pswitch_f
    const/high16 p0, 0x40260000    # 2.59375f

    goto :goto_0

    :pswitch_10
    const/high16 p0, 0x402c0000    # 2.6875f

    goto :goto_0

    :pswitch_11
    const/high16 p0, 0x40330000    # 2.796875f

    goto :goto_0

    :pswitch_12
    const/high16 p0, 0x40390000    # 2.890625f

    goto :goto_0

    :pswitch_13
    const/high16 p0, 0x40400000    # 3.0f

    :goto_0
    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_10
        :pswitch_11
        :pswitch_12
        :pswitch_13
    .end packed-switch
.end method

.method public static intentMode(Landroid/content/Intent;)V
    .locals 2

    sget v0, Lcom/Helper;->IsMode:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x6

    if-eq v0, v1, :cond_2

    const/16 v1, 0xc

    if-eq v0, v1, :cond_3

    goto :goto_0

    :cond_0
    const-string v1, "android.media.action.STILL_IMAGE_CAMERA"

    invoke-virtual {p0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    :cond_1
    const-string v1, "android.media.action.VIDEO_CAMERA"

    invoke-virtual {p0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    :cond_2
    const-string v1, "android.media.action.PORTRAIT"

    invoke-virtual {p0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    :cond_3
    const-string v1, "android.media.action.NIGHTSIGHT"

    invoke-virtual {p0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    :goto_0
    return-void
.end method

.method public static loadDistances()V
    .locals 4

    invoke-static {}, Landroid/app/AppGlobals;->getInitialApplication()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Application;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "pref_macro_ns_key"

    invoke-static {v1}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lpkr;->k:Llvp;

    sget-object v2, Landroid/hardware/camera2/CameraCharacteristics;->LENS_INFO_MINIMUM_FOCUS_DISTANCE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-interface {v1, v2}, Llvp;->n(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    sput v2, Lcom/Helper;->DistanceNear:F

    goto :goto_0

    :cond_0
    const-string v1, "pref_mf_near_key"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v1, "14.29"

    :cond_1
    invoke-static {v1}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    sput v1, Lcom/Helper;->DistanceNear:F

    :goto_0
    const-string v1, "pref_mf_far_key"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v1, "1.52"

    :cond_2
    invoke-static {v1}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    sput v1, Lcom/Helper;->DistanceFar:F

    const-string v1, "pref_hyperfocal_ns_key"

    invoke-static {v1}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, Lpkr;->k:Llvp;

    sget-object v2, Landroid/hardware/camera2/CameraCharacteristics;->LENS_INFO_HYPERFOCAL_DISTANCE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-interface {v1, v2}, Llvp;->n(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    sput v2, Lcom/Helper;->DistanceInfinity:F

    goto :goto_1

    :cond_3
    const-string v1, "pref_mf_infinity_key"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_4

    const-string v1, "0.45"

    :cond_4
    invoke-static {v1}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    sput v1, Lcom/Helper;->DistanceInfinity:F

    :goto_1
    return-void
.end method

.method public static onRestart()V
    .locals 5

    sget v0, Lcom/Helper;->sHdr_process:I

    if-nez v0, :cond_0

    const-wide/16 v0, 0x1f4

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    invoke-static {}, Landroid/app/AppGlobals;->getInitialApplication()Landroid/app/Application;

    move-result-object v0

    invoke-static {}, Lcom/Helper;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/google/android/apps/camera/legacy/app/activity/main/CameraActivity;

    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const v1, 0x8000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const v1, 0x10000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-static {v0}, Lcom/Helper;->GetEachModeIndividually(Landroid/content/Intent;)V

    invoke-virtual {v2, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/System;->exit(I)V

    :cond_0
    const v1, 0x7f140288

    invoke-static {v1}, Lcom/Helper;->Toast(I)V

    return-void
.end method

.method public static sHdrProcessTime(I)V
    .locals 4

    const-wide/16 v0, 0x0

    const/4 v2, 0x1

    if-ne p0, v2, :cond_0

    sget-wide v2, Lcom/Helper;->sHdrProcessTime:J

    cmp-long p0, v2, v0

    if-nez p0, :cond_1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    sput-wide v0, Lcom/Helper;->sHdrProcessTime:J

    goto :goto_0

    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    sput-wide v0, Lcom/Helper;->sHdrProcessTime:J

    const/4 p0, 0x0

    invoke-static {p0}, Lcom/hdrindicator/HDRProgress;->updateProgress(F)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static setAperture()F
    .locals 3

    const-string v2, "pref_aperture_key"

    invoke-static {v2}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_0

    const/high16 v0, 0x3fc00000    # 1.5f

    goto :goto_0

    :cond_0
    const v0, 0x4019999a    # 2.4f

    :goto_0
    return v0
.end method

.method public static setColorTransform()V
    .locals 1

    const-string v0, "pref_color_transform_key_front"

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/Helper;->sColorTransformFront:I

    sget v0, Lcom/Fix/Pref;->sAuxKey:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "pref_color_transform_key"

    goto :goto_0

    :pswitch_0
    const-string v0, "pref_color_transform_key"

    goto :goto_0

    :pswitch_1
    const-string v0, "pref_color_transform_key_2"

    goto :goto_0

    :pswitch_2
    const-string v0, "pref_color_transform_key_3"

    goto :goto_0

    :pswitch_3
    const-string v0, "pref_color_transform_key_4"

    goto :goto_0

    :pswitch_4
    const-string v0, "pref_color_transform_key_5"

    :goto_0
    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/Helper;->sColorTransform:I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public static setKeyOnStart()V
    .locals 1

    const-string v0, "pref_cam2api_nr_vf_mode_key"

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/Helper;->getVFDenoise:I

    const-string v0, "pref_camera_lightroom_key"

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/Helper;->GeometricCalibration:I

    const-string v0, "pref_sunlight_key"

    invoke-static {v0}, Lcom/SDE/LensValue;->SetLensValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/Helper;->getSunlightFix:I

    const-string v0, "pref_auto_ns_key"

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/Helper;->sAutoNS:I

    return-void
.end method

.method public static setMVresolution()V
    .locals 1

    const-string v0, "pref_mv_key"

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x280

    sput v0, Lcom/Helper;->mv_w:I

    const/16 v0, 0x1e0

    sput v0, Lcom/Helper;->mv_h:I

    return-void

    :pswitch_0
    const/16 v0, 0x280

    sput v0, Lcom/Helper;->mv_w:I

    const/16 v0, 0x1e0

    sput v0, Lcom/Helper;->mv_h:I

    return-void

    :pswitch_1
    const/16 v0, 0x500

    sput v0, Lcom/Helper;->mv_w:I

    const/16 v0, 0x2d0

    sput v0, Lcom/Helper;->mv_h:I

    return-void

    :pswitch_2
    const/16 v0, 0x780

    sput v0, Lcom/Helper;->mv_w:I

    const/16 v0, 0x438

    sput v0, Lcom/Helper;->mv_h:I

    return-void

    :pswitch_3
    const/16 v0, 0xf00

    sput v0, Lcom/Helper;->mv_w:I

    const/16 v0, 0x870

    sput v0, Lcom/Helper;->mv_h:I

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public static setMenuValue(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    invoke-static {}, Landroid/app/AppGlobals;->getInitialApplication()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Application;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, p0, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public static setSabre(I)I
    .locals 4

    sget v0, Lcom/Helper;->sFront:I

    if-eqz v0, :cond_0

    const-string v0, "pref_sabre_key_front"

    goto :goto_0

    :cond_0
    const-string v0, "pref_aux_key"

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    const-string v0, "pref_sabre_key_main"

    goto :goto_0

    :pswitch_0
    const-string v0, "pref_sabre_key_main"

    goto :goto_0

    :pswitch_1
    const-string v0, "pref_sabre_key_tele"

    goto :goto_0

    :pswitch_2
    const-string v0, "pref_sabre_key_wide"

    goto :goto_0

    :pswitch_3
    const-string v0, "pref_sabre_key_id4"

    goto :goto_0

    :pswitch_4
    const-string v0, "pref_sabre_key_id5"

    :goto_0
    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_1

    return v0

    :cond_1
    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public static setValue(Ljava/lang/String;I)V
    .locals 3

    invoke-static {}, Landroid/app/AppGlobals;->getInitialApplication()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Application;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, p0, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public static showT(Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Lcom/Helper;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, p0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    return-void
.end method


# virtual methods
.method public OpenPreference0(Ljava/lang/String;)V
    .locals 7

    invoke-static {}, Lcom/Helper;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    new-instance v0, Landroid/content/Intent;

    const-class v6, Lcom/google/android/apps/camera/legacy/app/settings/CameraSettingsActivity;

    invoke-direct {v0, v5, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v3, "pref_open_setting_page"

    invoke-virtual {v0, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {v5, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
