.class public final Llwa;
.super Ljava/lang/Object;

# interfaces
.implements Llvx;


# instance fields
.field private final a:Landroid/hardware/camera2/CameraManager;

.field private final b:Llis;

.field private final cameraManager2:Lcom/eszdman;


# direct methods
.method public constructor <init>(Landroid/hardware/camera2/CameraManager;Llis;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llwa;->a:Landroid/hardware/camera2/CameraManager;

    new-instance v0, Lcom/eszdman;

    invoke-direct {v0, p1}, Lcom/eszdman;-><init>(Landroid/hardware/camera2/CameraManager;)V

    iput-object v0, p0, Llwa;->cameraManager2:Lcom/eszdman;

    const-string p1, "DefaultCamIdsPrdr"

    invoke-interface {p2, p1}, Llis;->a(Ljava/lang/String;)Llis;

    move-result-object p1

    iput-object p1, p0, Llwa;->b:Llis;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 8

    :try_start_0
    iget-object v0, p0, Llwa;->cameraManager2:Lcom/eszdman;

    invoke-virtual {v0}, Lcom/eszdman;->getCameraIdList()[Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    const-string v2, "pref_aux_key"

    invoke-static {v2}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    sget v2, Lcom/Fix/Lens;->sAuxMain:I

    sget v3, Lcom/Fix/Lens;->sAuxSwitchMain:I

    goto :goto_0

    :pswitch_0
    sget v2, Lcom/Fix/Lens;->sAuxMain:I

    sget v3, Lcom/Fix/Lens;->sAuxSwitchMain:I

    goto :goto_0

    :pswitch_1
    sget v2, Lcom/Fix/Lens;->sAuxTele:I

    sget v3, Lcom/Fix/Lens;->sAuxSwitchTele:I

    goto :goto_0

    :pswitch_2
    sget v2, Lcom/Fix/Lens;->sAuxWide:I

    sget v3, Lcom/Fix/Lens;->sAuxSwitchWide:I

    goto :goto_0

    :pswitch_3
    sget v2, Lcom/Fix/Lens;->sAuxInfinity:I

    sget v3, Lcom/Fix/Lens;->sAuxSwitchInfinity:I

    goto :goto_0

    :pswitch_4
    sget v2, Lcom/Fix/Lens;->sAux5:I

    sget v3, Lcom/Fix/Lens;->sAuxSwitch5:I

    :goto_0
    aget-object v2, v0, v2

    invoke-static {v2}, Llvs;->b(Ljava/lang/String;)Llvs;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    aget-object v2, v0, v3

    invoke-static {v2}, Llvs;->b(Ljava/lang/String;)Llvs;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v1}, Loom;->j(Ljava/util/Collection;)Loom;

    move-result-object v0
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    iget-object v1, p0, Llwa;->b:Llis;

    const-string v2, "Unable to read camera list."

    invoke-interface {v1, v2}, Llis;->d(Ljava/lang/String;)V

    new-instance v1, Llvy;

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraAccessException;->getReason()I

    move-result v3

    invoke-direct {v1, v2, v3, v0}, Llvy;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    goto :goto_2

    :goto_1
    throw v1

    :goto_2
    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public final b()Ljava/util/List;
    .locals 1

    invoke-static {}, Loom;->l()Loom;

    move-result-object v0

    return-object v0
.end method
