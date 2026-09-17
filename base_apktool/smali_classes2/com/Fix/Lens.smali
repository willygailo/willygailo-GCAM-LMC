.class public Lcom/Fix/Lens;
.super Ljava/lang/Object;


# static fields
.field public static sAux5:I

.field public static sAuxInfinity:I

.field public static sAuxMain:I

.field public static sAuxSwitch5:I

.field public static sAuxSwitchInfinity:I

.field public static sAuxSwitchMain:I

.field public static sAuxSwitchTele:I

.field public static sAuxSwitchWide:I

.field public static sAuxTele:I

.field public static sAuxWide:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/Fix/Lens;->AuxLens()V

    return-void
.end method

.method public static AuxLens()V
    .locals 6

    const-string v0, "pref_manual_cameraid_key"

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "pref_manual_cameraid_back_1_key"

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/Fix/Lens;->sAuxMain:I

    const-string v0, "pref_manual_cameraid_back_2_key"

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/Fix/Lens;->sAuxTele:I

    const-string v0, "pref_manual_cameraid_back_3_key"

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/Fix/Lens;->sAuxWide:I

    const-string v0, "pref_manual_cameraid_back_4_key"

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/Fix/Lens;->sAuxInfinity:I

    const-string v0, "pref_manual_cameraid_back_5_key"

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/Fix/Lens;->sAux5:I

    const-string v0, "pref_manual_cameraid_front_1_key"

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/Fix/Lens;->sAuxSwitchMain:I

    const-string v0, "pref_manual_cameraid_front_2_key"

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/Fix/Lens;->sAuxSwitchTele:I

    const-string v0, "pref_manual_cameraid_front_3_key"

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/Fix/Lens;->sAuxSwitchWide:I

    const-string v0, "pref_manual_cameraid_front_4_key"

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/Fix/Lens;->sAuxSwitchInfinity:I

    const-string v0, "pref_manual_cameraid_front_5_key"

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/Fix/Lens;->sAuxSwitch5:I

    goto/16 :goto_0

    :cond_0
    const v2, 0x0

    sput v2, Lcom/Fix/Lens;->sAuxMain:I

    const v3, 0x1

    sput v3, Lcom/Fix/Lens;->sAuxSwitchMain:I

    const v2, 0x2

    sput v2, Lcom/Fix/Lens;->sAuxTele:I

    const v3, 0x1

    sput v3, Lcom/Fix/Lens;->sAuxSwitchTele:I

    const v2, 0x3

    sput v2, Lcom/Fix/Lens;->sAuxWide:I

    const v3, 0x1

    sput v3, Lcom/Fix/Lens;->sAuxSwitchWide:I

    const v2, 0x4

    sput v2, Lcom/Fix/Lens;->sAuxInfinity:I

    const v3, 0x1

    sput v3, Lcom/Fix/Lens;->sAuxSwitchInfinity:I

    const v2, 0x5

    sput v2, Lcom/Fix/Lens;->sAux5:I

    const v3, 0x1

    sput v3, Lcom/Fix/Lens;->sAuxSwitch5:I

    invoke-static {}, LMC/Device;->isInfinixOrTecno()Z

    move-result v1

    if-eqz v1, :cond_transsion_aux_not

    const v2, 0x0

    sput v2, Lcom/Fix/Lens;->sAuxMain:I

    const v2, 0x2

    sput v2, Lcom/Fix/Lens;->sAuxTele:I

    const v2, 0x3

    sput v2, Lcom/Fix/Lens;->sAuxWide:I

    const v2, 0x4

    sput v2, Lcom/Fix/Lens;->sAuxInfinity:I

    const v2, 0x5

    sput v2, Lcom/Fix/Lens;->sAux5:I

    goto/16 :goto_0

    :cond_transsion_aux_not
    invoke-static {}, LMC/Device;->isInvertedAux()Z

    move-result v1

    if-eqz v1, :cond_1

    const v2, 0x3

    sput v2, Lcom/Fix/Lens;->sAuxTele:I

    const v2, 0x2

    sput v2, Lcom/Fix/Lens;->sAuxWide:I

    const v2, 0x4

    sput v2, Lcom/Fix/Lens;->sAuxInfinity:I

    const v2, 0x5

    sput v2, Lcom/Fix/Lens;->sAux5:I

    goto/16 :goto_0

    :cond_1
    invoke-static {}, LMC/Device;->MN10()Z

    move-result v1

    if-eqz v1, :cond_2

    const v2, 0x2

    sput v2, Lcom/Fix/Lens;->sAuxTele:I

    const v2, 0x3

    sput v2, Lcom/Fix/Lens;->sAuxWide:I

    const v2, 0x5

    sput v2, Lcom/Fix/Lens;->sAuxInfinity:I

    const v2, 0x4

    sput v2, Lcom/Fix/Lens;->sAux5:I

    goto/16 :goto_0

    :cond_2
    invoke-static {}, LMC/Device;->SamsungS23Ultra()Z

    move-result v1

    if-eqz v1, :cond_3

    const v2, 0x4

    sput v2, Lcom/Fix/Lens;->sAuxMain:I

    const v2, 0x2

    sput v2, Lcom/Fix/Lens;->sAuxTele:I

    const v2, 0x5

    sput v2, Lcom/Fix/Lens;->sAuxWide:I

    const v2, 0x3

    sput v2, Lcom/Fix/Lens;->sAuxInfinity:I

    const v2, 0x4

    sput v2, Lcom/Fix/Lens;->sAux5:I

    goto/16 :goto_0

    :cond_3
    sget-object v1, Landroid/os/Build;->BOARD:Ljava/lang/String;

    const-string v0, "s5e9925"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    const-string v0, "b0q"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    const-string v0, "r9s"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const v2, 0x6

    sput v2, Lcom/Fix/Lens;->sAuxMain:I

    const v2, 0x4

    sput v2, Lcom/Fix/Lens;->sAuxTele:I

    const v2, 0x2

    sput v2, Lcom/Fix/Lens;->sAuxWide:I

    const v2, 0x5

    sput v2, Lcom/Fix/Lens;->sAuxInfinity:I

    goto/16 :goto_0

    :cond_4
    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    const-string v0, "ASUS_I002DD"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    const v2, 0x3

    sput v2, Lcom/Fix/Lens;->sAuxTele:I

    const v2, 0x2

    sput v2, Lcom/Fix/Lens;->sAuxWide:I

    const v2, 0x6

    sput v2, Lcom/Fix/Lens;->sAuxInfinity:I

    const v2, 0x5

    sput v2, Lcom/Fix/Lens;->sAux5:I

    goto/16 :goto_0

    :cond_5
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v0, "ASUS_I003D"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    const v2, 0x3

    sput v2, Lcom/Fix/Lens;->sAuxTele:I

    const v2, 0x2

    sput v2, Lcom/Fix/Lens;->sAuxWide:I

    const v2, 0x4

    sput v2, Lcom/Fix/Lens;->sAuxInfinity:I

    const v2, 0x5

    sput v2, Lcom/Fix/Lens;->sAux5:I

    goto/16 :goto_0

    :cond_6
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v0, "ASUS_I003DD"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    const v2, 0x3

    sput v2, Lcom/Fix/Lens;->sAuxTele:I

    const v2, 0x2

    sput v2, Lcom/Fix/Lens;->sAuxWide:I

    const v2, 0x4

    sput v2, Lcom/Fix/Lens;->sAuxInfinity:I

    const v2, 0x5

    sput v2, Lcom/Fix/Lens;->sAux5:I

    goto/16 :goto_0

    :cond_7
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v0, "Redmi Note 7"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    const v2, 0x0

    sput v2, Lcom/Fix/Lens;->sAuxMain:I

    const v2, 0x2

    sput v2, Lcom/Fix/Lens;->sAuxTele:I

    goto/16 :goto_0

    :cond_8
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v0, "ASUS_I01WD"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    const v2, 0x3

    sput v2, Lcom/Fix/Lens;->sAuxTele:I

    const v2, 0x3

    sput v2, Lcom/Fix/Lens;->sAuxWide:I

    const v2, 0x4

    sput v2, Lcom/Fix/Lens;->sAuxInfinity:I

    const v2, 0x5

    sput v2, Lcom/Fix/Lens;->sAux5:I

    goto/16 :goto_0

    :cond_9
    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    const-string v0, "Nord"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    const v2, 0x3

    sput v2, Lcom/Fix/Lens;->sAuxTele:I

    const v2, 0x2

    sput v2, Lcom/Fix/Lens;->sAuxWide:I

    const v2, 0x4

    sput v2, Lcom/Fix/Lens;->sAuxInfinity:I

    const v2, 0x5

    sput v2, Lcom/Fix/Lens;->sAux5:I

    goto/16 :goto_0

    :cond_a
    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    const-string v0, "star"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    const v2, 0x3

    sput v2, Lcom/Fix/Lens;->sAuxTele:I

    const v2, 0x2

    sput v2, Lcom/Fix/Lens;->sAuxWide:I

    goto/16 :goto_0

    :cond_b
    invoke-static {}, LMC/Device;->Mi12UltraDevice()Z

    move-result v1

    if-eqz v1, :cond_c

    const v2, 0x8

    sput v2, Lcom/Fix/Lens;->sAuxMain:I

    const v2, 0x3

    sput v2, Lcom/Fix/Lens;->sAuxTele:I

    const v2, 0x2

    sput v2, Lcom/Fix/Lens;->sAuxWide:I

    goto/16 :goto_0

    :cond_c
    invoke-static {}, LMC/Device;->Samsungs22UExynos()Z

    move-result v1

    if-eqz v1, :cond_d

    const v2, 0x4

    sput v2, Lcom/Fix/Lens;->sAuxMain:I

    const v2, 0x2

    sput v2, Lcom/Fix/Lens;->sAuxTele:I

    const v2, 0x5

    sput v2, Lcom/Fix/Lens;->sAuxWide:I

    const v2, 0x3

    sput v2, Lcom/Fix/Lens;->sAuxInfinity:I

    const v2, 0x4

    sput v2, Lcom/Fix/Lens;->sAux5:I

    goto/16 :goto_0

    :cond_d
    invoke-static {}, LMC/Device;->Samsungs22Exynos()Z

    move-result v1

    if-eqz v1, :cond_e

    const v2, 0x6

    sput v2, Lcom/Fix/Lens;->sAuxMain:I

    const v2, 0x4

    sput v2, Lcom/Fix/Lens;->sAuxTele:I

    const v2, 0x2

    sput v2, Lcom/Fix/Lens;->sAuxWide:I

    const v2, 0x5

    sput v2, Lcom/Fix/Lens;->sAuxInfinity:I

    const v2, 0x5

    sput v2, Lcom/Fix/Lens;->sAux5:I

    goto/16 :goto_0

    :cond_e
    invoke-static {}, LMC/Device;->S20FE()Z

    move-result v1

    if-eqz v1, :cond_f

    const v2, 0x0

    sput v2, Lcom/Fix/Lens;->sAuxMain:I

    const v2, 0x5

    sput v2, Lcom/Fix/Lens;->sAuxTele:I

    const v2, 0x2

    sput v2, Lcom/Fix/Lens;->sAuxWide:I

    const v2, 0x4

    sput v2, Lcom/Fix/Lens;->sAuxInfinity:I

    const v2, 0x5

    sput v2, Lcom/Fix/Lens;->sAux5:I

    goto/16 :goto_0

    :cond_f
    invoke-static {}, LMC/Device;->SamsungS21Ultra()Z

    move-result v1

    if-eqz v1, :cond_10

    const v2, 0x0

    sput v2, Lcom/Fix/Lens;->sAuxMain:I

    const v2, 0x4

    sput v2, Lcom/Fix/Lens;->sAuxTele:I

    const v2, 0x2

    sput v2, Lcom/Fix/Lens;->sAuxWide:I

    const v2, 0x5

    sput v2, Lcom/Fix/Lens;->sAuxInfinity:I

    const v2, 0x0

    sput v2, Lcom/Fix/Lens;->sAux5:I

    goto/16 :goto_0

    :cond_10
    invoke-static {}, LMC/Device;->RedmiNote10Pro()Z

    move-result v1

    if-eqz v1, :cond_11

    const v2, 0x0

    sput v2, Lcom/Fix/Lens;->sAuxMain:I

    const v2, 0x3

    sput v2, Lcom/Fix/Lens;->sAuxTele:I

    const v2, 0x4

    sput v2, Lcom/Fix/Lens;->sAuxWide:I

    goto/16 :goto_0

    :cond_11
    invoke-static {}, LMC/Device;->Xiaomi13()Z

    move-result v1

    if-eqz v1, :cond_12

    const v2, 0x7

    sput v2, Lcom/Fix/Lens;->sAuxMain:I

    const v2, 0x3

    sput v2, Lcom/Fix/Lens;->sAuxTele:I

    const v2, 0x2

    sput v2, Lcom/Fix/Lens;->sAuxWide:I

    goto/16 :goto_0

    :cond_12
    :goto_0
    return-void
.end method
