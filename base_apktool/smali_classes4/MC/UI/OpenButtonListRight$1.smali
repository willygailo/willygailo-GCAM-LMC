.class LMC/UI/OpenButtonListRight$1;
.super Landroid/animation/AnimatorListenerAdapter;
.source "OpenButtonListRight.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMC/UI/OpenButtonListRight;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:LMC/UI/OpenButtonListRight;


# direct methods
.method constructor <init>(LMC/UI/OpenButtonListRight;)V
    .locals 0

    iput-object p1, p0, LMC/UI/OpenButtonListRight$1;->this$0:LMC/UI/OpenButtonListRight;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    return-void
.end method
