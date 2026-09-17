.class Lcom/custom/ButtonEXPSlide$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/custom/ButtonEXPSlide;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/custom/ButtonEXPSlide;


# direct methods
.method constructor <init>(Lcom/custom/ButtonEXPSlide;)V
    .locals 0

    iput-object p1, p0, Lcom/custom/ButtonEXPSlide$2;->this$1:Lcom/custom/ButtonEXPSlide;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    invoke-static {}, Lcom/Helper;->onRestart()V

    return-void
.end method
