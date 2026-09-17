.class public Lcom/AGC;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static dep:Ldep;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/Fix/Pref;

    invoke-direct {v0}, Lcom/Fix/Pref;-><init>()V

    invoke-static {}, Lcom/AGC;->initMenuValue()V

    return-void
.end method

.method public static final a(Lkbi;ZLjrl;)F
    .locals 3

    sget-object v0, Ljrl;->g:Ljrl;

    if-ne p2, v0, :cond_0

    iget-object v0, p0, Lkbi;->A:Llwd;

    sget-object v1, Llwd;->a:Llwd;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lkbi;->c:Lddf;

    invoke-interface {v0}, Lddf;->b()V

    :cond_0
    invoke-virtual {p0}, Lkbi;->Z()Lghx;

    move-result-object v0

    iget-object v1, p0, Lkbi;->o:Llco;

    invoke-interface {v1}, Llco;->fA()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {p0, v0}, Lkbi;->aa(Lghx;)Z

    move-result v2

    if-eqz v2, :cond_1

    if-nez p1, :cond_1

    iget-object p0, p0, Lkbi;->W:Ldkm;

    invoke-virtual {p0, v0}, Ldkm;->a(Llvp;)F

    move-result p0

    return p0

    :cond_1
    invoke-virtual {p0}, Lkbi;->X()Z

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lkbi;->A:Llwd;

    sget-object v2, Llwd;->a:Llwd;

    if-ne p1, v2, :cond_4

    iget-boolean p1, p0, Lkbi;->L:Z

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lkbi;->Y()Z

    move-result p1

    iget-object p0, p0, Lkbi;->I:Lkad;

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lkad;->a(I)F

    move-result v1

    goto :goto_1

    :cond_3
    invoke-virtual {p0, v0}, Lkad;->a(I)F

    move-result v1

    goto :goto_1

    :cond_4
    :goto_0
    sget-object p1, Ljrl;->g:Ljrl;

    if-eq p2, p1, :cond_5

    goto :goto_1

    :cond_5
    invoke-virtual {p0}, Lkbi;->I()F

    move-result v1

    :goto_1
    return v1

    :cond_6
    sget-object p1, Ljrl;->g:Ljrl;

    if-eq p2, p1, :cond_7

    return v1

    :cond_7
    iget-object p1, p0, Lkbi;->A:Llwd;

    sget-object p2, Llwd;->a:Llwd;

    if-ne p1, p2, :cond_9

    iget-boolean p1, p0, Lkbi;->L:Z

    if-nez p1, :cond_8

    goto :goto_2

    :cond_8
    iget-object p1, p0, Lkbi;->I:Lkad;

    iget-object p0, p0, Lkbi;->c:Lddf;

    sget-object p2, Lddx;->H:Lddg;

    invoke-interface {p0, p2}, Lddf;->k(Lddg;)Z

    move-result p0

    xor-int/2addr p0, v0

    invoke-virtual {p1, p0}, Lkad;->a(I)F

    move-result p0

    return p0

    :cond_9
    :goto_2
    invoke-virtual {p0}, Lkbi;->I()F

    move-result p0

    return p0
.end method

.method public static getCaptureResult(Llzv;)Z
    .locals 2

    const/4 v1, 0x1

    sget-object v0, Landroid/hardware/camera2/CaptureResult;->CONTROL_AF_MODE:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-interface {p0, v0}, Llzv;->d(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    if-eqz p0, :cond_0

    return v1

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static getCaptureResultKey(Llzv;)Ljava/lang/Integer;
    .locals 1

    sget-object v0, Landroid/hardware/camera2/CaptureResult;->CONTROL_AF_MODE:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-interface {p0, v0}, Llzv;->d(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    return-object p0
.end method

.method public static getGcamSensorId(Llvp;Llvq;Llzv;)I
    .locals 15

    move-object/from16 v0, p2

    invoke-interface {p0}, Llvp;->k()Llwd;

    move-result-object v1

    sget-object v2, Llwd;->b:Llwd;

    invoke-interface {p0}, Llvp;->L()Z

    move-result v12

    sget-object v3, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_INFO_COLOR_FILTER_ARRANGEMENT:Landroid/hardware/camera2/CameraCharacteristics$Key;

    move-object v4, p0

    invoke-interface {p0, v3}, Llvp;->l(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v14

    if-eqz v12, :cond_1

    if-nez v0, :cond_1

    if-ne v1, v2, :cond_0

    const/4 v0, 0x5

    goto :goto_0

    :cond_0
    const/4 v0, 0x3

    :goto_0
    return v0

    :cond_1
    if-eqz v0, :cond_2

    invoke-static/range {p0 .. p2}, Lpkr;->y(Llvp;Llvq;Llzv;)Llvp;

    move-result-object v3

    goto :goto_1

    :cond_2
    move-object v3, v4

    :goto_1
    invoke-interface {v3}, Llvp;->t()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-ne v5, v7, :cond_3

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    :goto_2
    check-cast v4, Ljava/lang/Float;

    goto :goto_3

    :cond_3
    if-eqz v0, :cond_4

    sget-object v4, Landroid/hardware/camera2/CaptureResult;->LENS_FOCAL_LENGTH:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-interface {v0, v4}, Llzv;->d(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v4

    goto :goto_2

    :cond_4
    const/4 v4, 0x0

    :goto_3
    if-eqz v4, :cond_5

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    goto :goto_4

    :cond_5
    const/4 v4, 0x0

    :goto_4
    sget-object v5, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_INFO_PHYSICAL_SIZE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-interface {v3, v5}, Llvp;->l(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/util/SizeF;

    invoke-virtual {v3}, Landroid/util/SizeF;->getWidth()F

    move-result v5

    sget-object v3, Lpkr;->d:Llzi;

    invoke-virtual {v3}, Llzi;->h()Z

    move-result v8

    invoke-virtual {v3}, Llzi;->d()Z

    move-result v9

    iget-boolean v13, v3, Llzi;->a:Z

    iget-boolean v10, v3, Llzi;->k:Z

    iget-boolean v11, v3, Llzi;->m:Z

    invoke-static/range {p2 .. p2}, Lpkr;->D(Llzr;)Z

    move-result v0

    const-string v3, "pref_gcam_lens_logic_key"

    invoke-static {v3}, Lcom/SDE/LensValue;->SetLensValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v3

    if-ne v1, v2, :cond_6

    move v1, v7

    goto :goto_5

    :cond_6
    move v1, v6

    :goto_5
    move v6, v9

    move v7, v8

    move v8, v11

    move v9, v10

    move v10, v0

    move v11, v1

    invoke-static/range {v3 .. v14}, Lagc/Agc;->getGcamSensorID(IFFZZZZZZZZI)I

    move-result v0

    invoke-static {v0}, Lagc/Agc;->setSensorId(I)V

    return v0
.end method

.method public static getReadoutTimeNs(Llvp;)J
    .locals 2

    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-interface {p0, v0}, Llvp;->n(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    if-nez p0, :cond_0

    const-wide/32 v0, 0x2faf080

    goto :goto_0

    :cond_0
    const-wide/32 v0, 0x1fc9a30

    :goto_0
    return-wide v0
.end method

.method private static initMenuValue()V
    .locals 4

    invoke-static {}, Lcom/Fix/Pref;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "pref_menu_value_key"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-static {v1, v2}, Lcom/Fix/Pref;->setMenuValue(Ljava/lang/String;I)V

    :cond_0
    invoke-static {}, Lcom/Fix/Pref;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "pref_hexagon_key"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {v1, v2}, Lcom/Fix/Pref;->setMenuValue(Ljava/lang/String;I)V

    :cond_1
    invoke-static {}, Lcom/Fix/Pref;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "pref_video_hevc_setting_key"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    const/4 v3, 0x0

    if-nez v0, :cond_2

    invoke-static {v1, v3}, Lcom/Fix/Pref;->setMenuValue(Ljava/lang/String;I)V

    :cond_2
    invoke-static {}, Lcom/Fix/Pref;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "pref_camera_recordlocation_key"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    const/4 v3, 0x0

    if-nez v0, :cond_3

    invoke-static {v1, v3}, Lcom/Fix/Pref;->setMenuValue(Ljava/lang/String;I)V

    :cond_3
    invoke-static {}, Lcom/Fix/Pref;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "pref_vibro_button_key"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    const/4 v3, 0x1

    if-nez v0, :cond_4

    invoke-static {v1, v3}, Lcom/Fix/Pref;->setMenuValue(Ljava/lang/String;I)V

    :cond_4
    invoke-static {}, Lcom/Fix/Pref;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    return-void
.end method

.method public static minObject(Ljava/util/List;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Comparable;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-eqz p0, :cond_3

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Comparable;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Comparable;

    invoke-interface {v0, v1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v2

    if-lez v2, :cond_1

    move-object v0, v1

    goto :goto_0

    :cond_2
    return-object v0

    :cond_3
    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method
