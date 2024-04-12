load("@rules_kotlin//kotlin:android.bzl", "kt_android_library")

package(
    default_visibility = ["//app:__subpackages__"],
)

kt_android_library(
    name = "askhole_lib",
    srcs = glob(["java/**/*.kt"]),
    manifest = "AndroidManifest.xml",
    resource_files = glob(["res/**"]),
    custom_package = "io.askhole",
    plugins = ["//app:jetpack_compose_compiler_plugin"],
    deps = [
        "@maven//:androidx_appcompat_appcompat",
        "@maven//:androidx_recyclerview_recyclerview",
        "@maven//:androidx_cardview_cardview",
        "@maven//:com_google_android_material_material",
        "@maven//:com_yuyakaido_android_card_stack_view",
        "@maven//:com_makeramen_roundedimageview",
        "@maven//:androidx_lifecycle_lifecycle_runtime",
        "@maven//:com_google_guava_guava",

        "@maven//:androidx_activity_activity_compose",
        "@maven//:androidx_compose_material_material",
        "@maven//:androidx_compose_runtime_runtime",
        "@maven//:androidx_compose_ui_ui",
        "@maven//:androidx_compose_ui_ui_tooling",
        "@maven//:androidx_core_core_ktx",
        "@maven//:org_jetbrains_kotlin_kotlin_stdlib",
    ],
)
