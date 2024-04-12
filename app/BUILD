load("@rules_kotlin//kotlin:core.bzl", "define_kt_toolchain", "kt_compiler_plugin")

android_binary(
    name = "askhole",
    manifest = "AndroidManifest.xml",
    deps = ["//app/src/main:askhole_lib"],
)

kt_compiler_plugin(
    name = "jetpack_compose_compiler_plugin",
    id = "androidx.compose.compiler",
    target_embedded_compiler = True,
    visibility = ["//visibility:public"],
    deps = [
        "@maven//:androidx_compose_compiler_compiler",
    ],
)
