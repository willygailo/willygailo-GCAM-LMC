.class public LMC/hsld;
.super Ljava/lang/Object;


# static fields
.field public static dep:Ldep;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static setAEautomax()F
    .locals 10

    const-string v0, "pref_aeautomax_key"

    invoke-static {v0}, Lcom/SDE/LensValue;->SetLensValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    const v0, 0x44fa0000    # 2000.0f

    goto/32 :goto_0

    :pswitch_1
    const v0, 0x447a0000    # 1000.0f

    goto/32 :goto_0

    :pswitch_2
    const v0, 0x43fa0000    # 500.0f

    goto/32 :goto_0

    :pswitch_3
    const v0, 0x43a6aaa0

    goto/32 :goto_0

    :pswitch_4
    const v0, 0x437a0000    # 250.0f

    goto/32 :goto_0

    :pswitch_5
    const v0, 0x43480000    # 200.0f

    goto/32 :goto_0

    :pswitch_6
    const v0, 0x4326aaab

    goto/32 :goto_0

    :pswitch_7
    const v0, 0x430edb64

    goto/32 :goto_0

    :pswitch_8
    const v0, 0x42fa0000    # 125.0f

    goto/32 :goto_0

    :pswitch_9
    const v0, 0x42de38e4

    goto/32 :goto_0

    :pswitch_a
    const v0, 0x42c80000    # 100.0f

    goto/32 :goto_0

    :pswitch_b
    const v0, 0x42a6aa7f    # 83.333f

    goto/32 :goto_0

    :pswitch_c
    const v0, 0x428554fe    # 66.666f

    goto/32 :goto_0

    :pswitch_d
    const v0, 0x426b4ac1

    goto/32 :goto_0

    :pswitch_e
    const v0, 0x42480000    # 50.0f

    goto/32 :goto_0

    :pswitch_f
    const v0, 0x41f00000    # 30.0f

    goto/32 :goto_0

    :pswitch_10
    const v0, 0x41a00000    # 20.0f

    goto/32 :goto_0

    :pswitch_11
    const v0, 0x41700000    # 15.0f

    goto/32 :goto_0

    :pswitch_12
    const v0, 0x41200000    # 10.0f

    goto/32 :goto_0

    :pswitch_13
    const v0, 0x40a00000    # 5.0f

    goto/32 :goto_0

    :pswitch_14
    const v0, 0x40000000    # 2.0f

    goto/32 :goto_0

    :pswitch_15
    const v0, 0x3f800000    # 1.0f

    goto/32 :goto_0

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
        :pswitch_14
        :pswitch_15
    .end packed-switch

    :goto_0
    return v0
.end method

.method public static setDeveloperSettings(Ldep;)V
    .locals 4

    sput-object p0, LMC/hsld;->dep:Ldep;

    sget-object v0, Lddx;->r:Lddg;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Ldep;->s(Lddg;Z)V

    const/4 v3, 0x1

    sget-object v0, Lddm;->A:Lddg;

    invoke-virtual {p0, v0, v3}, Ldep;->s(Lddg;Z)V

    sget-object v0, Lddm;->D:Lddg;

    invoke-virtual {p0, v0, v3}, Ldep;->s(Lddg;Z)V

    sget-object v0, Lddq;->h:Lddg;

    invoke-virtual {p0, v0, v3}, Ldep;->s(Lddg;Z)V

    sget-object v0, Lddx;->o:Lddg;

    invoke-virtual {p0, v0, v1}, Ldep;->s(Lddg;Z)V

    sget-object v0, Lddx;->p:Lddg;

    invoke-virtual {p0, v0, v1}, Ldep;->s(Lddg;Z)V

    return-void
.end method

.method public static setEV()I
    .locals 5

    const-string v0, "pref_evslidersize_key"

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_0
    const v1, 0x7f0b0117

    return v1
.end method

.method public static setHDRregion()F
    .locals 10

    const-string v0, "pref_hdrregion_key"

    invoke-static {v0}, Lcom/SDE/LensValue;->SetLensValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    const v0, 0x3dcccccd    # 0.1f

    goto/32 :goto_0

    :pswitch_1
    const v0, 0x3f800000    # 1.0f

    goto/32 :goto_0

    :pswitch_2
    const v0, 0x40a00000    # 5.0f

    goto/32 :goto_0

    :pswitch_3
    const v0, 0x41200000    # 10.0f

    goto/32 :goto_0

    :pswitch_4
    const v0, 0x41a00000    # 20.0f

    goto/32 :goto_0

    :pswitch_5
    const v0, 0x41c80000    # 25.0f

    goto/32 :goto_0

    :pswitch_6
    const v0, 0x420c0000    # 35.0f

    goto/32 :goto_0

    :pswitch_7
    const v0, 0x42340000    # 45.0f

    goto/32 :goto_0

    :pswitch_8
    const v0, 0x42700000    # 60.0f

    goto/32 :goto_0

    :pswitch_9
    const v0, 0x428c0000    # 70.0f

    goto/32 :goto_0

    :pswitch_a
    const v0, 0x42a00000    # 80.0f

    goto/32 :goto_0

    :pswitch_b
    const v0, 0x42b40000    # 90.0f

    goto/32 :goto_0

    :pswitch_c
    const v0, 0x42c80000    # 100.0f

    goto/32 :goto_0

    :pswitch_d
    const v0, 0x42dc0000    # 110.0f

    goto/32 :goto_0

    :pswitch_e
    const v0, 0x42fa0000    # 125.0f

    goto/32 :goto_0

    :pswitch_f
    const v0, 0x43160000    # 150.0f

    goto/32 :goto_0

    :pswitch_10
    const v0, 0x432f0000    # 175.0f

    goto/32 :goto_0

    :pswitch_11
    const v0, 0x43480000    # 200.0f

    goto/32 :goto_0

    :pswitch_12
    const v0, 0x43610000    # 225.0f

    goto/32 :goto_0

    :pswitch_13
    const v0, 0x437a0000    # 250.0f

    goto/32 :goto_0

    :pswitch_14
    const v0, 0x43898000    # 275.0f

    goto/32 :goto_0

    :pswitch_15
    const v0, 0x43960000    # 300.0f

    goto/32 :goto_0

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
        :pswitch_14
        :pswitch_15
    .end packed-switch

    :goto_0
    return v0
.end method

.method public static setZSLFrames()I
    .locals 5

    const-string v0, "pref_zsl_frames_key"

    invoke-static {v0}, Lcom/SDE/LensValue;->SetLensValue1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_0
    const/16 v3, 0x7

    return v3
.end method
