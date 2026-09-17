.class public final Lluw;
.super Ljava/lang/Object;

# interfaces
.implements Llzp;


# instance fields
.field private final a:Landroid/hardware/camera2/CameraDevice;


# direct methods
.method public constructor <init>(Landroid/hardware/camera2/CameraDevice;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lluw;->a:Landroid/hardware/camera2/CameraDevice;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 2

    :try_start_0
    iget-object v0, p0, Lluw;->a:Landroid/hardware/camera2/CameraDevice;

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraDevice;->getCameraAudioRestriction()I

    move-result v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    goto :goto_0

    :catch_3
    move-exception v0

    goto :goto_0

    :catch_4
    move-exception v0

    :goto_0
    new-instance v1, Lllv;

    invoke-direct {v1, v0}, Lllv;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lluw;->a:Landroid/hardware/camera2/CameraDevice;

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final c(Llzz;)V
    .locals 6

    :try_start_0
    new-instance v0, Landroid/hardware/camera2/params/SessionConfiguration;

    iget v1, p1, Llzz;->a:I

    iget-object v2, p1, Llzz;->b:Ljava/util/List;

    sget-object v3, Limd;->j:Limd;

    invoke-static {v2, v3}, Lobr;->am(Ljava/util/List;Loiu;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p1, Llzz;->c:Ljava/util/concurrent/Executor;

    new-instance v4, Llvc;

    iget-object v5, p1, Llzz;->d:Llzn;

    invoke-direct {v4, v5}, Llvc;-><init>(Llzn;)V

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/hardware/camera2/params/SessionConfiguration;-><init>(ILjava/util/List;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)V

    iget-object p1, p1, Llzz;->e:Llzq;

    if-eqz p1, :cond_0

    invoke-static {p1}, Lmip;->aS(Llzl;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/hardware/camera2/CaptureRequest;

    invoke-virtual {v0, p1}, Landroid/hardware/camera2/params/SessionConfiguration;->setSessionParameters(Landroid/hardware/camera2/CaptureRequest;)V

    :cond_0
    iget-object p1, p0, Lluw;->a:Landroid/hardware/camera2/CameraDevice;

    invoke-virtual {p1, v0}, Landroid/hardware/camera2/CameraDevice;->createCaptureSession(Landroid/hardware/camera2/params/SessionConfiguration;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    goto :goto_0

    :catch_3
    move-exception p1

    goto :goto_0

    :catch_4
    move-exception p1

    :goto_0
    new-instance v0, Lllv;

    invoke-direct {v0, p1}, Lllv;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lluw;->a:Landroid/hardware/camera2/CameraDevice;

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraDevice;->close()V

    return-void
.end method

.method public final d(Ljava/util/List;Llzn;Landroid/os/Handler;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lluw;->a:Landroid/hardware/camera2/CameraDevice;

    new-instance v1, Llvc;

    invoke-direct {v1, p2}, Llvc;-><init>(Llzn;)V

    invoke-virtual {v0, p1, v1, p3}, Landroid/hardware/camera2/CameraDevice;->createCaptureSession(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    goto :goto_0

    :catch_3
    move-exception p1

    goto :goto_0

    :catch_4
    move-exception p1

    :goto_0
    new-instance p2, Lllv;

    invoke-direct {p2, p1}, Lllv;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final e(Ljava/util/List;Llzn;Landroid/os/Handler;)V
    .locals 6

    :try_start_0
    iget-object v0, p0, Lluw;->a:Landroid/hardware/camera2/CameraDevice;

    const-string v1, "pref_opmodes_key"

    invoke-static {v1}, Lcom/SDE/LensValue;->SetLensValueOp(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_d

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    const/4 v1, 0x0

    const-string v2, "pref_Customop_key"

    invoke-static {v2}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_6

    sget-object v2, Lcom/Helper;->sModeTo:Ljrl;

    sget-object v3, Ljrl;->b:Ljrl;

    if-ne v2, v3, :cond_0

    const-string v3, "pref_opmode_normal_key"

    goto/32 :goto_0

    :cond_0
    sget-object v2, Lcom/Helper;->sModeTo:Ljrl;

    sget-object v3, Ljrl;->c:Ljrl;

    if-ne v2, v3, :cond_1

    const-string v3, "pref_opmode_video_key"

    goto/32 :goto_0

    :cond_1
    sget-object v2, Lcom/Helper;->sModeTo:Ljrl;

    sget-object v3, Ljrl;->f:Ljrl;

    if-ne v2, v3, :cond_2

    const-string v3, "pref_opmode_motion_key"

    goto/32 :goto_0

    :cond_2
    sget-object v2, Lcom/Helper;->sModeTo:Ljrl;

    sget-object v3, Ljrl;->m:Ljrl;

    if-ne v2, v3, :cond_3

    const-string v3, "pref_opmode_night_key"

    goto/32 :goto_0

    :cond_3
    sget-object v2, Lcom/Helper;->sModeTo:Ljrl;

    sget-object v3, Ljrl;->g:Ljrl;

    if-ne v2, v3, :cond_4

    const-string v3, "pref_opmode_portrait_key"

    goto/32 :goto_0

    :cond_4
    sget-object v2, Lcom/Helper;->sModeTo:Ljrl;

    sget-object v3, Ljrl;->a:Ljrl;

    if-ne v2, v3, :cond_5

    const-string v3, "pref_opmode_experimental_key"

    goto/32 :goto_0

    :cond_5
    const-string v3, "pref_opmode_key"

    goto/32 :goto_0

    :cond_6
    sget-object v2, Lcom/Helper;->sModeTo:Ljrl;

    sget-object v3, Ljrl;->b:Ljrl;

    if-ne v2, v3, :cond_7

    const-string v3, "pref_Copmode_normal_key"

    goto/32 :goto_0

    :cond_7
    sget-object v2, Lcom/Helper;->sModeTo:Ljrl;

    sget-object v3, Ljrl;->c:Ljrl;

    if-ne v2, v3, :cond_8

    const-string v3, "pref_Copmode_video_key"

    goto/32 :goto_0

    :cond_8
    sget-object v2, Lcom/Helper;->sModeTo:Ljrl;

    sget-object v3, Ljrl;->f:Ljrl;

    if-ne v2, v3, :cond_9

    const-string v3, "pref_Copmode_motion_key"

    goto/32 :goto_0

    :cond_9
    sget-object v2, Lcom/Helper;->sModeTo:Ljrl;

    sget-object v3, Ljrl;->m:Ljrl;

    if-ne v2, v3, :cond_a

    const-string v3, "pref_Copmode_night_key"

    goto/32 :goto_0

    :cond_a
    sget-object v2, Lcom/Helper;->sModeTo:Ljrl;

    sget-object v3, Ljrl;->g:Ljrl;

    if-ne v2, v3, :cond_b

    const-string v3, "pref_Copmode_portrait_key"

    goto/32 :goto_0

    :cond_b
    sget-object v2, Lcom/Helper;->sModeTo:Ljrl;

    sget-object v3, Ljrl;->a:Ljrl;

    if-ne v2, v3, :cond_c

    const-string v3, "pref_Copmode_experimental_key"

    goto/32 :goto_0

    :cond_c
    const-string v3, "pref_Copmode_key"

    :goto_0
    invoke-static {v3}, Lcom/SDE/LensValue;->SetLensValueOp(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v3

    if-eqz v3, :cond_d

    invoke-static {p1}, Lmip;->aT(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    new-instance v4, Llvc;

    invoke-direct {v4, p2}, Llvc;-><init>(Llzn;)V

    move-object/from16 v5, p3

    invoke-virtual/range {v0 .. v5}, Landroid/hardware/camera2/CameraDevice;->createCustomCaptureSession(Landroid/hardware/camera2/params/InputConfiguration;Ljava/util/List;ILandroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V

    goto/16 :goto_1

    :cond_d
    invoke-static {p1}, Lmip;->aT(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    new-instance v1, Llvc;

    invoke-direct {v1, p2}, Llvc;-><init>(Llzn;)V

    invoke-virtual {v0, p1, v1, p3}, Landroid/hardware/camera2/CameraDevice;->createCaptureSessionByOutputConfigurations(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    return-void

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    goto :goto_2

    :catch_2
    move-exception p1

    goto :goto_2

    :catch_3
    move-exception p1

    goto :goto_2

    :catch_4
    move-exception p1

    :goto_2
    new-instance p2, Lllv;

    invoke-direct {p2, p1}, Lllv;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final f(Ljava/util/List;Llzn;Landroid/os/Handler;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lluw;->a:Landroid/hardware/camera2/CameraDevice;

    new-instance v1, Llvc;

    invoke-direct {v1, p2}, Llvc;-><init>(Llzn;)V

    invoke-virtual {v0, p1, v1, p3}, Landroid/hardware/camera2/CameraDevice;->createConstrainedHighSpeedCaptureSession(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    goto :goto_0

    :catch_3
    move-exception p1

    goto :goto_0

    :catch_4
    move-exception p1

    :goto_0
    new-instance p2, Lllv;

    invoke-direct {p2, p1}, Lllv;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final g(I)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lluw;->a:Landroid/hardware/camera2/CameraDevice;

    invoke-virtual {v0, p1}, Landroid/hardware/camera2/CameraDevice;->setCameraAudioRestriction(I)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    goto :goto_0

    :catch_3
    move-exception p1

    goto :goto_0

    :catch_4
    move-exception p1

    :goto_0
    new-instance v0, Lllv;

    invoke-direct {v0, p1}, Lllv;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final h(I)Lluz;
    .locals 8

    :try_start_0
    new-instance v0, Lluz;

    iget-object v1, p0, Lluw;->a:Landroid/hardware/camera2/CameraDevice;

    invoke-virtual {v1, p1}, Landroid/hardware/camera2/CameraDevice;->createCaptureRequest(I)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object p1

    invoke-direct {v0, p1}, Lluz;-><init>(Landroid/hardware/camera2/CaptureRequest$Builder;)V

    invoke-static {v0}, LMC/hslh;->GetC2apiPref(Lluz;)Lluz;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    goto :goto_0

    :catch_3
    move-exception p1

    goto :goto_0

    :catch_4
    move-exception p1

    :goto_0
    new-instance v0, Lllv;

    invoke-direct {v0, p1}, Lllv;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method
